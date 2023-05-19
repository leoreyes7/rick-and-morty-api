package org.pr7.rickandmortyapi.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.pr7.rickandmortyapi.dto.OriginDTO;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class OriginServiceTest {
    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private OriginService originService;

    private OriginDTO originDTO;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        originDTO = new OriginDTO();
        //originDTO.setName("PLANETA VEGITA");
        //originDTO.setDimension("DIMENSION HERMOSA Y DESCONOCIDA");
        //originDTO.setUrl("www.google.com");
    }

    @Test
    void getLocationById() {
        System.out.println(originDTO.getName());
        System.out.println(originDTO.getDimension());
        when(originService.getLocationById(2)).thenReturn(originDTO);
    }
}