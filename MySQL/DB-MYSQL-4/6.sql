CREATE DATABASE db_curso_da_minha_vida;

USE db_curso_da_minha_vida;

CREATE TABLE tb_categorias (
    id_categoria INT PRIMARY KEY AUTO_INCREMENT,
    nome_categoria VARCHAR(100) NOT NULL,
    descricao_categoria VARCHAR(255) NOT NULL
);

CREATE TABLE tb_cursos (
    id_curso INT PRIMARY KEY AUTO_INCREMENT,
    nome_curso VARCHAR(100) NOT NULL,
    valor DECIMAL(10, 2) NOT NULL,
    duracao INT NOT NULL, 
    descricao_curso VARCHAR(255),
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id_categoria)
);

INSERT INTO tb_categorias (nome_categoria, descricao_categoria) VALUES
('Ferramentas', 'Ferramentas para construção e reparos em geral'),
('Materiais Elétricos', 'Materiais para instalações elétricas e manutenção'),
('Materiais Hidráulicos', 'Produtos para instalações e reparos hidráulicos'),
('Tintas e Acabamento', 'Tintas e materiais para acabamento de obras'),
('Móveis e Decoração', 'Móveis e acessórios para decoração de ambientes');

INSERT INTO tb_cursos (nome_curso, valor, duracao, descricao_curso, id_categoria) VALUES
('Curso de Eletricista', 650.00, 40, 'Curso básico de eletricista com certificado', 2),
('Curso de Pintura', 350.00, 20, 'Aprenda técnicas de pintura para interiores e exteriores', 4),
('Curso de Instalações Hidráulicas', 500.00, 30, 'Curso de encanamento e instalação de sistemas hidráulicos', 3),
('Curso de Mestre de Obras', 1200.00, 60, 'Curso avançado para formação de mestres de obras', 1),
('Curso de Automação Residencial', 900.00, 50, 'Aprenda a automatizar residências com tecnologia', 2),
('Curso de Design de Interiores', 700.00, 45, 'Curso de decoração e design de interiores', 5),
('Curso de Carpintaria', 450.00, 25, 'Aprenda técnicas de carpintaria para construção e reformas', 1),
('Curso de Pintor de Obras', 300.00, 15, 'Curso para quem deseja aprender a pintar paredes e detalhes', 4);

SELECT *
FROM tb_cursos 
WHERE valor > 500;

SELECT * FROM 
tb_cursos 
WHERE valor BETWEEN 600 AND 1000;

SELECT * FROM tb_cursos 
WHERE valor BETWEEN 600 AND 1000;

SELECT * FROM tb_cursos WHERE nome_curso LIKE '%J%';

SELECT c.id_curso, c.nome_curso, c.valor, c.duracao, c.descricao_curso, cat.nome_categoria
FROM tb_cursos c
INNER JOIN tb_categorias cat ON c.id_categoria = cat.id_categoria;

SELECT c.id_curso, c.nome_curso, c.valor, c.duracao, c.descricao_curso, cat.nome_categoria
FROM tb_cursos c
INNER JOIN tb_categorias cat ON c.id_categoria = cat.id_categoria
WHERE cat.nome_categoria = 'Tintas e Acabamento';

