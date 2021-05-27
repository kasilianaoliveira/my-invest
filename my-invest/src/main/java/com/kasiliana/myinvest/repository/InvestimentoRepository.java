package com.kasiliana.myinvest.repository;

import com.kasiliana.myinvest.domain.Investimento;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {

}
