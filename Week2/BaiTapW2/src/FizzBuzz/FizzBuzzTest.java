package FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testfizzBuzz() {
        String kq="Fizz";
        String r=FizzBuzz.fizzBuzz(3);
        assertEquals(kq,r);
    }
    @Test
    void testfizzBuzz1() {
        String kq="muoi ba";
        String r=FizzBuzz.fizzBuzz(13);
        assertEquals(kq,r);
    }
}