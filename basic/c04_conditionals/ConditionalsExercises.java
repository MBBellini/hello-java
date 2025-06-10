package basic.c04_conditionals;

/*
Clase 3 - Strings, Condicionales y Arrays (17/04/2025)
Vídeo: https://www.twitch.tv/videos/2436086584
*/

import java.util.Scanner;

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        var age = 18;
        System.out.println(age >= 18);

        if (age >= 18) {
            System.out.println("El usuario es mayor de edad");
        } else if (age == 18) {
            System.out.println("El usuario cumplio 18 por lo tanto es mayor de edad");
        } else {
            System.out.println("El usuario es menor de edad");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int num1 = 25;
        int num2 = 5;
        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El número mayor es: " + num2);
        } else
            System.out.println("Los números son iguales");


        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int num = 20;
        if (num > 0) {
            System.out.println(num + " Es positivo.");
        } else if (num < 0) {
            System.out.println(num + " Es negativo");
        } else {
            System.out.println(num + " Es cero");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        int num3 = 6;
        if (num3 % 2 == 0) {
            System.out.println(num3 + " Es par");
        } else {
            System.out.println(num3 + " Es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        int num4 = 100;

        if (num4 >= 1 && num4 <= 100) {
            System.out.println("El número " + num4 + " se encuntra dentro del rango");
        } else {
            System.out.println("El número " + num4 + " se encuentra fuera del rango");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresá un número del 1 al 7 para ver el día");
        //int day = sc.nextInt();
        //sc.close();
        int dia = sc.nextInt();
        sc.close();
        //int dia = 5;
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El día señalado no existe");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int nota = 90;
        if(nota < 0 || nota > 100){
            System.out.println("Nota fuera de rango");
        }else{
            if (nota >= 90){
                System.out.println("Sobresaliente");
            } else if (nota >= 60) {
                System.out.println("Aprobado");
            }else{
                System.out.println("Suspenso");
            }
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int edad = 12;
        boolean acompañado = true;
        if( edad >= 15 || acompañado ){
            System.out.println("Puede ingresar");
        } else{
            System.out.println("No puede ingresar");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letra = 'A';
            char letraMinuscula = Character.toLowerCase(letra);
       if(letraMinuscula == 'a' || letraMinuscula == 'e' || letraMinuscula == 'i' || letraMinuscula =='o' || letraMinuscula == 'u'){
           System.out.println("Es vocal");
        }else{
            System.out.println("Es consonante");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int a = 5;
        int b = 20;
        int c = 32;

        if (a > b && a > c ){
            System.out.println("a es el mayor");
        } else if ( b > c && b > a){
            System.out.println("b es el mayor");
        }else{
            System.out.println(" c es el mayor");
        }

    }
}