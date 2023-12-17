package br.com.fiap.curso.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.curso.model.Pessoa;
import br.com.fiap.curso.service.PessoaService;

@RestController
@RequestMapping("/api/v1/pessoas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;

	@GetMapping
	public ResponseEntity<List<Pessoa>> listarPessoas() {
		return ResponseEntity.ok(this.pessoaService.listarTodasPessoas());
	}
	

    @GetMapping("/{id}")
    public Pessoa getClient(@PathVariable BigInteger id) {
        return pessoaService.obterPessoa(id);
    }

	@PostMapping
	public void salvarPessoa(@RequestBody Pessoa data) {
		pessoaService.gravarPessoa(data);
		return;
	}

	@PutMapping("/{id}")
	public void atualizarPessoa(@RequestBody Pessoa data, @PathVariable BigInteger id) {
		pessoaService.gravarPessoa(data);
		return;
	}
	
	@DeleteMapping("/{id}")
    public void deleteClient(@PathVariable BigInteger id) {
        pessoaService.apagarPessoa(id);
    }

}
