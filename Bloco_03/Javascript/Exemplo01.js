//variaves e constantes
let minhaVariavel = "Olá, mundo!";

// let numero = 10;
// let number = 10; //camelCase - padrão   

// const PI = 3.14;
// const MEU_NOME = "João";

console.log(minhaVariavel); //Olá, mundo!

// console.log("O script foi executado com sucesso!");
// console.log(numero); //10   
// console.log(PI); //3.14

// Path: Exemplo_02.js

//Operadores aritméticos
// let numero1 = 10;
// let numero2 = 5;

// let soma = numero1 + numero2;
// let subtracao = numero1 - numero2;
// let multiplicacao = numero1 * numero2;
// let divisao = numero1 / numero2;
// let resto = numero1 % numero2;

// console.log(soma); //15
// console.log(subtracao); //5
// console.log(multiplicacao); //50
// console.log(divisao); //2
// console.log(resto); //0

// como usar o console.log() para exibir mensagens no console do navegador?
// Path: Exemplo_03.js  


// interpolação de string
// let nome = "João";
// let idade = 25;

// // Interpolação de variáveis em uma string usando template literals
// let mensagem = `Olá, meu nome é ${nome} e eu tenho ${idade} anos.`;

// // Imprimindo a mensagem
// console.log(mensagem);

// Definindo arrays de nomes e idades
let nomes = ["João", "Maria", "Pedro"];
let idades = [30, 25, 35];

// Criando uma string para cada par de nome e idade usando um loop
for (let i = 0; i < nomes.length; i++) {
    let mensagem = `Olá, meu nome é ${nomes[i]} e eu tenho ${idades[i]} anos.`;
    console.log(mensagem);
}




// Path: Exemplo_04.js
//Operadores de comparação  
let numero1 = 10;
let numero2 = 5;

let maiorQue = numero1 > numero2;
let menorQue = numero1 < numero2;
let igual = numero1 === numero2;
let diferente = numero1 !== numero2;
let maiorOuIgual = numero1 >= numero2;
let menorOuIgual = numero1 <= numero2;

console.log(maiorQue); //true
console.log(menorQue); //false
console.log(igual); //false
console.log(diferente); //true
console.log(maiorOuIgual); //true
console.log(menorOuIgual); //false


function somar(numero1, numero2) {
    return numero1 + numero2;
}

let resultado = somar(10, 5);
console.log(resultado); //15


arrow function

let somar = (numero1, numero2) => {
    return numero1 + numero2;
}       

let resultado = somar(10, 5);
console.log(resultado); //15

para compilar > node ./Exemplo01.js