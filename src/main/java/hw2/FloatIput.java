package hw2;

//1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class FloatIput {
    static String value = null;

    static Scanner sc = new Scanner(System.in);

    public static float InputFloatNum(){
        while (true){
            System.out.println("Введите какое-нибудь вещественное число:");
            value = sc.next();
            try {
                return Float.parseFloat(value);
            }catch (NumberFormatException | NullPointerException e){
                System.out.println("Ошибка ввода. Введите вещественное число.");
            }
        }
    }
}
