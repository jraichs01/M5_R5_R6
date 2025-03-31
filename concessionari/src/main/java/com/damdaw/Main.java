package com.damdaw;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Programa concessionari");
        System.out.println(" -------------------");
        System.out.println(" Automòbils");
        System.out.println(" -------------------");

        // Crear un objecte de la classe Automobil
        Automobil automo = new Automobil("Audi", "A4", "1234ABC");
        
        // Mostrar les dades de l'automòbil
        System.out.println(automo.mostrarDades());
        // Modificar la marca de l'automòbil
        automo.marca = "BMW";
        // Mostrar les dades de l'automòbil
        System.out.println(automo.mostrarDades());
        // Validar matrícules
        System.out.println(Automobil.validarMatricula("1234ABC")); // True
        System.out.println(Automobil.validarMatricula("123ABC"));  // False
        System.out.println(Automobil.validarMatricula("1234abc")); // False
        System.out.println(Automobil.validarMatricula("1234ABCD")); // False
    }
}