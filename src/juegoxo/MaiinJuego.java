/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoxo;

import java.util.Scanner;

/**
 *
 * @author Crystell Reyes
 */
public class MaiinJuego {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int opcion;
         String player1,player2;
                char s1,s2;
                
       
        System.out.println(" \n || REGISTRO DE JUGADORES || \n ");
                System.out.print("<--- Player 1: -->");
                player1= read.next();
                System.out.print("<---  Simbolo: -->");
                s1=read.next().charAt(0);
                System.out.print("<-- Player 2: -->");
                player2= read.next();
                System.out.print("<--- Simbolo: -->");
                s2=read.next().charAt(0);
                
                System.out.println(" \n\n || MENU DE XO || \n\n ");
                System.out.println("1. Jugar! ");
                System.out.println("2. Configuración");
                System.out.print("|| Elegir opcion: ||");
                opcion= read.nextInt();
                
                 JuegoXO tmp =new JuegoXO(player1, player2);
                 
                switch(opcion){
                    case 1:
                     tmp.ImprimirTablero();
                      int x=1;
                        do{
                           
                            System.out.println(" || Turno del jugador "+x+" ||");
                            System.out.print("Fila: ");
                            int fila=read.nextInt();
                            System.out.print("Columna: ");
                            int col=read.nextInt();
                            tmp.marcarJugada(x,fila,col);
                            tmp.Ganador1(x, s2);
                            
                            
                            
                           
                            
                        }while(x<3);
                        
                        
                }
                
                
                

            
        
        
        
        
    }
}
