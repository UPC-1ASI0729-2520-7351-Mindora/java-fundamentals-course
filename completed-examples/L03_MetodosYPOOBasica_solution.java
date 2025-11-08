// Métodos, Entrada/Salida y POO básica

import java.util.Scanner;

class Estudiante {
    String nombre;
    int edad;

    Estudiante(String n, int e) {
        nombre = n;
        edad = e;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

public class Main {
    public static void saludarConNombre(String nombre) {
        System.out.println("Bienvenido, " + nombre + "!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        saludarConNombre(nombre);

        Estudiante estudiante = new Estudiante(nombre, edad);
        estudiante.mostrarInfo();
    }
}
