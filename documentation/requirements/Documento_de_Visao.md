# Documento de Visão
## PetLife

## 1. Introdução
O objetivo deste documento é a coleta, análise e definição das necessidades e funcionalidades do projeto Pet Life em alto nível de abstração. O foco deste documento é identificar as necessidades dos stakeholders (partes interessadas) e usuários-alvo e a importância delas existirem. O detalhamento de como o Pet Life vai suprir essas necessidades será realizado nas especificações de casos de uso e especificações suplementares.

### 1.1 Visão Estratégica
Este APP Pet Life tem como objetivo aproximar Ongs doadoras de Pets com pessoas que queiram adotar um animal, seja ele, cachorro, gato, pássaro, etc.

### 1.2 Escopo
Cadastrar de maneira rápida, fácil e segura as Ongs doadoras, podendo cada Ong postar fotos e dados dos pets que estarão disponíveis para doação. Os dados do doador e do Pet ficarão visíveis para o cliente efetuar a melhor escolha para sua adoção. Serão desenvolvidas apenas funcionalidades que atenderão a primeira versão do sistema. São elas:

### 1.2.1 Página Inicial
Ao abrir o aplicativo o usuário deverá ter a visibilidade dos seguintes itens:
   * Logo do Aplicativo;
   * Campo para poder digitar o login;
   * Campo para poder digitar a senha;
   * Opção para se cadastrar;
   * Opção para solicitar reset de senha;
   * Opção para o usuário manter-se conectado no aplicativo.

### 1.2.2 Tela de cadastro de usuário pessoas física e jurídica
Ao abrir o aplicativo o usuário deverá ter a visibilidade dos seguintes itens:
   * Logo do Aplicativo;
   * Campo para digitar o nome completo do usuário;
   * Campo para o usuário digitar o e-mail pessoal ou corporativo;
   * Campo para digitar o CPF ou CNPJ do usuário;
   * Campo para digitar a senha do usuário;
   * Campo para digitar o telefone;
   * Campo para digitar o CEP e endereço completo;
   * Campo para carregar documentos de anexos;
   * Aceite o Termo de uso (após realizar a leitura).
   * Validação Scarface;
   * Validação do e-mail.

### 1.2.3 Página após logado
Ao abrir o aplicativo o usuário deverá ter a visibilidade dos seguintes itens:
   * Barra de pesquisa
   * Filtro com as seguintes opções (Busca por região, animais e cidade)
   * Div com publicações onde ira conter 
   * Botão de contato com redirecionamento para o whats app
   * Menu

### 1.2.4 Barra de Pesquisa
Ao abrir a pesquisa no aplicativo o usuário deverá ter a visibilidade dos seguintes itens:
   * Barra de pesquisa;
   * Resultados em bloco;
   * Foto do Animal;
   * Informações Resumidas;
   * Botão de Perfil - Usuário;
   * Botão de Início;
   * Botão de Perfil - Animal;

### 1.2.5 Página de Informações do Animal
Ao abrir o bloco do animal, no aplicativo, o usuário deverá ter a visibilidade dos seguintes itens:
   * Barra de pesquisa;
   * Carrossel de Fotos do Animal;
   * Informações Detalhadas;
   * Botão para Chat;
   * Botão de Perfil - Usuário;
   * Botão de Início;
   * Botão de Perfil - Animal;

### 1.2.6 Página de Chat
Ao abrir o bloco do animal, no aplicativo, o usuário deverá ter a visibilidade dos seguintes itens:
   * Barra de pesquisa;
   * Bloco superior com foto miniatura e Nome;
   * Painel de mensagens;
   * Bloco para inserir texto;
   * Botão para enviar mensagem;
   * Botão de Perfil - Usuário;
   * Botão de Início;
   * Botão de Perfil - Animal;

