package com.exo.pokemon.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;





@Entity
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;

    @JsonIgnore
    // @JsonBackReference
    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
    private List<Pokemon> pokemonWithType;

    public Type() {
    }

    public Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
     * @return the pokemonWithType
     */
    public List<Pokemon> getPokemonWithType() {
        return pokemonWithType;
    }

    /**
     * @param pokemonWithType the pokemonWithType to set
     */
    public void setPokemonWithType(List<Pokemon> pokemonWithType) {
        this.pokemonWithType = pokemonWithType;
    }

    

}
