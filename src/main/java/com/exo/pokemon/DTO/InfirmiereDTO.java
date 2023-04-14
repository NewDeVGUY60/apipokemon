package com.exo.pokemon.DTO;

import java.util.List;

public class InfirmiereDTO {
    
    private Long id;
    private String name;
    private List<Long> pokemonIds;

    public InfirmiereDTO() {}

    public InfirmiereDTO(Long id, String name, List<Long> pokemonIds) {
        this.id = id;
        this.name = name;
        this.pokemonIds = pokemonIds;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
