package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerDato=new Scanner(System.in);
        Random cpu= new Random();

        String[] opcion = {"Piedra","Papel","Tijera"};

        int indiceCpu = cpu.nextInt(opcion.length);
        String jugadaCpu= opcion[indiceCpu];

        System.out.println("Selecciona una opcion (Piedra, Papel o Tijera: )");
        String jugadaJugador = leerDato.nextLine();

        System.out.println("CPU: " +jugadaCpu);
        System.out.println("JUGADOR: " +jugadaJugador);



        if (jugadaJugador.equals(jugadaCpu)){
            System.out.println("¡Empatados!");

        } else if ((jugadaJugador.equals("Piedra") && jugadaCpu.equals("Tijera"))||
            (jugadaJugador.equals("Tijera") && jugadaCpu.equals("Papel"))||
                    (jugadaJugador.equals("Papel") && jugadaCpu.equals("Piedra"))){
                System.out.println("¡Super Has Ganado!");

            } else {
        System.out.println("¡Que mal Perdiste!. ¡CPU Gana!");

        }

    }
}