### 1.2.7 Página de Perfil do Usuário
Ao abrir o bloco do perfil de usuário, no aplicativo, o usuário deverá ter a visibilidade dos seguintes itens:
   * Bloco com informações gravadas no sistema;
   * Botão Editar Informações;
   * Botão Salvar Informações;
   * Botão de Perfil - Usuário;
   * Botão de Início;
   * Botão de Perfil - Animal;

### 1.2.8 Página de Perfil do Animal
Ao abrir o bloco de perfil do animal, no aplicativo, o usuário deverá ter a visibilidade dos seguintes itens:
   * Bloco com informações gravadas no sistema;
   * Bloco com a foto atual do animal;
   * Botão para inserir/alterar foto;
   * Botão Salvar Informações;
   * Botão de Perfil - Usuário;
   * Botão de Início;
   * Botão de Perfil - Animal;

### 1.2.9 Página de Login do usuário
Ao abrir o perfil do usuário, se o mesmo não estiver autenticado no aplicativo, o usuário deverá ter a visibilidade dos seguintes itens:
   * Logo do Aplicativo;
   * Bloco com campo para login e senha;
   * Botão entrar no sistema;
   * Botão esqueceu a senha;
   * Botão Registro no sistema;
   * Botão de Perfil - Usuário;
   * Botão de Início;
   * Botão de Perfil - Animal;

### 1.2.10 Página de reset de senha do usuário
Ao abrir o perfil do usuário, se o mesmo não estiver autenticado no aplicativo, o usuário deverá ter a visibilidade dos seguintes itens:
   * Logo do Aplicativo;
   * Bloco com campo para e-mail;
   * Botão envio de senha no e-mail;
   * Botão de Perfil - Usuário;
   * Botão de Início;
   * Botão de Perfil - Animal;

### 1.2.11 Página de Registro do usuário
Ao abrir o perfil do usuário, se o mesmo não estiver autenticado no aplicativo, o usuário deverá ter a visibilidade dos seguintes itens:
   * Logo do Aplicativo;
   * Bloco Informações necessárias de registro;
   * Botão criar perfil;
   * Botão de Perfil - Usuário;
   * Botão de Início;
   * Botão de Perfil - Animal;

### 1.3 Definições e Abreviaturas
Vide Glossário do projeto.

### 1.4 Referências
|Nome do Documento de Referência|Data de Criação|Autor|Situação Atual|
|-------------------------------|---------------|-----|--------------|
|Dispõe sobre a reprodução, criação, vendas, compra e doação de animais de estimação em estabelecimentos comerciais e assemelhados, no âmbito do Estado de Mato Grosso, e dá outras providências. Lei Nº 11441 de 01/07/2021|01/07/2021, Publicado no DOE - MT em 2 jul 2021| Assembléia Legislativa do Estado de Mato Grosso|Em Vigência|
|Legislação Estadual de Mato Grosso(1)| | | |
|A Lei Federal de Crimes Ambientais 9.605/98, em seu artigo 32, Cap. V condena todos aquele que "Praticar ato de abuso e maus-tratos à animais domésticos ou domesticados, silvestres, nativos ou exóticos", com pena de detenção de três meses a um ano, e multa (a pena é aumentada de um sexto a um terço se ocorre morte do animal). Lei Nº 9.605, de 12 de fevereiro de 1998(1)|12 de fevereiro de 1998|Lei Federal|Em Vigência|
>Legenda de Situação:(1) Referência existente; (2) Referência existente, mas com necessidade de atualização; (3) Referência deve ser criada sob demanda deste projeto.

## 2. Posicionamento
### 2.1 Benefícios do Projeto
A adoção é extremamente importante para a sociedade e é capaz de salvar a vida de um animal que poderia estar nas ruas, abandonado, morrendo de fome e possivelmente sofrendo de maus tratos.
   * Tutores de cachorros são menos sedentários.
   * Cachorros diminuem a incidência de depressão em idosos.
   * O gato auxilia na comunicação com crianças autistas.

