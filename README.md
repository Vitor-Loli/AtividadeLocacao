# 🚗 Sistema de Locadora de Veículos

## 🧩 Descrição
Este projeto consiste em um sistema de gestão para locadora de veículos, desenvolvido com os princípios da **Programação Orientada a Objetos (POO)**: **herança**, **abstração**, **encapsulamento** e **polimorfismo**.

O sistema permite **cadastrar veículos de diferentes tipos**, controlar **disponibilidade** e **período de locação**, além de **calcular automaticamente o valor total** com base na diária e nos dias alugados.

## 🏗️ Estrutura do Projeto
- **Classe Abstrata `Veiculo`**: define os atributos e métodos comuns.
- **Classes Filhas** (`Carro`, `Moto`, `Caminhão`): herdam de `Veiculo` e implementam comportamentos específicos.
- **Controle de Locação**: registra datas de início e fim da locação.
- **Cálculo de Pagamento**: calcula o valor total conforme o período e a diária.
- **Encapsulamento e Polimorfismo**: uso de getters/setters, métodos sobrescritos e tratamento genérico dos veículos.

## 💻 Conceitos Aplicados
- Herança  
- Abstração  
- Encapsulamento  
- Polimorfismo  
- Sobrescrita de métodos (`@Override`)

## 🎯 Objetivo
Desenvolver um sistema orientado a objetos capaz de:
- Cadastrar diferentes tipos de veículos  
- Controlar locações e disponibilidade  
- Calcular automaticamente o valor total das locações  
