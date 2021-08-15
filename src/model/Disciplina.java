/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author evert
 */
public class Disciplina {
    
    private String Nome;
    private String Professor;
    private double n1 = -1;
    private double n2 = -1;
    private double sub = -1;
    private double exame = -1;

    public Disciplina (String nm_dis, String nm_prof){
        Nome = nm_dis;
        Professor = nm_prof;
    }
    public void alteraDisci(String novoNome){
           Nome=novoNome;
    }
    public void alteraProf(String novoProf){
        Professor=novoProf;
    }
    public void cadastraN1(double nota){
            if ((nota >=0 && nota <=10)){
                n1= nota;
	}
            else{
                
  throw new ArithmeticException("Nota precisa ser de 0 a 10");
}
    
} 
    public void cadastraN2(double nota){
    if ((nota >=0 && nota <=10)){
                n2= nota;
	}
            else{
                
  throw new ArithmeticException("Nota precisa ser de 0 a 10");
}
    }
    public void cadastraSub(double nota){
            if ((nota >=0 && nota <=10)){
                sub= nota;
	}
            else{
                
  throw new ArithmeticException("Nota precisa ser de 0 a 10");
}
    }
    public void cadastraEx(double nota){
            if ((nota >=0 && nota <=10)){
                exame= nota;
	}
            else{
                
  throw new ArithmeticException("Nota precisa ser de 0 a 10");
}
    }
    
    public String Consulta(String campo){
       
        String retorno = "";
       if (campo.equals("nome")){
           retorno = Nome;
       }
       if (campo.equals("professor")){
           retorno= Professor;
       }
       if (campo.equals("n1")){
           retorno= String.valueOf(n1);
       }
       if (campo.equals("n2")){
           retorno = String.valueOf(n2);
       }
       if (campo.equals("sub")){
           retorno = String.valueOf(sub);
       }
       if (campo.equals("exame")){
           retorno = String.valueOf(exame);
       }
           return retorno;
    }
    public String media(){
        double media_semestral= 0;
        double mediaf = 0;
        
        if(sub<0 && n1>=0 && n2>=0){
            media_semestral=(n1+n2)/2;
        }
        if(sub>=0 && n1>=0 && n2==-1){
            media_semestral=(sub+n1)/2;
        }
        if(sub>=0 && n2>=0 && n1==-1){
            media_semestral=(sub+n2)/2;
        }
        
        
        if (n1>=0 && n2 ==-1 && sub ==-1 && exame ==-1 ){
            media_semestral=(n1/2);
    }
       if (n1==-1 && n2 >=0 && sub ==-1 && exame ==-1 ){
            media_semestral=(n2/2);
    }
       if (n1==-1 && n2 ==-1 && sub >=0 && exame ==-1 ){
            media_semestral=(sub/2);
    }
       if (n1==-1 && n2 ==-1 && sub ==-1 && exame >=0 ){
            media_semestral=(exame/2);
            
    }
       if(media_semestral>=6.75){
           
             mediaf=media_semestral;           
        }
       if(media_semestral<6.75 && exame>=0){
           
             mediaf=(media_semestral+exame)/2;           
        }
       if (media_semestral<6.75 && ((exame>=0)==false)) {
            mediaf=(media_semestral /2 );          
       }
            return (  "Média Semestral: " + String.valueOf(media_semestral + "\n")
                    + "Média Final: " + String.valueOf(mediaf));

    }
        
       
        
    public String faltaexame(){
        double restante=0;
        double media_semestral= 0;
        double mediaf = 0;
        
        if(sub<0 && n1>=0 && n2>=0){
            media_semestral=(n1+n2)/2;
        }
        if(sub>=0 && n1>=0 && n2==-1){
            media_semestral=(sub+n1)/2;
        }
        if(sub>=0 && n2>=0 && n1==-1){
            media_semestral=(sub+n2)/2;
        }
        
        
        if (n1>=0 && n2 ==-1 && sub ==-1 && exame ==-1 ){
            media_semestral=(n1/2);
    }
       if (n1==-1 && n2 >=0 && sub ==-1 && exame ==-1 ){
            media_semestral=(n2/2);
    }
       if (n1==-1 && n2 ==-1 && sub >=0 && exame ==-1 ){
            media_semestral=(sub/2);
    }
       if (n1==-1 && n2 ==-1 && sub ==-1 && exame >=0 ){
            media_semestral=(exame/2);
            
    }
       
        if (media_semestral<6.75 && (exame<0)){
            restante = 10-media_semestral; 
        }
        return (String.valueOf(restante));
    }
    public String listar(){
        return ("Disciplina: " + Nome +"\n"
                + "Professor: " + Professor +"\n" 
               + "N1: " + String.valueOf(n1) +"\n"
                + "N2: " + String.valueOf(n2) + "\n"
                     +   "Sub: " + String.valueOf(sub) +"\n"
                + "Exame: " + String.valueOf(exame));
    }
}
