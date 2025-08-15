# Conversor de Moedas 💱

Este projeto é um **Conversor de Moedas** desenvolvido em **Java**, que consome uma API de câmbio em tempo real para realizar conversões entre diferentes moedas.  
O usuário informa o valor e as moedas de origem/destino, e o programa retorna o valor convertido.

---

## 📌 Funcionalidades
- Conversão de valores monetários entre diferentes moedas.
- Consumo de uma API externa para obter taxas de câmbio atualizadas.
- Interface em console simples e interativa.
- Estrutura de código organizada em classes separadas:
  - `Principal.java` → Classe de entrada do programa (main).
  - `ConversorDeMoedas.java` → Contém a lógica de conversão e integração com a API.
  - `RepostaApi.java` → Representa e trata a resposta recebida da API.

---

## 🏗️ Arquitetura do Projeto
/src
- ├── Principal.java # Classe principal, ponto de entrada da aplicação
- ├── ConversorDeMoedas.java # Classe responsável pela conversão e requisições HTTP
- ├── RepostaApi.java # Classe modelo para mapear dados retornados pela API

---

## 📋 Exemplo de uso

Suponha que o usuário queira converter 100 USD para BRL:

Digite o valor: 100
Digite a moeda de origem (ex.: USD): USD
Digite a moeda de destino (ex.: BRL): BRL

Resultado: 100 USD = 495.30 BRL


(o valor varia conforme a taxa de câmbio do momento)
