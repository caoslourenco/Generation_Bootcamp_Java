let message: string = 'Hello, World!';
console.log(message);

let message2: string = 'Hello, World!';
console.log(`${message2}`); // Hello, World!

// compile: tsc exemplo01.ts - não funciona 
// ts-node exemplo01.ts - funciona

function multiply(a: number, b: number) {
    return a * b;
}

const result = multiply(2, 5);
console.log(result); // 10


// Declaração de uma variável float
let salario: number = 3500.50;

// Outro exemplo de variável float
let temperatura: number = 25.75;

// Operações com números de ponto flutuante
let resultado: number = salario * 1.1; // Aumento de 10% no salário

// Saída
console.log("Salário atual:", salario);
console.log("Novo salário com aumento:", resultado);


// interface Pessoa {
//     nome: string;
//     sobrenome: string;
//     idade: number;
// }

// function imprimirPessoa(pessoa: Pessoa) {
//     console.log(pessoa.nome);
//     console.log(pessoa.sobrenome);
//     console.log(pessoa.idade);
// }

// let pessoa: Pessoa = { nome: 'João', sobrenome: 'Rukko', idade: 25 };
// imprimirPessoa(pessoa);

// -----------
// interface Pessoa {
//     nome: string;
//     sobrenome: string;
//     idade: number;
// }

// function imprimirPessoa(pessoa: Pessoa) {
//     console.log("Nome:", pessoa.nome);
//     console.log("Sobrenome:", pessoa.sobrenome);
//     console.log("Idade:", pessoa.idade);
//     console.log("-----------------------------");
// }

// // Array de objetos do tipo Pessoa
// let pessoas: Pessoa[] = [
//     { nome: 'João', sobrenome: 'Rukko', idade: 25 },
//     { nome: 'Maria', sobrenome: 'Silva', idade: 30 },
//     { nome: 'Pedro', sobrenome: 'Souza', idade: 28 }
// ];

// // Iterar sobre o array de pessoas e imprimir cada uma
// for (let pessoa of pessoas) {
//     imprimirPessoa(pessoa);
// }


interface Pessoa {
    nome: string;
    sobrenome: string;
    idade: number;
}

function imprimirPessoa(pessoa: Pessoa) {
    let infoPessoa: string = `Nome: ${pessoa.nome} ${pessoa.sobrenome}, Idade: ${pessoa.idade}`;
    console.log(infoPessoa);
}

let pessoas: Pessoa[] = [
    { nome: 'João', sobrenome: 'Rukko', idade: 25 },
    { nome: 'Maria', sobrenome: 'Silva', idade: 30 },
    { nome: 'Pedro', sobrenome: 'Souza', idade: 28 }
];

for (let pessoa of pessoas) {
    imprimirPessoa(pessoa);
}


// compilar > ts-node Exemplo01.ts  