programa
{
	
	funcao inicio()
	{
		inteiro numero
		escreva("Digite um número: ")
		leia(numero)
		escreva(verifica(numero))
	}

	funcao logico verifica(inteiro numero){
		se (numero % 4 == 0 ou numero % 9 == 0){
			retorne verdadeiro
		}senao{
			retorne falso	
		}
	}
}
