// 13808681
// davide.ferri.94@gmail.com

package fraction;

import org.junit.jupiter.api.Assertions;
import org.testng.Assert;

class FractionImplTest {

    @org.junit.jupiter.api.Test
    void testAdd() {
        // test one
        Fraction fr1 = new FractionImpl(5,3);
        Fraction fr2 = new FractionImpl(8,3);
        Fraction fr3 = fr1.add(fr2);
        Assert.assertEquals(fr3.toString(),"13/3");
        // test two
        Fraction fr4 = new FractionImpl(5,3);
        Fraction fr5 = new FractionImpl("2/-3");
        Fraction fr6 = fr4.add(fr5);
        Assert.assertEquals(fr6.toString(),"1");
        // test three
        Fraction fr7 = new FractionImpl(4,3);
        Fraction fr8 = new FractionImpl(-2);
        Fraction fr9 = fr7.add(fr8);
        Assert.assertEquals(fr9.toString(),"-2/3");
        // test four
        Fraction fr10 = new FractionImpl("2/3");
        Fraction fr11 = new FractionImpl("2/-3");
        Fraction fr12 = fr10.add(fr11);
        Assert.assertEquals(fr12.toString(),"0");
        // test five
        Fraction fr13 = new FractionImpl("11/    5");
        Fraction fr14 = new FractionImpl("2/-10");
        Fraction fr15 = fr13.add(fr14);
        Assert.assertEquals(fr15.toString(),"2");
    }

    @org.junit.jupiter.api.Test
    void testSubtract() {
        // test one
        Fraction fr1 = new FractionImpl(5,3);
        Fraction fr2 = new FractionImpl(8,3);
        Fraction fr3 = fr1.subtract(fr2);
        Assert.assertEquals(fr3.toString(),"-1");
        // test two
        Fraction fr4 = new FractionImpl(5,3);
        Fraction fr5 = new FractionImpl("2/-3");
        Fraction fr6 = fr4.subtract(fr5);
        Assert.assertEquals(fr6.toString(),"7/3");
        // test three
        Fraction fr7 = new FractionImpl(4,3);
        Fraction fr8 = new FractionImpl(-2);
        Fraction fr9 = fr7.subtract(fr8);
        Assert.assertEquals(fr9.toString(),"10/3");
        // test four
        Fraction fr10 = new FractionImpl("2/3");
        Fraction fr11 = new FractionImpl("2/-3");
        Fraction fr12 = fr10.subtract(fr11);
        Assert.assertEquals(fr12.toString(),"4/3");
        // test five
        Fraction fr13 = new FractionImpl("15/5");
        Fraction fr14 = new FractionImpl("3");
        Fraction fr15 = fr13.subtract(fr14);
        Assert.assertEquals(fr15.toString(),"0");
    }

    @org.junit.jupiter.api.Test
    void testMultiply() {
        // test one
        Fraction fr1 = new FractionImpl(5,3);
        Fraction fr2 = new FractionImpl(8,3);
        Fraction fr3 = fr1.multiply(fr2);
        Assert.assertEquals(fr3.toString(),"40/9");
        // test two
        Fraction fr4 = new FractionImpl(5,3);
        Fraction fr5 = new FractionImpl("2/-3");
        Fraction fr6 = fr4.multiply(fr5);
        Assert.assertEquals(fr6.toString(),"-10/9");
        // test three
        Fraction fr7 = new FractionImpl(4,3);
        Fraction fr8 = new FractionImpl(-2);
        Fraction fr9 = fr7.multiply(fr8);
        Assert.assertEquals(fr9.toString(),"-8/3");
        // test four
        Fraction fr10 = new FractionImpl("2/3");
        Fraction fr11 = new FractionImpl("2/-3");
        Fraction fr12 = fr10.multiply(fr11);
        Assert.assertEquals(fr12.toString(),"-4/9");
        // test five
        Fraction fr13 = new FractionImpl("15/5");
        Fraction fr14 = new FractionImpl("3");
        Fraction fr15 = fr13.multiply(fr14);
        Assert.assertEquals(fr15.toString(),"9");
    }

