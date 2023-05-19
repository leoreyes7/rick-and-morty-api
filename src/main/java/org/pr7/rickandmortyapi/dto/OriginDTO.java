package org.pr7.rickandmortyapi.dto;

import java.util.ArrayList;
import java.util.Arrays;

public class OriginDTO {
    private String name;
    private String url;
    private String dimension;
    private ArrayList residents;

    public OriginDTO() {
    }

    public OriginDTO(String name, String url, String dimension, ArrayList residents) {
        this.name = name;
        this.url = url;
        this.dimension = dimension;
        this.residents = residents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public ArrayList getResidents() {
        return residents;
    }

    public void setResidents(ArrayList residents) {
        this.residents = residents;
    }
}
