CREATE DATABASE ecommerce;

USE ecommerce;

CREATE TABLE produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT,
    preco DECIMAL(12, 2) NOT NULL,
    quantidade_estoque INT NOT NULL
);

INSERT INTO produtos (nome, descricao, preco, quantidade_estoque)
VALUES
('Smartphone XYZ', 'Smartphone com 6GB de RAM e 128GB de armazenamento', 1200.00, 50),
('Camiseta Básica', 'Camiseta de algodão, tamanho M, diversas cores', 49.90, 200),
('Notebook ABC', 'Notebook com processador i7 e 16GB de RAM', 3500.00, 30),
('Fone de Ouvido', 'Fone de ouvido sem fio, com cancelamento de ruído', 899.90, 100),
('Tênis Running', 'Tênis para corrida, modelo leve e confortável', 250.00, 150),
('Smartwatch Pro', 'Relógio inteligente com monitoramento de saúde', 599.00, 80),
('Cadeira Gamer', 'Cadeira ergonômica para jogos, ajustável', 750.00, 40),
('Livro Python', 'Livro sobre programação em Python para iniciantes', 89.90, 500);

SELECT * FROM produtos
WHERE preco > 500;

SELECT * FROM produtos
WHERE preco < 500;

UPDATE produtos
SET preco = 220.00, quantidade_estoque = 200
WHERE nome = 'Tênis Running';

