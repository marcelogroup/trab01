/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psiculturainteligente;

/**
 *
 * @author André
 */
class Peixe {
    private String nome;
    private int id;
    private double tempMin;
    private double tempMax;
    private int ph;
    private int oxigenio;
    private int idTanque;
    
    public Peixe(String id,String nome,String tempMin,String tempMax,String ph,String oxigenio){
        this.id= Integer.parseInt(id);
        this.nome= nome;
        this.tempMin= Double.parseDouble(tempMin);
        this.tempMax= Double.parseDouble(tempMax);
        this.ph= Integer.parseInt(ph);
        this.oxigenio=Integer.parseInt(oxigenio);
    }
    public void setTanque(int id,int tanque){
        if(id==this.id)
            this.idTanque=tanque;
    }
    public void listarPeixe(int id){
        if (id==this.id){
            System.out.println("Peixe "+this.nome);
            System.out.println("Temperatura da Agua Recomendada (Min/Max):"+ this.tempMin +"°C/"+this.tempMax+"°C.");
            System.out.println("PH da Agua Recomendada:"+this.ph);
            System.out.println("Oxigenio da Agua Recomendado:"+this.oxigenio);
            System.out.println("Tanque onde o peixe se localiza: Tanque numero "+this.idTanque);
        }
    }
    public void editarNome(int id,String nome){
        if(id==this.id){
            this.nome=nome;
        }
    }
    public void editarTempMin(int id,String temp){
        if(id==this.id){
            this.tempMin=Double.parseDouble(temp);
        }
    }
    public void editarTempMax(int id,String temp){
        if(id==this.id){
            this.tempMax=Double.parseDouble(temp);
        }
    }
    public void editarPH(int id,String ph){
        if(id==this.id){
            this.ph=Integer.parseInt(ph);
        }
    }
    public void editarOxi(int id,String oxi){
        if(id==this.id){
            this.oxigenio=Integer.parseInt(oxi);
        }
    }
    
}
