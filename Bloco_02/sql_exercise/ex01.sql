-- tabela de colaboradores
CREATE TABLE colaboradores (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    cargo VARCHAR(100),
    salario DECIMAL(10, 2),
    departamento VARCHAR(100),
    data_contratacao DATE
);

-- Inserir -  tabela de colaboradores
INSERT INTO colaboradores (nome, cargo, salario, departamento, data_contratacao) VALUES
('João Silva', 'Analista de RH', 2500.00, 'Recursos Humanos', '2022-01-15'),
('Maria Santos', 'Assistente Administrativo', 1800.00, 'Administrativo', '2021-08-20'),
('Pedro Oliveira', 'Programador', 3500.00, 'Tecnologia', '2022-03-10'),
('Ana Souza', 'Analista Financeiro', 2200.00, 'Financeiro', '2021-11-05'),
('Carlos Pereira', 'Gerente de Vendas', 2800.00, 'Vendas', '2021-05-25');

-- SELECT que retorna todos os colaboradores com salário maior do que 2000
SELECT * FROM colaboradores WHERE salario > 2000;

-- SELECT que retorna todos os colaboradores com salário menor do que 2000
SELECT * FROM colaboradores WHERE salario < 2000;

-- Atualizar um registro na tabela de colaboradores
UPDATE colaboradores SET salario = 2300.00 WHERE id = 2;
