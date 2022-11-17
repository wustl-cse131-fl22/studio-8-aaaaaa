package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}
	
    public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isHoliday() {
		return holiday;
	}

	public void setHoliday(boolean holiday) {
		this.holiday = holiday;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	@Override
	public String toString() {
		return (month + "/" + day + "/" + year);
	}

	public static void main(String[] args) {
		Date d1 = new Date(1, 2, 4, true);
		Date d2 = new Date(1, 2, 4, true);
		Date d3 = new Date(4, 2, 4, false);
		Date d4 = new Date(4, 2, 4, false);
		Date d5 = new Date(6, 8, 2, true);
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		HashSet<Date> set = new HashSet<Date>();
		set.add(d1);
		set.add(d2);
		set.add(d3);
		set.add(d4);
		set.add(d5);
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
		System.out.println(list);
		System.out.println(set);
    }

}
