package org.pr7.rickandmortyapi.services;

import org.pr7.rickandmortyapi.dto.CharacterDTO;
import org.pr7.rickandmortyapi.dto.OriginDTO;
import org.pr7.rickandmortyapi.dto.RootDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
//@RequiredArgsConstructor
public class RootService {
    public RootService(RestTemplate restTemplate) {this.restTemplate = restTemplate;}
    private final RestTemplate restTemplate;

    @Value("${character.url}")
    private String characterUrl;

    public RootDTO getDataById(int id){
        CharacterDTO characterResponse = restTemplate.getForObject(characterUrl+id, CharacterDTO.class);
        String originUrl = characterResponse.getOrigin().getUrl();

        RootDTO rootDTO = new RootDTO();
        rootDTO.setId(characterResponse.getId());
        rootDTO.setName(characterResponse.getName());
        rootDTO.setStatus(characterResponse.getStatus());
        rootDTO.setSpecies(characterResponse.getSpecies());
        rootDTO.setType(characterResponse.getType());
        rootDTO.setEpisode_count((int) characterResponse.getEpisode().stream().count());
        rootDTO.setOrigin(characterResponse.getOrigin());

        if (!Objects.equals(originUrl, "")){
            OriginDTO originResponse = restTemplate.getForObject(originUrl, OriginDTO.class);
            rootDTO.setOrigin(originResponse);
        }

        return rootDTO;
    }
}
