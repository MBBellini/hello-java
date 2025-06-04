package basic.c03_strings;

/*
Clase 3 - Strings, Condicionales y Arrays (17/04/2025)
Vídeo: https://www.twitch.tv/videos/2436086584
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String name = "Belen";
        var lastname = new String ("Bellini");
        System.out.println(name + " " + lastname);

        // 2. Muestra la longitud de una cadena de texto.
        String texto = "No se me ocurre que escribir";
        System.out.println(texto.length());

        // 3. Muestra el primer y último carácter de un string.
        String texto2 = "Otra variable";
        System.out.println(texto2.charAt(0));
        System.out.println(texto2.charAt(texto2.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name);

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(texto2.contains("Otra"));
        System.out.println("Estoy creando otro boolean".contains("Belen"));

        // 6. Formatea un string con un entero.
        var num = 50;
        System.out.println(String.format("Estoy buscando un número que es %d", num));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String texto3 = " Lo estoy creando para eliminar lugares ";
        System.out.println(texto3);
        System.out.println(texto3.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println("Hola, quiero reemplazar los espacios por algo mas copado".replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        var a = "Comparaciones";
        var b = "Comparaciones";

        System.out.println( a == b);

        System.out.println(name.equals(lastname));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(name.length());
    }
}
