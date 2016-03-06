package za.ac.cput.Calculator;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2016/03/06.
 */
public class CalculatorNegTest extends TestCase {

    double num = 10.0;
    String number = null;

    @Test
    public void testCalc() throws Exception {
        Calculator calc = new Calculator();

        /**Floating Point */
        assertEquals(10,num);

        /**Object Equality*/
        assertEquals(11,calc.Add(3,7));

        /**Nullness*/
        assertNull(calc.Add(3,7));

        /** Not Null */
        assertNotNull(number);
    }

}
