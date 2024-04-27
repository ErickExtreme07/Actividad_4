import java.util.Scanner;

public class Visitantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalVisitas = 0;
        int tiempoTotalEstadia = 0;
        Byte edad;

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Bienvenido al PH Marino: " + nombre);

        System.out.print("Por favor Ingrese su cedula: ");
        String cedula = scanner.nextLine();

        System.out.print("Ingrese el numero del apartamento: ");
        Long napart = scanner.nextLong();

        //System.out.print("Ingrese su sexo 'M'/'F': ");
        //char sexo = scanner;

        System.out.print("Ingrese su Altura: ");
        double Altura = scanner.nextDouble();

        // Leer visitas y calcular tiempo total de estadía
        for (int i = 1; i <= 2; i++) {
            System.out.print("Ingrese la Cantidad de veces que ingreso al PH el día " + i + ": ");
            int visitasDia = scanner.nextInt();
            totalVisitas += visitasDia;

            System.out.print("Ingrese el tiempo que estuvo dentro del PH (*en minutos*) el día " + i + ": ");
            int tiempoEstadia = scanner.nextInt();
            tiempoTotalEstadia += visitasDia * tiempoEstadia;
        }

        // Calcular el tiempo promedio de estadía
        double tiempoPromedioEstadia = (double) tiempoTotalEstadia / totalVisitas;

        // Leer edad de la persona
        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();

        // Determinar si es mayor o menor de edad
        String mensajeEdad = (edad >= 18) ? "mayor de edad" : "menor de edad";

        // Mostrar resultados
        System.out.println("Gracias " + nombre + " con cedula: " + cedula + " por Visitar el apartamento " + napart + " del PH Marino");
        System.out.println("Su cantidad total de visitas fueron : " + totalVisitas + " en la semana");
        System.out.println("Su tiempo promedio de estadía: " + tiempoPromedioEstadia + " minutos");
        System.out.println("Usted es una persona " + mensajeEdad);
        System.out.println("Su altura es de: " + Altura);

        scanner.close();
    }
}