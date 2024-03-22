-- Criar o banco de dados
CREATE DATABASE db_pizzaria_legal;

-- Usar o banco de dados criado
USE db_pizzaria_legal;

-- Criar a tabela tb_categorias
CREATE TABLE tb_categorias (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    descricao VARCHAR(100)
);

-- Inserir registros na tabela tb_categorias
INSERT INTO tb_categorias (nome, descricao) VALUES
('Salgada', 'Pizzas com recheios salgados'),
('Doce', 'Pizzas com recheios doces'),
('Vegetariana', 'Pizzas sem carne'),
('Especial', 'Pizzas especiais'),
('Vegana', 'Pizzas sem ingredientes de origem animal');

-- Criar a tabela tb_pizzas
CREATE TABLE tb_pizzas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    valor DECIMAL(10, 2) NOT NULL,
    ingredientes VARCHAR(255),
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id)
);

-- Inserir registros na tabela tb_pizzas
INSERT INTO tb_pizzas (nome, valor, ingredientes, id_categoria) VALUES
('Mussarela', 35.90, 'Molho de tomate, mussarela', 1),
('Calabresa', 40.50, 'Molho de tomate, calabresa, cebola, mussarela', 1),
('Marguerita', 48.75, 'Molho de tomate, mussarela, tomate, manjericão', 1),
('Quatro Queijos', 52.80, 'Molho de tomate, mussarela, provolone, parmesão, gorgonzola', 1),
('Chocolate', 45.00, 'Chocolate derretido, morangos', 2),
('Banana com Canela', 47.50, 'Banana, canela, leite condensado', 2),
('Vegetariana', 55.00, 'Molho de tomate, palmito, champignon, pimentão, cebola, azeitonas', 3),
('Vegana', 60.00, 'Molho de tomate, vegetais variados, tofu', 5);

-- Queries solicitadas

-- Pizzas cujo valor seja maior do que R$ 45,00
SELECT * FROM tb_pizzas WHERE valor > 45.00;

-- Pizzas cujo valor esteja no intervalo R$ 50,00 e R$ 100,00
SELECT * FROM tb_pizzas WHERE valor BETWEEN 50.00 AND 100.00;

-- Pizzas que possuam a letra "M" no atributo nome
SELECT * FROM tb_pizzas WHERE nome LIKE '%M%';

-- Unindo os dados da tabela tb_pizzas com os dados da tabela tb_categorias
SELECT p.*, c.nome AS categoria_nome, c.descricao AS categoria_descricao
FROM tb_pizzas p
INNER JOIN tb_categorias c ON p.id_categoria = c.id;

-- Unindo os dados da tabela tb_pizzas com os dados da tabela tb_categorias,
-- onde traga apenas as pizzas que pertençam a uma categoria específica
SELECT p.*, c.nome AS categoria_nome, c.descricao AS categoria_descricao
FROM tb_pizzas p
INNER JOIN tb_categorias c ON p.id_categoria = c.id
WHERE c.nome = 'Doce';
