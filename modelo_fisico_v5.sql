/* modelo_logico_v5: */

CREATE TABLE Funcionario (
    IdFuncionario Serial PRIMARY KEY,
    Nome varchar(35),
    CPF varchar(11),
    FK_Tanque_IdTanque Serial,
    FK_Turno_IdTurno Serial,
    FK_Cargo_IdCargo Serial
);

CREATE TABLE Turno (
    IdTurno Serial PRIMARY KEY,
    Horario varchar(10)
);

CREATE TABLE Cargo (
    IdCargo Serial PRIMARY KEY,
    NomeCargo varchar(11)
);

CREATE TABLE Contato (
    IdContato Serial PRIMARY KEY,
    Dado varchar(50),
    FK_TipoContato_IdTipo Serial,
    FK_Funcionario_IdFuncionario Serial
);

CREATE TABLE TipoContato (
    IdTipo Serial PRIMARY KEY,
    Tipo varchar(11)
);

CREATE TABLE Endereco (
    IdEndereco Serial PRIMARY KEY,
    Cidade varchar(20),
    Bairro varchar(20),
    Logradouro varchar(20),
    Complemento varchar(20),
    CEP varchar(8),
    FK_Funcionario_IdFuncionario Serial
);

CREATE TABLE Tanque (
    IdTanque Serial PRIMARY KEY,
    Temperatura float,
    Ph float,
    Oxigenio float,
    FK_Peixe_IdPeixe Serial
);

CREATE TABLE Peixe (
    IdPeixe Serial PRIMARY KEY,
    NomeCientifico varchar(30),
    TipoAgua varchar(10),
    TempMin float,
    TempMax float,
    PhMin float,
    PhMax float,
    OxMin float,
    OxMax float
);

CREATE TABLE Medicao (
    IdMedicao Serial PRIMARY KEY,
    Temperatura float,
    Ph float,
    Oxigenio float,
    Hora time,
    Data date,
    FK_Tanque_IdTanque Serial
);
 
ALTER TABLE Funcionario ADD CONSTRAINT FK_Funcionario_1
    FOREIGN KEY (FK_Tanque_IdTanque)
    REFERENCES Tanque (IdTanque)
    ON DELETE CASCADE ON UPDATE CASCADE;
 
ALTER TABLE Funcionario ADD CONSTRAINT FK_Funcionario_2
    FOREIGN KEY (FK_Turno_IdTurno)
    REFERENCES Turno (IdTurno)
    ON DELETE CASCADE ON UPDATE CASCADE;
 
ALTER TABLE Funcionario ADD CONSTRAINT FK_Funcionario_3
    FOREIGN KEY (FK_Cargo_IdCargo)
    REFERENCES Cargo (IdCargo)
    ON DELETE RESTRICT ON UPDATE RESTRICT;
 
ALTER TABLE Contato ADD CONSTRAINT FK_Contato_1
    FOREIGN KEY (FK_TipoContato_IdTipo)
    REFERENCES TipoContato (IdTipo)
    ON DELETE CASCADE ON UPDATE CASCADE;
 
ALTER TABLE Contato ADD CONSTRAINT FK_Contato_2
    FOREIGN KEY (FK_Funcionario_IdFuncionario)
    REFERENCES Funcionario (IdFuncionario)
    ON DELETE CASCADE ON UPDATE CASCADE;
 
ALTER TABLE Endereco ADD CONSTRAINT FK_Endereco_1
    FOREIGN KEY (FK_Funcionario_IdFuncionario)
    REFERENCES Funcionario (IdFuncionario)
    ON DELETE RESTRICT ON UPDATE RESTRICT;
 
ALTER TABLE Tanque ADD CONSTRAINT FK_Tanque_1
    FOREIGN KEY (FK_Peixe_IdPeixe)
    REFERENCES Peixe (IdPeixe)
    ON DELETE SET NULL ON UPDATE CASCADE;
 
ALTER TABLE Medicao ADD CONSTRAINT FK_Medicao_1
    FOREIGN KEY (FK_Tanque_IdTanque)
    REFERENCES Tanque (IdTanque)
    ON DELETE CASCADE ON UPDATE CASCADE;