package ru.academits.vkozlov111.Range;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world");

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Введите первое и последнее число интервала: ");
        double startPoint = scanner.nextDouble();
        double endPoint = scanner.nextDouble();
        Range range = new Range(startPoint, endPoint);
        System.out.println("Длина интервала равна " + range.getIntervalLength());

        System.out.println("Введите число для проверки принадлежности интервалу:");
        double isInsideNumber = scanner.nextDouble();
        System.out.println("Число " + isInsideNumber + ((range.isInside(isInsideNumber) ? "" : " не") + " принадлежит интервалу"));
    }
}
