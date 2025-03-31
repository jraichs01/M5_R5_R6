package com.damdaw;

public class Automobil {

    public String marca; // Marca es public perque es pot modificar des de fora de la classe
    public String model; // Model es public perque es pot modificar des de fora de la classe
    public String matricula; // Matricula es public perque es pot modificar des de fora de la classe
   
    // Constructor amb tots els atributs
    Automobil(String marca, String model, String matricula) {
        this.marca = marca;
        this.model = model;
        this.matricula = matricula;
    }

    // Mètode per mostrar la informació de l'automòbil
    public String mostrarDades() {
        return ("Marca: " + marca + ", Model: " + model + ", Matricula: " + matricula);
    }
   
    /**
     * Funció que retorna true si una matrícula és vàlida a Espanya.
     * @param matricula : String
     * @return True: Matrícula correcta, False: en altre cas
     */
    public static boolean validarMatricula(String matricula) {
        boolean resultat = false;
        
        if (matricula == null || matricula.length() != 7) {
             resultat = false;
        } else{ 
            resultat = matricula.matches("\\d{4}[A-Z]{3}");  // Comprovem que la matrícula tingui el format correcte: 4 números seguits de 3 lletres
        }
   
        return resultat;
    }

  
}
