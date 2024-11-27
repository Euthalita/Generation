CREATE DATABASE escola;

USE escola;

CREATE TABLE estudantes(
id INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
data_nascimento DATE NOT NULL,
nota DECIMAL(3, 1) NOT NULL,
turma VARCHAR(20) NOT NULL
);

INSERT INTO estudantes (nome, data_nascimento, nota, turma)
VALUES
('Maria Silva', '2005-03-15', 8.5, '1A'),
('João Pereira', '2004-07-20', 7.0, '1A'),
('Ana Costa', '2005-11-30', 9.0, '1B'),
('Carlos Souza', '2004-09-10', 6.5, '1B'),
('Julia Almeida', '2005-02-02', 8.0, '2A'),
('Ricardo Mendes', '2004-10-18', 7.5, '2A'),
('Beatriz Oliveira', '2005-06-22', 6.0, '2B'),
('Lucas Martins', '2004-12-05', 7.8, '2B');

SELECT * FROM estudantes
WHERE nota > 7.0;

SELECT * FROM estudantes
WHERE nota < 7.0;

SELECT id FROM estudantes WHERE nome = 'Carlos Souza';

UPDATE estudantes
SET nota = 7.2
WHERE id = 4;


CREATE TABLE notas(
id INT AUTO_INCREMENT PRIMARY KEY,
id_estudante INT NOT NULL,
p1 DECIMAL(3, 1),
p2 DECIMAL(3, 1),
p3 DECIMAL(3, 1),
FOREIGN KEY (id_estudante) REFERENCES estudantes(id)
);

INSERT INTO notas (id_estudante, p1, p2, p3) VALUES
(1, 8.5, 7.0, 9.0),   
(2, 7.5, 8.0, 6.5),   
(3, 6.5, 7.0, 8.0),   
(4, 9.0, 8.5, 7.5),   
(5, 7.0, 6.5, 7.5),   
(6, 8.0, 8.5, 9.5),   
(7, 7.5, 7.0, 8.5),   
(8, 6.0, 5.5, 6.5);

SELECT * FROM notas;