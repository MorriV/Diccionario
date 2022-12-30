/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diccionariov2;

/**
 *
 * @author Mr_Floppa
 */
public class Data {
    
    //el la
    String[] x1 = {"el"};
    String[] x2 = {"la"};
    
    //Sustantivos
    String[] s = {"persona","comida","nube","hombre", "mujer","casa", "escuela"
                , "vehiculo", "libro", "computadora", "laptop", "celular", "consola"
                , "banca", "parque", "cine", "pueblo", "curso", "aplicación", "software"
                , "moto", "coche", "camion", "mochila", "ropa", "sistema", "zapato"
                , "tenis", "empresa", "camara", "perro", "gato", "alfombra", "edificio"
                , "hospital", "mapache", "maestro", "maestra", "carro", "puerta"};
    
    //Verbos
    String[] v0 = {"esta"};
    String[] v1 = {"es"};
    String[] v2 = {"corre", "camina", "salta", "cae", "rompe", "vocaliza", "juega"
                , "aguanta", "cava", "ayuda", "daña", "desplaza"};
    String[] v3 = {"abre", "cierra"};
    String[] v4 = {"cuesta", "ayuda", "daña", "aguanta", "funciona"};
    String[] v5 = {"corre", "desplaza"};
    String[] v6 = {"lee", "escribe", "habla", "programa", "viaja", "vuela", "estudia"
                , "cocina", "plancha", "pinta", "navega", "piensa"};
    String[] v7 = {"sabe", "cae", "cuesta"};
    
    //Adjetivos
    
    String[] a1 = {"alto", "bajo"};
    String[] a1m = {"alta", "baja"};
    String[] a2 = {"feo", "bonito"};
    String[] a2m = {"fea", "bonita"};
    String[] a3 = {"todo", "nada"};
    String[] a4 = {"bien", "mal"};
    String[] a5 = {"joven", "viejo"};
    String[] a5m = {"joven", "vieja"};
    String[] a6 = {"morado", "rojo", "rosa", "azul", "verde"};
    String[] a7 = {"caro", "barato"};
    String[] a8 = {"mucho", "poco"};
    String[] a9 = {"salado", "dulce"};
    String[] a10 = {"activo", "inactivo"};
    String[] a10m = {"activa", "inactiva"};
    String[] a11 = {"grande", "chico"};
    String[] a12 = {"divertido", "aburrido"};
    String[] a13 = {"comoda", "incomoda"};
    String[] a14 = {"rapido", "lento"};
    String[] a14m = {"rapido", "lento"};
    String[] a15 = {"temprano", "tarde"};
    String[] a16 = {"optimizado"};
    String[] a17 = {"eficiente"};
    
    public String RetornoT(String input){
        if(Ffor(x1, input)){return "el";}
        if(Ffor(x2, input)){return "la";}
        if(Ffor(s, input)){return "Sustantivo";}
        if(Ffor(v0, input)){return "Universal1";}
        if(Ffor(v1, input)){return "Universal2";}
        if(Ffor(v2, input)){return "Ser Vivo";}
        if(Ffor(v3, input)){return "Estado";}
        if(Ffor(v4, input)){return "Interaccion";}
        if(Ffor(v5, input)){return "Avanza";}
        if(Ffor(v6, input)){return "Humano";}
        if(Ffor(v7, input)){return "Consumible";}
        if(Ffor(a1, input)){return "Altura";}
        if(Ffor(a1m, input)){return "Altura F";}
        if(Ffor(a2, input)){return "Apariencia";}
        if(Ffor(a2m, input)){return "Apariencia F";}
        if(Ffor(a3, input)){return "Valor";}
        if(Ffor(a4, input)){return "Estado";}
        if(Ffor(a5, input)){return "Edad";}
        if(Ffor(a5m, input)){return "Edad F";}
        if(Ffor(a6, input)){return "Color";}
        if(Ffor(a7, input)){return "Precio";}
        if(Ffor(a8, input)){return "Cuantific";}
        if(Ffor(a9, input)){return "Sabor";}
        if(Ffor(a10, input)){return "Estatus";}
        if(Ffor(a10m, input)){return "Estatus F";}
        if(Ffor(a11, input)){return "Tamaño";}
        if(Ffor(a12, input)){return "Entret";}
        if(Ffor(a13, input)){return "Sentir";}
        if(Ffor(a14, input)){return "Velocidad";}
        if(Ffor(a14m, input)){return "Velocidad F";}
        if(Ffor(a15, input)){return "Hora";}
        if(Ffor(a16, input)){return "Optimizado";}
        if(Ffor(a17, input)){return "Eficiente";}
        
        return "Salto de Linea";
    }
    
        public String Retorno(String input){
        if(Ffor(x1, input)){return "x1";}
        if(Ffor(x2, input)){return "x2";}
        if (Ffor(s, input)) {
            for (int i = 1; i < s.length; i++) {
                if (s[i].equals(input)) {
                    return String.valueOf(i);
                }
            }
        }
        if(Ffor(v0, input)){return "v0";}
        if(Ffor(v1, input)){return "v1";}
        if(Ffor(v2, input)){return "v2";}
        if(Ffor(v3, input)){return "v3";}
        if(Ffor(v4, input)){return "v4";}
        if(Ffor(v5, input)){return "v5";}
        if(Ffor(v6, input)){return "v6";}
        if(Ffor(v7, input)){return "v7";}
        if(Ffor(a1, input)){return "a1";}
        if(Ffor(a1m, input)){return "a1m";}
        if(Ffor(a2, input)){return "a2";}
        if(Ffor(a2m, input)){return "a2m";}
        if(Ffor(a3, input)){return "a3";}
        if(Ffor(a4, input)){return "a4";}
        if(Ffor(a5, input)){return "a5";}
        if(Ffor(a5m, input)){return "a5m";}
        if(Ffor(a6, input)){return "a6";}
        if(Ffor(a7, input)){return "a7";}
        if(Ffor(a8, input)){return "a8";}
        if(Ffor(a9, input)){return "a9";}
        if(Ffor(a10, input)){return "a10";}
        if(Ffor(a10m, input)){return "a10m";}
        if(Ffor(a11, input)){return "a11";}
        if(Ffor(a12, input)){return "a12";}
        if(Ffor(a13, input)){return "a13";}
        if(Ffor(a14, input)){return "a14";}
        if(Ffor(a14m, input)){return "a14m";}
        if(Ffor(a15, input)){return "a15";}
        if(Ffor(a16, input)){return "a16";}
        if(Ffor(a17, input)){return "a17";}
        
        return "ü";
    }
    
    public boolean Ffor (String tipo[], String compara){
        for(int i = 0; i < tipo.length; i++){
            if(compara.equals(tipo[i])){
                return true;
            }
        }
        return false;
    }
}
