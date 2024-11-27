CREATE DATABASE cidade_dos_vegetais;

USE cidade_dos_vegetais;

CREATE TABLE tb_categorias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    descricao VARCHAR(255) NOT NULL
);

INSERT INTO tb_categorias (nome, descricao)
VALUES
('Folhosos', 'Vegetais com folhas comestíveis, como alface, couve, etc.'),
('Raízes', 'Vegetais que crescem no solo e têm raízes comestíveis, como cenoura, beterraba.'),
('Frutas', 'Vegetais que possuem propriedades frutíferas, como tomate, pepino.'),
('Legumes', 'Vegetais comestíveis que não se encaixam em outras categorias, como abobrinha.'),
('Tubérculos', 'Vegetais comestíveis que crescem no solo e são ricos em amido, como batata.');

CREATE TABLE tb_produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    valor DECIMAL(10, 2) NOT NULL,
    quantidade_estoque INT NOT NULL,
    id_categoria INT NOT NULL,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id)
);

INSERT INTO tb_produtos (nome, valor, quantidade_estoque, id_categoria)
VALUES
('Alface', 4.50, 150, 1),
('Cenoura', 6.00, 100, 2),
('Tomate', 8.00, 200, 3),
('Abobrinha', 7.50, 80, 4),
('Batata', 10.00, 250, 5),
('Couve', 5.00, 120, 1),
('Beterraba', 9.00, 90, 2),
('Pepino', 7.00, 130, 3);

SELECT * 
FROM tb_produtos 
WHERE valor > 50.00;

SELECT * 
FROM tb_produtos 
WHERE valor BETWEEN 50.00 AND 150.00;

SELECT * 
FROM tb_produtos 
WHERE nome LIKE '%C%';

SELECT p.nome AS nome_produto, p.valor, p.quantidade_estoque, c.nome AS nome_categoria, c.descricao 
FROM tb_produtos p
INNER JOIN tb_categorias c ON p.id_categoria = c.id;

SELECT p.nome AS nome_produto, p.valor, p.quantidade_estoque, c.nome AS nome_categoria, c.descricao 
FROM tb_produtos p
INNER JOIN tb_categorias c ON p.id_categoria = c.id
WHERE c.nome = 'Raízes';