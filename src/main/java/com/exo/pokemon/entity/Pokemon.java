package com.exo.pokemon.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


// @Table(name = "pokemon")
// @JsonIdentityInfo(
    //   generator = ObjectIdGenerators.PropertyGenerator.class,
    //   property = "id")
    @Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // @JsonIgnore
    // @JsonManagedReference
    @ManyToOne//fetch récupère les données le lazy "soit paraisseux" fait que la récupération se fait à la demande
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    private Type type;

    @JsonIgnore
    // @JsonManagedReference
    @ManyToOne//fetch récupère les données le lazy "soit paraisseux" fait que la récupération se fait à la demande
    @JoinColumn(name = "infirmiere_id", referencedColumnName = "id")
    private Infirmiere infirmiere;

    public Pokemon(){}

    public Pokemon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    public Infirmiere getInfirmiere() {
        return infirmiere;
    }


    public void setInfirmiere(Infirmiere infirmiere) {
        this.infirmiere = infirmiere;
    }
    

}
