package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//4.Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class TryHW4 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static String text;
    public static void Inputtext() {
        System.out.println("Введите какую-нибудь строку: ");
        try {
            text = reader.readLine();
            if (text.equals("")) {
                throw new IOException("Введена пустая строка.");
            }else {
                System.out.println("Успешно введена следующая строка: " +text);
            }
        } catch (IOException e){
            System.out.println("Catching exception: " + e);
        }
    }
}
