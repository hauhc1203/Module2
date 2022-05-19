package bt2;

import org.junit.jupiter.api.Test;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    void testgetNextDay(){
        Date day1=new Date(98,2,31);
        Date day2=new Date(98,3,1);
        Date result= NextDayCalculator.getNextDay(day1);
        assertEquals(day2,result);
    }



    @Test
    void testgetNextDay1(){
        Date day1=new Date(100,1,29);
        Date day2=new Date(100,2,1);
        Date result= NextDayCalculator.getNextDay(day1);
        assertEquals(day2,result);
    }
    @Test

    void testgetNextDay2(){
        Date day1=new Date(101,1,28);
        Date day2=new Date(101,2,1);
        Date result= NextDayCalculator.getNextDay(day1);
        assertEquals(day2,result);
    }
    @Test

    void testgetNextDay12(){
        Date day1=new Date(118,3,30);
        Date day2=new Date(118,4,1);
        Date result= NextDayCalculator.getNextDay(day1);
        assertEquals(day2,result);
    }
}