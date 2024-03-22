-- Criar o banco de dados
CREATE DATABASE db_generation_game_online;

-- Usar o banco de dados criado
USE db_generation_game_online;

-- Criar a tabela tb_classes
CREATE TABLE tb_classes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    tipo VARCHAR(50) NOT NULL
);

-- Inserir registros na tabela tb_classes
INSERT INTO tb_classes (nome, tipo) VALUES
('Guerreiro', 'Melee'),
('Arqueiro', 'Longa distância'),
('Mago', 'Magia'),
('Lutador', 'Melee'),
('Assassino', 'Furtividade');

-- Criar a tabela tb_personagens
CREATE TABLE tb_personagens (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    poder_ataque INT NOT NULL,
    poder_defesa INT NOT NULL,
    id_classe INT,
    FOREIGN KEY (id_classe) REFERENCES tb_classes(id)
);

-- Inserir registros na tabela tb_personagens
INSERT INTO tb_personagens (nome, poder_ataque, poder_defesa, id_classe) VALUES
('Herói', 2500, 1500, 1),
('Arqueiro Ágil', 1800, 1200, 2),
('Mago Poderoso', 3000, 800, 3),
('Guerreiro Resistente', 2200, 2500, 1),
('Assassino Furtivo', 2000, 1000, 5),
('Lutador Bruto', 2800, 1800, 4),
('Arqueira Ágil', 1900, 1100, 2),
('Feiticeiro Místico', 2700, 1200, 3);

-- Queries solicitadas

-- Personagens cujo poder de ataque seja maior do que 2000
SELECT * FROM tb_personagens WHERE poder_ataque > 2000;

-- Personagens cujo poder de defesa esteja no intervalo 1000 e 2000
SELECT * FROM tb_personagens WHERE poder_defesa BETWEEN 1000 AND 2000;

-- Personagens que possuam a letra "C" no atributo nome
SELECT * FROM tb_personagens WHERE nome LIKE '%C%';

-- Unindo os dados da tabela tb_personagens com os dados da tabela tb_classes
SELECT p.*, c.nome AS classe_nome, c.tipo AS classe_tipo
FROM tb_personagens p
INNER JOIN tb_classes c ON p.id_classe = c.id;

-- Unindo os dados da tabela tb_personagens com os dados da tabela tb_classes,
-- onde traga apenas os personagens da classe dos arqueiros
SELECT p.*, c.nome AS classe_nome, c.tipo AS classe_tipo
FROM tb_personagens p
INNER JOIN tb_classes c ON p.id_classe = c.id
WHERE c.nome = 'Arqueiro';
