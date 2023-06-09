package com.exo.pokemon.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exo.pokemon.entity.Infirmiere;

public interface InfirmiereRepository extends JpaRepository<Infirmiere, Long> {
    Optional<Infirmiere> findByName(String name);
}
