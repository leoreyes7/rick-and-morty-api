package org.pr7.rickandmortyapi.controller;

import org.pr7.rickandmortyapi.dto.CharacterDTO;
import org.pr7.rickandmortyapi.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("api/v1/")
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("character/{id}")
    public ResponseEntity <CharacterDTO> getCharacterById(@PathVariable("id") int id){
        return ResponseEntity.ok(characterService.getCharacterById(id));
    }

}
