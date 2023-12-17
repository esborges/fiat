DROP TABLE IF EXISTS curso.pessoa;
DROP TABLE IF EXISTS curso.endereco;

DROP SEQUENCE IF EXISTS curso.endereco_seq;
DROP SEQUENCE IF EXISTS curso.pessoa_seq;

CREATE SEQUENCE curso.endereco_seq;
CREATE SEQUENCE curso.pessoa_seq;


CREATE TABLE curso.endereco
	(
	id_endereco           SERIAL NOT NULL,
	logradouro            VARCHAR (100),
	numero                INTEGER,
	complemento           VARCHAR (50),
	bairro                VARCHAR (50),
	cep                   VARCHAR (8),
	cidade                VARCHAR (50),
	estado                CHARACTER (2),
	cd_iso_pais           CHARACTER (2),
	CONSTRAINT endereco_pkey PRIMARY KEY (id_endereco)
	);

CREATE TABLE curso.pessoa
	(
	id_pessoa                        SERIAL NOT NULL,
	id_endereco                      BIGINT,
	nome_completo                    VARCHAR (255),
	sexo                             CHAR(1),
	documento                        VARCHAR (30),
	CONSTRAINT pessoa_pkey PRIMARY KEY (id_pessoa),
	CONSTRAINT fk_id_endereco FOREIGN KEY (id_endereco) REFERENCES curso.endereco (id_endereco)
	);