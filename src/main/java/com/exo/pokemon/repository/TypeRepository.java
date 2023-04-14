package com.exo.pokemon.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.exo.pokemon.entity.Type;

public interface TypeRepository extends JpaRepository<Type, Long> {

}
