# Documento de Visão do Sistema

## Histórico de Revisão

|Data|Autor|Descrição|Versão|
|----|-----|---------|------|
|09/06/22|Almir Dias|Criação do Documento|1.0|

## 1. Objetivo deste Documento
O documento de visão tem propósito de apresentar o design e requisitos de alto nível para que os interessados possam compreender o sistema que está em desenvolvimento, Seu objetivo é fornecer uma visão ampla do produto que se pretende desenvolver, sem se aprofundar em detalhes.

## 2. Contextualização
A Organização Mundial da Saúde estima que só no Brasil existam 30 milhões de animais abandonados, entre 10 milhões de gatos e 20 milhões de cães. Em cidades de grande porte, para cada cinco habitantes há um cachorro. Destes, 10% estão abandonados.

## 3. Escopo do Produto
O projeto Pet Life pretende auxiliar pessoas que querem adotar animais. A plataforma vai ligar pessoas a Ongs facilitando o processo de adoção.

## 4. Não está no Escopo do Produto
* Responsabilidade pela guarda e cuidados dos animais;
* Responsabilidade de realizar ou acompanhar as doações;
* Responsabilidade de cuidar dos animais.

## 5. Descrição dos Envolvidos

### 5.1 Usuarios
Pessoas que farão o acesso a aplicação com interesse de doar ou adotar algum animal, usuários deverão realizar cadastro e comprovar residência fixa.

### 5.2 Resumo dos Usuários
|Nome|Responsabilidades|Perfil|
|----|-----------------|------|
|Adotante|* Ter a intenção de adotar <br/> * Realizar o cadastro <br/> * Ter condições de manter o pet, referênte a alimentação, medicação e cuidados da saúde|Usuário de Aplicação Web|
|ONG's|* Possuir os animais <br/> * Ter cadastro na aplicação <br/> * Manter os dados dos pet's atualizados |Usuário de Aplicação Web|
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
|RF004|Inclusão de Pet|Usuários do tipo ONG's poderão incluir, visualizar e alterar informações de pet.|
|RF005|Desativar Visualização de Pet|Usuários do tipo ONG's poderão a qualquer momento desativar a visualização de algum animal sempre que desejarem e deverão informar o motivo.|
|RF006|Localizar Animais|Usuários cadastrados ou não poderão localizar animais disponiveis para adoção, mas só os usuários cadastrados poderão ter acesso ao botão de "entrar em contato".|
|RF007|Apresentar Resultados|A tela principal da aplicação apresentará o total de "Animais doados" e "Animais disponíveis"|
|RF008|Curtir animais|Usuários poderão clicar em icone "Coração" mostrando interesse pelo pet.|
|RF009|Visualizar slider de Imagens|Usuários ao clicar na imagem apresentada na pesquisa visualizará um Slider com mais imagens do Pet em questão.|

## 6.2 Requisitos Não Funcionais
|Nº|Nome|Descrição|
|--|----|---------|
|RNF001|Funcionalidade - Responsividade|O sistema se adapta a diferentes tipos de monitores e aparelhos.|
|RNF002|Funcionalidade - Acurácia|O sistema executa suas funções com precisão.|
|RNF003|Funcionalidade - Segurança de Acesso|O sistema apresenta 100% de segurança e todos as informações são protegidas no banco de dados.|
|RNF004|Confiabilidade - Maturidade|O sistema não apresenta bugs e erro de conteúdo aos usuários.|
|RNF005|Confiabilidade - Tolerância a Falhas|O sistema não tolera falhas de instabilidade em geral.|
|RNF006|Confiabilidade - Recuperabilidade|Caso o sistema fique off-line os dados estarão armazenados no banco de dados, e o sistema restaurado com as ultimas configurações.|
|RNF007|Usabilidade - Apresentabilidade|O sistema deverá ser o mais intuitivo possível para o uso do usuário.|
|RNF008|Usabilidade - Operacionalidade|A interface precisa seguir o fluxo de funcionamento do sistema. Sendo o mais simples possível para entendimento do usuário e não apresentando dificuldades ou redundância.|
|RNF009|Usabilidade - Atratividade|O sistema possui identidade visual própria, sendo composto por ilustrações e tipografia que visam facilitar sua utilização.|
|RNF010|Eficiência - Comportamento em relação ao tempo|O sistema não deverá demorar mais que o tempo médio definido com as análises dos administradores para responder ás solicitações de usuários em detrimento a sua conexão com a internet.|
|RNF011|Eficiência - Utilização de recursos| A utilização de conexão de dados do usuário deverá ser a mínima possível em relação as requisições realizadas pelo mesmo.|
|RNF012|Manutenibilidade - Modificabilidade|O sistema poderá sofrer alterações com facilidade e rapidez caso seja evidenciado algum problema.|
|RNF013|Manutenibilidade - Analisabilidade|O sistema apresenta documentação detalhada de seus requisitos, proporcionando facilidade na análise de alguma função ou código.|

