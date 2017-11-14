package intcalculator;

/**
 * This program implements and demonstrates an anonymous inner classes, and a
 * Lambda Expressions
 * Assignment#3
 * @author olga.osinskaya
 */
public class AnonymosInnerClasses {

    public static void main(String[] args) {
        int x1 = 2;//holds the argument for 1st expression
        double x2 = 2.5;//holds the argument for 2st expression
        double y2 = 3;//holds the argument for 2st expression
        double x3 = 3;//holds the argument for 3rd expression
        int x4 = 5;//holds the argument for 4rd expression
        System.out.println("-----------------------------------------");
        System.out.println("Anonymous Inner Class + Lambda Expression");
        System.out.println("-----------------------------------------");
        //display the result of the 1st expression 
        System.out.println("The polynomial of " + x1 + " is " + exp1.polynomial(x1));
        //display the result of the 2st expression 
        System.out.println("The " + x2 + " to the power of " + y2 + " is " + exp2.MathPow(x2, y2));
        //display the result of the 3st expression 
        System.out.println("The Area of Circle of " + x3 + " is " + exp3.rPi(x3));
        //display the result of the 4st expression 
        System.out.println("Factorial of " + x4 + "! is " + exp4.ifelse(x4));
    }

}

interface IntCalculator {

    int calculate(int number);
}

interface DoubleCalculator {

    double Dcalculate(double number);
}

class exp1 {

    /**
     * The polynomial method implements an Anonymous Inner Class, and a Lambda
     * Expression that returns the results of the polynomial x2 + 2x + 4;
     *
     * @param number1
     * @return the results of the polynomial x2 + 2x + 4
     */
    public static int polynomial(int number1) {
        IntCalculator polynomial = (int x) -> x * x + 2 * x + 4;
        return polynomial.calculate(number1);
    }
}

class exp2 {

    /**
     * This method implements an Anonymous Inner Class, and a Lambda Expression
     * that returns the results of x to the power of y. x,y are double
     * parameters.
     *
     * @param number2
     * @param y
     * @return the results of x to the power of y
     */
    public static double MathPow(double number2, double y) {
        DoubleCalculator MathPow = x ->  Math.pow(x, y);
        //Math.pow() returns a double by design

        return MathPow.Dcalculate(number2);
    }
}

class exp3 {

    /**
     * The rPi method implements an Anonymous Inner Class, and a Lambda
     * Expression that returns the results of π*r2. r is double parameter.
     *
     * @param r
     * @return the results of π*r2
     */
    public static double rPi(double radius) {
        DoubleCalculator rPi = r -> (double)(Math.PI * r * r);
        return rPi.Dcalculate(radius);
    }
}

class exp4 {

    /**
     * The ifelse method implements an Anonymous Inner Class, and a Lambda
     * Expression that returns the results of the factorial of given number.
     *
     * @param number2
     * @return the results of the factorial of given number
     */
    public static int ifelse(int number2) {
        IntCalculator ifelse = (int x) -> {
            if (x <= 0) {
                return 1;
            } else {
                int fact = 1;
                for (int i = 1; i <= x; i++) {
                    fact *= i;
                }
                return fact;
            }
        };
        return ifelse.calculate(number2);
    }

}
