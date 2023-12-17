package br.com.fiap.curso.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.curso.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, BigInteger> {

}
