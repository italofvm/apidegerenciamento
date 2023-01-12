<h1> API de Gerenciamento de Pessoas com Spring Boot </h1>

> Status: Em desenvolvimento ⚠️

Este é um projeto de aplicação web para gereciamento de pessoas usando o framework Java Spring Boot. 
Com ele, é possível criar, editar, consultar, listar e excluir informações sobre as pessoas.

## Pré-requisitos

Para rodar este projeto, é preciso ter java 17 instalado e configurado no seu ambiente de desenvolvimento.


## Instalação

Para instalar o projeto, basta clonar o repositório e importá-lo em sua IDE de preferêcia como um projeto Maven existente.

~~~
git clone https://github.com/italofvm/apidegerenciamento.git
~~~

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
+ Listar pessoas/endereço
+ Criar endereços da pessoa

## Api Funcionando


<h3>Criando Pessoa/Endereço</h3>

![image](https://user-images.githubusercontent.com/33766000/212180255-c7f4452b-d332-41cc-a5a4-f433a21cb403.png)

-------------------------

<h3>Lista de Pessoas/Endereços</h3>

![image](https://user-images.githubusercontent.com/33766000/212180363-ee3240d5-2b95-4d8b-9af5-a294902f2ade.png)

-------------------------

<h3>Editar Pessoa/Endereço</h3>

![image](https://user-images.githubusercontent.com/33766000/212183366-4f029ab1-99d7-4df7-8665-2407a1b8b041.png)

-------------------------

<h3>Consultar Pessoa</h3>

![image](https://user-images.githubusercontent.com/33766000/212183591-e5872eca-1b00-4ac6-bf3b-de171b2d75db.png)

![image](https://user-images.githubusercontent.com/33766000/212183928-79e4039c-cce6-4842-9232-7f0739974986.png)

-------------------------

<h3>Deletar Pessoa</h3>

![image](https://user-images.githubusercontent.com/33766000/212184103-a66a056e-ca39-4ec2-9f52-bde47224d5bf.png)

-------------------------------------------------------------------------------------------------------------




