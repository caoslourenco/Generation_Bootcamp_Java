-- Criar o banco de dados (utilizarei o nome db_cidade_das_carnes para este exemplo)
CREATE DATABASE db_cidade_das_carnes;

-- Usar o banco de dados criado
USE db_cidade_das_carnes;

-- Criar a tabela tb_categorias
CREATE TABLE tb_categorias (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    descricao VARCHAR(100),
    tipo VARCHAR(50) NOT NULL
);

-- Inserir registros na tabela tb_categorias
INSERT INTO tb_categorias (nome, descricao, tipo) VALUES
('Carnes', 'Produtos de origem animal', 'Proteína'),
('Aves', 'Produtos de origem avícola', 'Proteína'),
('Peixes', 'Produtos de origem aquática', 'Proteína'),
('Frutas', 'Frutas frescas', 'Hortifruti'),
('Legumes', 'Legumes frescos', 'Hortifruti'),
('Verduras', 'Verduras frescas', 'Hortifruti'),
('Laticínios', 'Produtos lácteos', 'Lácteos'),
('Congelados', 'Produtos congelados', 'Congelados');

-- Criar a tabela tb_produtos
CREATE TABLE tb_produtos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    valor DECIMAL(10, 2) NOT NULL,
    quantidade INT NOT NULL,
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id)
);

-- Inserir registros na tabela tb_produtos
INSERT INTO tb_produtos (nome, valor, quantidade, id_categoria) VALUES
('Picanha', 80.00, 20, 1),
('Peito de Frango', 30.00, 30, 2),
('Salmão', 90.00, 15, 3),
('Maçã', 5.50, 50, 4),
('Cenoura', 3.00, 70, 5),
('Alface', 2.50, 60, 6),
('Queijo Minas', 25.00, 25, 7),
('Hambúrguer', 15.00, 40, 8);

-- Queries solicitadas

-- Produtos cujo valor seja maior do que R$ 50,00
SELECT * FROM tb_produtos WHERE valor > 50.00;

-- Produtos cujo valor esteja no intervalo R$ 50,00 e R$ 150,00
SELECT * FROM tb_produtos WHERE valor BETWEEN 50.00 AND 150.00;

-- Produtos que possuam a letra "C" no atributo nome
SELECT * FROM tb_produtos WHERE nome LIKE '%C%';

-- Unindo os dados da tabela tb_produtos com os dados da tabela tb_categorias
SELECT p.*, c.nome AS categoria_nome, c.descricao AS categoria_descricao, c.tipo AS categoria_tipo
FROM tb_produtos p
INNER JOIN tb_categorias c ON p.id_categoria = c.id;

-- Unindo os dados da tabela tb_produtos com os dados da tabela tb_categorias,
-- onde traga apenas os produtos que pertençam a uma categoria específica
SELECT p.*, c.nome AS categoria_nome, c.descricao AS categoria_descricao, c.tipo AS categoria_tipo
FROM tb_produtos p
INNER JOIN tb_categorias c ON p.id_categoria = c.id
WHERE c.nome IN ('Aves', 'Frutas');
