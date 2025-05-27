package basic.c02_operators;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int num = 20;
        int num1 = 4;
        //Operacion aritmética

        int suma = num + num1;
        System.out.println(suma);
        int resta = num - num1;
        System.out.println(resta);
        int multiplicacion = num * num1;
        System.out.println(multiplicacion);
        int division = num / num1;
        System.out.println(division);

        // 2. Crea una variable para cada tipo de operación de asignación.
        int a = 5;
        System.out.println(" ");
        System.out.println(a);
        a += 6;
        System.out.println(a);
        a -= 3;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 4;
        System.out.println(a);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(" ");
        System.out.println(a != 5);
        System.out.println(a < 5);
        System.out.println(a <= 5);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(a == 5);
        System.out.println(a > 5);
        System.out.println(a >= 5);

        // 5. Utiliza el operador lógico and.
        System.out.println(" ");

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(2 < 4 && 9 == 2);

        // 6. Utiliza el operador lógico or.
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(2 < 4 || 9 == 2);


        // 7. Combina ambos operadores lógicos.
        System.out.println(5 > 4 && 2 < 4 || 9 == 2);

        // 8. Añade alguna negación.
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(2 < 4 || 9 == 2);

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println(+a);
        System.out.println(-a);
        System.out.println(++a);

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        System.out.println(2 < 4 || 9 == 2);
    }
}
