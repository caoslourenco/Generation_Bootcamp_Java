# Comandos do compilador Java
JAVAC = javac
JAVA = java

# Diretórios
SRC_DIR = .
BIN_DIR = bin

# Nome do arquivo fonte
SOURCE = $(SRC_DIR)/Divisao.java

# Nome do arquivo compilado
CLASS = $(BIN_DIR)/Divisao.class

# Nome do executável
EXECUTABLE = Divisao

# Comando para remover arquivos
RM = rm -rf

# Alvo padrão
all: $(EXECUTABLE)

# Compilação
$(CLASS): $(SOURCE)
	@mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $(SOURCE)

# Regra para executar o programa
$(EXECUTABLE): $(CLASS)
	$(JAVA) -cp $(BIN_DIR) aula_exceptions.Divisao

# Limpar arquivos temporários
clean:
	$(RM) $(BIN_DIR)

# Remover tudo, incluindo executáveis e objetos
fclean: clean

# Regra para reconstruir o programa do zero
re: fclean all

# Regra phony para forçar a execução mesmo que exista um arquivo com o mesmo nome
.PHONY: all clean fclean re $(EXECUTABLE)
