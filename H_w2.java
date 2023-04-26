import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class H_w2 {
    public static boolean flag = false;
    public static void main(String[] args) throws Exception{
        inputNumber();
        // fun();
        // fun2();
    }
    
    public static void inputNumber() throws Exception {
        Double num = 0.0;
        while (!flag) {
            System.out.println("Введите дробное число: ");
            try {
                Scanner cs = new Scanner(System.in);
                String str = cs.nextLine();
                inputNull(str);
                num = Double.parseDouble(str);
                if (num % 1 != 0) {
                    flag = true;
                    cs.close();
                }
            } catch (NumberFormatException e) {
            } catch (InputMismatchException i) {
            } finally {
                if (!flag) {
                    System.out.println("Вы ввели не дробное число!");
                    inputNumber();
                } else {
                    System.out.printf("Вы ввели число: %s", num);
                }
            }
        }
    }

    public static void fun() {
        try {
            int d = 0;
            int[] intArray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 }; 
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    public static void fun2() throws FileNotFoundException {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

    public static void inputNull(String str) throws Exception {
        if (str.equals("")) {
            System.out.println(new Exception("Ошибка! Строка не может быть пустой."));
        }
    }
}