    @org.junit.jupiter.api.Test
    void testDivide() {
        // test one
        Fraction fr1 = new FractionImpl(5,3);
        Fraction fr2 = new FractionImpl(8,3);
        Fraction fr3 = fr1.divide(fr2);
        Assert.assertEquals(fr3.toString(),"5/8");
        // test two
        Fraction fr4 = new FractionImpl(5,3);
        Fraction fr5 = new FractionImpl("2/-3");
        Fraction fr6 = fr4.divide(fr5);
        Assert.assertEquals(fr6.toString(),"-5/2");
        // test three
        Fraction fr7 = new FractionImpl(4,3);
        Fraction fr8 = new FractionImpl(-2);
        Fraction fr9 = fr7.divide(fr8);
        Assert.assertEquals(fr9.toString(),"-2/3");
        // test four
        Fraction fr10 = new FractionImpl("2/3");
        Fraction fr11 = new FractionImpl("2/-3");
        Fraction fr12 = fr10.divide(fr11);
        Assert.assertEquals(fr12.toString(),"-1");
        // test five
        Fraction fr13 = new FractionImpl("15/5");
        Fraction fr14 = new FractionImpl("3");
        Fraction fr15 = fr13.divide(fr14);
        Assert.assertEquals(fr15.toString(),"1");
        // test six
        Fraction fr16 = new FractionImpl("2/5");
        Fraction fr17 = new FractionImpl("0/7");
        Assertions.assertThrows(ArithmeticException.class, () -> fr16.divide(fr17));
    }

    @org.junit.jupiter.api.Test
    void testAbs() {
        // test one
        Fraction fr1 = new FractionImpl("22/   -2");
        Assert.assertEquals(fr1.abs().toString(),"11");
        // test two
        Fraction fr2 = new FractionImpl(-23);
        Assert.assertEquals(fr2.abs().toString(),"23");
        // test three
        Fraction fr3 = new FractionImpl(0,-11);
        Assert.assertEquals(fr3.abs().toString(),"0");
        // test four
        Fraction fr4 = new FractionImpl(-49,-7);
        Assert.assertEquals(fr4.abs().toString(),"7");
        // test five
        Fraction fr5 = new FractionImpl("-22  /    -15");
        Assert.assertEquals(fr5.abs().toString(),"22/15");
    }

    @org.junit.jupiter.api.Test
    void testNegate() {
        // test one
        Fraction fr1 = new FractionImpl("22/   -2");
        Assert.assertEquals(fr1.negate().toString(),"11");
        // test two
        Fraction fr2 = new FractionImpl(-23);
        Assert.assertEquals(fr2.negate().toString(),"23");
        // test three
        Fraction fr3 = new FractionImpl(0,-11);
        Assert.assertEquals(fr3.negate().toString(),"0");
        // test four
        Fraction fr4 = new FractionImpl(-49,-7);
        Assert.assertEquals(fr4.negate().toString(),"-7");
        // test five
        Fraction fr5 = new FractionImpl("-22  /    -15");
        Assert.assertEquals(fr5.negate().toString(),"-22/15");
    }

    @org.junit.jupiter.api.Test
    void testHashCode() {
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
        // test one
        Fraction fr1 = new FractionImpl("22/   -2");
        int c = -11;
        Assert.assertNotEquals(c, fr1);
        // test two
        Fraction fr2 = new FractionImpl(-22,2);
        Assert.assertEquals(fr2, fr1);
        // test three
        Fraction fr3 = new FractionImpl(44,4);
        Assert.assertEquals(fr3.negate(), fr1);
        // test four
        Fraction fr4 = new FractionImpl(-49,-7);
        Assert.assertNotEquals(fr4, fr1);
        // test five
        Fraction fr5 = new FractionImpl("-22  /    -15");
        Assert.assertNotEquals(fr5, fr1);
        // test six
        Fraction fr6 = new FractionImpl("2/3");
        int d = 2/3;
        Assert.assertNotEquals(d, fr6);
    }

    @org.junit.jupiter.api.Test
    void testClone() {
    }

