# Comandos do compilador Java
JAVAC = javac
JAVA = java

# Diretórios
SRC_DIR = .
BIN_DIR = bin

# Listagem dos arquivos fonte
SOURCES = $(wildcard $(SRC_DIR)/*.java)

# Objetos
CLASSES = $(SOURCES:$(SRC_DIR)/%.java=$(BIN_DIR)/%.class)

# Nome dos executáveis
EXECUTABLES = ChecaIdade

# Comando para remover arquivos
RM = rm -rf

# Alvo padrão
all: $(EXECUTABLES)

# Compilação
$(BIN_DIR)/%.class: $(SRC_DIR)/%.java
	@mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $<

# Regra para executar cada programa
ChecaIdade: $(BIN_DIR)/ChecaIdade.class
	$(JAVA) -cp $(BIN_DIR) aula_exceptions.ChecaIdade

# Limpar arquivos temporários
clean:
	$(RM) $(BIN_DIR)

# Remover tudo, incluindo executáveis e objetos
fclean: clean

# Regra para reconstruir o programa do zero
re: fclean all

# Regra phony para forçar a execução mesmo que exista um arquivo com o mesmo nome
.PHONY: all clean fclean re ChecaIdade
