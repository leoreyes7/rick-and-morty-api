package org.pr7.rickandmortyapi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.pr7.rickandmortyapi.dto.OriginDTO;
import org.pr7.rickandmortyapi.services.OriginService;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class OriginControllerTest {
    @Mock
    private OriginService originService;

    @InjectMocks
    private OriginController originController;

    private OriginDTO originDTO;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        originDTO = new OriginDTO();
    }

    @Test
    void getLocationById() {
        when(originController.getLocationById(1));
    }
}