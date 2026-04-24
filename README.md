💳 Operador de Cartão - Arquitetura Hexagonal

Projeto backend desenvolvido em Java com foco em estudo e aplicação da Arquitetura Hexagonal (Ports and Adapters), simulando um sistema de operações com cartão.

📌 Sobre o projeto

Este projeto tem como objetivo praticar conceitos avançados de arquitetura de software, aplicando a Arquitetura Hexagonal para manter o domínio da aplicação isolado de frameworks e tecnologias externas.

A ideia principal é separar claramente regras de negócio, infraestrutura e interfaces externas, garantindo um código mais organizado, testável e desacoplado.

📌 Arquitetura utilizada

O projeto segue o padrão Hexagonal Architecture (Ports and Adapters), com separação entre:

Core (Domain): regras de negócio da aplicação
Application: casos de uso
Infrastructure: adapters, banco de dados e frameworks externos
📌 Tecnologias utilizadas
Java 17
Spring Boot
Spring Data JPA
PostgreSQL
Lombok
Gradle
Git / GitHub
📌 Estrutura do projeto

domain/ → entidades, regras de negócio e ports
application/ → casos de uso (use cases)
infrastructure/ → adapters, repositórios e configurações

📌 Funcionalidades
Simulação de operação com cartão
Processamento de regras de negócio no core
Persistência de dados com PostgreSQL
Separação entre domínio e infraestrutura
Arquitetura desacoplada e testável
📌 Objetivo do projeto

Este projeto foi desenvolvido com foco em aprendizado prático de arquitetura de software, simulando um sistema real para entender como isolar regras de negócio, desacoplar banco de dados do domínio e aplicar Ports and Adapters na prática.

📌 Benefícios da arquitetura aplicada
Código mais organizado
Baixo acoplamento
Facilidade para testes
Facilidade de manutenção
Possibilidade de trocar tecnologias sem afetar o core
📌 Como executar o projeto

Clonar o repositório:
git clone https://github.com/BrunoOAlm/operador-cartao-hexagonal-architecture.git

Configurar banco PostgreSQL no application.properties:
spring.datasource.url=jdbc:postgresql://localhost:5432/cartao_db
spring.datasource.username=postgres
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Rodar o projeto:
./gradlew bootRun

📌 Aprendizados
Arquitetura Hexagonal na prática
Separação de responsabilidades
Ports and Adapters
Inversão de dependência
Estruturação de backend profissional com Java e Spring Boot
📌 Status do projeto

Em desenvolvimento

📌 Autor

Desenvolvido por Bruno Almeida
Projeto de estudo focado em arquitetura de software e backend Java
