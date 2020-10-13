/*
Необходимо выполнить задание:
        Нужно реализовать класс простых дробей.
        Дробь состоит из трех частей: целой части, числитель, знаменатель.
        Для сокращения необходимо использовать алгоритм Евклида.
        Дробь выводится на экран в виде 1 1/2.
        Должен быть метод получения экземпляра дроби из строкового представления, из целого числа и из числа с плавающей точкой.
        Должны поддерживаться операции сложения, вычитания, умножения, деления.
        Проект реализуется без ide и cборщиков типа maven.
        Реализуется консольное приложение, в main методе реализуются примеры использования класса простых дробей.
        Должен быть скрипт который будет собирать запускаемый jar.
        Код нужно выложить на github для ревью.
*/

class Main  {

    public static void main(String[] args) {

        Fraction fractionINT1 = convert(4);
        System.out.println("Получение дроби из целого числа " + fractionINT1.toString());
        Fraction fractionINT2 = convert(-2);
        System.out.println("Получение дроби из целого числа " + fractionINT2.toString());

        Fraction fractionDOUBLE1 = convert(4.58);
        System.out.println("Получение дроби из числа с плавающей точкой " + fractionDOUBLE1.toString());
        Fraction fractionDOUBLE2 = convert(-1.088);
        System.out.println("Получение дроби из числа с плавающей точкой " + fractionDOUBLE2.toString());

        Fraction fractionSTRING1 = convert("8/5");
        System.out.println("Получение дроби  из строкового представления " + fractionSTRING1.toString());
        Fraction fractionSTRING2 = convert("-1/5");
        System.out.println("Получение дроби  из строкового представления " + fractionSTRING2.toString());
        Fraction fractionSTRING3 = convert("7 5516/11820");
        System.out.println("Получение дроби  из строкового представления " + fractionSTRING3.toString());

        System.out.println();

        Fraction fraction1 = Calculator.minus(convert(2.4),convert(-1.2));
        System.out.println("Результат вычитания дробей " + fraction1.toString());

        fraction1 = Calculator.sum(convert("1 7/8"),convert("3/4"));
        System.out.println("Результат сложения дробей " + fraction1.toString());

        fraction1 = Calculator.divide(convert("8/15"),convert("9/15"));
        System.out.println("Результат деления дробей " + fraction1.toString());

        fraction1 = Calculator.multiply(convert(-7), convert(4.2));
        System.out.println("Результат умножения дробей " + fraction1.toString());

    }

    private static Fraction convert (int a) {
        int sign = 1;
        if (a < 0) {
            sign = -1;
            a = -a;
        }
        Fraction fraction = new Fraction(sign, a, 1);
        fraction.nodMethod();
        return fraction;
    }

    private static Fraction convert (Double a) {
        int sign = 1;
        if (a < 0) {
            sign = -1;
            a = -a;
        }
        String s = a.toString();
        String [] strings = s.split("\\D");
        int intNum = Integer.parseInt(strings[0]);
        int numerator = Integer.parseInt(strings[1]);
        if (numerator == 0) {
            return convert(intNum);
        }
        int denominator = (int) Math.pow(10, strings[1].length());
        Fraction fraction = new Fraction(sign, intNum,numerator,denominator);
        fraction.nodMethod();
        return fraction;
    }

    private static Fraction convert(String str) {
        int sign = 1;
        int intNum;
        int numerator;
        int denominator;

        if (str.startsWith("-")) {
           str = str.substring(1);
           sign = -1;
        }

        String [] strings = str.split("\\D");

        if (strings.length == 2) {
            numerator = Integer.parseInt(strings[0]);
            denominator = Integer.parseInt(strings[1]);
            Fraction fraction = new Fraction(sign, numerator,denominator);
            fraction.nodMethod();
            return fraction;
        }

        intNum = Integer.parseInt(strings[0]);
        numerator = Integer.parseInt(strings[1]);
        denominator = Integer.parseInt(strings[2]);
        Fraction fraction = new Fraction(sign,intNum, numerator,denominator);
        fraction.nodMethod();
        return fraction;
    }
}






