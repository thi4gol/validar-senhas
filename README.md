# Verificador de Senha

Este é um projeto Java 17 que implementa um verificador de senha, permitindo ao usuário inserir uma senha e validar se ela atende aos critérios de segurança especificados.

## Funcionalidades

- **Validação de Senha**: O usuário pode inserir uma senha e verificar se ela atende aos seguintes critérios de segurança:
  - Pelo menos uma letra maiúscula.
  - Pelo menos uma letra minúscula.
  - Pelo menos um número.
  - Pelo menos um caractere especial.
  - Não contém sequências comuns (como "123456" ou "abcdef", sem distinção entre maiúsculas e minúsculas).
  - Não é uma palavra comum (como "password", "123456" ou "qwerty", sem distinção entre maiúsculas e minúsculas).
  - Comprimento mínimo de 8 caracteres.

## Estrutura do Projeto

O projeto é composto por duas classes:

1. **Validacao**: Classe principal que inicia a aplicação e cria uma instância da classe Menu.
2. **Menu**: Implementa as funcionalidades do verificador de senha, incluindo a lógica para mostrar o menu, validar a senha e limpar o console.

## Como Executar

Para executar o projeto, siga estas etapas:

1. Certifique-se de ter o Java 17 instalado em seu sistema.
2. Compile os arquivos `Validacao.java` e `Menu.java`.
3. Execute o arquivo compilado `Validacao.class`.

## Uso

Ao executar o programa, o usuário será apresentado com um menu contendo uma opção para validar uma senha. Ao escolher essa opção, será solicitado que o usuário insira a senha. Após inserir a senha, o programa mostrará se a senha atende aos critérios de segurança especificados.

## Contribuindo

Se você quiser contribuir para este projeto, siga estas etapas:

1. Faça um fork do projeto.
2. Implemente suas alterações.
3. Faça um pull request.

## Autor

Este projeto foi desenvolvido por Thiago Siqueira.

## Licença

Este projeto está licenciado sob a [Licença MIT](https://opensource.org/licenses/MIT).
