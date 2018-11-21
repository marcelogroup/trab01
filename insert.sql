/*cargo*/
INSERT INTO cargo(NomeCargo)values('gerente'),('funcionario');
/*turno*/
INSERT INTO turno (horario) values('manhã'),('tarde'),('noite');
/*peixe*/
insert INTO peixe (nomecientifico,tipoagua,tempmin,tempmax,phmin,phmax,oxmin,oxmax)values
	('tilapia','doce',27,32,6,8.5,5,9),
	('dourado','doce',22,28,6.5,8,4,8); 
INSERT INTO TipoContato(idTipo, Tipo)
VALUES  (1, 'email'),
		(2, 'telefone');

INSERT INTO funcionario (nome,cpf,fk_tanque_idtanque,fk_turno_idturno,fk_cargo_idcargo)values
	('gabriela','24739683714',null,1,1),
	('marcelo','14730683714',null,1,2),
	('olavo','74731683511',null,1,2),
	('jose','71131683510',null,1,2),
	('joaquim','12331622510',null,1,2),
	('bilbo','98753612345',null,1,2);

INSERT INTO endereco
	(cidade,bairro,logradouro,complemento,cep,fk_funcionario_idfuncionario)values
	('vila velha','soteco','rua visconde de taunay',' numero 33','29106080',2),
	('vila velha','cocal','rua cravos verdes',' numero 33','29106090',3),
	('vila velha','cocal','rua laranja mecanica',' numero 33','29106100',4),
	('vila velha','soteco','rua dos alfaiates',' numero 33','29106110',5),
	('vila velha','condado','rua ponei saltitante',' numero 33','29106120',6);

/*respectivos contatos*/
INSERT INTO contato
(dado,fk_tipocontato_idtipo,fk_funcionario_idfuncionario)values('33394433',2,2),
('marceloestudoifes@gmail.com',1,2),
('33393191',2,3),
('gatao@gmail.com',1,3),
('33323987',2,4),
('33393123',2,5),
('33393789',2,6);

INSERT INTO tanque (temperatura,ph,oxigenio,fk_peixe_idpeixe)values(30.5,6.2,6.2,1),
(30.4,6.9,6.5,2);

/*update tanque nos funcionarios*/
update funcionario set fk_tanque_idtanque=1 where idfuncionario=2;
update funcionario set fk_tanque_idtanque=2 where idfuncionario=3;
update funcionario set fk_tanque_idtanque=3 where idfuncionario=4;
update funcionario set fk_tanque_idtanque=4 where idfuncionario=5;
update funcionario set fk_tanque_idtanque=5 where idfuncionario=6;
/* medicoes 
//tanque1 */
INSERT INTO historicomedicao (temperatura,ph,oxigenio,hora,data,fk_tanque_idtanque)
values(34 ,7.5 ,8.9,'08:30', '1-28-2018', 1),
(34.1 ,7.6 ,8.8,'09:30', '1-28-2018', 1),
(34.3 ,7.7 ,8.7,'10:30', '1-28-2018', 1),
(34.4 ,7.8 ,8.7,'11:30', '1-28-2018', 1),
(35.5 ,7.9 ,8.5,'12:30', '1-28-2018', 1);

/* tanque2 */
INSERT INTO historicomedicao (temperatura,ph,oxigenio,hora,data,fk_tanque_idtanque)
values(33 ,7.0 ,8.6,'08:30', '1-28-2018', 2),
(33.1 ,7.1 ,8.8,'09:30', '1-28-2018', 2),
(32.3 ,7.5 ,8.6,'10:30', '1-28-2018', 2),
(34.4 ,7.1 ,8.6,'11:30', '1-28-2018', 2),
(33.5 ,7.1 ,8.5,'12:30', '1-28-2018', 2);

/* tanque3 */
INSERT INTO historicomedicao (temperatura,ph,oxigenio,hora,data,fk_tanque_idtanque)
values(34 ,7.5 ,8.9,'08:30', '1-28-2018', 3),
(34.1 ,7.6 ,8.8,'09:30', '1-28-2018', 3),
(34.3 ,7.7 ,8.7,'10:30', '1-28-2018', 3),
(34.4 ,7.8 ,8.7,'11:30', '1-28-2018', 3),
(35.5 ,7.9 ,8.5,'12:30', '1-28-2018', 3);

/* tanque4 */
INSERT INTO historicomedicao (temperatura,ph,oxigenio,hora,data,fk_tanque_idtanque)
values(33 ,7.0 ,8.6,'08:30', '1-28-2018', 4),
(33.1 ,7.1 ,8.8,'09:30', '1-28-2018', 4),
(32.3 ,7.5 ,8.6,'10:30', '1-28-2018', 4),
(34.4 ,7.1 ,8.6,'11:30', '1-28-2018', 4),
(33.5 ,7.1 ,8.5,'12:30', '1-28-2018', 4);

/*tanque 5*/
INSERT INTO historicomedicao (temperatura,ph,oxigenio,hora,data,fk_tanque_idtanque)
values(34 ,7.5 ,8.9,'08:30', '1-28-2018', 5),
(34.1 ,7.6 ,8.8,'09:30', '1-28-2018', 5),
(34.3 ,7.7 ,8.7,'10:30', '1-28-2018', 5),
(34.4 ,7.8 ,8.7,'11:30', '1-28-2018', 5),
(35.5 ,7.9 ,8.5,'12:30', '1-28-2018', 5);
