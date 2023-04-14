package com.exo.pokemon.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exo.pokemon.entity.Pokemon;
import com.exo.pokemon.entity.Type;
import com.exo.pokemon.repository.PokemonRepository;
import com.exo.pokemon.repository.TypeRepository;

@RestController
public class PokemonController {

    @Autowired
    TypeRepository typeRepository;
    @Autowired
    PokemonRepository pokemonRepository;
    
@PostMapping("/pokemons/add-pokemon")
public Pokemon createPokemon(@RequestBody Pokemon pokemon, @RequestParam Long typeid){

    Type newType = typeRepository.findById(typeid).get();

    pokemon.setType(newType);
    
return pokemonRepository.save(pokemon);

}

@GetMapping("/pokemons")
public List<Pokemon> findAllPokemon(){

    return pokemonRepository.findAll();
}
@GetMapping("/pokemons/{name}")
public ResponseEntity<?>  findPokemonByName(@PathVariable String name) {
    Optional<Pokemon> pokemon = pokemonRepository.findByName(name);
    if (pokemon.isPresent()) {
        
        return ResponseEntity.ok(pokemon.get());
    } else {
        return ResponseEntity.notFound().build();
    }
}


@PutMapping("/pokemons/{name}")
public Pokemon updatePokemonName(@PathVariable String name, @RequestParam String newName){

    Pokemon pokemonToUpdate = pokemonRepository.findByName(name).get();

    pokemonToUpdate.setName(newName);
    pokemonRepository.save(pokemonToUpdate);

    return pokemonRepository.findByName(newName).get();
}

@DeleteMapping("/pokemons/{name}")
public ResponseEntity<?> deletePokemonByName(@PathVariable String name) {
    Optional<Pokemon> optionalPokemon = pokemonRepository.findByName(name);
    // if (optionalPokemon.isPresent()) {
        // Pokemon pokemon = optionalPokemon.get();
        // pokemonRepository.delete(pokemon);
      Type pokemonType = optionalPokemon.get().getType();
        pokemonType.getPokemonWithType().remove(optionalPokemon.get());
        pokemonRepository.delete(optionalPokemon.get());
        return ResponseEntity.ok().build();
    // } else {
    //     return ResponseEntity.notFound().build();
    // }
}
}





// 1. Post qui rentre le nom, et type du pokemon (Feu, air, water, shadow)
// 2.Get qui renvoie tous les pokemon
// 3.Get qui renvoie un pokémon  par son nom
// 4.Put qui permet de modifier le nom du pokémon
// 5. Delete qui permet de supprimer le pokemon