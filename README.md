# 🏦 Cadastro de Conta Bancária

[![Java](https://img.shields.io/badge/Java-17-blue?logo=java&logoColor=white)](https://www.java.com/)
[![Status](https://img.shields.io/badge/Status-Concluído-brightgreen)]()

Sistema de cadastro de conta bancária desenvolvido em **Java**, com foco em **encapsulamento**, **métodos de depósito e saque**, e um **menu interativo no console**.

---

## 💡 Funcionalidades

- Criar conta bancária com número e nome do titular
- Depósito inicial opcional
- Depositar valores posteriormente
- Sacar valores com validação de saldo
- Alterar nome do titular
- Visualizar detalhes da conta a qualquer momento
- Exibição automática do saldo após cada operação

---

## 🛠 Tecnologias

- Java SE 8 ou superior  
- Console (terminal)  
- Scanner para entrada de dados  

---

## 📂 Estrutura do projeto
````
cadastro_conta_bancaria/
├── src/
│ ├── application/Program.java
│ └── entities/Holder.java
├── .gitignore
└── README.md

````
---

## 🚀 Como usar

1. **Clone o repositório:**

```
git clone https://github.com/ThiagoCh12/cadastro-conta-bancaria.git

javac src\entities\Holder.java src\application\Program.java

java -cp src application.Program
````
## 📸 Demonstração

Exemplo de uso no console:
````
================= BANKER =================
Enter your name: Thiago
Enter your number account: 1234
Do you want to make an initial deposit?
1 - YES | 2 - NO: 1
Inform the value to deposit: 500
ACCOUNT DETAILS:
Number account: 1234
Name holder: Thiago
Account balance: 500.00
````
👤 Autor

[Thiago no GitHub](https://github.com/ThiagoCh12)

⚠️ Observações

Projeto desenvolvido como exercício de fixação de encapsulamento, métodos e controle de fluxo em Java.

Permite testes simples de operações bancárias via console.
