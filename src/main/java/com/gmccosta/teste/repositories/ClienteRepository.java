package com.gmccosta.teste.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gmccosta.teste.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Serializable>{

}
