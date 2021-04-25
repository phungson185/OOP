package hust.soict.hedspi.test.utils;

import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.MyDate;

// import static org.junit.Assert.assertEquals;

public class DateTest {
	public static void main(String[] args) {
//		MyDate myDate = new MyDate();
//		myDate.setDay(8);
//		assertEquals(8, myDate.getDay());
//		;
//		myDate.setMonth(9);
//		assertEquals(9, myDate.getMonth());
//		;
//		myDate.setYear(2000);
//		assertEquals(2000, myDate.getYear());
//		;
//		myDate.accept();
//		System.out.print("Day: " + myDate.getDay() + "\n");
//		System.out.print("Month: " + myDate.getMonth() + "\n");
//		System.out.print("Year: " + myDate.getYear() + "\n");
//		myDate.print();

		MyDate myDate2 = new MyDate(18, 5, 2000);
		MyDate myDate3 = new MyDate(8, 7, 2000);

		MyDate[] dateList = { myDate3, myDate2 };

		System.out.print(DateUtils.compareMyDate(myDate2, myDate3));
		DateUtils.sortMyDate(dateList);

		int n = dateList.length;
		for (int i = 0; i < n; i++)
			System.out.printf("%d/%d/%d\n", dateList[i].getDay(), dateList[i].getMonth(), dateList[i].getYear());
		;
	}
}
