/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

/**
 *
 * @author olga.osinskaya
 */
public class Fraction {

    int par_numerator;
    int par_denominator;

    /**
     * Constructor accepts two integer numbers, numerator and denominator.
     * Denominator must not be a 0. If a 0 passed as a denominator, an
     * IllegalArgumentException must be thrown by the constructor
     *
     * @param numerator
     * @param denominator
     */
    public Fraction(int numerator, int denominator) {
        this.par_numerator = numerator;
        this.par_denominator = denominator;
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator must not be a 0");
        }
    }

    /**
     * Non-argument constructor. The constructor set numerator to 0 and
     * denominator to 1.
     */
    public Fraction() {
        par_numerator = 0;
        par_denominator = 1;
    }

    public void setNumerator(int numerator) {
        this.par_numerator = numerator;

    }

    public void setDenominator(int denominator) {
        this.par_denominator = denominator;

    }

    public double getNumerator() {
        return par_numerator;
    }

    public double getDenominator() {
        return par_denominator;
    }

    /**
     * When two Fraction objects are added together, the result is a Fraction
     * object that is the sum of two fractions. Do not forget that in order to
     * add two fractions together you first need to convert them to have common
     * denominator. In order to simplify the coding process for you, the sample
     * code that adds fractions is provided. See it in GDC.java. I would
     * recommend creating a private method that finds and returns greatest
     * common divider (GDC). Please see sample code that calls add() method
     * below: Fraction a = new Fraction (1, 3); Fraction b = new Fraction (1,
     * 12); Fraction c = a.add(b); // c = a+b
     *
     * @param obj
     * @return
     */
    Fraction add(Fraction obj) {
        // finding the greatest common divider of the denominators of the two fractions
        int common = par_denominator > obj.par_denominator ? gcd(par_denominator, obj.par_denominator) : gcd(obj.par_denominator, par_denominator);
        int mult_one = obj.par_denominator / common; // finding the multiple for the first fraction
        int mult_two = par_denominator / common;// finding the multiple for the second fraction
        // the two fractions are being added now:
        int num_sum = par_numerator * mult_one + obj.par_numerator * mult_two;
        int denom_sum = par_denominator * mult_one;

        // Simplifying the new fraction.
        // Finding GCD of the numerator and denominator
        Fraction add = new Fraction(num_sum, denom_sum);
        add = add.simplify();
        return add;
    }

    /**
     * String toString() method converts the fraction into a string. For example
     * “3/24 “.If the fraction is more than 1 (has a whole part), like 25/24, it
     * must be converted into a mixed fraction: “1 and 1/24”
     *
     * @return
     */
    public String toString() {
        if (par_numerator >= par_denominator) {
            if (par_denominator == 1) {
                int number = par_numerator / par_denominator;
                String num = Integer.toString(number);
                return num;
            } else {
                return (par_numerator / par_denominator) + " and " + (par_numerator % par_denominator) + "/" + par_denominator;
            }
        } else {
            return par_numerator + "/" + par_denominator;
        }
    }

    /**
     * This method implements Euclid's algorithm of calculation of the greatest
     * common divider (GCD) of two integers. The algorithm has recursive nature:
     * GCD of x and y with x > y is the same as GCD of y and (x % y ) (x= ky +
     * x%y)
     *
     * @param x first integer
     * @param y second integer
     * @return greatest common divider
     */
    public static int gcd(int x, int y) {
        do {
            int tmp;
            tmp = y;
            y = x % y;
            x = tmp;
        } while (y > 0);
        return x;
    }

    /**
     * The Subtraction method
     *
     * @param obj
     * @return
     */
    Fraction subtract(Fraction obj) {

//        while (par_denominator == obj.par_denominator && par_numerator == obj.par_numerator) {
//        }
        int common = par_denominator > obj.par_denominator ? gcd(par_denominator, obj.par_denominator) : gcd(obj.par_denominator, par_denominator);
        int mult_one = obj.par_denominator / common; // finding the multiple for the first fraction
        int mult_two = par_denominator / common;// finding the multiple for the second fraction
        int num_sub = (par_numerator * mult_one) - (obj.par_numerator * mult_two);
        int denom_sub = par_denominator * mult_one;
//        common = gcd(denom_sub, num_sub);
//        denom_sub = denom_sub / common;
//        num_sub = num_sub / common;
        Fraction subtract = new Fraction(num_sub, denom_sub);
        subtract = subtract.simplify();
        return subtract;
    }

    /**
     * The multiply method - Multiplies two fractions then simplifies the
     * result.
     *
     * @param obj
     * @return
     */
    Fraction multiply(Fraction obj) {
        // create new fraction to return as product
        Fraction multiply = new Fraction();
        // calculate product
        multiply.par_numerator = par_numerator * obj.par_numerator;
        multiply.par_denominator = par_denominator * obj.par_denominator;
        // reduce the resulting fraction
        multiply = multiply.simplify();
        return multiply;
    }

    /**
     * The divide method divides two fractions then simplifies the result.
     *
     * @param obj
     * @return
     */
    Fraction divide(Fraction obj) {
        // create new fraction to return as result
        Fraction result = new Fraction();
        // calculate result
        result.par_numerator = par_numerator * obj.par_denominator;
        result.par_denominator = par_denominator * obj.par_numerator;
        // reduce the resulting fraction
        result = result.simplify();
        return result;
    }

    /**
     * The simplify method simplifies the fraction as much as possible. This can
     * be done by finding greatest common divider for numerator and denominator
     *
     * @return
     */
    private Fraction simplify() {
        Fraction result = new Fraction();
        int common = 0;
        // get absolute values for numerator and denominator
        int num = Math.abs(par_numerator);
        int den = Math.abs(par_denominator);
        // figure out which is less, numerator or denominator
        if (num > den) {
            common = gcd(num, den);
        } else if (num < den) {
            common = gcd(den, num);
        } else // if both are the same, don't need to call gcd
        {
            common = num;
        }

        // set result based on common factor derived from gcd
        result.par_numerator = par_numerator / common;
        result.par_denominator = par_denominator / common;
        return result;
    }

    /**
     * Method returns true if the calling fraction object is smaller than the
     * parameter object. Do not forget to convert both fractions so they have a
     * common denominator before you compare them. Fraction a = new Fraction (1,
     * 3); Fraction b = new Fraction (1, 12); boolean res = a.less(b); //res is
     * holding false because 1/3 is NOT less than 1/12
     *
     * @param obj
     * @return
     */
    boolean less(Fraction obj) {
        if (par_numerator * obj.par_denominator < obj.par_numerator * par_denominator) {
            return true;
        } else {
            return false;
        }
    }

    boolean more(Fraction obj) {
        if (par_numerator * obj.par_denominator > obj.par_numerator * par_denominator) {
            return true;
        } else {
            return false;
        }
    }

    boolean equals(Fraction obj) {

        if (!(obj instanceof Fraction)) {
            return false;
        }
        Fraction other = (Fraction) obj;
        return this.par_numerator * obj.par_denominator == other.par_numerator * this.par_denominator;

    }

    public static void main(String[] args) {

        try {
            Fraction a = new Fraction(7, 6);
            Fraction b = new Fraction(1, 6);

            Fraction result = new Fraction();

            // test addition
            System.out.println("Test addition:");
            result = a.add(b);
            System.out.println("("+a+ ")" + " + " + "("+b+ ")"+ " = " +  "(" +result+ ")");
            System.out.println();

            //test subtract
            System.out.println("Test subtraction:");
            result = a.subtract(b);
            System.out.println("("+a+ ")" + " - " + "("+b+ ")" + " = " +  "(" +result+ ")");
            System.out.println();

            // test multiplication
            System.out.println("Test multiplication:");
            result = a.multiply(b);
            System.out.println("("+a+ ")"+ " * " + "("+b+ ")" + " = " +  "(" +result+ ")");
            System.out.println();

            // test division
            System.out.println("Test division:");
            result = a.divide(b);
            System.out.println("("+a+ ")"+ " : " +"("+b+ ")" + " = " +  "(" +result+ ")");
            System.out.println();

            // test equals
            System.out.println("Test Equals:");
            if (a.equals(b)) {
                System.out.println("Fraction "+ "("+a+ ")"+" equals "+"("+b+ ")");
            } else {
                System.out.println("Fraction "+ "("+a+ ")"+" not equals "+"("+b+ ")");
            }

            // test less
            System.out.println();
            System.out.println("Test Less:");
            if (a.less(b)) {
                System.out.println("Fraction "+ "("+a+ ")"+" less "+"("+b+ ")");
            } else {
                System.out.println("Fractions "+ "("+a+ ")"+" not less " +"("+b+ ")" );
            }
            // test less
            System.out.println();
            System.out.println("Test more:");
            if (a.more(b)) {
                System.out.println("Fraction "+ "("+a+")"+ " more than "+ "("+b+")");
            } else {
                System.out.println("Fraction "+ "("+a+")"+ " not more than "+ "("+b+")");
            }
        } catch (Exception e) // handle the exception below
        {
            System.out.println(e.getMessage());
            // throws the Exception
        }

    }

}

