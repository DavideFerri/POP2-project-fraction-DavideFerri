package fraction;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionImplTest {

    @org.junit.jupiter.api.Test
    void add() {
    }

    @org.junit.jupiter.api.Test
    void subtract() {
    }

    @org.junit.jupiter.api.Test
    void multiply() {
    }

    @org.junit.jupiter.api.Test
    void divide() {
    }

    @org.junit.jupiter.api.Test
    void abs() {
    }

    @org.junit.jupiter.api.Test
    void negate() {
    }

    @org.junit.jupiter.api.Test
    void testHashCode() {
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
    }

    @org.junit.jupiter.api.Test
    void testClone() {
    }

    @org.junit.jupiter.api.Test
    void inverse() {
    }

    @org.junit.jupiter.api.Test
    void compareTo() {
    }

    @org.junit.jupiter.api.Test
    void testToString()
    {
        // test one
        FractionImpl fr1 = new FractionImpl(5,3);
        Assert.assertEquals(fr1.toString(),"5/3");
        // test two
        FractionImpl fr2 = new FractionImpl(15,3);
        Assert.assertEquals(fr2.toString(),"5");
        // test three
        FractionImpl fr3 = new FractionImpl(15,-3);
        Assert.assertEquals(fr3.toString(),"-5");
        // test four
        FractionImpl fr4 = new FractionImpl(-22,-11);
        Assert.assertEquals(fr4.toString(),"2");
        // test five
        FractionImpl fr5 = new FractionImpl("22/   -2");
        Assert.assertEquals(fr5.toString(),"-11");
        // test six
        FractionImpl fr6 = new FractionImpl(-23);
        Assert.assertEquals(fr6.toString(),"-23");
        // test seven
        FractionImpl fr7 = new FractionImpl(0,-11);
        Assert.assertEquals(fr7.toString(),"0");
        // test eight
        FractionImpl fr8 = new FractionImpl(-49,-7);
        Assert.assertEquals(fr8.toString(),"7");
        // test nine
        FractionImpl fr9 = new FractionImpl("-22  /    -15");
        Assert.assertEquals(fr9.toString(),"22/15");
        // test ten
        FractionImpl fr10 = new FractionImpl("-6");
        Assert.assertEquals(fr10.toString(),"-6");
    }
}