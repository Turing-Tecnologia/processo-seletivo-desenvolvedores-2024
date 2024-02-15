# Time Desejado: Back-end
# Um pouco sobre mim: 
Meu nome é Jorge, tenho um grande interesse e curiosidade na área da programação, tenho curso técnico em TI no IFRN, onde lá me identifiquei com a programação, e agora curso Sistemas de informação na UFERSA para ajudar a ingressar na área de programação. Estudo python e atualmente estou estudando Django, tenho um conhecimento básico em MYSQL, git e github, entendo o mínimo de front-end e sempre aberto a aprender mais e mais.
# Detalhes do projeto:

# API de Gerenciamento de Tarefas (Todo)

A API de Gerenciamento de Tarefas permite que os usuários criem, leiam, atualizem e excluam tarefas (Todos).

## Modelos

### Todo

Representa uma tarefa a ser concluída.

#### Campos

| Campo       | Tipo           | Descrição                                |
|-------------|----------------|------------------------------------------|
| `id`        | Integer        | Identificador único da tarefa.          |
| `title`     | CharField      | Título da tarefa.                       |
| `created_in`| DateTimeField  | Data e hora de criação da tarefa.       |
| `done`      | BooleanField   | Indica se a tarefa está concluída.      |

#### Métodos

- `__str__`: Retorna o título da tarefa.

#### Meta

- `verbose_name`: Nome singular para a tarefa (Todo).
- `verbose_name_plural`: Nome plural para as tarefas (Todos).
- `ordering`: Ordena as tarefas pelo ID por padrão.

## Serializadores

### TodoSerializer

Serializa e desserializa os objetos Todo para/desde JSON.

#### Campos

- `id`: Identificador único da tarefa.
- `title`: Título da tarefa.
- `created_in`: Data e hora de criação da tarefa.
- `done`: Indica se a tarefa está concluída.

#### Métodos

- `create`: Cria uma nova instância de `Todo` com base nos dados fornecidos.
- `update`: Atualiza uma instância existente de `Todo` com os dados fornecidos.

#### Uso

- Para serializar um objeto `Todo` em JSON, utilize `TodoSerializer(todo_instance).data`.
- Para desserializar dados JSON em um objeto `Todo`, utilize `TodoSerializer(data=request_data)` seguido de `serializer.is_valid()` e `serializer.save()`.

## Visualizações

### TodoViewSet

Este conjunto de visualizações fornece endpoints para operações CRUD em tarefas (Todos).

#### Métodos e Endpoints

| Método | Endpoint          | Descrição                              |
|--------|-------------------|----------------------------------------|
| GET    | /todos/           | Retorna todas as tarefas.              |
| POST   | /todos/           | Cria uma nova tarefa.                  |
| GET    | /todos/{id}/      | Retorna detalhes de uma tarefa.        |
| PUT    | /todos/{id}/      | Atualiza uma tarefa existente.         |
| DELETE | /todos/{id}/      | Exclui uma tarefa existente.           |

#### Parâmetros de Consulta

- Nenhum parâmetro de consulta é necessário para as operações GET.

#### Corpos de Solicitação (POST e PUT)

O corpo da solicitação deve conter os dados da tarefa no formato JSON, incluindo `title` e `done`.

#### Respostas

- GET: Retorna os detalhes da tarefa solicitada no formato JSON.
- POST: Retorna os detalhes da tarefa recém-criada no formato JSON.
- PUT: Retorna os detalhes da tarefa atualizada no formato JSON.
- DELETE: Retorna um corpo de resposta vazio com status HTTP 204 (No Content) em caso de sucesso.

## URLs

### Endpoints Principais

| Endpoint        | Descrição                                    |
|-----------------|----------------------------------------------|
| /admin/         | Interface administrativa do Django.          |
| /todo/          | Endpoint base para a API de Gerenciamento de Tarefas. |

### API de Gerenciamento de Tarefas (Todo)

Para mais detalhes sobre a API de Gerenciamento de Tarefas, consulte a [documentação da API de Gerenciamento de Tarefas (Todo)](#).

## Instalação

1. Clone este repositório:

    ```bash
    git clone <url-do-repositorio>
    ```

2. Instale as dependências:

    ```bash
    pip install -r requirements.txt
    ```

3. Execute as migrações do banco de dados:

    ```bash
    python manage.py migrate
    ```

4. Inicie o servidor de desenvolvimento:

    ```bash
    python manage.py runserver
    ```

## Contribuição

Sinta-se à vontade para contribuir com melhorias para esta API. Basta abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).
