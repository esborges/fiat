package br.com.fiap.curso.model;

import java.math.BigInteger;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity(name = "pessoa")
@Table(name = "pessoa", schema = "curso")
public class Pessoa {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pessoa", nullable = false)
	private BigInteger idPessoa;
	
	private String nomeCompleto;
	
	private String sexo;
	
	private String documento;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;
}
