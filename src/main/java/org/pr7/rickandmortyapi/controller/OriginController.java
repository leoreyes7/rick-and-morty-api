package org.pr7.rickandmortyapi.controller;

import org.pr7.rickandmortyapi.dto.OriginDTO;
import org.pr7.rickandmortyapi.services.OriginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("api/v1/")
public class OriginController {

    @Autowired
    private OriginService originService;

    @GetMapping("origin/{id}")
    public ResponseEntity<OriginDTO> getLocationById(@PathVariable("id") int id){
        return ResponseEntity.ok(originService.getLocationById(id));
    }
}
