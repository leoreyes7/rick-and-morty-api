package org.pr7.rickandmortyapi.dto;

import java.util.ArrayList;

public class CharacterDTO {
    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private OriginDTO origin;
    private ArrayList episode;

    public CharacterDTO() {
    }

    public CharacterDTO(int id, String name, String status, String species, String type, OriginDTO origin, ArrayList episode) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.species = species;
        this.type = type;
        this.origin = origin;
        this.episode = episode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OriginDTO getOrigin() {
        return origin;
    }

    public void setOrigin(OriginDTO origin) {
        this.origin = origin;
    }

    public ArrayList getEpisode() {
        return episode;
    }

    public void setEpisode(ArrayList episode) {
        this.episode = episode;
    }
}
