class Fraction {
    private int numerator;
    private int denominator;
    private int intNum;
    private int sign;

    Fraction(int sign, int numerator, int denominator) {
        this.sign = sign;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    Fraction(int sign, int intNum, int numerator, int denominator) {
        this(sign,numerator,denominator);
        this.intNum = intNum;
    }

    public void nodMethod() {
        numerator += intNum * denominator;
        intNum = 0;

        if (numerator == 0 || denominator == 0) {
            numerator = denominator = 0;
            return;
        }

        int b = Math.abs(denominator);
        if (b == 1) {
            return;
        }

        int a = Math.abs(numerator);
        while (a != b) {
            if (a > b) {
                a -= b;
            }
            if (b > a) {
                b -= a;
            }
        }
        numerator /= a;
        denominator /= a;

        if (numerator > denominator) {
            intNum = numerator / denominator;
            numerator = numerator - (denominator * intNum);
        }
    } //алгоритм Евклида

    public String toString() {
        if (numerator == 0) {
            return intNum*sign + "/" + denominator;
        }
        if (intNum == 0) {
            return numerator * sign + "/" + denominator;
        }
        return intNum*sign + " " + numerator + "/" + denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getIntNum() {
        return intNum;
    }

    public void setSign(int sign) {
        this.sign = sign;
    }

    public int getSign() {
        return sign;
    }
}