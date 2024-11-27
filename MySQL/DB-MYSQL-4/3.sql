CREATE DATABASE db_farmacia_bem_estar;

USE db_farmacia_bem_estar;

CREATE TABLE tb_categorias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    descricao VARCHAR(255) NOT NULL
);

CREATE TABLE tb_produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    valor DECIMAL(10, 2) NOT NULL,
    quantidade_estoque INT NOT NULL,
    id_categoria INT NOT NULL,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias (nome, descricao)
VALUES
('Medicamentos', 'Produtos para tratamentos médicos, como remédios e analgésicos.'),
('Cosméticos', 'Produtos de beleza e cuidados pessoais, como cremes e maquiagens.'),
('Higiene', 'Produtos para higiene pessoal, como sabonetes, pasta de dente e desodorantes.'),
('Suplementos', 'Suplementos alimentares e vitamínicos para saúde e bem-estar.'),
('Beleza', 'Produtos voltados para cuidados estéticos, como esmaltes e maquiagens.');

INSERT INTO tb_produtos (nome, valor, quantidade_estoque, id_categoria)
VALUES
('Aspirina', 15.00, 50, 1),
('Shampoo Anticaspa', 30.00, 30, 2),
('Sabonete Líquido', 5.50, 100, 3),
('Multivitamínico', 45.00, 20, 4),
('Esmalte Vermelho', 12.00, 150, 5),
('Ibuprofeno', 20.00, 60, 1),
('Desodorante Roll-On', 7.50, 80, 3),
('Creme Hidratante', 25.00, 40, 2);

SELECT * 
FROM tb_produtos 
WHERE valor > 50.00;

SELECT * 
FROM tb_produtos 
WHERE valor BETWEEN 5.00 AND 60.00;

SELECT * 
FROM tb_produtos 
WHERE nome LIKE '%C%';

SELECT p.nome AS nome_produto, p.valor, p.quantidade_estoque, c.nome AS nome_categoria, c.descricao 
FROM tb_produtos p
INNER JOIN tb_categorias c ON p.id_categoria = c.id;

SELECT p.nome AS nome_produto, p.valor, p.quantidade_estoque, c.nome AS nome_categoria, c.descricao 
FROM tb_produtos p
INNER JOIN tb_categorias c ON p.id_categoria = c.id
WHERE c.nome = 'Cosméticos';
