-- Criar o banco de dados
CREATE DATABASE db_curso_da_minha_vida;

-- Usar o banco de dados criado
USE db_curso_da_minha_vida;

-- Criar a tabela tb_categorias
CREATE TABLE tb_categorias (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    descricao VARCHAR(100),
    nivel VARCHAR(20) NOT NULL
);

-- Inserir registros na tabela tb_categorias
INSERT INTO tb_categorias (nome, descricao, nivel) VALUES
('Programação', 'Cursos de programação', 'Intermediário'),
('Marketing Digital', 'Cursos de marketing online', 'Avançado'),
('Design Gráfico', 'Cursos de design para mídias digitais', 'Básico'),
('Finanças', 'Cursos de finanças pessoais e investimentos', 'Avançado'),
('Idiomas', 'Cursos de idiomas estrangeiros', 'Intermediário');

-- Criar a tabela tb_cursos
CREATE TABLE tb_cursos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    valor DECIMAL(10, 2) NOT NULL,
    carga_horaria INT NOT NULL,
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id)
);

-- Inserir registros na tabela tb_cursos
INSERT INTO tb_cursos (nome, valor, carga_horaria, id_categoria) VALUES
('Java Fundamentals', 699.99, 40, 1),
('Marketing de Conteúdo', 899.50, 30, 2),
('Introdução ao Photoshop', 499.00, 20, 3),
('Investimentos em Ações', 799.00, 35, 4),
('Inglês Intermediário', 599.99, 50, 5),
('Python Avançado', 999.00, 45, 1),
('Estratégias de SEO', 750.75, 25, 2),
('Ilustração Digital', 549.90, 30, 3);

-- Queries solicitadas

-- Cursos cujo valor seja maior do que R$ 500,00
SELECT * FROM tb_cursos WHERE valor > 500.00;

-- Cursos cujo valor esteja no intervalo R$ 600,00 e R$ 1000,00
SELECT * FROM tb_cursos WHERE valor BETWEEN 600.00 AND 1000.00;

-- Cursos que possuam a letra "J" no atributo nome
SELECT * FROM tb_cursos WHERE nome LIKE '%J%';

-- Unindo os dados da tabela tb_cursos com os dados da tabela tb_categorias
SELECT c.*, cat.nome AS categoria_nome, cat.descricao AS categoria_descricao, cat.nivel AS categoria_nivel
FROM tb_cursos c
INNER JOIN tb_categorias cat ON c.id_categoria = cat.id;

-- Unindo os dados da tabela tb_cursos com os dados da tabela tb_categorias,
-- onde traga apenas os cursos que pertençam a uma categoria específica
SELECT c.*, cat.nome AS categoria_nome, cat.descricao AS categoria_descricao, cat.nivel AS categoria_nivel
FROM tb_cursos c
INNER JOIN tb_categorias cat ON c.id_categoria = cat.id
WHERE cat.nome = 'Programação';
