/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ricardo Luna Allende Vespertino 7 U
 */
public class Juego {

    public static void main(String[] args) {
        try {
            Scanner datos = new Scanner(System.in);
            Random random = new Random();
            String opciones = "[1=Piedra, 2=Papel, 3=Tijera]";
            boolean jugar = true;
            while (jugar) {
                System.out.println("""
                           \nBienvenido al juego
                           Piedra, papel o tijeras
                           ¿Como deseas jugar?
                           1.- Jugador vs Jugador
                           2.- Jugador vs PC
                           3.- Salir                         
                           seleccione una opcion valida                          
                           """);
                int opcion = datos.nextInt();
                datos.nextLine();
                switch (opcion) {

                    case 1:
                        System.out.println("Jugador 1 ingrese su nombre por favor: ");
                        String nombre1 = datos.nextLine();
                        System.out.println("Jugador 2 ingrese su nombre por favor: ");
                        String nombre2 = datos.nextLine();
                        System.out.println("\n" + nombre1
                                + "\nIndique su seleccion [1=Piedra, 2=Papel, 3=Tijera]:");
                        int jug1 = datos.nextInt();
                        System.out.println("\n" + nombre2
                                + "\nIndique su seleccion [1=Piedra, 2=Papel, 3=Tijera]:");
                        int jug2 = datos.nextInt();

                        if (jug1 == 1 && jug2 == 3 || jug1 == 2 && jug2 == 1 || jug1 == 3 && jug2 == 2) {
                            System.out.println("Felcidades " + nombre1 + "  has ganado");
                        } else if (jug2 == 2 && jug1 == 1 || jug2 == 3 && jug1 == 2 || jug2 == 1 && jug1 == 3) {
                            System.out.println("Felicidades " + nombre2 + "  has ganado");

                        } else {
                            System.out.println("Han quedado en empate");
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese su nombre por favor: ");
                        String nombre = datos.nextLine();

                        System.out.println("Es su turno " + nombre
                                + "\nIndique su seleccion [1=Piedra, 2=Papel, 3=Tijera]:");

                        int jug = datos.nextInt();

                        System.out.println("Es el turno de la Maquina");
                        System.out.println("Espere por favor");
                        int maquina = random.nextInt(4) + 1;
                        Thread.sleep(3000);
                        System.out.println("La maquina ha seleccionado");

                        if (maquina == 1 && jug == 3 || maquina == 2 && jug == 1 || maquina == 3 && jug == 2) {
                            System.out.println(opciones + "\nLa maquina selecciono: " + maquina);
                            System.out.println("La maquina te ha ganado");
                        } else if (jug == 2 && maquina == 1 || jug == 3 && maquina == 2 || jug == 1 && maquina == 3) {
                            System.out.println(opciones + "\nLa maquina selecciono: " + maquina);
                            System.out.println("Felicidades " + nombre + " has vencido a la maquina");

                        } else {
                            System.out.println(opciones + "\nLa maquina selecciono: " + maquina);
                            System.out.println("Han quedado en empate");
                        }
                        break;
                    case 3:
                        jugar = false; // Salir del bucle while
                        System.out.println("Gracias por jugar");
                        break;

                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        break;
                }

            }

        } catch (Exception e) {
            System.err.println("Por favor verifica el error: "+e);
        }

    }

}
