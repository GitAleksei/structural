package ru.netology.task1;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator(new Calculator());
        System.out.println("2 + 2 = " + calc.sum(2, 2));
        System.out.println("10 * 22 = " + calc.mult(10, 22));
        System.out.println("2 ^ 10 = " + calc.pow(2, 10));
    }
}
