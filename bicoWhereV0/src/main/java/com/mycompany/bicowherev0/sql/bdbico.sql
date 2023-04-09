USE bicoapp;

CREATE TABLE usuario (
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(50) NOT NULL,
  sobrenome VARCHAR(50) NOT NULL,
  usuario VARCHAR(50) NOT NULL,
  senha VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE categoria (
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE produtos (
  id INT NOT NULL AUTO_INCREMENT,
  nome_produto VARCHAR(100) NOT NULL,
  qtd_produto INT NOT NULL,
  preco DECIMAL(10,2) NOT NULL,
  data_validade DATE NOT NULL,
  data_entrada DATE NOT NULL,
  valor_total DECIMAL(10,2) NOT NULL,
  id_usuario INT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (id_usuario) REFERENCES usuario(id)
);

CREATE TABLE produtos_categoria (
  id_produto INT NOT NULL,
  id_categoria INT NOT NULL,
  FOREIGN KEY (id_produto) REFERENCES produtos(id),
  FOREIGN KEY (id_categoria) REFERENCES categoria(id),
  PRIMARY KEY (id_produto, id_categoria)
);
