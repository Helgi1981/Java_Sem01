// Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
// заменены
// знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до
// верного
// равенства. Предложить хотя бы одно решение или сообщить, что его нет.

public class EquationSolver {
    public static void main(String[] args) {
        String equation = "2? + ?5 = 69";
        solveEquation(equation);
    }

    public static void solveEquation(String equation) {
        // Разделяем уравнение на три части: q, w и e
        String[] parts = equation.split(" ");
        String qPart = parts[0];
        String wPart = parts[2];
        String ePart = parts[4];

        // Преобразуем ePart в целое число
        int e = Integer.parseInt(ePart);

        // Перебираем все возможные значения для q и w
        for (int q = 0; q < 100; q++) {
            for (int w = 0; w < 100; w++) {
                // Формируем строковые представления q и w с заменой знаков вопроса
                String qStr = String.format("%02d", q);
                String wStr = String.format("%02d", w);

                if (matches(qPart, qStr) && matches(wPart, wStr)) {
                    if (q + w == e) {
                        System.out.printf("Решение: %d + %d = %d\n", q, w, e);
                        return;
                    }
                }
            }
        }

        System.out.println("Решений нет.");
    }

    // Метод для проверки, соответствует ли число шаблону с вопросительными знаками
    public static boolean matches(String pattern, String number) {
        if (pattern.length() != number.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) != '?' && pattern.charAt(i) != number.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

// Метод main:
// - Уравнение задано строкой equation.
// - Вызывается метод solveEquation для решения уравнения.

// Метод solveEquation:
// - Уравнение разделяется на три части: q, w и e.
// - Преобразуется правая часть уравнения e в целое число.
// - Перебираются все возможные значения для q и w (от 0 до 99).
// - Для каждого значения проверяется соответствие шаблону (с вопросительными
// знаками).
// - Если найдено соответствие и сумма q и w равна e, выводится решение.
// - Если решения не найдено, выводится сообщение "Решений нет".

// Метод matches:
// - Метод проверяет, соответствует ли число number шаблону pattern с
// вопросительными
// знаками.
// - Если символ в pattern не равен '?' и не совпадает с соответствующим
// символом в number,
// возвращается false.
// - Если все символы совпадают или соответствуют '?', возвращается true.