# Forum Hub

Aplicação de fórum onde usuários podem criar, editar e excluir tópicos. A autenticação é realizada via token JWT.

## Como rodar o projeto

1. Clone este repositório.
2. Execute o projeto utilizando `mvn spring-boot:run`.
3. Acesse o endpoint `localhost:8080`.

### Endpoints:

- **POST /auth/login** - Realizar login e obter o token JWT.
- **GET /topicos** - Listar todos os tópicos.
- **POST /topicos** - Criar um novo tópico (somente autenticados).
- **PUT /topicos/{id}** - Atualizar um tópico (somente o autor).
- **DELETE /topicos/{id}** - Excluir um tópico (somente o autor).

## Tecnologias

- Spring Boot
- H2 Database
- JWT para autenticação
