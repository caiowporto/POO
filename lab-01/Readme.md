# Sistema de Controle de Versão

## Configuração inicial para uso do Git

- Configuração de nome de usuário e e-mail no Git

No Git, a configuração do nome de usuário e do e-mail é essencial para identificar o autor dos commits, garantindo a autoria e a rastreibilidade do projeto, já que essas informações ficam permanentemente associadas ao histórico do código.
Para realizar essa configuração, utilizaremos o comando abaixo:
```bash
git config --global user.name "Caio Henrique Weber Porto"
git config --global user.email "caio.hwp2005@aluno.ifsc.edu.br"
```

- Criando Personal Access Token (PAT) no GitHub

Um Personal Access Token (PAT) é uma credencial de autenticação que substitui a senha da conta do GitHub em operações realizadas via Git. A criação de um PAT é necessária porque, por questões de segurança, o GitHub não aceita senhas tradicionais para autenticação em operações do Git realizadas pelo terminal, exigindo métodos de autenticação mais seguros, como os Personal Access Tokens.

>Passos para criar um PAT no GitHub:
>1. Acesse sua conta do GitHub
>1. Abra as Configurações (Settings)
>1. Acesse as configurações de desenvolvedor
>1. Vá para Personal access tokens
>1. Escolha entre Tokens (classic) ou Fine-grained tokens
>1. Clique no botão Generate new token
>1. Preencha os detalhes do token
>1. Conclua a criação clicando no botão verde Generate Token
>1. Copie e salve o token


- Salvar em cache as credenciais do PAT

Salvar o Personal Access Token (PAT) em cache tem como principal objetivo proporcionar maior praticidade e otimizar o fluxo de trabalho. Dessa forma, não é necessário informar o token sempre que um comando do Git que exige autenticação for executado.
Enquanto o período de validade do cache estiver ativo, o Git reutiliza automaticamente o PAT armazenado, permitindo a execução de operações sem a necessidade de inserir novamente as credenciais. Após o tempo configurado expirar, será necessário fornecer o PAT novamente para que ele seja armazenado em cache por um novo período.

Para salvar em cache por 1 hora, utilizaremos este código abaixo:
```bash
git config--global credential.helper 'cache--timeout=3600'
```

## Qual a diferença entre git merge e git rebase?

