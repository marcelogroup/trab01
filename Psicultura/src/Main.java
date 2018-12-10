
import userinterface.IPeixe;
import userinterface.Relatorio;
import userinterface.IContato;
import userinterface.ITanque;
import userinterface.IFuncionario;
import conexao.CriaQuery;
import conexao.InsertTable;
import nucleopsicultura.*;
import conexao.DeleteTable;
import conexao.Update;
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
         *  2 adicionar novo funcionario e seu endereco
         *  3 adicionar especie
         *  4 inserir gerente e seu endereco
         *  5 inserir contato
         */
        /**
         * atualizar dados da espécie 
         * atualizar dados do tanque
         * atualizar dados do gerente
         * atualizar dados do funcionario
         * atualizar contato
         */
        /**
         *  principais deleções 
         *  1 - deletar especie  
         *  2 - deletear tanque
         *  3 - deletar contato
         *  4 - deletar funcionario
         *  5 - deletar gerente
         *  0 << voltar
         */
       
        
        operacao = JOptionPane.showInputDialog("insira a operação \n"
                                            + " 1 - Gerar relatorio. \n"
                                            + " 2 - Adição de dados. \n"
                                            + " 3 - Apagar dados.\n"
                                            + " 4 - Alterar dados.\n"    
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
               relatorio.relatorioUm();
            }else if(op==2){
               relatorio.relatorioDois();
            }else if(op==3){
                relatorio.relatorioTres();
            }else if(op==4){
                relatorio.relatorioQuatro(); 
            }else if(op==5){
                relatorio.relatorioCinco();
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
                    Peixe peixinho = new Peixe(interPeixe.getNomeEspecie(),interPeixe.getTipoAgua(),
                                    interPeixe.getTempMax(),interPeixe.getTempMin(),interPeixe.getPhMax(),
                                    interPeixe.getPhMin(),interPeixe.getPorcetagemOxiMax(),interPeixe.getPorcetagemOxiMin());
                    q = new CriaQuery();
                    insertobj.insert(q.peixe(peixinho));
                    break;
                case 2:
                    insertobj= new InsertTable("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv","rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");
                    
                    ITanque interTanque= new ITanque();
                    Tanque tanque = new Tanque(interTanque.getSensorTemp(),interTanque.getSensorOxi(),interTanque.getSensorPh(),interTanque.getPeixe());
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
                    if("manha".equals(interFunc.getTurnoTrabalho())){
                        turno.setManha();
                    }else if("tarde".equals(interFunc.getTurnoTrabalho())){
                        turno.setTarde();
                    }else if("noite".equals(interFunc.getTurnoTrabalho())){
                        turno.setNoite();
                    }
                    Funcionario func = new Funcionario(interFunc.getNome(),interFunc.getCpf(),
                            interFunc.getTanqueFunc(),cargo,turno,endereco);
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
                    if("manha".equals(interGen.getTurnoTrabalho())){
                        turno.setManha();
                    }else if("tarde".equals(interGen.getTurnoTrabalho())){
                        turno.setTarde();
                    }else if("noite".equals(interGen.getTurnoTrabalho())){
                        turno.setNoite();
                    }
                    Gerente gerente= new Gerente(interGen.getNome(),interGen.getCpf(),interGen.getTanqueFunc(),cargo,turno,endereco);
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
            
        }else if (op==3){
            operacao = JOptionPane.showInputDialog("Escolha ação\n"
            + " 1 - apagar uma especie.\n"
            + " 2 - apagar um tanque. \n"
            + " 3 - apagar um funcionario.\n"
            + " 4 - apagar um endereco  \n"
            + " 5 - apagar um contato  \n"
            + " 0 - voltar << ");
            op = Integer.parseInt(operacao); 
            DeleteTable delete = new DeleteTable();
            CriaQuery query = new CriaQuery();
            if(op==1){
                delete.deletePeixe();                
            }
            else if(op==2){
                delete.deleteTanque();
            }
            else if(op==3){
                delete.deleteFunc();
            }
            else if(op==4){
                delete.deleteEndereco();
            }
            else if(op==5){
                delete.deleteContato();
            }
        }else if (op==4){
            operacao = JOptionPane.showInputDialog("Escolha ação\n"
            + " 1 - atualizar uma especie.\n"
            + " 2 - atualizar um tanque. \n"
            + " 3 - atualizar um funcionario.\n"
            + " 4 - atualizar um endereco.\n"
            + " 5 - atualizar um contato  \n"
            + " 0 - voltar << ");
            op = Integer.parseInt(operacao); 
            CriaQuery query = new CriaQuery();
            Update up = new Update("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv","rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");
            if(op==1){
                up.updatePeixe(query.updatePeixe());
            }
            else if(op==2){
                up.updateTanque(query.updateTanque());
            }
            else if(op==3){
                up.updateFuncionario(query.updateFuncionario());
            }
            else if(op==4){
               up.updateEndereco(query.updateEndereco());
            }
            else if (op==5){
                up.updateContato(query.updateContato());
            }
        }
        
        
       
        
    }
}

