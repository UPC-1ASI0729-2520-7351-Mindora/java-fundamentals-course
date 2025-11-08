// Operadores y expresiones + Estructuras de control

public class Main {
    public static void main(String[] args) {
        int edad = 16;
        int nota = 15;

        // Operadores aritméticos
        int suma = edad + nota;
        int resta = edad - nota;
        int producto = edad * 2;
        int division = nota / 3;
        int resto = nota % 4;

        System.out.println("Resultados de operadores:");
        System.out.println("Edad + nota = " + suma);
        System.out.println("Edad - nota = " + resta);
        System.out.println("Edad * 2 = " + producto);
        System.out.println("Nota / 3 = " + division);
        System.out.println("Nota % 4 = " + resto);

        System.out.println("\nEvaluando la nota:");
        if (nota >= 11) {
            System.out.println("Aprobaste");
        } else {
            System.out.println("Desaprobaste");
        }

        System.out.println("\nUsando un bucle for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración número: " + i);
        }

        System.out.println("\nUsando un bucle while:");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        System.out.println("\nEjemplo combinado:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + " es impar");
            }
        }
    }
}
