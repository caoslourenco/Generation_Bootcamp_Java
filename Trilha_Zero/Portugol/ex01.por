programa
{
	
	funcao inicio()
	{
		real numero
		escreva("Digite um número: ")
		leia(numero)
		escreva(verifica(numero))
	}

	funcao logico verifica(real numero){
		retorne numero > 10
	}
}