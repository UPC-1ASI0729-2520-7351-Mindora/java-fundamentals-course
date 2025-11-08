// Programa básico + Buenas prácticas

import java.util.Scanner;

class Estudiante {
    private String nombre;
    private int edad;

    Estudiante(String n, int e) {
        nombre = n;
        edad = e;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiante[] grupo = new Estudiante[3];

        for (int i = 0; i < grupo.length; i++) {
            System.out.print("Ingresa el nombre del estudiante " + (i + 1) + ": ");
            String nombre = sc.nextLine();

            System.out.print("Ingresa la edad de " + nombre + ": ");
            int edad = sc.nextInt();
            sc.nextLine();

            grupo[i] = new Estudiante(nombre, edad);
        }

        System.out.println("\nLista de estudiantes:");
        for (Estudiante e : grupo) {
            e.mostrarInfo();
        }

        if (grupo.length > 1) {
            System.out.println("\nActualizando edad del segundo estudiante...");
            System.out.print("Ingresa la nueva edad para " + grupo[1].getNombre() + ": ");
            int nuevaEdad = sc.nextInt();
            grupo[1].setEdad(nuevaEdad);

            System.out.println("Edad actualizada de " + grupo[1].getNombre() + ": " + grupo[1].getEdad());
        }

        sc.close();
    }
}