### 2.2 Descrição do Problema
O abandono de animais traz problemas de saúde pública e ambiental afetando toda a sociedade brasileira, ocasionando principalmente a proliferação de zoonoses, ataques a pedestres e condutores devido à agressividade dos animais abandonados e a legislação em defesa dos animais. O abandono de animais no Brasil é um problema alarmante que atinge o todo, pois além de prejudicar o próprio animal, a sociedade também acaba sendo exposta ao perigo. O que precisa ser revisto e colocado em prática seriam políticas públicas e privadas que promovam medidas de conscientização da guarda responsável e dos problemas de saúde pública e ambiental ocasionados pelo abandono. Além de campanhas de castração de animais em massa e de baixo custo a fim de controlar a população de caninos e felinos.

## 3. Descrição dos Usuários

### 3.1 Usuários Envolvidos no Projeto
|Papel na Organização|Entidade Representada/Descrição das Atividades|Papel no Projeto/Papel que o representa no Projeto|
|--------------------|----------------------------------------------|--------------------------------------------------|
|Unir ongs doadoras de pets com interessados a criação deles|Como contexto, facilitar a adoção e dominuir a alta de pets sem lar à qual as ongs acolhem|Ajudar ongs credenciadas e criar novas conexões entre os pets e nós seres humanos|
|Doação de animais|Criação de cadastro e escolha como doador ou donatário|Usuário envolvido no projeto que representa este usuário Cliente|

### 3.2 Ambiente do Usuários

## 4. Priorização das Necessidades

## 5. Perspectiva do Produto
Esta seção descreve a visão geral das características do projeto PetLife (textual e gráfica), expressando relação entre funcionalidades e interfaces com as aplicações

### 5.1 Perspectiva do Produto
O projeto consiste no desenvolvimento de um aplicativo com a finalidade de divulgação de produtos e serviços, tais como parceiros, entre outros. Mas o principal objetivo é atrair futuros clientes a se tornarem conveniados, associados, doadores e parceiros de modo fácil, rápido e seguro através da plataforma , interligando esses dados com o sistema da PetLife.

Suposições e Dependências
Lista cada um dos fatores que afetam os recursos que o documento de visão inclui. Lista as suposições que, se modificadas, alteraram o documento de visão. Por exemplo, uma suposição pode indicar que um sistema operacional específico fique disponível para o hardware designado para o produto de software. Se o sistema operacional não estiver disponível, será necessário alterar o documento de visão.

<img src="https://raw.githubusercontent.com/TurmaADS2020/PetLife/main/documentation/images/attachment/suposicoes_dependencias.png" height="500" width="500">

### 5.2 Licença e Instalaçao

## 6. Caracteristicas Funcionais
Esta seção define e descreve as características funcionais do PetLife. As características funcionais são capacidades necessárias ao sistema para que o mesmo possa atender a demanda funcional do usuário.

### 6.1 Cadastro

Intervenção
Descrição: O sistema deve permitir que uma ONG e um usuário faça os devidos cadastros. Na conclusão dos cadastros, o sistema deverá permitir a entrada da ONG e dos Usuários.Para que assim a ONG possa cadastrar os Pets que residem em sua estádia. E os Usuários ficaram disponíveis para poder adotar os Pets.

### 6.1.1 Funcionalidade: Cadastro

### 6.1.2 Operação: Solicitação de Cadastro de usuário

### 6.1.2.1 Impacto: Criação

### 6.1.3 Operação: Cancelamento de Cadastro de usuário

### 6.1.3.1 Impacto: Exclusão

### 6.1.4 Operação: Solicitação de Cadastro da ONG

### 6.1.4.1 Impacto: Criação

### 6.1.5 Operação: Cancelamento de Cadastro dos ONG

### 6.1.5.1 Impacto: Exclusão

### 6.2 Fotos dos Pet
Intervesão
Descrição: Fotos dos Pets que as ONG's cadastradas terão que adicionar para uma, melhor visualização do usuário que irá decidir adotar. E irá ter fotos para monitoramento dos Pets.

### 6.2.1 Funcionalidade

## 7. Características Não-Funcionais

## 8. Aprovação

