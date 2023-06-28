import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws Exception {
        System.out.println("Введите числа:");
        String[] str;
        if ((str = (new Scanner(System.in)).nextLine().split(" ")).length != 3) throw new Exception("Неверная операция");
        if (new Scanner(str[0]).hasNextInt() && new Scanner(str[2]).hasNextInt()) {
            System.out.println("Результат:"+calc(Integer.parseInt(str[0]), Integer.parseInt(str[2]), str[1]));
        }
        else {
            throw new Exception("Ввели неверное выражение");
        }

    }
    public static int calc(int num1, int num2, String oper) throws Exception {
        if ((0 >= num1 || num1 > 10) || (0 >= num2 || num2 > 10)) throw new Exception("Введите цифры от 1 до 10");
        return switch (oper) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "/" -> num1 / num2;
            case "*" -> num1 * num2;
            default -> throw new Exception("Неверная операция");
        };
    }
}