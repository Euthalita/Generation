CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categorias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,         
    descricao VARCHAR(255) NOT NULL    
);

CREATE TABLE tb_pizzas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    valor DECIMAL(10, 2) NOT NULL,
    tamanho VARCHAR(20) NOT NULL,
    id_categoria INT NOT NULL,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias (nome, descricao)
VALUES
('Salgadas', 'Pizzas salgadas com variados sabores, como carne, frango, calabresa.'),
('Doces', 'Pizzas com coberturas doces, como chocolate, frutas e outros.'),
('Veganas', 'Pizzas sem ingredientes de origem animal, com substitutos vegetais.'),
('Integrais', 'Pizzas feitas com massa integral, mais saudáveis.'),
('Especiais', 'Pizzas com ingredientes diferenciados, como trufas e ingredientes gourmet.');

INSERT INTO tb_pizzas (nome, valor, tamanho, id_categoria)
VALUES
('Pizza de Calabresa', 45.00, 'Média', 1),
('Pizza de Margherita', 38.00, 'Grande', 1),
('Pizza de Chocolate', 55.00, 'Média', 2),
('Pizza de Banana com Canela', 50.00, 'Pequena', 2),
('Pizza Vegana de Cogumelos', 65.00, 'Grande', 3),
('Pizza de Brócolis com Alho', 60.00, 'Média', 3),
('Pizza Integral de Tomate Seco', 52.00, 'Pequena', 4),
('Pizza Especial de Trufas', 120.00, 'Grande', 5);

SELECT * 
FROM tb_pizzas 
WHERE valor > 45.00;

SELECT * 
FROM tb_pizzas 
WHERE valor BETWEEN 50.00 AND 100.00;

SELECT * 
FROM tb_pizzas 
WHERE nome LIKE '%M%';

SELECT p.nome AS nome_pizza, p.valor, p.tamanho, c.nome AS nome_categoria, c.descricao 
FROM tb_pizzas p
INNER JOIN tb_categorias c ON p.id_categoria = c.id;

SELECT p.nome AS nome_pizza, p.valor, p.tamanho, c.nome AS nome_categoria, c.descricao 
FROM tb_pizzas p
INNER JOIN tb_categorias c ON p.id_categoria = c.id
WHERE c.nome = 'Doces';

