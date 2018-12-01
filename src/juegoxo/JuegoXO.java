/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoxo;

/**
 *
 * @author Crystell Reyes
 */
public class JuegoXO {

    /**
     * @param args the command line arguments
     */
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
//\\//\\//\\//\\//\\//\\ EJECUTAR LAS MARCAS DE LOS JUGADORES //\\//\\//\\//\\//\\//\\
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
    
    public String jugador1;
    public String jugador2;
    public char symbol1;
    public char symbol2;
    public char tablero[][]= new char[3][3];

    public JuegoXO() {
    }
    
    
        //----------------------------------- SELECCIONAR NOMBRES-------------------------------//
     public JuegoXO(String j1, String j2){
         jugador1=j1;
         jugador2=j2; 
     }
     
         // ----------------------------------SELECCIONAR SIMBOLO -----------------------------//
    public boolean AsignarSimbolo(char s1, char s2){
        if(s1==s2){
            System.out.println(" AMBOS JUGADORES NO PUEDEN USAR EL MISMO SIMBOLO!!");
            return false;
        }else{
         symbol1=s1;
         symbol2=s2;
        }
        return true;
    }
          
     


    
    
    // ------------------------------------------- VERIFICAR GANADOR ------------------------------------------------------//
    public char Ganador1(int j, char s){
        char Ganador='E';
        String record;
        
        //GANAR JUGADOR 1
        if(tablero[0][0]==s && tablero[0][1]==s && tablero[0][2]==s ) Ganador =s;
        if(tablero[1][0]==s && tablero[1][1]==s && tablero[1][2]==s ) Ganador =s;
        if(tablero[2][0]==s && tablero[2][1]==s && tablero[2][2]==s ) Ganador =s;
        
        //GANAR EN VERTICAL
        if(tablero[0][0]==s && tablero[0][1]==s && tablero[0][2]==s ) Ganador =s;
        if(tablero[1][0]==s && tablero[1][1]==s && tablero[1][2]==s ) Ganador =s;
        if(tablero[2][0]==s && tablero[2][1]==s && tablero[2][2]==s ) Ganador =s;
         
         //GANAR EN DIAGONAL
        if(tablero[0][0]==s && tablero[1][1]==s && tablero[2][2]==s ) Ganador =s;
        if(tablero[2][0]==s && tablero[1][1]==s && tablero[0][2]==s ) Ganador =s;
        
        if(tablero[0][0]==s && tablero[1][1]==s && tablero[2][2]==s ) Ganador =s;
        if(tablero[2][0]==s && tablero[1][1]==s && tablero[0][2]==s ) Ganador =s;  
        
        
         if(Ganador==s && j==1){
             System.out.println(" ¡¡ Jugador 1 ha ganado !! Felicidades:  "+jugador1);
             record=jugador1 + s;
             return Ganador;
         }
         return Ganador2(j,s);
    }
    
    
    
    // ------------------------------------------- VERIFICAR GANADOR ------------------------------------------------------//
    public char Ganador2(int j, char s){
          char Ganador=' ';
          String record;
          
          //GANAR EN HORIZONTAL
        if(tablero[0][0]==s && tablero[0][1]==s && tablero[0][2]==s ) Ganador =s;
        if(tablero[1][0]==s && tablero[1][1]==s && tablero[1][2]==s ) Ganador =s;
        if(tablero[2][0]==s && tablero[2][1]==s && tablero[2][2]==s ) Ganador =s;
        
        //GANAR EN VERTICAL
        if(tablero[0][0]==s && tablero[0][1]==s && tablero[0][2]==s ) Ganador =s;
        if(tablero[1][0]==s && tablero[1][1]==s && tablero[1][2]==s ) Ganador =s;
        if(tablero[2][0]==s && tablero[2][1]==s && tablero[2][2]==s ) Ganador =s;
         
         //GANAR EN DIAGONAL
        if(tablero[0][0]==s && tablero[1][1]==s && tablero[2][2]==s ) Ganador =s;
        if(tablero[2][0]==s && tablero[1][1]==s && tablero[0][2]==s ) Ganador =s;
        
        if(tablero[0][0]==s && tablero[1][1]==s && tablero[2][2]==s ) Ganador =s;
        if(tablero[2][0]==s && tablero[1][1]==s && tablero[0][2]==s ) Ganador =s;
          
           if(Ganador==s && j==2 ){
               System.out.println(" ¡¡ Jugador 2 ha ganado !! Felicidades: "+jugador2);
               record=jugador2+s;
             return Ganador;
         }
           return ' ';
    }
    
    
    // --------------------------------------- VERIFICAR POSICION  ------------------------------------------------------//  
 
    public boolean PosicionOcupada(int fila, int columna){
        if(tablero[fila][columna]=='d' || tablero[fila][columna]=='d'  ){
           // System.out.println("¡Ésta posicion ya está ocupada! \n Favor de escoger otra posicion");
            return true;
        }
        return false;
    }
    

    //-----------------------------------------------------------------------------------//

    public boolean marcarJugada(int jugador, int f, int c){
        boolean temp= PosicionOcupada(f, c);
        JuegoXO tmp=new JuegoXO();
        
        if(!temp){
            if(f>=0 && f<=2){
                if(c>=0 && c<=2){
                    if(jugador==1){
                      tablero[f][c]=symbol1;
                      tmp.ImprimirTablero();
                      return true;
                    }   else if (jugador==2){
                          System.out.println(tablero[f][c]=symbol2);
                           tmp.ImprimirTablero();
                          return true;
                        }   else{
                                System.out.println("Numero de jugador invalido!");
                            }             
                }else{
                    System.out.println(" Posicion de columna invalido!");
                }
            }else{
                System.out.println(" Posicion de fila invalido!");
            }
            
        }else{
            System.out.println(" Posicion del tablero ya ocupada!");
        }
        return false;
    }
    
        //--------------- RELLENAR EL TABLERO CON NUMEROS DE POSICIONES ---------------------//
    public void Tablero(){
        for(int x=0;x<=2;x++){
            for(int y=0; y<=2;y++){
              tablero[x][y]='*';  
            }
        }
    }
    
    
    
    //------------------------------------------- IMPRIMIR TABLERO -------------------------------------------------------//
    public String ImprimirTablero(){
        System.out.println("\n");
        System.out.println("\n\t\t"+" [ "+ tablero[0][0]+" ] "+"  |  "+" [ "+tablero[0][1]+" ] "+"  |  "+" [ " +tablero[0][2]+" ] "+"  |  ");
        System.out.println("\n\t\t"+" [ "+ tablero[1][0]+" ] "+"  |  "+" [ "+tablero[1][1]+" ] "+"  |  "+" [ "+ tablero[1][2]+" ] "+"  |  ");
        System.out.println("\n\t\t"+" [ "+ tablero[2][0]+" ] "+"  |  "+" [ "+tablero[2][1]+" ] "+"  |  "+" [ "+ tablero[2][2]+" ] "+"  |  ");
        System.out.println("\n");
        return "ImprimirTablero";
    }

    
    //------------------------------------GUARDAR HISTORIAL DE PARTTIDAS--------------------------------------------------//

}