    @org.junit.jupiter.api.Test
    void testInverse() {
        // test one
        Fraction fr1 = new FractionImpl("22/   -2");
        Assert.assertEquals(fr1.inverse().toString(),"-1/11");
        // test two
        Fraction fr2 = new FractionImpl(-23);
        Assert.assertEquals(fr2.inverse().toString(),"-1/23");
        // test three
        Fraction fr3 = new FractionImpl(1,-1);
        Assert.assertEquals(fr3.inverse().toString(),"-1");
        // test four
        Fraction fr4 = new FractionImpl(-49,-7);
        Assert.assertEquals(fr4.inverse().toString(),"1/7");
        // test five
        Fraction fr5 = new FractionImpl("-22  /    -15");
        Assert.assertEquals(fr5.inverse().toString(),"15/22");
        // test six
        Fraction fr6 = new FractionImpl("0/1");
        Assertions.assertThrows(ArithmeticException.class, fr6::inverse);
    }

    @org.junit.jupiter.api.Test
    void testCompareTo() {
        // test one
        Fraction fr1 = new FractionImpl(5,3);
        Fraction fr2 = new FractionImpl(8,3);
        Assert.assertTrue(fr2.compareTo(fr1) > 0);
        // test two
        Fraction fr4 = new FractionImpl(5,3);
        Fraction fr5 = new FractionImpl("2/-3");
        Assert.assertTrue(fr4.compareTo(fr5) > 0);
        // test three
        Fraction fr7 = new FractionImpl(4,3);
        Fraction fr8 = new FractionImpl(-2);
        Assert.assertFalse(fr8.compareTo(fr7) > 0);
        // test four
        Fraction fr10 = new FractionImpl("2/-3");
        Fraction fr11 = new FractionImpl("2/3");
        Assert.assertTrue(fr10.compareTo(fr11) < 0);
        // test five
        Fraction fr13 = new FractionImpl("0/1");
        Fraction fr14 = new FractionImpl("0");
        Assert.assertEquals(fr13.compareTo(fr14), 0);
        // test five
        Fraction fr15 = new FractionImpl("11/2");
        Fraction fr16 = new FractionImpl(11,-2);
        Assert.assertEquals(fr15.compareTo(fr16.negate()), 0);

    }

    @org.junit.jupiter.api.Test
    void testToString()
    {
        // test one
        Fraction fr1 = new FractionImpl(5,3);
        Assert.assertEquals(fr1.toString(),"5/3");
        // test two
        Fraction fr2 = new FractionImpl(15,3);
        Assert.assertEquals(fr2.toString(),"5");
        // test three
        Fraction fr3 = new FractionImpl(15,-3);
        Assert.assertEquals(fr3.toString(),"-5");
        // test four
        Fraction fr4 = new FractionImpl(-22,-11);
        Assert.assertEquals(fr4.toString(),"2");
        // test five
        Fraction fr5 = new FractionImpl("22/   -2");
        Assert.assertEquals(fr5.toString(),"-11");
        // test six
        Fraction fr6 = new FractionImpl(-23);
        Assert.assertEquals(fr6.toString(),"-23");
        // test seven
        Fraction fr7 = new FractionImpl(0,-11);
        Assert.assertEquals(fr7.toString(),"0");
        // test eight
        Fraction fr8 = new FractionImpl(-49,-7);
        Assert.assertEquals(fr8.toString(),"7");
        // test nine
        Fraction fr9 = new FractionImpl("-22  /    -15");
        Assert.assertEquals(fr9.toString(),"22/15");
        // test ten
        Fraction fr10 = new FractionImpl("-6");
        Assert.assertEquals(fr10.toString(),"-6");
    }

    @org.junit.jupiter.api.Test
    void testConstructor()
    {
        // test one
        Assertions.assertThrows(ArithmeticException.class, () -> new FractionImpl(15,0));
        // test two
        Assertions.assertThrows(NumberFormatException.class, () -> new FractionImpl("2/3/4"));
        // test three
        Assertions.assertThrows(ArithmeticException.class, () -> new FractionImpl("3/0"));
        // test four
        Assertions.assertThrows(ArithmeticException.class, () -> new FractionImpl(0,0));
        // test five
        Assertions.assertThrows(NumberFormatException.class, () -> new FractionImpl("1 0 / -4"));
        // test six
        Assertions.assertThrows(NumberFormatException.class, () -> new FractionImpl("10 / +-4"));
        // test seven
        Assertions.assertThrows(NumberFormatException.class, () -> new FractionImpl("!10 / 4"));
    }
}