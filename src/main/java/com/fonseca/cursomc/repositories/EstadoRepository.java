package com.fonseca.cursomc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fonseca.cursomc.domain.Cidade;
import com.fonseca.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Cidade, Integer> {
	
}
