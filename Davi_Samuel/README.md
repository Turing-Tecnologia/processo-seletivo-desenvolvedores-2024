# Olá, eu sou Draggner

<div align="center">
  <img src="./src/img/DRAGGNER_LOGO_TRANSPARENT_PRETO.png" width="150px">
</div>

**Time para ingressar**: Desenvolvimento Front-end

## Apresentação

Eu sou Davi Samuel, tenho 19 anos e resido no munícipio do Alto do Rodrigues/RN. Formado como Técnico em Informática tenho bastante familiaridade em aprender, na finalidade de entrar no mercado de programação.

Sou estudante de segundo período em Bacharel de Sistemas de Informação, prosseguindo em adquirir conhecimentos, capacidade técnica e comportamental para se desenvolver na programação.

### Sobre o Projeto

O projeto se baseia na construção de uma Landing Page sobre mim. Quis desenvolver um portfólio conforme os conhecimentos técnicos em meu alcance abordando e introduzindo a construção de uma marca pessoal que adoto. Mas basicamente o site se baseia da seguinte forma:

Existe uma aba de navegação no qual demonstra a logo, parte inicial, sobre, qualificações e projetos.

- **Parte Inicial**: basicamente demonstro nome, cargo e alguns icones que são direcionaveis.
- **Parte Sobre**: abordei de forma simplificada sobre mim, com umas características de marca pessoal.
- **Parte Qualificações**: demonstro minhas competências acadêmicas e técnicas dos quais tomo conhecimento.
- **Parte Projetos**: um campo voltado para inserir projetos que realizei.

## Rodar o Projeto

Antes de iniciar,

Considere como um pré-requisito instalar o [NodeJs](https://nodejs.org). No site tem os procedimentos, é recomendado usar a versão LTS, que é estável para uso.

Depois, verifique em algum terminal se o NodeJs está instalado:

```
node -v
```

O comando acima mostra a versão instalada na máquina. Em caso de exibição, podemos inicializar o procedimento.

1. Faça o ``Fork`` do repositório
2. Execute o comando `git clone https://github.com/SEU_USUÁRIO/processo-seletivo-desenvolvedores-2024.git`
3. Adicione o remote upstream do repositório original para manter atualizado localmente com `git add remote upstream https://github.com/draggner/processo-seletivo-desenvolvedores-2024.git`
4. Em seguida, use `git pull upstream main` para verificar e puxar qualquer alteração em caso de atualizações.

Após os procedimentos até aqui, será necessário instalar as dependências do projeto. Com o gerenciador de pacotes Nodejs, conhecido como `npm`, execute:

```npm
npm install
```

Após as instalações das depêndencias, uma a ser utilizada é `http-server` que serve para abrir aplicação em um servidor local (no próprio browser), com isso rode o seguinte comando no terminal:

```
http-server ./Davi_Samuel
```

E pronto, será gerado um servidor local geralmente como `http://127.0.0.1:8080` ou outras exibições, basta inserir a URL no browser