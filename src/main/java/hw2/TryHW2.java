package hw2;
//2. Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
public class TryHW2 {
    public static void CorrectWok2(){

//        Добавил инициализацию массива, т.к. ошибки на стадии компиляции не отлавливаются. Также добавл выход за границы массива в качестве исключения
//        и налпоинтер.
        try {
            int[] intArray = {};
//            int[] intArray = null;
//            double[] intArray = {4.5d,0d,6.5d,6.6d,8d,45d,5.6d,3.2d,3.3d,1.8d};
//            float[] intArray = {4.5f,0f,6.5f,6.6f,8f,45f,5.6f,3.2f,3.3f,1.8f};
//            System.out.println(intArray.length);
//            for (int i = 0; i < intArray.length; i++) {
//                System.out.printf(intArray[i] + ", ");
//                if (i == intArray.length - 1){
//                    System.out.println(intArray[i]);
//                }
//            }
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catching ArrayException: " + e);
        } catch (NullPointerException e){
            System.out.println("Catching NullException: " + e);
        }
    }
}
