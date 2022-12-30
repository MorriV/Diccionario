/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diccionariov2;

/**
 *
 * @author Mr_Floppa
 */
public class AnalizadorSintactico {
    
    String[] input;
    String consola="";
    int contador=0, almacen=0;
    
    public AnalizadorSintactico(String[] input){
        this.input = input;
    }
    
    public String getConsola(){
        return consola;
    }
    
    public void AnalSintactico(){
        c("Inicio Analizador");
        if(texto()){
            c("Sintaxis Correcta!");
        }else{
            c("Sintaxis Incorrecta!");
        }
    }
    
    public boolean texto(){
        System.out.println("inicio texto y recursividad");
        if(texto2()){
            return true;
        }else{
            if(input[contador].equals("ü")){return false;}
        }
        if(!fif("ü")){return false;}      
        return true;
    }
    
    public boolean texto2(){
        System.out.println("inicio texto2");
        if(input[contador].equals("ü")){return false;}
        System.out.println("Checando oracion");
        if(!oracion()){return false;}
        System.out.println("oracion correcta");
        almacen = contador;
        if(!texto2()){ contador = almacen; return false; }
        return true;
    }
    
    public boolean parrafo(){
        return true;
    }
    
    public boolean oracion(){
        if(!fif("x")){return false;}
        if(!sus()){return false;}
        if(!fif("v")){return false;}
        if(!fif("a")){return false;}
        return true;
    }
    
    public void c(String txt){
        consola = consola + txt + "\n";    
    }
    
    public boolean sus(){
        for(int i = 0; i<40; i++){
            if(input[contador].equals(String.valueOf(i))){contador ++; return true;}           
        }
        return false;
    }
    
    public boolean fif(String tkn){
        if(!input[contador].contains(tkn)){
            return false;
        }
        contador ++;
        return true;
    }
}
