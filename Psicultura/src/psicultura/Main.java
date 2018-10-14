
package psicultura;



public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int codigoOperacao;
        Tanque tanque= new Tanque(29.7f,0.0077f,7.045f,1);
        //
        EspeciePeixe peixe= new EspeciePeixe("tilapia","doce",40.5f,15.9f,7.99f,6.89f,0.0100f,0.0010f);
        //
        tanque.addPeixe(peixe);
        //
        Gerente gerente= new  Gerente("jose","14730683714","220372", "matutino","0001","Rua carijós","29106090","soteco","vila ","02730631033");
        //
        Funcionario func= new Funcionario("Joao manoel","14783730715","330227","maturino","0002","Rua machado de Assis","290106803","cocal","cariacica","02732569875",1);    
        
       
    }
}

 /*codigos de operação
        1 criar tanque 
        2 criar gerente 
        3 criar funcionario 
        4 criar peixe
        5 adcionar peixe ao tanque
        0 sair
        
        String op_str =JOptionPane.showInputDialog(null,"Digite a operacao");
        codigoOperacao = Integer.parseInt(op_str);
        while(codigoOperacao!=0){
            if(codigoOperacao==1){
                //criar tanque
                String id_str =JOptionPane.showInputDialog(null,"O id do tanque");
                Tanque tanque=new Tanque();
            }
            if(codigoOperacao==2){
                //criar gerente
            }
            if(codigoOperacao==3){
                //criar funcionario
            }
            if(codigoOperacao==4){
                
            }
        
            
            
            op_str =JOptionPane.showInputDialog(null,"Digite a operacao");
            codigoOperacao = Integer.parseInt(op_str);
        }*/