<h1> API de Gerenciamento de Pessoas com Spring Boot </h1>

> Status: Em desenvolvimento ⚠️

Este é um projeto de aplicação web para gereciamento de pessoas usando o framework Java Spring Boot. 
Com ele, é possível criar, editar, consultar, listar e excluir informações sobre as pessoas.

## Pré-requisitos

Para rodar este projeto, é preciso ter java 17 instalado e configurado no seu ambiente de desenvolvimento.


## Instalação

Para instalar o projeto, basta clonar o repositório e importá-lo em sua IDE de preferêcia como um projeto Maven existente.

`~~~
git clone https://github.com/italofvm/apidegerenciamento.git
~~~`

## Configuração

Antes de rodar a aplicação, é preciso configurar o banco de dados. Isso pode ser feito no arquivo 
`application.properties`, onde você deve especificar as configurações de acesso ao seu banco de dados.

## Execução

Para executar o projeto, basta rodar a classe principal `ApiRestAttornatusApplication` como uma aplicação Java. 
Isso iniciará o servidor Tomcat embutido e a aplicação estará disponível em `http://localhost:8080`.


## Uso

A API possui as seguintes funcionalidades:

+ Criar uma pessoa
+ Editar uma pessoa
+ Consultar uma pessoa
+ Listar pessoas
+ Criar endereços da pessoa
+ Listar endereços da pessoa

