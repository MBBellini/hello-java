package basic.c01_beginner;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String nombre = "Belen";
        System.out.println("Me llamo " + nombre);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int edad = 30;
        System.out.println("Tengo "+ edad);

        // 3. Crea una variable double con tu altura en metros.
        double altura = 1.67;
        System.out.println("Mido "+ altura);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean programar = true;
        System.out.println(programar);

        // 5. Declara una constante con tu email.
        final String email = "belenbellini.94@gmail.com";
        System.out.println(email);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char letra = 'B';

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "Mi Localidad";
        System.out.println("localidad inicial " + localidad);
        localidad = "Otra localidad";
        System.out.println("Localidad actualizada " + localidad);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 6;
        int b = 9;

        int suma = a + b;
        System.out.println(suma);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(nombre);
        System.out.println(letra);

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        String declarar = "";
        declarar = "algo";
        System.out.println(declarar);
    }
}
