# TRABALHO 01:  Piscicultura Inteligente
Trabalho desenvolvido durante a disciplina de BD1

# Sumário

### 1. COMPONENTES<br>
Integrantes do grupo<br>
André Altivo: andrehdx@gmail.com<br>
Gabriela Piffer: gabrielamarinato@hotmail.com<br>
Lucca Pedrini: pedrinilucca@gmail.com<br>
Marcelo Passamai Mendes:marceloestudoifes@gmail.com<br>

### 2.INTRODUÇÃO E MOTIVAÇAO<br>
Este documento contém a especificação do projeto do banco de dados <nome do projeto> 
<br>e motivação da escolha realizada. <br>
 
Com o constante crescimento na area da piscicultura e os riscos que envolvem criar peixes em ambientes controlados nosso cliente pensou em uma solução para aumentar a produção e a qualidade dos peixes por meio de um sistema de monitoramento da água. Esse sistema deverá monitorar, registrar informações (PH, temperatura e oxigênio) e avisar quando os niveis estiverem fora do esperado. O monitoramento será feito por sensores e os dados serão enviados para quem estiver cuidando do aquário, cada peixe será tratado de forma diferente, com isso será avisado se a água não estiver em condições ideiais para que seja tomada uma decisão. 
 

### 3.MINI-MUNDO Novo<br>

 O sistema que o cliente deseja, precisa auxiliar no gerenciamento de diversos tanques de piscicultura, monitorando e informando dados sensíveis em tempo real para que seja tomada providências de forma ágil. Esse sistema também deve gerenciar funcionários individualmente para que se possa obter a informação de qual funcionário está responsável por qual tanque em certa hora do dia.
 
 Com isso, foi decidido que a melhor forma de resolver esse problema é com um sistema, que irá notificar o funcionário responsável e o gerente quando um valor estiver fora do padrão pré definido. Esse padrão é definido pelo tipo de peixe que está em cada tanque (somente uma espécie de peixe por tanque), os peixes poderão ser cadastrados pelo gerente que irá informar todos os intervalos de valores aceitáveis para criação daquela espécie de peixe.
 
 Todos os dados serão obtidos por meio de sensores que tem como objetivo capturar a Temperatura, Ph e o Oxigênio do tanque. Como a maioria dos peixes precisam de uma condição aceitável para sobreviver, esses dados serão atualizados a todo minuto para que se garanta a confiabilidade do sistema. Essas informações serão apresentadas de forma intuitiva para ajudar no entendimento da situação e serão guardados históricos no banco de dados para que se possa comparar e analisar como o tanque se comportou em um certo período de tempo.
 
 O aplicativo deve conter um sistema de login, que tem como principal objetivo separar o usuário funcionário do gerente. Enquanto os funcionários só terão acesso às informações pessoais e funções designadas a eles o gerente poderá modificar os dados de todos os funcionários e terá acesso a funções administrativas (cadastrar tanques, cadastrar funcionários e cadastrar peixes).

 

### 4.RASCUNHOS BÁSICOS DA INTERFACE (MOCKUPS)<br>

![Protótipo feito no Balsamiq](https://github.com/pisciculturainteligente/trab01/blob/master/arquivos/PsicIntBalsamiqProt.pdf?raw=true "Protótipo")

#### 4.1 QUAIS PERGUNTAS PODEM SER RESPONDIDAS COM O SISTEMA PROPOSTO?
 
 > O cliente precisa que o sistema informe os seguintes dados:
    
 * O Ph do tanque, como é o dado mais sensível ele precisa ser atualizado constantemente.
 * O oxigênio do tanque.
 * A temperatura do tanque.
 * Um histórico dos Tanques, com base nos critérios dos funcionários.
 * Informações dos funcionários.
 
 
#### 4.2 TABELA DE DADOS DO SISTEMA:
   
![Tabela](https://github.com/pisciculturainteligente/trab01/blob/master/Planilha%20Projeto%20Psicultura.xlsx?raw=true "Tabela")
    
>## Marco de Entrega 01 em: (30/08/2018)<br>

### 5.MODELO CONCEITUAL<br>
        
![Alt text](https://github.com/pisciculturainteligente/trab01/blob/master/novosmodelos/modelo_conceitual_v5.png?raw=true "Modelo Conceitual")
    
    B) NOTACAO UML (Caso esteja fazendo a disciplina de analise)
![Alt text](https://github.com/pisciculturainteligente/trab01/blob/master/images/Diagrama%20de%20classe%20An%C3%A1lise.jpg?raw=true "Modelagem de classe")
    C) QUALIDADE 
        Garantir que a semântica dos atributos seja clara no esquema
        Criar o esquema de forma a garantir a redução de informação redundante, possibilidade de valores null, 
        e tuplas falsas
    
        
    
#### 5.1 Validação do Modelo Conceitual
    Transportes de perecíveis: Rafael dos Anjos e Andreas José, Nicolas e Daniel Comerio
    QRBus: Ewerson Vieira, Giuliano de Paulo, Lorran Gabriel e Marcos Antônio

#### 5.2 DECISÕES DE PROJETO
    a) Sensor: Campo que guarda a informação sobre quais sensores estão associados com esse tanque.
    
    b) Temperatura mínima e máxima: possui a informação da temperatura máxima e mínima que o peixe precisa para sobreviver.
    
    c) Oxigênio mínima e máxima: possui a informação do oxigênio máximo e mínimo que o peixe precisa para sobreviver.
    
    d) Ph mínima e máxima: possui a informação do Ph máximo e mínimo que o peixe precisa para sobreviver.
    
    e) Especie: Nome do tipo do peixe, é preciso saber para saber as condições ideais do tanque.
    
    f) Data e Hora: necessário para manter um histórico das informações.

