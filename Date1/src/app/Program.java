package app;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
			
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:36");
		Instant d03 = Instant.parse("2022-07-20T01:30:36Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d01 = " + d01.format(fmt1));
		System.out.println("d02 = " + fmt1.format(d02));
		System.out.println("d03 = " + d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("d02 = " + d02.format(fmt1));
		System.out.println("d02 = " + d02.format(fmt2));
		System.out.println("d02 = " + d02.format(fmt4));
		System.out.println("d03 = " + fmt3.format(d03));
		System.out.println("d03 = " + fmt5.format(d03));

	}

}
