/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.piedrapapeltijera;

/**
 *
 * @author jonathan
 */
import java.util.Scanner;
import java.util.Random;


public class piedrapapeltijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int opcionM;
        String  elijioU1="",elijioU2="",elijioU3="";
        int opcionJugador1=0;
        int opcionJugador2=0;
        int opcionJugador3=0;
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        //int contadorJugador1 =0,contadorJugador2 =0,contadorJugador3=0;
        System.out.println("Vamos a jugar piedra papel tijera \n Primer Jugador: \n");
            
        
        for(int i =0; i<3; i++){
            System.out.println("Elije: \n 1_Piedra\n 2_Papel\n 3_Tijera \n");
            opcionJugador1 = leer.nextInt();
           
            switch(opcionJugador1){
                case 1:
                    elijioU1 = "piedra";
                break;
                case 2:
                    elijioU1 = "papel";
                break;
                default:
                    elijioU1 = "tijera";
                break;
            }
            
         
            System.out.println(" \n Segundo Jugador: \n");
            System.out.println("Elije:\n 1_Piedra\n 2_Papel\n 3_Tijera \n");
            opcionJugador2 = leer.nextInt();
        
            switch(opcionJugador2){
                case 1:
                    elijioU2 = "piedra";
                break;
                case 2:
                    elijioU2 = "papel";
                break;
                default:
                    elijioU2 = "tijera";
                break;
            }
            
            
        
            System.out.println("\n Tercer Jugador: \n");
            System.out.println("Elije:\n 1_Piedra\n 2_Papel\n 3_Tijera \n");
            opcionJugador3 = leer.nextInt();
        
            switch(opcionJugador3){
                case 1:
                    elijioU3 = "piedra";
                break;
                case 2:
                    elijioU3 = "papel";
                break;
                default:
                    elijioU3 = "tijera";
                break;
            }
            
            
        
        //este es de una forma despies esta la forma mas resumida
       
            if(elijioU1 == "piedra" & elijioU2 == "papel"){
                System.out.println("el jugador 2 le gana la partida al jugador 1, 'EL PAPEL CUBRE A LA PIEDRA' " );
                opcionJugador2++;
                if(elijioU2 == "papel" & elijioU3 == "tijera"){
                    System.out.println("El jugador 3 le gana la partida al jugador 2, 'LA TIJERA CORTA AL PAPEL'");
                    opcionJugador3++;
                }
            }else if(elijioU1 =="papel" & elijioU2 == "tijera"){        
                System.out.println("el jugador 2 gana la partida, 'LA TIJERA CORTA AL PAPEL' " );
                opcionJugador2++;
                if(elijioU2=="tijera" & elijioU3 == "piedra"){
                    System.out.println("El jugador 3 gana la partida, 'LA PIEDRA APLASTA A LA TIJERA'");
                    opcionJugador3++;
                }
        
            }else if(elijioU1 == "tijera" & elijioU2 == "piedra"){
                System.out.println("el jugador 2 gana la partida, 'LA PIEDRA APLASTA A LA TIJERA' " );
                opcionJugador2++;
                if(elijioU2=="piedra" & elijioU3 == "papel"){
                    System.out.println("el jugador 3 gana la partida, 'EL PAPEL CUBRE A LA PIEDRA' " );
                    opcionJugador3++;
            
                }
            
        //__________________________________________________________________________________________________//
        
            }else if(elijioU1 == "tijera" & elijioU2 == "papel"){
                System.out.println("el jugador 1 gana la partida, 'LA TIJERA CORTA AL PAPEL' " );
                opcionJugador1++;
                if(elijioU1 == "tijera" & elijioU3 == "papel"){
                    System.out.println("el jugador 1 gana la partida, 'LA TIJERA CORTA AL PAPEL' " );
                    opcionJugador1++;
                }
        
            }else if(elijioU1 == "papel" & elijioU2 == "piedra"){
                System.out.println("el jugador 1 gana la partida, 'EL PAPEL CUBRE A LA PIEDRA' " );
                opcionJugador1++;
                if(elijioU1 == "papel" & elijioU3 == "piedra"){
                    System.out.println("el jugador 1 gana la partida, 'EL PAPEL CUBRE A LA PIEDRA' " );
                    opcionJugador1++;
                }
        
            }else if(elijioU1 == "piedra" & elijioU2 == "tijera"){
                System.out.println("el jugador 1 gana la partida, 'LA PIEDRA APLASTA A LA TIJERA' " );
                opcionJugador1++;
                if(elijioU1 == "piedra" & elijioU3 == "tijera"){
                    System.out.println("el jugador 1 gana la partida, 'LA PIEDRA APLASTA A LA TIJERA' " );
                    opcionJugador1++;
                }
            
        //________________________________________________________________________________________________//
        
            }else if(elijioU1 == "tijera" & elijioU2 == "papel"){
                System.out.println("el jugador 1 gana la partida, 'LA TIJERA CORTA AL PAPEL' " );
                opcionJugador1++;
                if(elijioU1 == "tijera" & elijioU3 == "piedra"){
                    System.out.println("el jugador 3 gana la partida, 'LA PIEDRA APLASTA A LA TIJERA' " );
                    opcionJugador3++;
                }
        
            }else if(elijioU1 == "papel" & elijioU2 == "piedra"){
                System.out.println("el jugador 1 gana la partida, 'EL PAPEL CUBRE A LA PIEDRA' " );
                opcionJugador1++;
                if(elijioU1 == "papel" & elijioU3 == "tijera"){
                    System.out.println("el jugador 3 gana la partida, 'LA TIJERA CORTA AL PAPEL' " );
                    opcionJugador3++;
                }
        
            }else if(elijioU1 == "piedra" & elijioU2 == "tijera"){
                System.out.println("el jugador 1 gana la partida, 'LA PIEDRA APLASTA A LA TIJERA' " );
                opcionJugador1++;
                if(elijioU1 == "piedra" & elijioU3 == "papel"){
                    System.out.println("el jugador 3 gana la partida, 'EL PAPEL CUBRE A LA PIEDRA' " );
                    opcionJugador3++;
                }
            
        //________________________________________________________________________________________________//    
            
         
            }else if(elijioU1 == "tijera" & elijioU2 == "tijera" & elijioU3 == "tijera"){
                System.out.println(" Los Tres 'EMPATAN!!'" );
                opcionJugador1++;
                opcionJugador2++;
                opcionJugador3++;
                
            }else if(elijioU1 == "papel" & elijioU2 == "papel" & elijioU3 == "papel"){
                System.out.println(" Los Tres 'EMPATAN!!'" );
                opcionJugador1++;
                opcionJugador2++;
                opcionJugador3++;
        
            }else if(elijioU1 == "piedra" & elijioU2 == "piedra"& elijioU3 == "piedra"){
                System.out.println(" Los Tres 'EMPATAN!!'" );
                opcionJugador1++;
                opcionJugador2++;
                opcionJugador3++;
            }
        }
        System.out.println("Jugador1: " + opcionJugador1 + " jugador2: " + opcionJugador2 + " jugador3: " + opcionJugador3);
        
         
        
      
            
        /*
        
        opcionM = rand.nextInt(6);
        
        switch (opcionM) {
            case 0:
                elijioM = "piedra";
                System.out.println("Piedra");
                break;
            case 1:
                elijioM = "papel";
                System.out.println("Papel");
                break;
            default:
                elijioM = "tijera";
                System.out.println("Tijera");
                break;
        }
        
        if(elijioU.equalsIgnoreCase("piedra") && elijioM == "papel"){
        
        System.out.println("La maquina gana");
    
    
        }else if(elijioU.equalsIgnoreCase("papel") && elijioM == "tijera"){
        
        System.out.println("La maquina gana");
        
        
        }else if(elijioU.equalsIgnoreCase("tijera") && elijioM == "piedra"){
        
        
        System.out.println("La maquina gana");
        
        }else if(elijioU.equalsIgnoreCase("piedra") && elijioM == "tijera"){
        
        System.out.println("Usted gana");
    
    
        }else if(elijioU.equalsIgnoreCase("tijera") && elijioM == "papel"){
        
        System.out.println("usted gana");
        
        
        }else if(elijioU.equalsIgnoreCase("papel") && elijioM == "piedra"){
        
        
        System.out.println("Usted gana");
        
        }
        
      */  
        
    }
}
