CREATE DATABASE RH;

USE RH; 

CREATE TABLE colaboradores(
id BIGINT AUTO_INCREMENT,
nome VARCHAR(60) NOT NULL,
data_nascimento DATE,
cpf VARCHAR (14) NOT NULL,
cargo VARCHAR(80),
salario DECIMAL(10,2), 
PRIMARY KEY (id)
);

INSERT INTO colaboradores (nome, data_nascimento, cpf, cargo, salario) VALUES
('Ana Costa', '1985-04-12', '123.456.789-01', 'Assistente de RH', 3000.00),
('Beatriz Lima', '1990-08-22', '234.567.890-12', 'Analista de Recrutamento e Seleção', 4000.00),
('Carlos Pereira', '1982-02-15', '345.678.901-23', 'Coordenador de RH', 6000.00),
('Juliana Santos', '1988-11-05', '456.789.012-34', 'Gerente de Recursos Humanos', 8500.00),
('Ricardo Oliveira', '1980-09-30', '567.890.123-45', 'Diretor de Recursos Humanos', 12000.00);

SELECT * FROM colaboradores WHERE salario > 2000;

SELECT * FROM colaboradores WHERE salario < 2000;

UPDATE colaboradores SET salario = 1900.00 WHERE LOWER(cargo) = 'Assistente de RH' AND id = 1; 

UPDATE colaboradores SET salario = 2500.00 WHERE cargo = 'Analista de Recrutamento e Seleção' AND id = 2;




