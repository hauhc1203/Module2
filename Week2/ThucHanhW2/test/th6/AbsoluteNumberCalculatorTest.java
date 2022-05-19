package th6;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void testfindAbsolute() {
        int num=0;
        int expected=0;
        int result = AbsoluteNumberCalculator.findAbsolute(num);
        assertEquals(expected,result);
    }

    @Test
    void testfindAbsolute1() {
        int num=-1;
        int expected=1;
        int result = AbsoluteNumberCalculator.findAbsolute(num);
        assertEquals(expected,result);
    }
}