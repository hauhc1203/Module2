package bt2;

import java.sql.Date;

public class NextDayCalculator {
    public static Date getNextDay(Date day){
        int day2=day.toLocalDate().getDayOfMonth()+1;

        return new Date(day.getYear(),day.getMonth(),day2);
    }


}
