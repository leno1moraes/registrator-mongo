# Projeto registrador de tarefas (Registrator)

Bem-vindo ao **Registrator**, um projeto de aplicação para gerenciar e registrar tarefas, desenvolvido utilizando as tecnologias S**pring Boot, React JS (Vite), Docker e Vagrant**. Este projeto visa fornecer uma solução simples e eficiente para o gerenciamento de tarefas, permitindo que os usuários criar e excluir tarefas com facilidade.


## Funcionalidades
- Criação, edição e exclusão de tarefas.
- Interface intuitiva e responsiva para uma melhor experiência do usuário.
- API RESTful para facilitar a comunicação entre o frontend e o backend.


## Tecnologias Utilizadas
- **Spring Boot**: Framework Java utilizado para desenvolver a API backend, garantindo uma integração robusta e escalável.

- **React**: Biblioteca JavaScript para construir interfaces de usuário dinâmicas e responsivas no frontend.

- **Docker**: Ferramenta de containerização que facilita a criação, implementação e execução de aplicativos em ambientes isolados.

- **Vagrant**: Ferramenta para automatizar a configuração de ambientes de desenvolvimento, proporcionando um ambiente consistente para todos os desenvolvedores.


## How to up!

### Requisitos
1 - Ubuntu 22.04.4 LTS

2 - Docker version 27.1.1

3 - Docker Compose

4 - Vagrant 2.4.1

### Modo 1
Levantar o frontend e backend no docker
```
./start_01.sh
```

### Modo 2
Levantar o frontend no vagrant e o backend no docker
```
./start_01.sh
```


## Estrutura do projeto
```
Projeto/
├── backend/
|   ├── src/
│   |     └── main/
│   |         ├── java/
│   |         |    ├── config/
│   |         |    |    └── DataInitizr.java
│   |         |    ├── controller/
│   |         |    |    └── RegistratorController.java
│   |         |    ├── entity/
│   |         |    |    └── Registrator.java
│   |         |    ├── repository/
│   |         |    |    └── RegistratorRepository.java
│   |         |    └── BackendApplication.java 
│   |         └── resources
│   |             └── application.properties   
│   ├── Dockerfile
│   ├── mvnw
│   └── pom.xml
├── frontend/
│   ├── public
│   ├── src
│   │   ├── App.css
│   │   ├── App.jsx
│   │   ├── index.css
│   │   └── index.css
│   ├── index.html
│   ├── package.json
│   └── vite.config.js
├── Vagrantfile
├── provision.sh
└── docker-compose.yml
```



**Demos**

![image](https://github.com/leno1moraes/registrator-mongo/assets/47091156/8b471cfc-ff94-4160-a6f9-11c478523f3e)


![image](https://github.com/leno1moraes/registrator-mongo/assets/47091156/2252f6a9-e8d3-4cbc-bea0-915b7911e489)


![image](https://github.com/leno1moraes/registrator-mongo/assets/47091156/a9ae2017-e931-4f47-815f-cc418b2cc7b0)


Projeto baseado no curso: 
