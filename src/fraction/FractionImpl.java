package fraction;

import static java.lang.Math.max;

public class FractionImpl implements Fraction {
    /**
     * Parameters are the <em>numerator</em> and the <em>denominator</em>.
     * Normalize the fraction as you create it.
     * For instance, if the parameters are <pre>(8, -12)</pre>, create a <pre>Fraction</pre> with numerator
     * <pre>-2</pre> and denominator <pre>3</pre>.
     *
     * The constructor should throw an <pre>ArithmeticException</pre> if the denominator is zero.
     *
     * @param numerator
     * @param denominator
     */
    int numerator;
    int denominator;

    public FractionImpl(int numerator, int denominator)
    {
        this(numerator+"/"+denominator);
    }

    /**
     * The parameter is the numerator and <pre>1</pre> is the implicit denominator.
     *
     * @param wholeNumber representing the numerator
     */
    public FractionImpl(int wholeNumber) {
        this(Integer.toString(wholeNumber));
    }

    /**
     * The parameter is a <pre>String</pre> containing either a whole number, such as `5` or `-3`, or a fraction,
     * such as "8/-12".
     * Allow blanks around (but not within) integers.
     * The constructor should throw an <pre>ArithmeticException</pre>
     * if given a string representing a fraction whose denominator is zero.
     * <p>
     * You may find it helpful to look at the available String API methods in the Java API.
     *
     * @param fraction the string representation of the fraction
     */
    public FractionImpl(String fraction) {
        if (fraction.contains("/"))
        {
            String[] arr = new String[2];
            arr = fraction.split("/");
            int numerator = Integer.parseInt(arr[0].trim());
            int denominator = Integer.parseInt(arr[1].trim());
            if (denominator==0) throw new ArithmeticException("Divide by zero");
            int gcd = FractionImpl.gcd(Math.abs(numerator),Math.abs(denominator));
            boolean is_positive = FractionImpl.isPositive(numerator,denominator);
            this.numerator = (is_positive) ? (Math.abs(numerator)/gcd):(-Math.abs(numerator)/gcd);
            this.denominator = Math.abs(denominator)/gcd;
        }
        else
        {
            this.numerator = Integer.parseInt(fraction.trim());
            this.denominator = 1;
        }
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction add(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction subtract(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction multiply(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction divide(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction abs() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction negate() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * @inheritDoc
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction inverse() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int compareTo(Fraction o) {
        return 0;
    }

    /**
     * @inheritDoc
     */
    @Override
    public String toString()
    {
        if (this.denominator==1) return Integer.toString(this.numerator);
        else return Integer.toString(this.numerator)+"/"+Integer.toString(this.denominator);
    }

    private static int gcd(int numerator, int denominator)
    {
        while (numerator > 0 && denominator > 0)
        {
            if (numerator >= denominator)
                numerator = numerator % denominator;
            else denominator = denominator % numerator;
        }
        return max(numerator,denominator);
    }

    private static boolean isPositive(int numerator, int denominator)
    {
        if (numerator*denominator>=0) return true;
        else return false;
    }
}