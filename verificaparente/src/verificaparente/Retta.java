/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package verificaparente;

/**
 *
 * @author Studente
 */
public class Retta {
    double x,y,c;
    public Retta(double a,double b, double z){
        this.x=a;
        this.y=b;
        this.c=z;
        
    }
    public String getTipo(){
        if(this.x==0) return "retta orizzontale";
        else if(this.y==0) return "retta verticale";
        else return "retta obliqua";  
    }
    
    
    public String stampa(){
         if(x==0){ 
   
                String A=(String.valueOf(this.y)+"y + "+String.valueOf(this.c)+" = 0");
                return A;
            }
            if(this.y==0){
             
                String B=(String.valueOf(this.x)+"x + "+String.valueOf(this.c)+" = 0");
                
            }
            if((x!=0)&(y!=0)){ 
                String A="";
                if(this.y>0) A=(String.valueOf(this.x)+"x + "+String.valueOf(this.y)+" y +"+String.valueOf(this.c)+" = 0");
                if(this.y<0) A=(String.valueOf(this.x)+"x  "+String.valueOf(this.y)+" y +"+String.valueOf(c)+" = 0");
                if((this.y>0)&&(this.c>0)) A=(String.valueOf(this.x)+"x + "+String.valueOf(this.y)+" y +"+String.valueOf(c)+" = 0");
                if((y>0)&(c<0)) A=(String.valueOf(this.x)+"x + "+String.valueOf(this.y)+" y "+String.valueOf(c)+" = 0");
                return A;
            }
          return "";  
    }
       
    public boolean verificapunto(double a,double b){
        if((this.x*a+(this.y*b)+this.c)==0) return true;
        return false;
        
    }
    
}
