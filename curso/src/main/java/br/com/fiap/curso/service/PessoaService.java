package br.com.fiap.curso.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.curso.model.Pessoa;
import br.com.fiap.curso.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public void gravarPessoa(Pessoa pessoa) {
		this.pessoaRepository.save(pessoa);
	}
	
	public List<Pessoa> listarTodasPessoas() {
		return this.pessoaRepository.findAll();
	}
	
	public Pessoa obterPessoa(BigInteger id) {
		return this.pessoaRepository.findById(id).orElseThrow(RuntimeException::new);
	}
	
	public void apagarPessoa(BigInteger id) {
		pessoaRepository.deleteById(id);
	}

}
