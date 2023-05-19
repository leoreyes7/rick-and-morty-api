package org.pr7.rickandmortyapi.services;

import org.pr7.rickandmortyapi.dto.OriginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OriginService {
    private String baseUrl = "https://rickandmortyapi.com/api/location/";

    @Autowired
    private RestTemplate restTemplate;

    public OriginDTO getLocationById(int id){
        OriginDTO response = restTemplate.getForObject(baseUrl+id, OriginDTO.class);
        return response;
    }
}
