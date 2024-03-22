-- Criar o banco de dados
CREATE DATABASE db_farmacia_bem_estar;

-- Usar o banco de dados criado
USE db_farmacia_bem_estar;

-- Criar a tabela tb_categorias
CREATE TABLE tb_categorias (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    descricao VARCHAR(100),
    tipo VARCHAR(50) NOT NULL
);

-- Inserir registros na tabela tb_categorias
INSERT INTO tb_categorias (nome, descricao, tipo) VALUES
('Medicamentos', 'Produtos para tratamento de doenças', 'Remédios'),
('Cosméticos', 'Produtos para cuidados com a pele e cabelos', 'Beleza'),
('Higiene', 'Produtos para higiene pessoal', 'Higiene'),
('Vitaminas', 'Suplementos vitamínicos', 'Saúde'),
('Alimentação', 'Produtos alimentícios especiais', 'Alimentação');

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
('Paracetamol', 10.50, 100, 1),
('Shampoo', 15.75, 50, 2),
('Creme Dental', 5.25, 80, 3),
('Vitamina C', 20.00, 30, 4),
('Protetor Solar', 35.00, 40, 2),
('Sabonete Líquido', 8.99, 70, 3),
('Creme Hidratante', 25.50, 25, 2),
('Barra de Cereal', 4.75, 120, 5);

-- Queries solicitadas

-- Produtos cujo valor seja maior do que R$ 50,00
SELECT * FROM tb_produtos WHERE valor > 50.00;

-- Produtos cujo valor esteja no intervalo R$ 5,00 e R$ 60,00
SELECT * FROM tb_produtos WHERE valor BETWEEN 5.00 AND 60.00;

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
WHERE c.nome = 'Cosméticos';
