package dateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);

        // dd/MM/yyyy (correct pattern for day/month/year) // convert date to string
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String format1 = sdf1.format(d);
        System.out.println(format1);

        // US date format (MM/dd/yyyy)
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
        String format2 = sdf2.format(d);
        System.out.println(format2);
        System.out.println("=======================");
        
        //convert String  to Date
        
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDate=sdf3.parse("2022-12-20");
        System.out.println(parsedDate);
        System.out.println("============================");
        
        //java.sql.date
        java.sql.Date d1 = new java.sql.Date(20241023);
        System.out.println(d1);
        
    }
}
