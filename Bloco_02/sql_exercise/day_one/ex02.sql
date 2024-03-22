CREATE TABLE produtos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    descricao TEXT,
    preco DECIMAL(10, 2),
    categoria VARCHAR(50),
    disponivel BOOLEAN
);

INSERT INTO produtos (nome, descricao, preco, categoria, disponivel) VALUES
('Smartphone XYZ', 'Smartphone avançado com câmera de alta resolução.', 899.99, 'Eletrônicos', true),
('Notebook ABC', 'Notebook com processador rápido e tela de alta definição.', 1200.00, 'Informática', true),
('Fone de Ouvido Bluetooth', 'Fone de ouvido sem fio com cancelamento de ruído.', 149.99, 'Acessórios', true),
('Camiseta Casual', 'Camiseta de algodão confortável para uso diário.', 29.99, 'Roupas', true),
('Tênis Esportivo', 'Tênis para corrida com amortecimento avançado.', 89.99, 'Calçados', true),
('Mochila Executiva', 'Mochila com compartimentos para notebook e acessórios.', 69.99, 'Acessórios', true),
('Cadeira Gamer', 'Cadeira ergonômica para longas sessões de jogos.', 399.99, 'Móveis', true),
('Teclado Gamer', 'Teclado mecânico com iluminação RGB e macros programáveis.', 129.99, 'Informática', true);

SELECT * FROM produtos WHERE preco > 500;

SELECT * FROM produtos WHERE preco < 500;

UPDATE produtos SET preco = 109.99 WHERE id = 1;
