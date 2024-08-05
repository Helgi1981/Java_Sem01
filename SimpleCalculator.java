// Реализовать калькулятор, который будет выполнять математические операции
// (+, -, *, /) над двумя целыми числами и возвращать результат вещественного
// типа.

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя первое число
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        // Запрашиваем у пользователя оператор
        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Запрашиваем у пользователя второе число
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        // Вычисляем результат операции
        double result = calculate(num1, num2, operator);

        // Выводим результат на экран
        System.out.println("Результат: " + result);

        scanner.close();
    }

    // Метод для выполнения вычислений
    public static double calculate(int num1, int num2, char operator) {
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Проверка деления на ноль
                if (num2 != 0) {
                    result = (double) num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль.");
                    result = Double.NaN; // Not a Number
                }
                break;
            default:
                System.out.println("Ошибка: неверный оператор.");
                result = Double.NaN; // Not a Number
                break;
        }
        return result;
    }
}

// 1. Импорт библиотеки Scanner:
// Этот импорт позволяет использовать класс Scanner для считывания ввода
// пользователя.

// 2. Метод main:
// - Ввод данных: Программа запрашивает у пользователя ввод двух целых чисел и
// оператора.
// Вычисление результата: Ввод передаётся в метод calculate для выполнения
// соответствующей операции.
// - Вывод результата: Результат операции выводится на экран.

// 3. Метод calculate:
// - Операции: Метод выполняет операции сложения, вычитания, умножения и
// деления.
// - Проверка деления на ноль: При делении проверяется, чтобы делитель не был
// равен нулю.
// В случае деления на ноль выводится сообщение об ошибке и возвращается
// значение
// Double.NaN.
// - Возврат результата: Метод возвращает результат операции в виде
// вещественного числа
// типа double.