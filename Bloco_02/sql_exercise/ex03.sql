CREATE TABLE estudantes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    idade INT,
    genero VARCHAR(10),
    curso VARCHAR(100),
    nota DECIMAL(3, 1)
);

-- Inserir dados dos estudantes
INSERT INTO estudantes (nome, idade, genero, curso, nota) VALUES
('João Silva', 20, 'Masculino', 'Engenharia', 8.5),
('Maria Santos', 22, 'Feminino', 'Medicina', 9.2),
('Pedro Oliveira', 21, 'Masculino', 'Administração', 7.8),
('Ana Souza', 19, 'Feminino', 'Direito', 6.5),
('Carlos Pereira', 23, 'Masculino', 'Economia', 8.0),
('Juliana Lima', 20, 'Feminino', 'Psicologia', 7.3),
('Lucas Rodrigues', 21, 'Masculino', 'Arquitetura', 6.8),
('Mariana Costa', 22, 'Feminino', 'Ciência da Computação', 8.7);

SELECT * FROM estudantes WHERE nota > 7.0;

SELECT * FROM estudantes WHERE nota < 7.0;

UPDATE estudantes SET nota = 7.5 WHERE id = 4;
