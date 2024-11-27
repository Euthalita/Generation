CREATE DATABASE db_construindo_vidas;

USE db_construindo_vidas;

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
('Medicamentos', 'Produtos para tratamento de doenças'),
('Suplementos', 'Produtos para suplementação alimentar'),
('Higiene', 'Produtos de cuidados pessoais e higiene'),
('Beleza', 'Produtos de cosméticos e cuidados com a pele'),
('Hidráulica', 'Produtos e ferramentas para reparo hidráulico');

INSERT INTO tb_produtos (nome, valor, quantidade_estoque, id_categoria)
VALUES
('Paracetamol', 15.00, 100, 1),
('Aspirina', 18.00, 150, 1),
('Creatina', 120.00, 50, 2),
('Vitaminas', 45.00, 200, 2),
('Sabonete', 5.00, 300, 3),
('Shampoo', 30.00, 100, 3),
('Base Facial', 80.00, 75, 4),
('Ferramenta Hidráulica', 120.00, 30, 5);

SELECT * 
FROM tb_produtos 
WHERE valor > 100.00;

SELECT * 
FROM tb_produtos 
WHERE valor BETWEEN 70.00 AND 150.00;

SELECT p.nome AS nome_produto, p.valor, p.quantidade_estoque, c.nome AS nome_categoria, c.descricao 
FROM tb_produtos p
INNER JOIN tb_categorias c ON p.id_categoria = c.id;

SELECT p.nome AS nome_produto, p.valor, p.quantidade_estoque, c.nome AS nome_categoria, c.descricao 
FROM tb_produtos p
INNER JOIN tb_categorias c ON p.id_categoria = c.id
WHERE c.nome = 'Hidráulica';