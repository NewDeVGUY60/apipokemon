package com.exo.pokemon.repository;


import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.exo.pokemon.entity.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
   Optional<Pokemon> findByName(String name);
   
    // void deleteByName(String name);
}
