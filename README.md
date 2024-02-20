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

**Comando para levantar os containers**

docker compose up -d


