package com.skbprod.skbprod.objetivos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjetivoRepository extends JpaRepository<Objetivo, Long> {
}
