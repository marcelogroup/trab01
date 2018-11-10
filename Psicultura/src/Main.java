
import conexao.InsertTable;
import psicultura.Peixe;
import psicultura.Funcionario;
import psicultura.Gerente;
import psicultura.Tanque;
import java.util.Date;
import psicultura.Cargo;
import psicultura.Endereco;
import psicultura.Turno;

public class Main {

    public static void main(String[] args) {
        
        
       Date agora= new Date();
       
       /* fazendo 5 tanques*/       
       Tanque tanque_1=new Tanque(30.4f, 7.5f, 7.1f,1,agora,null);
       Tanque tanque_2=new Tanque(32.5f, 9.2f, 6.9f,2,agora,null);
       Tanque tanque_3=new Tanque(31.7f, 6.1f, 7.0f,3,agora,null);
       Tanque tanque_4=new Tanque(30.1f, 7.1f, 7.5f,4,agora,null);        
       Tanque tanque_5=new Tanque(29.4f, 5.2f, 7.2f,5,agora,null);
       
       
       /*funcionarios da manhã */
       Turno turno_manha=new Turno();
       turno_manha.setManha();
       Cargo funcionario=new Cargo();
       funcionario.setFuncionario();
       
       Funcionario f1  = new Funcionario(null,"marcelo","14730683714",turno_manha,"12345",null,null);
       Endereco end_f1 = new Endereco("29106080","vila velha","soteco","rua visconde de taunay"," numero 33");
       f1.AtualizarEndereco(end_f1);
       f1.AtualizarTanque(tanque_1);
       f1.AtualizarCargo(funcionario);
       
       Funcionario f2  = new Funcionario(null,"olavo","74731683511",turno_manha,"12345",null,null);
       Endereco end_f2 = new Endereco("29106090","vila velha","soteco","rua cravos verdes"," numero 3");
       f1.AtualizarEndereco(end_f2);
       f1.AtualizarTanque(tanque_2);
       f1.AtualizarCargo(funcionario);
       
       Funcionario f3  = new Funcionario(null,"jose","71131683510",turno_manha,"12345",null,null);
       Endereco end_f3 = new Endereco("29106100","vila velha","soteco","rua laranja mecanica"," numero 10");
       f1.AtualizarEndereco(end_f3);
       f1.AtualizarTanque(tanque_3);
       f1.AtualizarCargo(funcionario);
       
       Funcionario f4  = new Funcionario(null,"joaquim","12331622510",turno_manha,"12345",null,null);
       Endereco end_f4 = new Endereco("29106110","vila velha","cristovao colombo","rua dos alfaiates"," numero 4");
       f1.AtualizarEndereco(end_f4);
       f1.AtualizarTanque(tanque_4);
       f1.AtualizarCargo(funcionario);
       
       Funcionario f5  = new Funcionario(null,"bilbo","98753612345",turno_manha,"12345",null,null);
       Endereco end_f5 = new Endereco("29106120","vila velha","cristovao colombo","rua condado"," numero 7");
       f1.AtualizarEndereco(end_f5);
       f1.AtualizarTanque(tanque_5);
       f1.AtualizarCargo(funcionario);
       
       //Cargo gerente = new Cargo();
       //gerente.setGerente();
       Endereco end_g1 = new Endereco("29106120","vila velha","cristovao colombo","rua condado"," numero 7");
       Gerente g1 = new Gerente("moises","56753612345",turno_manha,"12345",end_g1);
       
       
      
       // dados reais
       Peixe tilapia = new Peixe("tilapia","doce", 32.0f, 27.0f, 8.5f, 6.0f, 9.0f, 5.0f );
       Peixe dourado = new Peixe("dourado","doce", 28.0f, 22.0f, 8.0f, 6.5f, 8.0f, 4.0f );
       
       tanque_1.AdicionarPeixe(tilapia);
       tanque_2.AdicionarPeixe(tilapia);
       tanque_3.AdicionarPeixe(dourado);
       tanque_4.AdicionarPeixe(dourado);
       tanque_5.AdicionarPeixe(tilapia);
       
       /**
        * adicionando tanques ao banco
        */
       InsertTable insert_obj= new InsertTable("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv","rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");
        //insert_obj.AdicionarTanque(tanque_1);
        //insert_obj.AdicionarTanque(tanque_2);
        //insert_obj.AdicionarTanque(tanque_3);
        //insert_obj.AdicionarTanque(tanque_4);
        //insert_obj.AdicionarTanque(tanque_5);
        insert_obj.InsertPeixe(dourado);
        insert_obj.InsertPeixe(tilapia);
        insert_obj.InsertPeixe(dourado);
        insert_obj.InsertPeixe(tilapia);
       
    }
}

