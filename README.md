# 📚 Sistema de Empréstimo de Livros

## 📖 Sobre o Projeto

Este projeto é um sistema simples de empréstimo de livros desenvolvido em Java, criado como parte da **Prova 01 do Segundo Semestre**. Ele permite calcular o valor devido com base na data de empréstimo e na data de devolução do livro. O programa utiliza conceitos como manipulação de datas, tratamento de exceções e interface gráfica básica.

---

## 🚀 Funcionalidades

- **Cálculo de Dias de Empréstimo:** Calcula o número de dias entre a data de empréstimo e a data de devolução.
- **Cálculo do Valor Devido:** 
  - Até 7 dias: R$ 5,00.
  - Dias extras: R$ 1,00 por dia adicional.
- **Validação de Datas:** Verifica se a data de devolução é posterior à data de empréstimo.
- **Interface Gráfica Simples:** Permite ao usuário inserir as datas e visualizar os resultados.
- **Testes Unitários:** Inclui testes para garantir o correto funcionamento dos cálculos.

---

## 🛠️ Tecnologias Utilizadas

- ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white): Linguagem de programação utilizada para desenvolver o sistema.
- **Java Swing**: Biblioteca gráfica para criar a interface do usuário.
- ![JUnit](https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit5&logoColor=white): Framework para testes unitários.
- ![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white): Plataforma para versionamento e hospedagem do código.

---

## 📦 Estrutura do Projeto

O projeto está organizado em três pacotes principais:

1. **Model (`Model`):**
   - Contém a classe `Emprestimo`, que gerencia as datas de empréstimo e devolução, além de calcular os dias e o valor devido.

2. **View (`View`):**
   - Contém a classe `App`, que implementa a interface gráfica e interage com o usuário.

3. **Testes (`Model`):**
   - Contém a classe `EmprestimoTest`, que realiza testes unitários para garantir o correto funcionamento da lógica de negócio.

---

## 🧪 Testes Unitários

A classe `EmprestimoTest` contém testes para validar os cálculos de dias de empréstimo e valor devido. Os testes foram implementados usando o framework **JUnit**.

---

## 🎯 Como Usar

**Insira as Datas:**
- No campo **"Data de Empréstimo"**, insira a data no formato dd/MM/yyyy (ex: 01/10/2023).
- No campo **"Data de Devolução"**, insira a data no mesmo formato.
- Clique em **"Calcular Empréstimo"**:
- O programa calculará o número de dias de empréstimo e o valor devido.

**Resultados:**
- O número de dias de empréstimo será exibido na primeira label.
- O valor devido será exibido na segunda label.

---

## 🧑‍💻 Desenvolvedor

<table>
  <tr>
    <td align="center">
      <a href="https://www.linkedin.com/in/guilhermegeisler/">
        <img src="https://avatars.githubusercontent.com/u/53203780?s=400&u=9a85ac6d2d3c55a872ab0bafd1d38d8bd0da5cc4&v=4" width="100px;" alt="Foto do Guilherme Geisler"/><br>
        <sub>
          <b>Guilherme Geisler</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

---

## 📧 Contato

Se tiver alguma dúvida ou sugestão, entre em contato:

- **Guilherme Geisler**: [LinkedIn](https://www.linkedin.com/in/guilhermegeisler/) | [Email](mailto:guilherme.sgeisler@gmail.com)

---

Feito com ❤️ por [Guilherme Geisler](https://www.linkedin.com/in/guilhermegeisler/).
