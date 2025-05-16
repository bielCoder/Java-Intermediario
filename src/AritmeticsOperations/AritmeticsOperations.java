package AritmeticsOperations;

public class AritmeticsOperations {
    public static void main(String[] args) {
        // Operações Aritméticas

        int num1 = 10;
        int num2 = 20;

        System.out.println(sum(num1, num2));
        System.out.println(minus(num1, num2));
        System.out.println(division(num1, num2));
        System.out.println(multiplay(num1, num2));
        System.out.println(remaing(num1, num2));


    }

    static int sum(int num1, int num2)
    {
       return num1 + num2;
    }

    static int minus(int num1, int num2)
    {
        return num1 - num2;
    }

    static int division(int num1, int num2)
    {
        return num1 / num2;
    }

    static int multiplay(int num1, int num2)
    {
        return num1 * num2;
    }

    static int remaing(int num1, int num2)
    {
        return num1 % num2;
    }

}
