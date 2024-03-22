-- Criar o banco de dados
CREATE DATABASE db_construindo_vidas;

-- Usar o banco de dados criado
USE db_construindo_vidas;

-- Criar a tabela tb_categorias
CREATE TABLE tb_categorias (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    descricao VARCHAR(100),
    tipo VARCHAR(50) NOT NULL
);

-- Inserir registros na tabela tb_categorias
INSERT INTO tb_categorias (nome, descricao, tipo) VALUES
('Ferramentas', 'Produtos relacionados a ferramentas para construção', 'Ferramentas'),
('Elétrica', 'Produtos relacionados a materiais elétricos', 'Elétrica'),
('Hidráulica', 'Produtos relacionados a materiais hidráulicos', 'Hidráulica'),
('Tintas', 'Produtos relacionados a tintas e materiais para pintura', 'Tintas'),
('Cimento e Argamassa', 'Produtos relacionados a cimento e argamassa', 'Materiais de Construção');

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
('Furadeira Elétrica', 149.90, 20, 1),
('Fio Elétrico 2.5mm', 89.99, 30, 2),
('Torneira Automática', 129.50, 15, 3),
('Tinta Acrílica Branca', 110.00, 25, 4),
('Cimento Portland', 30.75, 50, 5),
('Chave de Fenda', 15.50, 40, 1),
('Conduíte Flexível', 75.25, 35, 2),
('Pia de Cozinha', 250.00, 10, 3);

-- Queries solicitadas

-- Produtos cujo valor seja maior do que R$ 100,00
SELECT * FROM tb_produtos WHERE valor > 100.00;

-- Produtos cujo valor esteja no intervalo R$ 70,00 e R$ 150,00
SELECT * FROM tb_produtos WHERE valor BETWEEN 70.00 AND 150.00;

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
WHERE c.nome = 'Hidráulica';
