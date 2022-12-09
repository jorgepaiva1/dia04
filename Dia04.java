/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nim;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Dia04 {

    public static void main(String[] args) {
        String nombre1;
        String nombre2;
        Scanner escanner = new Scanner(System.in);
        
        System.out.print("Introduzca el nombre del jugador 1: ");
        nombre1= escanner.nextLine();
        
        System.out.print("Introduzca el nombre del jugador 2: ");
        nombre2= escanner.nextLine();
        nim juego1=new nim(nombre1,nombre2);
        
        juego1.Jugar();
    }
}