>## Marco de Entrega 02 em: (13/09/2018)<br>
#### 5.3 DESCRIÇÃO DOS DADOS 
    Funcionario: Tabela que armazena as informações relacionadas ao funcionario;
     Id: campo de identificação do funcionario;
     IdTurno: campo de identificação do turno que o funcionario trabalha;
     IdCargo: campo de identificação do cargo que o funcionario atua;
     Nome: campo que armazena o nome do funcionario;
     CPF: campo que armazena o número de Cadastro de Pessoa Física para cada funcionario;
     IdTanque: campo de identificação do tanque cujo o funcionario é responsavel.
    
    Turno: Tabela que armazena os turnos de trabalho;
     Id: campo de identificação do turno;
     Horario: campo que armazena o periodo do turno.
    
    Cargo: Tabela que armazena as informações relacionadas aos Cargos de trabalho;
     Id: campo de identificação do cargo;
     Nome: campo que armazena o nome do cargo.
    
    Endereço: Tabela que armazena as informações relacionadas ao endereço de certo funcionario;
     IdFuncionario: campo de identificação do funcionario cujo pertence o endereço;
     Cidade: campo que armazena o nome da cidade;
     Bairro: campo que armazena o nome do bairro;
     Logradouro: campo que armazena a rua,avenida,etc;
     Numero: campo que armazena o numero da casa;
     Complemento: campo que armazena o complemento (caso tenha);
     CEP: campo que armazena o CEP do endereço.
     
    Contato: Tabela que armazena os contatos do funcionario;
     Id: campo de identificação do contato;
     IdFuncionario: campo de identificação do funcionario dono do contato;
     IdTipo: campo de identificação do tipo de contato (telefone, email, whatsapp, etc);
     Dado: campo que armazena o contato.
    
    TipoContato: Tabela que armazena os tipos de contatos disponiveis;
     Id: campo de identificação do contato;
     Tipo: nome do tipo de contato.
     
    Tanque: Tabela que armazena as informações relacionadas ao tanque;
     Id: campo de identificação do Tanque;
     IdFuncionario: campo de identificação do funcionario responsavel pelo tanque;
     IdPeixe: campo de identificação do peixe presente no tanque;
     Sensor: campo de identificação dos sensores presentes no tanque.
    
    HistoricoMedição: Tabela que armazena o Historico de Medição relacionada ao Tanque informado pelos Sensores;
     Id: campo de identificação do historico
     Temperatura: campo que armazena a temperatura da água no momento;
     PH: campo que armazena o PH da água no momento;
     Oxigenio: campo que armazena a Oxigenação da água no momento;
     IdTanque: campo de identificação do tanque cujo os dados pertencem;
     Hora: campo que informa a hora em que os dados foram medidos;
     Data: campo que informa a data em que os dados foram medidos;
     
    Peixe: Tablea que armazena as informações relacionadas ao Peixe;
     Id: campo de identificação do peixe;
     Especie: campo que armazena a especie do peixe;
     TipoAgua: campo que armazena o tipo de agua do peixe;
     TempMax: temperatura maxima da agua recomendada para a sobrevivencia do peixe;
     TempMin: temperatura minima da agua recomendada para a sobrevivencia do peixe;
     PHMax: PH maximo da agua recomendada para a sobrevivencia do peixe;
     TempMin: PH minimo da agua recomendada para a sobrevivencia do peixe;
     OxMax: oxigenação maxima da agua recomendada para a sobrevivencia do peixe;
     OxMin: oxigenação minima da agua recomendada para a sobrevivencia do peixe.
    

### 6	MODELO LÓGICO<br>

![Alt text](https://github.com/pisciculturainteligente/trab01/blob/master/novosmodelos/modelo_logico_v5.png?raw=true "Brmodelonovo")
        a) inclusão do modelo lógico do banco de dados
        b) verificação de correspondencia com o modelo conceitual 
        (não serão aceitos modelos que não estejam em conformidade)

### 7	MODELO FÍSICO<br>
https://github.com/pisciculturainteligente/trab01/blob/master/modelo_fisico_v5.sql
      
        
### 8	INSERT APLICADO NAS TABELAS DO BANCO DE DADOS<br>
#### 8.1 DETALHAMENTO DAS INFORMAÇÕES
https://github.com/pisciculturainteligente/trab01/blob/master/insert.sql

