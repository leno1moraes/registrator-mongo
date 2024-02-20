**Tecnologias Usadas**

React Native + Vite + Mongo DB + Mongo Express + Spring Boot Spring Framework + docker + vagrant


**Estrutura**

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

**Docker**

**Comando para lenvantar os container:** docker compose up -d

**versão do Docker:** Docker version 25.0.3

**versão do Docker Compose:** docker-compose version 1.29.2


**Vagrant**

Apenas usado como teste para simular um frontend em outra máquina


**Demos**

![image](https://github.com/leno1moraes/registrator-mongo/assets/47091156/8b471cfc-ff94-4160-a6f9-11c478523f3e)


![image](https://github.com/leno1moraes/registrator-mongo/assets/47091156/2252f6a9-e8d3-4cbc-bea0-915b7911e489)


![image](https://github.com/leno1moraes/registrator-mongo/assets/47091156/a9ae2017-e931-4f47-815f-cc418b2cc7b0)

