package ru.academits.vkozlov111.lessons;

import ru.academits.vkozlov111.classes.Range;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
/*
        System.out.println("Введите первое и последнее число интервала: ");
        double startPoint = scanner.nextDouble();
        double endPoint = scanner.nextDouble();
        Range firstRange = new Range(startPoint, endPoint);
        System.out.println("Длина интервала равна " + firstRange.getIntervalLength());

        System.out.println("Введите число для проверки принадлежности интервалу:");
        double isInsideNumber = scanner.nextDouble();
        System.out.println("Число " + isInsideNumber + ((firstRange.isInside(isInsideNumber) ? "" : " не") + " принадлежит интервалу"));
*/
        Range firstRange = new Range(0, 10);

        System.out.println("Введите первое и последнее число второго интервала: ");
        Range secondRange = new Range(scanner.nextDouble(), scanner.nextDouble());
        Range intersectionOfRanges = firstRange.getIntersection(secondRange);

        if (intersectionOfRanges != null) {
            System.out.println("Начало и конец пересечения: " + intersectionOfRanges.getFrom() + " " + intersectionOfRanges.getTo());
        } else System.out.println("Для данных интервалов пересечения не существует");

    }
}
