package org.pr7.rickandmortyapi.services;

import org.pr7.rickandmortyapi.dto.CharacterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CharacterService {
    private String baseUrl = "https://rickandmortyapi.com/api/character/";

    @Autowired
    private RestTemplate restTemplate;

    public CharacterDTO getCharacterById(int id) {
        return restTemplate.getForObject(baseUrl + id, CharacterDTO.class);
    }

}
