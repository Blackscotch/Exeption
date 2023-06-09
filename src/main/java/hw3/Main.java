package hw3;

import javax.swing.*;
public class Main {

//  Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
//  Login должен содержать только латинские буквы, цифры и знак подчеркивания.
//  Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//  Password должен содержать только латинские буквы, цифры и знак подчеркивания. Длина password должна быть меньше 20 символов.
//  Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//  WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает
//  сообщение исключения и передает его в конструктор класса Exception.
//  Обработка исключений проводится внутри метода.
//  Используем multi-catch block.
//  Метод возвращает true, если значения верны или false в другом случае.
    public static void main(String[] a) {
        LoginFrame frame = new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10, 10, 350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
    }
}
