package com.kasiliana.myinvest.repository;

import com.kasiliana.myinvest.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
