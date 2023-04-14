package com.exo.pokemon.DTO;

import java.util.List;

import com.exo.pokemon.entity.Type;

public class TypeDTO {
    private Long id;
    private String type;
    private List<Long> pokemonIds;

    public TypeDTO() {}

    public TypeDTO(Type type) {
        this.id = type.getId();
        this.type = type.getType();
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the pokemonIds
     */
    public List<Long> getPokemonIds() {
        return pokemonIds;
    }

    /**
     * @param pokemonIds the pokemonIds to set
     */
    public void setPokemonIds(List<Long> pokemonIds) {
        this.pokemonIds = pokemonIds;
    }

    
}
