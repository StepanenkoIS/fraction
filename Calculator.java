class Calculator {

    static Fraction multiply (Fraction fraction1, Fraction fraction2) {
        int num1 = fraction1.getNumerator();
        int den1 = fraction1.getDenominator();
        int iNum1 = fraction1.getIntNum();
        int sign1 = fraction1.getSign();

        int num2 = fraction2.getNumerator();
        int den2 = fraction2.getDenominator();
        int iNum2 = fraction2.getIntNum();
        int sign2 = fraction2.getSign();

        int numerator = (iNum1 * den1 + num1) * (iNum2 * den2 + num2);
        int denominator = den1 * den2;
        int sign = sign1 * sign2;

        Fraction fraction = new Fraction(sign, numerator, denominator);
        fraction.nodMethod();
        return fraction;
    }

    static Fraction divide (Fraction fraction1, Fraction fraction2) {
        int num1 = fraction1.getNumerator();
        int den1 = fraction1.getDenominator();
        int iNum1 = fraction1.getIntNum();
        int sign1 = fraction1.getSign();

        int num2 = fraction2.getNumerator();
        int den2 = fraction2.getDenominator();
        int iNum2 = fraction2.getIntNum();
        int sign2 = fraction2.getSign();

        int numerator = (iNum1 * den1 + num1) *den2 ;
        int denominator = den1 * (iNum2 * den2 + num2);
        int sign = sign1 * sign2;

        Fraction fraction = new Fraction(sign, numerator, denominator);
        fraction.nodMethod();
        return fraction;
    }

    static Fraction sum (Fraction fraction1, Fraction fraction2) {
        int num1 = fraction1.getNumerator();
        int den1 = fraction1.getDenominator();
        int iNum1 = fraction1.getIntNum();
        int sign1 = fraction1.getSign();

        int num2 = fraction2.getNumerator();
        int den2 = fraction2.getDenominator();
        int iNum2 = fraction2.getIntNum();
        int sign2 = fraction2.getSign();

        if (num1 == 0) {
            return fraction2;
        }

        if (num2 == 0) {
            return fraction1;
        }

        int numerator = sign1* (iNum1 * den1 + num1) * den2 + sign2 *(iNum2 * den2 + num2) * den1;
        int denominator = den1 * den2;

        int sign = 1;
        if (numerator < 0) {
            sign = -1;
            numerator = -numerator;
        }

        if (numerator == 0 || denominator == 0) {
            return new Fraction(0, 0, 0);
        }

        Fraction fraction = new Fraction(sign, numerator, denominator);
        fraction.nodMethod();
        return fraction;
    }

    static Fraction minus (Fraction fraction1, Fraction fraction2) {
        int num1 = fraction1.getNumerator();
        int den1 = fraction1.getDenominator();
        int iNum1 = fraction1.getIntNum();
        int sign1 = fraction1.getSign();

        int num2 = fraction2.getNumerator();
        int den2 = fraction2.getDenominator();
        int iNum2 = fraction2.getIntNum();
        int sign2 = fraction2.getSign();

        if (num1 == 0 && num2 == 0) {
            new Fraction(0, 0,0, 0);
        }

        if (num1 == 0) {
            fraction2.setSign(sign2 * (-1));
            return fraction2;
        }

        if (num2 == 0) {
            return fraction1;
        }

        int numerator = sign1* (iNum1 * den1 + num1) * den2 - sign2 *(iNum2 * den2 + num2) * den1;
        int denominator = den1 * den2;

        int sign = 1;
        if (numerator < 0) {
            sign = -1;
            numerator = -numerator;
        }

        if (numerator == 0 || denominator == 0) {
            return new Fraction(0, 0, 0);
        }

        Fraction fraction = new Fraction(sign, numerator, denominator);
        fraction.nodMethod();
        return fraction;
    }
}