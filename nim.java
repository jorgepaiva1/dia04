/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nim;
import java.util.Scanner;
/**
 *
 * @author jorge
 */
public class nim {
    String NombreJug1;
    String NombreJug2;
    
    public nim(){
     NombreJug1="Jugador1";
     NombreJug2="Jugador2";
    }
    
    public nim(String nombre1, String nombre2){
        NombreJug1=nombre1;
        NombreJug2=nombre2;
    }
    
    public void setJug1(String nombre){
        NombreJug1=nombre;
    }
    public void setJug2(String nombre){
        NombreJug2=nombre;
    }
    public String getJug1(){
        return NombreJug1;
    }
    public String getJug2(){
        return NombreJug2;
    }
    
    public String toString(){
        return ("Los nombres de jugadores son: "+NombreJug1+" y "+NombreJug2);
    }
    
    public void Jugar(){
        int juego=0; //juego=0 el juego no termino -- juego=1 el juego termino
        int A=3,B=4,C=5,cantIntroducida;
        int jug,introducCorrec=1,cantCorrec; //introducCorrect 1 si se introdujo bien -- 0 si no 
        String elejido;
        jug=(int)(Math.random()*(1)+1);  //el jugador que empieza primero =0 el jugador1 empieza -- =1 el jugador2 empieza
        Scanner escanner = new Scanner(System.in);
        
        System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
        
        juegofinalizado:
        while(juego==0){    //espera que juego sea 1 para que no entre y termine
            if(jug==0){     // -------------------------------------------------------- jugador 1
                jug=1;
                System.out.print(NombreJug1+" Elija una pila: ");
                elejido= escanner.next();
                introducCorrec=1;
                
                if(elejido.toLowerCase().equals("a")||elejido.toLowerCase().equals("b")||
                        elejido.toLowerCase().equals("c")){
                    System.out.print("\ncuantos quitara de la pila "+elejido.toUpperCase()+": ");
                    cantIntroducida = escanner.nextInt();
                    cantCorrec=1;
                    //valida si es correcto lo introducido
                    if(elejido.toLowerCase().equals("a")&& (cantIntroducida>0&&cantIntroducida<=A)){
                        A-=cantIntroducida;
                        if(A==0&&B==0&&C==0){
                            System.out.println("Felicidades "+NombreJug2+" ganaste!!!");
                            break;
                        }else 
                            System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                    }
                    else if(elejido.toLowerCase().equals("b")&& (cantIntroducida>0&&cantIntroducida<=B)){
                        B-=cantIntroducida;  
                        if(A==0&&B==0&&C==0){
                            System.out.println("Felicidades "+NombreJug2+" ganaste!!!");
                            break;
                        }else
                            System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                    }
                    else if(elejido.toLowerCase().equals("c")&& (cantIntroducida>0&&cantIntroducida<=C)){
                        C-=cantIntroducida;
                        if(A==0&&B==0&&C==0){
                            System.out.println("Felicidades "+NombreJug2+" ganaste!!!");
                            break;
                        }else 
                            System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                    }
                    else{
                        cantCorrec=0;
                        while(cantCorrec==0){//pide valor correcto
                            System.out.println("No se puede  quitar esa cantidad de la pila "+elejido.toUpperCase());
                            System.out.println("Vuelva a elejir la cantidad: ");
                            cantIntroducida= escanner.nextInt();
                            
                            if(elejido.toLowerCase().equals("a")&& (cantIntroducida>0&&cantIntroducida<=A)){
                                A-=cantIntroducida;
                                cantCorrec=1;
                                if(A==0&&B==0&&C==0){
                                    System.out.println("Felicidades "+NombreJug2+" ganaste!!!");
                                    continue juegofinalizado;
                                }else 
                                    System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                            } 
                            else if(elejido.toLowerCase().equals("b")&& (cantIntroducida>0&&cantIntroducida<=B)){
                                B-=cantIntroducida;
                                cantCorrec=1;
                                if(A==0&&B==0&&C==0){
                                    System.out.println("Felicidades "+NombreJug2+" ganaste!!!");
                                    continue juegofinalizado;
                                }else 
                                    System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                            }
                            else if(elejido.toLowerCase().equals("c")&& (cantIntroducida>0&&cantIntroducida<=C)){
                                C-=cantIntroducida;
                                cantCorrec=1;
                                if(A==0&&B==0&&C==0){
                                    System.out.println("Felicidades "+NombreJug2+" ganaste!!!");
                                    continue juegofinalizado;
                                }else 
                                    System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                            }  
                        }
                    }     
                }
                else{
                    introducCorrec=0;
                    while(introducCorrec==0){
                        System.out.println("Introdujo mal la pila son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                        System.out.println("Vuelva a elejir: ");
                        elejido= escanner.next();
                        
                        if(elejido.toLowerCase().equals("a")||elejido.toLowerCase().equals("b")||
                        elejido.toLowerCase().equals("c"))
                            introducCorrec=1;
                    }
                    System.out.print(NombreJug1+" Elija una pila: ");
                    elejido= escanner.next();
                    introducCorrec=1;

                    if(elejido.toLowerCase().equals("a")||elejido.toLowerCase().equals("b")||
                            elejido.toLowerCase().equals("c")){         //--- comprobacion si se introdujo bien la pila
                        System.out.print("\ncuantos quitara de la pila "+elejido.toUpperCase()+": ");
                        cantIntroducida = escanner.nextInt();
                        cantCorrec=1;
                        
                        //comprobacion para si se ingreso la cantidad correcta a retirar
                        if(elejido.toLowerCase().equals("a")&& (cantIntroducida>0&&cantIntroducida<=A)){
                            A-=cantIntroducida;
                            if(A==0&&B==0&&C==0){
                            System.out.println("Felicidades "+NombreJug2+" ganaste!!!");
                            break;
                        }else 
                            System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                        }
                        else if(elejido.toLowerCase().equals("b")&& (cantIntroducida>0&&cantIntroducida<=B)){
                            B-=cantIntroducida;
                            if(A==0&&B==0&&C==0){
                            System.out.println("Felicidades "+NombreJug2+" ganaste!!!");
                            break;
                        }else 
                            System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                        }
                        else if(elejido.toLowerCase().equals("c")&& (cantIntroducida>0&&cantIntroducida<=C)){
                            C-=cantIntroducida;
                            if(A==0&&B==0&&C==0){
                            System.out.println("Felicidades "+NombreJug2+" ganaste!!!");
                            break;
                        }else 
                            System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                        }
                        else{ //aca puede haber un error por los else -------------------------------------
                            cantCorrec=0;
                            while(cantCorrec==0){   //si no se ingreso bien a cantidad a extraer se vuelve a pedir
                                System.out.println("No se puede  quitar esa cantidad de la pila "+elejido.toUpperCase());
                                System.out.println("Vuelva a elejir la cantidad: ");
                                cantIntroducida= escanner.nextInt();

                                if(elejido.toLowerCase().equals("a")&& (cantIntroducida>0&&cantIntroducida<=A)){
                                A-=cantIntroducida;
                                cantCorrec=1;
                                if(A==0&&B==0&&C==0){
                                        System.out.println("Felicidades "+NombreJug2+" ganaste!!!");
                                        continue juegofinalizado;
                                    }else 
                                        System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                                }else if(elejido.toLowerCase().equals("b")&& (cantIntroducida>0&&cantIntroducida<=B)){
                                    B-=cantIntroducida;
                                    cantCorrec=1;
                                    if(A==0&&B==0&&C==0){
                                        System.out.println("Felicidades "+NombreJug2+" ganaste!!!");
                                        continue juegofinalizado;
                                    }else 
                                        System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                                }else if(elejido.toLowerCase().equals("c")&& (cantIntroducida>0&&cantIntroducida<=C)){
                                    C-=cantIntroducida;
                                    cantCorrec=1;
                                    if(A==0&&B==0&&C==0){
                                        System.out.println("Felicidades "+NombreJug2+" ganaste!!!");
                                        continue juegofinalizado;
                                    }else 
                                        System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                                }
                            }
                        } 
                    }
                }       
            }
            else if(jug==1){    // -------------------------------------------------------- jugador 2
                jug=0;
                System.out.print(NombreJug2+" Elija una pila: ");
                elejido= escanner.next();
                introducCorrec=1;
                
                if(elejido.toLowerCase().equals("a")||elejido.toLowerCase().equals("b")||
                        elejido.toLowerCase().equals("c")){
                    System.out.print("\ncuantos quitara de la pila "+elejido.toUpperCase()+": ");
                    cantIntroducida = escanner.nextInt();
                    cantCorrec=1;
                    //valida si es correcto lo introducido
                    if(elejido.toLowerCase().equals("a")&& (cantIntroducida>0&&cantIntroducida<=A)){
                        A-=cantIntroducida;
                        if(A==0&&B==0&&C==0){
                            System.out.println("Felicidades "+NombreJug1+" ganaste!!!");
                            break;
                        }else
                            System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                    }
                    else if(elejido.toLowerCase().equals("b")&& (cantIntroducida>0&&cantIntroducida<=B)){
                        B-=cantIntroducida;
                        if(A==0&&B==0&&C==0){
                            System.out.println("Felicidades "+NombreJug1+" ganaste!!!");
                            break;
                        }else
                            System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                    }
                    else if(elejido.toLowerCase().equals("c")&& (cantIntroducida>0&&cantIntroducida<=C)){
                        C-=cantIntroducida;
                        if(A==0&&B==0&&C==0){
                            System.out.println("Felicidades "+NombreJug1+" ganaste!!!");
                            break;
                        }else
                            System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                    }
                    else{       //se introdujo mal la cantidad a extraer
                        cantCorrec=0;
                        while(cantCorrec==0){//pide valor correcto
                            System.out.println("No se puede  quitar esa cantidad de la pila "+elejido.toUpperCase());
                            System.out.println("Vuelva a elejir la cantidad: ");
                            cantIntroducida= escanner.nextInt();
                            
                            if(elejido.toLowerCase().equals("a")&& (cantIntroducida>0&&cantIntroducida<=A)){
                                A-=cantIntroducida;
                                cantCorrec=1;
                            }
                            else if(elejido.toLowerCase().equals("b")&& (cantIntroducida>0&&cantIntroducida<=B)){
                                B-=cantIntroducida;
                                cantCorrec=1;
                            }
                            else if(elejido.toLowerCase().equals("c")&& (cantIntroducida>0&&cantIntroducida<=C)){
                                C-=cantIntroducida;
                                cantCorrec=1;
                            }  
                        }
                    }     
                }
                else {       //se introdujo mal la pila
                    //introducCorrec=0;
                    while(introducCorrec==0){
                        System.out.println("Introdujo mal la pila son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                        System.out.println("Vuelva a elejir: ");
                        elejido= escanner.next();
                        
                        if(elejido.toLowerCase().equals("a")||elejido.toLowerCase().equals("b")||
                        elejido.toLowerCase().equals("c"))
                            introducCorrec=1;
                    }
                    /*System.out.print(NombreJug2+" Elija una pila: ");
                    elejido= escanner.nextLine();*/
                    introducCorrec=1;

                    if(elejido.toLowerCase().equals("a")||elejido.toLowerCase().equals("b")||
                            elejido.toLowerCase().equals("c")){
                        System.out.print("\ncuantos quitara de la pila "+elejido.toUpperCase()+": ");
                        cantIntroducida = escanner.nextInt();
                        cantCorrec=1;

                        if(elejido.toLowerCase().equals("a")&& (cantIntroducida>0&&cantIntroducida<=A))
                            A-=cantIntroducida;
                        else if(elejido.toLowerCase().equals("b")&& (cantIntroducida>0&&cantIntroducida<=B))
                            B-=cantIntroducida;
                        else if(elejido.toLowerCase().equals("c")&& (cantIntroducida>0&&cantIntroducida<=C))
                            C-=cantIntroducida;
                        else{
                            cantCorrec=0;
                            while(cantCorrec==0){
                                System.out.println("No se puede  quitar esa cantidad de la pila "+elejido.toUpperCase());
                                System.out.println("Vuelva a elejir la cantidad: ");
                                cantIntroducida= escanner.nextInt();

                                if(elejido.toLowerCase().equals("a")&& (cantIntroducida>0&&cantIntroducida<=A)){
                                A-=cantIntroducida;
                                cantCorrec=1;
                                if(A==0&&B==0&&C==0){
                                        System.out.println("Felicidades "+NombreJug1+" ganaste!!!");
                                        continue juegofinalizado;
                                    }else 
                                        System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                                }
                                else if(elejido.toLowerCase().equals("b")&& (cantIntroducida>0&&cantIntroducida<=B)){
                                    B-=cantIntroducida;
                                    cantCorrec=1;
                                    if(A==0&&B==0&&C==0){
                                        System.out.println("Felicidades "+NombreJug1+" ganaste!!!");
                                        continue juegofinalizado;
                                    }else 
                                        System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                                }
                                else if(elejido.toLowerCase().equals("c")&& (cantIntroducida>0&&cantIntroducida<=C)){
                                    C-=cantIntroducida;
                                    cantCorrec=1;
                                    if(A==0&&B==0&&C==0){
                                        System.out.println("Felicidades "+NombreJug1+" ganaste!!!");
                                        continue juegofinalizado;
                                    }else 
                                        System.out.println("Las pilas son:\n\t A:"+A+"\t B:"+B+"\t C:"+C);
                                }
                            }
                        } 
                    }
                }
            }    
        }
    }
}    

