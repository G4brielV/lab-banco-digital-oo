# 🏦 Banco & Contas - Melhoria de Funcionalidades em Java

Este repositório contém aprimoramentos para o projeto original Banco Digital OO disponível em: https://github.com/falvojr/lab-banco-digital-oo

A seguir, foram adicionadas validações e novos recursos para tornar o sistema bancário mais robusto.

## 📄 Descrição do Projeto

A aplicação gerencia operações bancárias para contas correntes e poupanças, garantindo consistência por meio de validações e relacionamentos entre entidades.

### Funcionalidades Implementadas

1. **Verificação de Saldo**: Antes de realizar um saque ou transferência, o sistema confere se o valor requisitado não excede o saldo disponível.
2. **Associação a Banco**: Ao criar uma nova conta, o usuário informa a agência e vincula a conta a uma instância de `Banco`.
3. **Listagem de Contas**: O `Banco` mantém uma lista de todas as suas contas e fornece método para exibir detalhes de cada uma delas.

---

## 🗺️ Diagrama de Classes

![Diagrama UML de Classes](https://github.com/user-attachments/assets/eaa3a9c3-03c3-4f54-a411-a852245db3da)


> O diagrama mostra as interfaces e classes principais: `IConta`, `Conta`, `ContaCorrente`, `ContaPoupanca`, `Banco` e `Cliente`.

---

## 📁 Estrutura do Projeto

```
AgenciaBancaria/
├── Cliente/
│   └── Cliente.java
├── Banco.java
├── Conta.java
├── ContaCorrente.java
├── ContaPoupanca.java
├── IConta.java       # Interface
└── Main.java
```

---
