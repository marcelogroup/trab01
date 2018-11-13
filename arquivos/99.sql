create view contatoetipo as
select Contato.idcontato,Contato.dado,TipoContato.Tipo 
from Contato
inner join TipoContato
on (Contato.FK_TipoContato_IdTipo = TipoContato.IdTipo );

create view pessoacontato as
select Funcionario.Nome ,Contato.dado
from Funcionario
inner join Contato
on (Contato.FK_Funcionario_IdFuncionario = Funcionario.IdFuncionario );

create view idtanquehistorico as
select Tanque.IdTanque ,HistoricoMedicao.Temperatura, HistoricoMedicao.Oxigenio,HistoricoMedicao.Ph, HistoricoMedicao.Hora, HistoricoMedicao.Data
from Tanque
inner join HistoricoMedicao
on (Tanque.idTanque = HistoricoMedicao.FK_Tanque_IdTanque );

create view infofuncionario as
select f.Nome as funcionario, cargo.NomeCargo, tq.Idtanque, turno.Horario as turno
from funcionario f inner join cargo on (f.FK_Cargo_IdCargo = cargo.IdCargo)
inner join turno on (f.FK_Turno_IdTurno = turno.IdTurno)
left outer join tanque tq on (f.FK_Tanque_IdTanque=tq.idtanque);

create view tanquepeixe as
select tanque.idtanque, peixe.NomeCientifico
from peixe right outer join tanque on (tanque.FK_Peixe_IdPeixe =peixe.idpeixe);

create view mediaoxigenio as
select FK_Tanque_IdTanque as idtanque, AVG(oxigenio) as mediaOxigenio
FROM HistoricoMedicao
Group By FK_Tanque_IdTanque;
