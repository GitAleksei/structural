package ru.netology.task2;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String number1 = "111101";
        String number2 = "000010";
        System.out.printf("%s + %s = %s\n", number1, number2, bins.sum(number1, number2));
        System.out.printf("%s * %s = %s", number1, number2, bins.mult(number1, number2));
    }
}
