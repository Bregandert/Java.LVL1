package ru.geekbrains.java1.lesson1;

import java.security.PrivateKey;
import java.util.Scanner;

public class lesson1 {

    private static Scanner scanner = new Scanner(System.in);

    private static boolean sum(int one, int two) {
        //  Если все правильно понял. то неоходимо именно возвратить значение а не напечатать его
            if ((one+two>=10)&&(one+two<=20)) {
                boolean result = true;
                return result;
        }   else {
                boolean result=false;
                return result;
        }}

    private static void prover(int chislo) {
            if (chislo>=0) {
                System.out.println("Число положительное");
        }   else {
                System.out.println("Число отрицательное");}}

//Разница с примером на уроке заключается в том, что метод должен возвращать значение?
    private static String helloName(String name) {
                System.out.println("Привет, "+name+"!");
            return "Привет, "+name+"!";
    }

//Високосный год
    private static void god(int year){

            if (year<0){
                System.out.println("Год всегда положительное число");
        }   else if (((year%4)==0)&&((year%100)!=0)||((year%400)==0)){
                System.out.println("Год високосный!");
        }   else {
                System.out.println("Год не високосный!");
        }

    }
    public static void main(String[] args) {
// Консоль запрашивает от нас ввод целых чисел
                System.out.println("Введите целое число a");
            int a = scanner.nextInt();
                System.out.println("Введите целое число b");
            int b = scanner.nextInt();
                System.out.println("Введите целое число c");
            int c = scanner.nextInt();
                System.out.println("Введите целое число d");
            int d = scanner.nextInt();
//Присваиваю дробной переменной e целое значение d, чтобы получить результат с плавающей точкой
            float e=d;

//Вычисляю выражение и вывожу его в консоль
            float i=a*(b+(c/e));
                System.out.println("a*(b+(c/d))=" +i);
/* Основной вопрос у меня возник с тем. что я не могу написать отдельный метод и использовать его в методе main
Полагаю что причина в том. что переменные вводим через консоль?
 */

//Если не через консоль, то вроде как все проще
            boolean summa=sum(5,116);
                System.out.println("Сумма " + summa);

//Проверка числа
            prover(-5);

/*Сначала прописал выводить в консоль в методе, потом еще раз прочитал задание -
необходимо. чтобы метод возвращал значение.
Поэтому дописал в методе возврат выражения и в main присвоил строковой переменной возвращаемое методом helloName значение
Дал указание вывести строку в консоль
Можно просто прописать обращение к методу с параметром. Либо можно удалить в методе helloName вывод в консоль
Сейчас программа выдает Приветствие в консоль дважды
 */
            String privetstvie=helloName("Дима");
                System.out.println(privetstvie);

// Проверяем год
            god(2019);

    }

}
