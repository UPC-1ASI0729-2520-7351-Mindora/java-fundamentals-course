// Encapsulación e instanciación + Arrays y cadenas con objetos

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

    public void setEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre : " + nombre + ", Edad : " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante[] grupo = {
            new Estudiante("Ana", 15),
            new Estudiante("Luis", 16),
            new Estudiante("Fernando", 17)
        };

        for (Estudiante e : grupo) {
            e.mostrarInfo();
        }

        grupo[2].setEdad(18);
        System.out.println("Edad actualizada de " + grupo[2].getNombre() + ": 18");
    }
}
