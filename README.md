# Spring Boot Convidados Web App

Este é um controlador Spring Boot para uma aplicação web simples de gerenciamento de convidados. Ele permite listar convidados e salvar novos convidados em um banco de dados.

## Visão Geral

Este controlador Spring Boot é parte de uma aplicação maior que inclui um front-end e um banco de dados. Ele lida com solicitações relacionadas a convidados, como listar convidados e salvar novos convidados no banco de dados.

## Recursos Principais

- **Listagem de Convidados**: Este controlador lida com solicitações GET para listar todos os convidados armazenados no banco de dados. Os convidados são recuperados do banco de dados por meio do `ConvidadosRepository` e enviados para uma visualização chamada "ListaConvidados" usando o `ModelAndView`.

- **Salvar Novos Convidados**: Este controlador também lida com solicitações POST para salvar novos convidados no banco de dados. Os dados do novo convidado são enviados como um objeto `Convidado` e salvos no banco de dados usando o `convidados.save(convidado)`.

## Como Usar

1. Certifique-se de ter uma configuração Spring Boot completa, incluindo um banco de dados configurado e um front-end correspondente.

2. Abra o arquivo `ConvidadosController.java` em sua IDE ou editor de texto.

3. Verifique se você tem todas as dependências necessárias no seu projeto Spring Boot para que o controlador funcione corretamente.

4. Execute sua aplicação Spring Boot e acesse a rota `/convidados` no seu navegador para listar os convidados e adicionar novos convidados.

5. Use as funcionalidades do controlador conforme necessário no contexto da sua aplicação web maior.

## Personalização

Este controlador Spring Boot pode ser personalizado para atender às necessidades específicas do seu projeto. Você pode adicionar validações, autenticação, páginas de erro personalizadas e muito mais, dependendo dos requisitos do seu aplicativo.

## Autor

Este controlador Spring Boot foi desenvolvido por um desenvolvedor entusiasta e está disponível para uso livre e personalização.
