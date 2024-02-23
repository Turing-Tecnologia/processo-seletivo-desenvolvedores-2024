# Processo seletivo para desenvolvedores da EJ Turing Tecnologia 2024



Me chamo wesley, no presente momento, estou cursando o 6° período do curso Bacharelado em Sistemas de Informação-UFERSA. Iniciei a minha carreira como desenvolvedor backend após desenvolver algumas aplicações que me fizeram optar por esse caminho, que faz meus olhos brilharem. Desejo entrar no time de backend.

<br/>

Nesse projeto foi feito uma API REST com um CRUD de uma agenda telefônica, com as seguintes tecnologias:
- Java 17
- PostgreSQL
- Springboot
- JPA
- Swagger 


# Instruções de como rodar o projeto em localhost:
- Clone e descompacte o arquivo
- Importe o projeto IDE de sua escolha
- Instale o Postman disponível em: https://www.postman.com/
- Instale o SGBD PostgreSQL (https://www.postgresql.org/download/) Obs: o usuario e senha do banco devem ser postgres ⚠
- Crie uma database chamada agenda
- Inicie o projeto
- Inicie o Postman
   - Crie uma nova collection
   - Adicione uma Request
   - Vá para body -> raw -> JSON

- Caso queira, abra o link para visualizar a documentação via Swagger http://localhost:8080/swagger-ui/index.html#/ com o projeto em execução

# Teste a API 

 | Tipo de Requisição  | URL | Descrição |
| ------------- | ------------- | ------------- |
| GET  | http://localhost:8080/api/contatos/ | Retorna todos os contatos|
| GET  | http://localhost:8080/api/contatos/{id} | Retorna um contato por id|
| POST  | http://localhost:8080/api/contatos/ | Salva um novo contato|
| PUT  | http://localhost:8080/api/contatos/{id} | Atualiza um contato por id|
| DELETE  | http://localhost:8080/api/contatos/{id} | Deleta um contato por id|

# Observações 
Recomendo que, antes de testar os métodos GET, PUT e DELETE, crie um contato com o método POST por meio do Postman, como por exemplo
<br/>
```
{
    "nome": "Um nome",
    "telefone" :"(99) 999999999"   
}
```
