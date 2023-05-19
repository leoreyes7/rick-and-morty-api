package org.pr7.rickandmortyapi.controller;

import lombok.RequiredArgsConstructor;
import org.pr7.rickandmortyapi.dto.RootDTO;
import org.pr7.rickandmortyapi.services.RootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
//@RequiredArgsConstructor
public class RootController {

    public RootController(RootService rootService){this.rootService = rootService;}

    //@Autowired
    //private RootService rootService;
    private final RootService rootService;

    @GetMapping("/{id}")
    public ResponseEntity <RootDTO> getDataById(@PathVariable("id") int id){
        return ResponseEntity.ok(rootService.getDataById(id));
    }


}
