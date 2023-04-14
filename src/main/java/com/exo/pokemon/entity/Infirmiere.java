package com.exo.pokemon.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Infirmiere {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // @JsonIgnore
    // @JsonBackReference
    @OneToMany(mappedBy = "infirmiere")
    private List<Pokemon> pokemonInfirmiere;

   
    public Infirmiere() {}

    public Infirmiere( String name) {
        
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Pokemon> getPokemonInfirmiere() {
        return pokemonInfirmiere;
    }


    public void setPokemonInfirmiere(List<Pokemon> pokemonInfirmiere) {
        this.pokemonInfirmiere = pokemonInfirmiere;
    }


}
