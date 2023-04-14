package com.exo.pokemon.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exo.pokemon.entity.Infirmiere;
import com.exo.pokemon.entity.Pokemon;
import com.exo.pokemon.repository.InfirmiereRepository;
import com.exo.pokemon.repository.PokemonRepository;

@RestController
public class InfirmiereController {

    @Autowired
    InfirmiereRepository infirmiereRepository;
    @Autowired
    PokemonRepository pokemonRepository;

    @DeleteMapping("/nurs/{name}")
    public ResponseEntity<?> deleteInfirmiereByName(@PathVariable String name) {
        Optional<Infirmiere> optionalInfirmiere = infirmiereRepository.findByName(name);
        if (optionalInfirmiere.isPresent()) {
            Infirmiere infirmiere = optionalInfirmiere.get();
            List<Pokemon> pokemonInfirmiere = infirmiere.getPokemonInfirmiere();
            for (Pokemon pokemon : pokemonInfirmiere) {
                pokemon.setInfirmiere(null);
            }
            infirmiereRepository.delete(infirmiere);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/nurs")
    public List<Infirmiere> fidAllInfermiere(){

       return  infirmiereRepository.findAll();

    }
 
    
}
