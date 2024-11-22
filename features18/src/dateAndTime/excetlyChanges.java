package dateAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class excetlyChanges {
public static void main(String[] args) {
	
	
	Date d1 = new Date();
	System.out.println(d1);
	System.out.println("================");
	
	LocalDate of = LocalDate.of(2024, 10, 23);
	System.out.println(of);
	
	System.out.println("=========");
	
	LocalDate d2 = LocalDate.now();
	System.out.println(d2);
	
	 d2=d2.plusDays(3);
	System.out.println(d2);
	
	d2 = d2.plusMonths(1);
	System.out.println(d2);
	
	d2 = d2.plusYears(1);
	System.out.println(d2);
	// there is so many methods is there we can also perform 
	
	
	System.out.println("==============");
	
	// Whether  leafYear or not
 boolean leapyear=	LocalDate.parse("2024-12-22").isLeapYear();
 System.out.println("Leaf year ::"+ leapyear);
 
 System.out.println("=================");
 
   // Whether before day or not
  boolean before =LocalDate.parse("2024-12-22").isBefore(LocalDate.parse("2025-12-22"));
   System.out.println("Before Date ::"+ before);
   System.out.println("=========================");
   
   // localTime
   
   LocalTime time = LocalTime.now();
   System.out.println(time);
   time = time.plusHours(2);
   
   // Local date and time 
   LocalDateTime datetime =LocalDateTime.now();
   System.out.println(datetime);
   System.out.println("===========================");
   
   // period class
   
//   Period p=Period.ofDays(5);
//   System.out.println(p.getDays());
   
   
 Period between=  Period.between(LocalDate.parse("2002-07-14"), LocalDate.now());
   System.out.println(between.getYears());
   
   System.out.println("=============");
   
   Duration duration =Duration.between(LocalTime.parse("18:00"), LocalTime.now());
   System.out.println(duration);
   
}
}