#### 8.2 INCLUSÃO DO SCRIPT PARA CRIAÇÃO DE TABELAS E INSERÇÃO DOS DADOS
https://github.com/pisciculturainteligente/trab01/blob/master/arquivos/cria%C3%A7%C3%A3o%20e%20inser%C3%A7%C3%A3o.txt

#### 8.3 INCLUSÃO DO SCRIPT PARA EXCLUSÃO DE TABELAS EXISTENTES, CRIAÇÃO DE TABELA NOVAS E INSERÇÃO DOS DADOS
https://github.com/pisciculturainteligente/trab01/blob/master/arquivos/deletar%20tabelas.txt

>## Marco de Entrega 03 em: (27/09/18) <br>

### 9 TABELAS E PRINCIPAIS CONSULTAS<br>


(https://github.com/pisciculturainteligente/trab01/blob/master/item9.ipynb "item9")

### 10	ATUALIZAÇÃO DA DOCUMENTAÇÃO DOS SLIDES PARA APRESENTAÇAO FINAL (Mínimo 6 e Máximo 10)<br>

### 11 Backup completo do banco de dados postgres 
https://github.com/pisciculturainteligente/trab01/blob/master/backupBD.backup 
    a) deve ser realizado no formato "backup" 
        (Em Dump Options #1 Habilitar opções Don't Save Owner e Privilege)
    b) antes de postar o arquivo no git o mesmo deve ser testado/restaurado por outro grupo de alunos/dupla
    c) informar aqui o grupo de alunos/dupla que realizou o teste.
	
	Andreas Hermes
	Daniel Comério
	Nicolas Sampaio
	Rafael dos Anjos

### 12	TUTORIAL COMPLETO DE PASSOS PARA RESTAURACAO DO BANCO E EXECUCAO DE PROCEDIMENTOS ENVOLVIDOS NO TRABALHO PARA OBTENÇÃO DOS RESULTADOS<br>
Tutorial de restauração
Com o Download do backup feito e o pgadmin aberto, Siga os passos a seguir<br>
![Alt text](https://github.com/pisciculturainteligente/trab01/blob/master/images/restore/criardatabase.png?raw=true "criar")<br>

Crie um banco de dados para servir de restauração do backup<br>
![Imagem 2](https://github.com/pisciculturainteligente/trab01/blob/master/images/restore/criardatabase01.PNG?raw=true "Criar1")<br>	
Com banco devidamente criado siga os passo a seguir para restaurar o banco<br>
![Alt text](https://github.com/pisciculturainteligente/trab01/blob/master/images/restore/restore1.png?raw=true "restaurar")<br>	
Selecione onde você baixou o arquivo de backup e insira em filename<br>
![Alt text](https://github.com/pisciculturainteligente/trab01/blob/master/images/restore/restore2.PNG?raw=true "restaurar1")<br>    
Clique em restore e aguarde
		
	a) Outros grupos deverão ser capazes de restaurar o banco
        b) executar todas as consultas presentes no trabalho
        c) executar códigos que tenham sido construídos para o trabalho 
        d) realizar qualquer procedimento executado pelo grupo que desenvolveu o trabalho
        
### 13   DIFICULDADES ENCONTRADAS PELO GRUPO<br>
>## Marco de Entrega Final em: (08/11/2018)<br>
        
### 14  FORMATACAO NO GIT: https://help.github.com/articles/basic-writing-and-formatting-syntax/
<comentario no git>
 

    
##### About Formatting
    https://help.github.com/articles/about-writing-and-formatting-on-github/
    
##### Basic Formatting in Git
    
    https://help.github.com/articles/basic-writing-and-formatting-syntax/#referencing-issues-and-pull-requests
    
    
##### Working with advanced formatting
    https://help.github.com/articles/working-with-advanced-formatting/
#### Mastering Markdown
    https://guides.github.com/features/mastering-markdown/


### 15 Canvas<br>
![Alt text](https://github.com/pisciculturainteligente/trab01/blob/master/images/CanvasPiscicultura.jpg?raw=true "Modelo Conceitual")
    
### 16 Trello<br>
  https://trello.com/b/s6o1Ke4c/trabalho-integrado
    
### OBSERVAÇÕES IMPORTANTES

#### Todos os arquivos que fazem parte do projeto (Imagens, pdfs, arquivos fonte, etc..), devem estar presentes no GIT. Os arquivos do projeto vigente não devem ser armazenados em quaisquer outras plataformas.
1. Caso existam arquivos com conteúdos sigilosos, comunicar o professor que definirá em conjunto com o grupo a melhor forma de armazenamento do arquivo.

#### Todos os grupos deverão fazer Fork deste repositório e dar permissões administrativas ao usuário do git "profmoisesomena", para acompanhamento do trabalho.

#### Os usuários criados no GIT devem possuir o nome de identificação do aluno (não serão aceitos nomes como Eu123, meuprojeto, pro456, etc). Em caso de dúvida comunicar o professor.


Link para BrModelo:<br>
http://sis4.com/brModelo/brModelo/download.html
<br>


Link para curso de GIT<br>
![https://www.youtube.com/curso_git](https://www.youtube.com/playlist?list=PLo7sFyCeiGUdIyEmHdfbuD2eR4XPDqnN2?raw=true "Title")


