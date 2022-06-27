//  Написать метод, который будет эмулировать работу динамического массива (Без исопользования коллекций),
//  протестировать можно при выводе последовательности треугольного числа до n
//  Приvер
// 1
// 1 3
// 1 3 6

package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] mas1 = new int[1]; // Задан первый массив. Длина = 1 знак
        int count = 0;
        System.out.println(" Massive nember " + count + " = " + Arrays.toString(mas1)); // печатаем начальный массив

        System.out.println("Input member n : ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        int a = 0;
        int sum = 0;

        while (count <= x) {

            if (sum >= mas1.length){ // если число полученных цифр больше длины массива mas1, нужен массив большего размера
                int[] mas2 = new int[count+1];

                for (int i = 0; i < mas1.length; i++){mas2[i] = mas1[i]; }
                mas1 = mas2;
                System.out.println(" New Massive (lenght = " + count + " ) = " + Arrays.toString(mas1)); // печатаем новый массив
            }
            mas1 [count] = sum;
            a = a + 1;
            sum = sum + a;
            count = count + 1;
        }
        System.out.println(" New Massive (lenght = " + count + " ) = " + Arrays.toString(mas1)); // печатаем новый массив
        System.out.println("triangular number " + x + " level = " + sum);
    }
}