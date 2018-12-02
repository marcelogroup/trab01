/*cargo*/
INSERT INTO cargo(NomeCargo)values('gerente'),('funcionario');
/*turno*/
INSERT INTO turno (horario) values('manhã'),('tarde'),('noite');
/*peixe*/
insert into peixe (idpeixe, nomecientifico,tipoagua,tempmin,tempmax,phmin,phmax,oxmin,oxmax)values
	(0,'none','none',0,0,0,0.0,0,0);
insert INTO peixe (nomecientifico,tipoagua,tempmin,tempmax,phmin,phmax,oxmin,oxmax)values
	('tilapia','doce'	 ,27,32,6,8.5,5,10),
	('dourado','doce'	 ,22,28,6.5,8,4,10),
	('prateado','salgada',22,28,6.5,8,4,10), 
	('sardinha','salgada',25,37.5,6.5,8,4,10), 
	('bacalhau','salgada',18,23,6.1,8,4,10), 
	('marlin'  ,'salgada',20.5,25,6.5,8,4,10),	
	('piranha' ,'doce'   ,27.5,32,6.5,8,4,10),
	('casao'   ,'salgada',32.5,38,5.5,8,4,10),
	('peroa'   ,'salgada',20.5,25,7.5,8,4,10),
	('baicu'   ,'doce'	 ,20.5,25,6.0,8,4,10);	
	
INSERT INTO TipoContato(idTipo, Tipo)
VALUES  (1, 'email'),
		(2, 'telefone');
	
INSERT INTO tanque (idtanque,temperatura,ph,oxigenio,fk_peixe_idpeixe)values
	(0,0,0,0,0);	
INSERT INTO tanque (temperatura,ph,oxigenio,fk_peixe_idpeixe)values
	(30.5,6.2,7.2,1),
	(30.4,6.9,5.5,2),
	(30.1,6.9,6.2,1),
	(30.3,6.8,6.3,2),
	(30.5,7.2,7.1,1);

INSERT INTO funcionario (nome,cpf,fk_tanque_idtanque,fk_turno_idturno,fk_cargo_idcargo)values
	('gabriela','24739683714',0,1,1),
	('marcelo','14730683714',1,1,2),
	('gandalf','74731683511',2,1,2),
	('andre'  ,'71131683510',3,1,2),
	('joaquim','12331622510',4,1,2),
	('bilbo'  ,'98753612345',5,1,2),
	('lucca'  ,'98753612655',0,2,1),
	('boromir','24730683714',1,2,2),
	('aragorn','23731683511',2,2,2),
	('legolas','32131683510',3,2,2),
	('tauriel','32331622510',4,2,2),
	('frodo'  ,'98246612345',5,2,2);

alter table   endereco alter column logradouro type  varchar(35);
INSERT INTO endereco (cidade,	  bairro   ,logradouro				,complemento ,cep		,fk_funcionario_idfuncionario)values
	('Serra','serra sede'  	  ,'rua crisantemo'        ,' numero 13' ,'22106080',1),
	('vila velha'	,'soteco' ,'rua visconde de taunay',' numero 33' ,'29106080',2),
	('vila velha'	,'cocal'  ,'rua cravos verdes'		,' numero 31' ,'29106090',3),
	('vila velha'	,'cocal'  ,'rua laranja mecanica'	,' numero 27' ,'29106100',4),
	('vila velha'  	,'soteco' ,'rua dos alfaiates'		,' numero 55' ,'29106110',5),
	('middle earth'	,'cocal'  ,'rua ponei saltitante'	,' numero 15' ,'29106111',6),
	('vila velha'  ,'itapua'  ,'rua abacate doce'		,' numero 23' ,'29106101',7),
	('middle earth'	,'harehal','rua dos alfaiates'	 	,' numero 65' ,'29106111',8),
	('middle earth'	,'condado','rua ponei saltitante'	,' numero 15' ,'29106121',9),
	('middle earth'	,'harehal','rua dos alfaiates'	 	,' numero 95' ,'29106111',10),
	('middle earth'	,'condado','rua ponei saltitante'	,' numero 25' ,'29106121',11),
	('middle earth'	,'harehal','rua dos alfaiates'	 	,' numero 75' ,'29106111',12);
	


/*respectivos contatos*/
INSERT INTO contato
(dado,fk_tipocontato_idtipo,fk_funcionario_idfuncionario)values('33394433',2,2),
	('gabichu@gmail.com',1,1),
	('marceloestudoifes@gmail.com',1,2),
	('33393191',2,3),
	('gatao@gmail.com',1,3),
	('33323987',2,4),
	('33393123',2,5),
	('33393789',2,6),
	('32569874',2,7),
	('32569811',2,8),
	('33304499',2,9),
	('30334148',2,10),
	('38985689',2,11),
	('30313459',2,12);


/* medicoes */
/* /tanque1 */
INSERT INTO medicao (temperatura,ph,oxigenio,hora,data,fk_tanque_idtanque)
values(34 ,7.5 ,8.9,'08:30', '2018-1-28', 1),
(34.1 ,7.6 ,8.8,'09:30', '2018-1-28', 1),
(34.3 ,7.7 ,8.7,'10:30', '2018-1-28', 1),
(34.4 ,7.8 ,8.7,'11:30', '2018-1-28', 1),
(35.5 ,7.9 ,8.5,'12:30', '2018-1-28', 1);

/* tanque2 */
INSERT INTO medicao (temperatura,ph,oxigenio,hora,data,fk_tanque_idtanque)
values(33 ,7.0 ,8.6,'08:30', '2018-1-28', 2),
(33.1 ,7.1 ,8.8,'09:30', '2018-1-28', 2),
(32.3 ,7.5 ,8.6,'10:30', '2018-1-28', 2),
(34.4 ,7.1 ,8.6,'11:30', '2018-1-28', 2),
(33.5 ,7.1 ,8.5,'12:30', '2018-1-28', 2);

/* tanque3 */
INSERT INTO medicao (temperatura,ph,oxigenio,hora,data,fk_tanque_idtanque)
values(34 ,7.5 ,8.9,'08:30', '2018-1-28', 3),
(34.1 ,7.6 ,8.8,'09:30', '2018-1-28', 3),
(34.3 ,7.7 ,8.7,'10:30', '2018-1-28', 3),
(34.4 ,7.8 ,8.7,'11:30', '2018-1-28', 3),
(35.5 ,7.9 ,8.5,'12:30', '2018-1-28', 3);

/* tanque4 */
INSERT INTO medicao (temperatura,ph,oxigenio,hora,data,fk_tanque_idtanque)
values(33 ,7.0 ,8.6,'08:30','2018-1-28', 4),
(33.1 ,7.1 ,8.8,'09:30', '2018-1-28', 4),
(32.3 ,7.5 ,8.6,'10:30', '2018-1-28', 4),
(34.4 ,7.1 ,8.6,'11:30', '2018-1-28', 4),
(33.5 ,7.1 ,8.5,'12:30', '2018-1-28', 4);

/*tanque 5*/
INSERT INTO medicao (temperatura,ph,oxigenio,hora,data,fk_tanque_idtanque)
values(34 ,7.5 ,8.9,'08:30', '2018-1-28', 5),
(34.1 ,7.6 ,8.8,'09:30', '2018-1-28', 5),
(34.3 ,7.7 ,8.7,'10:30', '2018-1-28', 5),
(34.4 ,7.8 ,8.7,'11:30', '2018-1-28', 5),
(35.5 ,7.9 ,8.5,'12:30', '2018-1-28', 5);
