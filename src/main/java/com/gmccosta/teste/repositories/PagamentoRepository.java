package com.gmccosta.teste.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gmccosta.teste.domain.Pagamento;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Serializable>{

}
