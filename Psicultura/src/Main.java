
import conexao.CriaQuery;
import conexao.InsertTable;
import psicultura.*;
import Interface.*;
import java.util.Date;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        
        String operacao;
        int op;
        CriaQuery q;
        InsertTable insertobj;
        Endereco endereco;
        Cargo cargo;
        Turno turno;
        /**
         * principáis relatórios 
         *  1 O Ph do tanque, como é o dado mais sensível ele precisa ser atualizado constantemente.
         *  2 O oxigênio do tanque.
         *  3 A temperatura do tanque.
         *  4 Um histórico dos Tanques, com base nos critérios dos funcionários.
         *  5 Informações dos funcionários
        
         * principais adições de dados
         *  1 inserir medicao
         *  2 adicionar novo funcionario
         *  3 adicionar especie
         * 
         */
        
        operacao = JOptionPane.showInputDialog("insira a operação \n"
                                            + " 1 - Gerar relatorio \n"
                                            + " 2 - Adição de dados \n"
                                            + " 0 - Sair \n");
        op = Integer.parseInt(operacao);
        System.out.println(op);   
        if(op==1){
            /**
             *  menu escolha do relatório
             */
            //objeto que imiprime relatorio
            Relatorio relatorio=new Relatorio();
            operacao = JOptionPane.showInputDialog("Escolha o ralatório \n"
                    + " 1 - Exibir quais especies de peixes estão em quais tanques no momento atual e o tipo da água.\n"
                    + " 2 - Mostrar estado atual de um tanque e quais dados estão fora do esperado.\n"
                    + " 3 - Mostrar quais funcionarios estão responsaveis por quais tanques.\n"
                    + " 4 - Um histórico dos Tanques, com base nos funcionários.\n"
                    + " 5 - mostrar dados de informções de contato dos funcionarios.\n"
                    + " 0 - voltar");        
            op = Integer.parseInt(operacao);
            if(op==1){
               relatorio.RelatorioUm();
            }else if(op==2){
               relatorio.RelatorioDois();
            }else if(op==3){
                relatorio.RelatorioTres();
            }else if(op==4){
                relatorio.RelatorioQuatro(); 
            }else if(op==5){
                relatorio.RelatorioCinco();
            }
            
        }else if(op==2){
            /**
             * menu escolher objeto do dominio
             */  
            operacao = JOptionPane.showInputDialog("Escolha ação\n"
            + " 1 - Inserir nova especie \n"
            + " 2 - Inserir novo tanque  \n"
            + " 3 - Inserir funcionario  \n"
            + " 4 - Inserir gerente      \n"
            + " 5 - Inserir Contato      \n"
            + " 0 - voltar << ");
            op = Integer.parseInt(operacao);
            switch (op) {
                case 1:
                    insertobj= new InsertTable("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv","rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");
                    
                    IPeixe interPeixe = new IPeixe();
                    Peixe peixinho = new Peixe(interPeixe.getNome_especie(),interPeixe.getTipo_agua(),
                                    interPeixe.getTemp_max(),interPeixe.getTemp_min(),interPeixe.getPh_max(),
                                    interPeixe.getPh_min(),interPeixe.getPorcetagem_oxi_max(),interPeixe.getPorcetagem_oxi_min());
                    q = new CriaQuery();
                    insertobj.insert(q.peixe(peixinho));
                    break;
                case 2:
                    insertobj= new InsertTable("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv","rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");
                    
                    ITanque interTanque= new ITanque();
                    Tanque tanque = new Tanque(interTanque.getSensor_temp(),interTanque.getSensor_oxi(),interTanque.getSensor_ph(),interTanque.getPeixe());
                    q=new CriaQuery();
                    insertobj.insert(q.tanque(tanque));
                    break;
                case 3:
                    insertobj= new InsertTable("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv","rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");
                    
                    IFuncionario interFunc= new IFuncionario();
                    endereco =  new Endereco(interFunc.getEndereco().getCep(),
                                    interFunc.getEndereco().getCidade(),interFunc.getEndereco().getBairro(),
                                    interFunc.getEndereco().getLorgadouro(),interFunc.getEndereco().getComplemento());
                    cargo= new Cargo();
                    if("funcionario".equals(interFunc.getCargo())){
                        cargo.setFuncionario();
                    }else if("estagiario".equals(interFunc.getCargo())){
                        cargo.setEstagiario();
                    }
                    turno=new Turno();
                    if("manha".equals(interFunc.getTurno_de_trabalho())){
                        turno.setManha();
                    }else if("tarde".equals(interFunc.getTurno_de_trabalho())){
                        turno.setTarde();
                    }else if("noite".equals(interFunc.getTurno_de_trabalho())){
                        turno.setNoite();
                    }
                    Funcionario func = new Funcionario(interFunc.getNome(),interFunc.getCpf(),
                            interFunc.getTanque_do_func(),cargo,turno,endereco);
                    q=new CriaQuery();
                    insertobj.insert(q.funcionario(func));    /* inserindo no banco */
                    
                    insertobj.insert(q.endereco(func));
                    break;
                case 4:
                    insertobj= new InsertTable("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv","rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");
                    IFuncionario interGen= new IFuncionario();
                    endereco =  new Endereco(interGen.getEndereco().getCep(),
                                    interGen.getEndereco().getCidade(),interGen.getEndereco().getBairro(),
                                    interGen.getEndereco().getLorgadouro(),interGen.getEndereco().getComplemento());
                    
                    cargo = new Cargo();
                    cargo.setGerente();
                    turno=new Turno();
                    if("manha".equals(interGen.getTurno_de_trabalho())){
                        turno.setManha();
                    }else if("tarde".equals(interGen.getTurno_de_trabalho())){
                        turno.setTarde();
                    }else if("noite".equals(interGen.getTurno_de_trabalho())){
                        turno.setNoite();
                    }
                    Gerente gerente= new Gerente(interGen.getNome(),interGen.getCpf(),interGen.getTanque_do_func(),cargo,turno,endereco);
                    q=new CriaQuery();
                    insertobj.insert(q.gerente(gerente));
                    insertobj.insert(q.endereco(gerente));
                    break;
                case 5:
                    insertobj= new InsertTable("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv","rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");
                    IContato interCon= new IContato();
                    Contato contato= new Contato(interCon.getDado(),interCon.getTipo(),interCon.getCPFDono());
                    q=new CriaQuery();
                    insertobj.insert(q.contato(contato));
                    break;
                default:
                    break;
            }
            
        }
        
        
       
        
    }
}

