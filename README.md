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

 O sistema que o cliente deseja precisa auxiliar no gerenciamento de diversos tanques de piscicultura, monitorando e informando dados sensíveis em tempo real para que seja tomada providências de forma exata e ágil. Esse sistema também deve gerenciar funcionários individualmente para que se possa obter a informação de qual funcionário está responsável por qual tanque em certa hora do dia.
 
 Com isso, foi decidido que a melhor forma de resolver esse problema é com um aplicativo mobile, que irá notificar o funcionário responsável e o gerente quando um valor estiver fora do padrão pré definido. Esse padrão é definido pelo tipo de peixe que está em cada tanque (somente uma espécie de peixe por tanque), os peixes poderão ser cadastrados pelo gerente que irá informar todos os intervalos de valores aceitáveis para criação daquela espécie de peixe.
 
 Todos os dados serão obtidos por meio de sensores que tem como objetivo monitorar a Temperatura, Ph e o Oxigênio do tanque. Como a maioria dos peixes precisam de uma condição ideal para sobreviver esses dados serão atualizados a todo minuto para que se garanta a confiabilidade do sistema. Essas informações serão apresentadas de forma intuitiva para ajudar no entendimento da situação e serão guardados históricos no banco de dados para que se possa comparar e analisar como o tanque se comportou em um certo período de tempo.
 
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
        
![Alt text](https://github.com/pisciculturainteligente/trab01/blob/master/Brmodelonovov2.png?raw=true "Brmodelonovo")
    
    B) NOTACAO UML (Caso esteja fazendo a disciplina de analise)
![Alt text](https://github.com/pisciculturainteligente/trab01/blob/master/images/modelagem%20de%20classe_trabalho.png?raw=true "Modelagem de classe")
    C) QUALIDADE 
        Garantir que a semântica dos atributos seja clara no esquema
        Criar o esquema de forma a garantir a redução de informação redundante, possibilidade de valores null, 
        e tuplas falsas
    
        
    
#### 5.1 Validação do Modelo Conceitual
    Transportes de perecíveis: Rafael dos Anjos e Andreas José, Nicolas e Daniel Comerio
    QRBus: Everson, Tadeu

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

![Alt text](https://github.com/pisciculturainteligente/trab01/blob/master/logicoNovo_vs2.png?raw=true "Brmodelonovo")
        a) inclusão do modelo lógico do banco de dados
        b) verificação de correspondencia com o modelo conceitual 
        (não serão aceitos modelos que não estejam em conformidade)

### 7	MODELO FÍSICO<br>
https://github.com/pisciculturainteligente/trab01/blob/master/arquivos/cria%C3%A7%C3%A3o%20de%20tabela.txt
      
        
### 8	INSERT APLICADO NAS TABELAS DO BANCO DE DADOS<br>
#### 8.1 DETALHAMENTO DAS INFORMAÇÕES
https://github.com/pisciculturainteligente/trab01/blob/master/arquivos/insers%C3%A3o%20de%20dados.txt

#### 8.2 INCLUSÃO DO SCRIPT PARA CRIAÇÃO DE TABELAS E INSERÇÃO DOS DADOS
https://github.com/pisciculturainteligente/trab01/blob/master/arquivos/criacao%20e%20insers%C3%A3o.txt

#### 8.3 INCLUSÃO DO SCRIPT PARA EXCLUSÃO DE TABELAS EXISTENTES, CRIAÇÃO DE TABELA NOVAS E INSERÇÃO DOS DADOS
https://github.com/pisciculturainteligente/trab01/blob/master/arquivos/deletar%20tabelas.txt

>## Marco de Entrega 03 em: (27/09/18) <br>

### 9	TABELAS E PRINCIPAIS CONSULTAS<br>
    OBS: Incluir para cada tópico as instruções SQL + imagens (print da tela) mostrando os resultados.<br>
#### 9.1	CONSULTAS DAS TABELAS COM TODOS OS DADOS INSERIDOS (Todas) <br>
#### 9.2	CONSULTAS DAS TABELAS COM FILTROS WHERE (Mínimo 4)<br>
#### 9.3	CONSULTAS QUE USAM OPERADORES LÓGICOS, ARITMÉTICOS E TABELAS OU CAMPOS RENOMEADOS (Mínimo 11)
    a) Criar 5 consultas que envolvam os operadores lógicos AND, OR e Not
    b) Criar no mínimo 3 consultas com operadores aritméticos 
    c) Criar no mínimo 3 consultas com operação de renomear nomes de campos ou tabelas
#### 9.4	CONSULTAS QUE USAM OPERADORES LIKE E DATAS (Mínimo 12) <br>
    a) Criar outras 5 consultas que envolvam like ou ilike
    b) Criar uma consulta para cada tipo de função data apresentada.

#### 9.5	ATUALIZAÇÃO E EXCLUSÃO DE DADOS (Mínimo 6)<br>

>## Marco de Entrega 04 em: (18/10/2017)<br>

#### 9.6	CONSULTAS COM JUNÇÃO E ORDENAÇÃO (Mínimo 6)<br>
        a) Uma junção que envolva todas as tabelas possuindo no mínimo 3 registros no resultado
        b) Outras junções que o grupo considere como sendo as de principal importância para o trabalho
#### 9.7	CONSULTAS COM GROUP BY E FUNÇÕES DE AGRUPAMENTO (Mínimo 6)<br>
#### 9.8	CONSULTAS COM LEFT E RIGHT JOIN (Mínimo 4)<br>
#### 9.9	CONSULTAS COM SELF JOIN E VIEW (Mínimo 6)<br>
        a) Uma junção que envolva Self Join
        b) Outras junções com views que o grupo considere como sendo de relevante importância para o trabalho
#### 9.10	SUBCONSULTAS (Mínimo 3)<br>
### 10	ATUALIZAÇÃO DA DOCUMENTAÇÃO DOS SLIDES PARA APRESENTAÇAO FINAL (Mínimo 6 e Máximo 10)<br>

### 11 Backup completo do banco de dados postgres 
    a) deve ser realizado no formato "backup" 
        (Em Dump Options #1 Habilitar opções Don't Save Owner e Privilege)
    b) antes de postar o arquivo no git o mesmo deve ser testado/restaurado por outro grupo de alunos/dupla
    c) informar aqui o grupo de alunos/dupla que realizou o teste.

### 12	TUTORIAL COMPLETO DE PASSOS PARA RESTAURACAO DO BANCO E EXECUCAO DE PROCEDIMENTOS ENVOLVIDOS NO TRABALHO PARA OBTENÇÃO DOS RESULTADOS<br>
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


