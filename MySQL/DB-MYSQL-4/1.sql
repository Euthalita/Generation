CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classes(
id INT AUTO_INCREMENT PRIMARY KEY,
nome_classe VARCHAR(100) NOT NULL,
descricao VARCHAR(255) NOT NULL
);

CREATE TABLE tb_personagens (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,               
    poder_ataque INT NOT NULL,               
    poder_defesa INT NOT NULL,                
    id_classe INT NOT NULL,                   
    FOREIGN KEY (id_classe) REFERENCES tb_classes(id)  
);

INSERT INTO tb_classes (nome_classe, descricao)
VALUES
('Guerreiro', 'Classe focada em combate corpo a corpo com grande resistência e força.'),
('Arqueiro', 'Classe especializada em ataques à distância com alta precisão e velocidade.'),
('Mago', 'Classe que usa magia poderosa, com ataques de longo alcance e habilidades especiais.'),
('Ladino', 'Classe ágil e furtiva, especializada em ataques rápidos e evasivos.'),
('Paladino', 'Classe que combina habilidades de combate com poderes curativos e de defesa.');

INSERT INTO tb_personagens (nome, poder_ataque, poder_defesa, id_classe)
VALUES
('Aragorn', 2500, 1500, 1),   
('Legolas', 1800, 1200, 2),   
('Gandalf', 3000, 800, 3),    
('Thief', 2200, 900, 4),     
('Lancelot', 2700, 1700, 5), 
('Frodo', 500, 800, 4),      
('Boromir', 2400, 1600, 1),   
('Elrond', 1500, 1200, 3);    

SELECT * 
FROM tb_personagens 
WHERE poder_ataque > 2000;

SELECT * 
FROM tb_personagens 
WHERE poder_defesa BETWEEN 1000 AND 2000;

SELECT * 
FROM tb_personagens 
WHERE nome LIKE '%C%';

SELECT p.nome AS nome_personagem, p.poder_ataque, p.poder_defesa, c.nome_classe AS nome_classe, c.descricao 
FROM tb_personagens p
INNER JOIN tb_classes c ON p.id_classe = c.id;

SELECT p.nome AS nome_personagem, p.poder_ataque, p.poder_defesa AS nome_classe, c.descricao 
FROM tb_personagens p
INNER JOIN tb_classes c ON p.id_classe = c.id
WHERE c.nome_classe = 'Arqueiro';





