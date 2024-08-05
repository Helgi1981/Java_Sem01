// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n). Каждое число на новой строке.

import java.util.Scanner; // Импортируем класс Scanner для ввода данных

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для считывания ввода с консоли
        System.out.print("Введите число n: "); // Запрашиваем у пользователя ввод числа n
        int n = scanner.nextInt(); // Считываем введенное пользователем число и сохраняем в переменной n
        scanner.close(); // Закрываем Scanner, так как он больше не нужен

        int triangularNumber = calculateTriangularNumber(n); // Вычисляем n-ое треугольное число
        long factorial = calculateFactorial(n); // Вычисляем факториал числа n

        // Выводим результаты на экран
        System.out.println("n-ое треугольное число: " + triangularNumber);
        System.out.println("n!: " + factorial);
    }

    // Метод для вычисления n-го треугольного числа
    public static int calculateTriangularNumber(int n) {
        // Формула для вычисления треугольного числа: n * (n + 1) / 2
        return n * (n + 1) / 2;
    }

    // Метод для вычисления факториала числа n
    public static long calculateFactorial(int n) {
        long result = 1; // Инициализируем результат как 1
        for (int i = 1; i <= n; i++) { // Цикл от 1 до n
            result *= i; // Умножаем результат на текущее значение i
        }
        return result; // Возвращаем результат
    }
}

// Объяснение кода с комментариями:

// 1. Импортируем класс Scanner:
// Это необходимо для того, чтобы мы могли считывать ввод данных от
// пользователя.

// 2. Основной метод main:
// - Создает объект Scanner для ввода значения n от пользователя.
// - Считывает введенное пользователем значение и сохраняет его в переменной n.
// - Закрывает Scanner, так как он больше не нужен.
// - Вычисляет n-ое треугольное число и факториал числа n, используя методы
// calculateTriangularNumber и calculateFactorial.
// - Выводит результаты на экран.

// 3. Метод calculateTriangularNumber:
// Использует формулу n(n+1)/2 для вычисления n-го треугольного числа

// 4. Метод calculateFactorial:
// - Инициализирует переменную result как 1.
// - Использует цикл for для умножения result на каждое число от 1 до n.
// - Возвращает результат.