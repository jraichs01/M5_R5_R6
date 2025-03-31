package com.damdaw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Automobil[] automobils = new Automobil[10]; // Array per emmagatzemar fins a 10 automòbils
        int count = 0; // Comptador d'automòbils introduïts

        int option;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Afegir un automòbil");
            System.out.println("2. Mostrar tots els automòbils");
            System.out.println("3. Sortir");
            System.out.print("Selecciona una opció: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir el salt de línia

            switch (option) {
                case 1:
                    if (count < automobils.length) {
                        System.out.print("Introdueix la marca: ");
                        String marca = scanner.nextLine();
                        System.out.print("Introdueix el model: ");
                        String model = scanner.nextLine();
                        System.out.print("Introdueix la matrícula: ");
                        String matricula = scanner.nextLine();

                        if (Automobil.validarMatricula(matricula)) {
                            automobils[count] = new Automobil(marca, model, matricula);
                            count++;
                            System.out.println("Automòbil afegit correctament!");
                        } else {
                            System.out.println("Matrícula no vàlida. Torna-ho a intentar.");
                        }
                    } else {
                        System.out.println("No es poden afegir més automòbils. L'array està ple.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Llista d'automòbils ---");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + automobils[i].mostrarDades());
                    }
                    break;

                case 3:
                    System.out.println("Sortint del programa...");
                    break;

                default:
                    System.out.println("Opció no vàlida. Torna-ho a intentar.");
            }
        } while (option != 3);

        scanner.close();
    }
}