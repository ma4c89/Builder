<h1 align="center">Exemplo de Padrão Builder em Java</h1>

Este projeto demonstra o uso do **padrão de projeto Builder** para construir objetos complexos passo a passo de forma clara, reutilizável e fluente.

## 🔧 Tecnologias Utilizadas
<div align="center">

| Ferramenta | Descrição |
|------------|-----------|
| ☕ Java 8+  | Linguagem principal |
| 💡 Design Pattern | Padrão Builder (Criacional) |

</div>


## ✅ O que o código faz?

* Define uma classe `Computador` com atributos: CPU, RAM e Armazenamento.
* Cria uma interface `ComputadorBuilder` para definir os métodos de configuração.
* Implementa `ComputadorPadraoBuilder` que permite montar o objeto passo a passo.
* No `main`, são criados dois computadores diferentes reutilizando o padrão de construção.

## 📚 Conceitos Demonstrados

* Separação da construção e representação de objetos.
* Reutilização de lógica de montagem.
* Encadeamento de métodos (Fluent Interface).
* Imutabilidade do objeto construído.

## 🧠 Benefícios do Builder

* Facilita a construção de objetos com muitos parâmetros.
* Evita construtores longos e confusos.
* Melhora a legibilidade e a manutenção do código.