## 6.3 Descrição de Processos
Descrevemos os principais processos executados pelos usuários na aplicação.

### 6.3.1 Fluxo Adotante
Usuário adotante com o processo de cadastro concluído realizará a autenticação no aplicativo. Na tela principal utilizará  da barra de pesquisa para localizar algum pet de interesse ou selecionará alguns dos resultados apresentados na tabela de resultados.
O aplicativo apresenta os cadastros de pet com uma imagem principal, nome da ONG’s responsável pelo animal, breve resumo do animal e um texto com link “entrar em contato”

Ao clicar no botão contato o usuário será direcionado a uma tela que possui mais informações sobre a ONGs possibilitando que o usuário entre em contato com a mesma e concluindo o processo de adoção.

<figure>
<figcaption>Fluxo Principal Adotante</figcaption>
<img src="https://github.com/TurmaADS2020/PetLife/blob/main/documentation/images/attachment/dv_principal_adotante.png?raw=true">
</figure>

### 6.3.2 Fluxo Doador
O usuário doador com o processo de cadastro concluído realizará a autenticação no aplicativo. Na tela principal o usuário visualiza um botão para acessar o perfil onde será apresentado todos os pets cadastrados por ele e possibilidade de realizar novo cadastro.

O Usuário poderá sempre que desejar atualizar suas informações possibilitando que o adotante tenha acesso a dados atualizados.

Os contatos feitos pelo adotante serão por meios externos ao aplicativo.

<figure>
<figcaption>Fluxo Principal Doador</figcaption>
<img src="https://github.com/TurmaADS2020/PetLife/blob/main/documentation/images/attachment/dv_principal_doador.png?raw=true">
</figure>

### 6.3.3 Fluxo Principal do Processo de Doação
Fluxo apresenta o processo principal da aplicação com todas as exigências sanadas, as exceções serão apresentados nos documentos de casos de uso armazenados no diretório “PetLife/documentation/requirements/use_cases/” e referenciados em tabela no tópico de Casos de Uso.

<figure>
<figcaption>Fluxo Principal Doação</figcaption>
<img src="https://github.com/TurmaADS2020/PetLife/blob/main/documentation/images/attachment/dv_principal_doacao.png?raw=true">
</figure>

## 6.4 Casos de Uso
Apresentação dos casos de uso, os documentos estão armazenados e serão referenciados na tabela a seguir.

|Nº|Nome|Descrição|Local|
|--|----|---------|-----|
|UC001|Cadastro de Usuário|Processo de cadastro de novos usuários|<a href="https://github.com/TurmaADS2020/PetLife/blob/main/documentation/requirements/use_cases/UC002.md"> Link </a>|
|UC002|Autenticação de Usuário|Processo de autenticação do usuário na aplicação|<a href="https://github.com/TurmaADS2020/PetLife/blob/main/documentation/requirements/use_cases/UC001.md"> Link </a> |
|UC003|Redefinir Senha|Processo de redefinir a senha esquecida pelo usuário|<a href="https://github.com/TurmaADS2020/PetLife/blob/main/documentation/requirements/use_cases/UC003.md"> Link </a> |
|UC004|Modificar Perfil|Processo de alteração no perfil do usuário|(verificar caso de uso)|
|UC005|Doa Animal|Processo cadastrar um animal na plataforma |<a href="https://github.com/TurmaADS2020/PetLife/blob/main/documentation/requirements/use_cases/1.2.12_Doacoes.md"> Link </a>|
|UC006|Pesquisa Animal|Proceso de busca por animal cadastrado no sistema |<a href="https://github.com/TurmaADS2020/PetLife/blob/main/documentation/requirements/use_cases/UC004.md"> Link </a>|
|UC007|Favorita Animal|Processo de marcar um animal como favorito|(verificar necessidade)|
|UC008|Adota Animal|Processo de adotar um animal cadastrado na plataforma|<a href="https://github.com/TurmaADS2020/PetLife/blob/main/documentation/requirements/use_cases/1.2.3_Pagina_apos_logado.md"> Link </a>|
|UC009|Cancela Cadastro| Processo de cancelar um cadastro feito no sistema|(caso de uso inexistente)|

## 7. Restrições
Restrições que serão impostas ao sistema ou ao processo de desenvolvimento.
* Deve ser funcional no ambiente web e mobile;
* Deve ser responsivo no ambiente web e mobile;
* Deve ser compativel com os browsers mais populares (chrome, firefox e edge);
## 8. Política de Versionamento
Como será realizado a política de versionamento do projeto.
* GitHub
* Cada alteração é acompanhada pela equipe antes de cada commit;
* É mantido um histórico de versão por meio do github.
