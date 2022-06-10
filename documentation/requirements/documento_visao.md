# Documento de Visão do Sistema

## 1. Objetivo deste Documento
O documento de visão tem propósito de apresentar o design e requisitos de alto nível para que os interessados possam compreender o sistema que está em desenvolvimento, Seu objetivo é fornecer uma visão ampla do produto que se pretende desenvolver, sem se aprofundar em detalhes.

## 2. Histórico de Revisão

|Data|Autor|Descrição|Versão|
|----|-----|---------|------|
|09/06/22|Almir Dias|Criação do Documento|1.0|

## 3. Escopo do Produto
A Organização Mundial da Saúde estima que só no Brasil existam 30 milhões de animais abandonados, entre 10 milhões de gatos e 20 milhões de cães. Em cidades de grande porte, para cada cinco habitantes há um cachorro. Destes, 10% estão abandonados.

O projeto Pet Life pretende auxiliar pessoas que querem adotar animais. A plataforma vai ligar pessoas a Ongs facilitando o processo de adoção.
## 4. Não está no Escopo do Produto
* Não é responsável pela guarda e cuidados aos animais;
* Não é responsabilidade dos mantenedores da Aplicação a entrega e acompanhamento das doações;
* PetLife não é responsável pelo cuidado dos animais.

## 5. Descrição dos Envolvidos

### 5.1 Usuarios
Pessoas que farão o acesso a aplicação com interesse de doar ou adotar algum animal, usuários deverão realizar cadastro e comprovar residência fixa.

### 5.2 Resumo dos Usuários
|Nome|Responsabilidades|Perfil|
|----|-----------------|------|
|Adotante|* Ter a intenção de adotar <br/> * Realizar o cadastro <br/> * Ter condições de manter o pet, referênte a alimentação, medicação e cuidados da saúde|Usuário de Aplicação Web|
|ONG's|* Possuir os animais <br/> * Ter cadastro na aplicação <br/> * Alimentar o aplicação com dados dos pet's |Usuário de Aplicação Web|
|Administrador|* Usuário para gerir a aplicação <br/> * Realizar suporte ao demais usuários <br/> * Gerar relatórios e entregar aos interessados|Usuário de Aplicação Web <br/> Acesso ao código fonte <br/> Acesso ao banco de dados|

## 6. Visão Geral do Produto
O PetLife pretende contribuir para o bem estar animal e humano.
A aplicação PetLife deve disponibilizar ao usuário uma interface intuitiva que possibilite o acesso de pessoas com diferentes níveis de familiaridade com as atuais tecnologias da informação.
A aplicação deve persistir dados cadastrados pelos usuários e logs gerados pela atividade na aplicação.

## 6.1 Requisitos Funcionais
|Nº|Nome|Descrição|
|--|----|---------|
|RF001|Manter Cadastros Usuários |Os usuários poderão incluir, visualizar e alterar suas informações.|
|RF002|Recuperação de Senha|Os usuários poderão realizar recuperação de senha.|
|RF003|Cancelar cadastro|Os usuários poderão cancelar o cadastro sempre que desejarem|
## 6.2 Requisitos Não Funcionais

## 7. Restrições

## 8. Política de Versionamento
