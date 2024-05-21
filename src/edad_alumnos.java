import java.util.Scanner;

public class edad_alumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" ingrese la cantidad que dese de los estudiantes : ");
        int edad_alumnos = scanner.nextInt();

        int[] edades = new int[edad_alumnos];

        for (int i = 0; i < edad_alumnos; i++) {
            System.out.print(" por favor ingrese la cantidad de edad de el estudiantes " + (i + 1) + " : ");
            edades[i] = scanner.nextInt();
        }

        int sumamayores5 = 0;
        int cantidadmayores5 = 0;
        for (int edad : edades) {


            if (edad > 5) {
                sumamayores5 += edad;
                cantidadmayores5++;
            }
        }


    }

}