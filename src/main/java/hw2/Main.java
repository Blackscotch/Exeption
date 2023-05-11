package hw2;


import static hw2.TryHW2.CorrectWok2;
import static hw2.TryHW4.Inputtext;

public class Main {
    public static void main(String[] args) {
        float x = FloatIput.InputFloatNum();
        System.out.println("Число "+ x +" успешно получено!");
        CorrectWok2();
        Inputtext();
    }
}
