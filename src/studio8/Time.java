package studio8;

import java.util.Objects;
import java.util.Scanner;

public class Time {

	private int hour;
	private int minute;
	private boolean twentyFourHour;
	
	public Time(int hour, int minute, boolean twentyFourHour) {
		this.minute = minute;
		this.hour = hour;
		this.twentyFourHour = twentyFourHour;
	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public boolean isTwentyFourHour() {
		return twentyFourHour;
	}

	@Override
	public String toString() {
		return (hour + ":" + minute);
	}

	public void setTwentyFourHour(boolean twentyFourHour) {
		this.twentyFourHour = twentyFourHour;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public static void main(String[] args) {
		Time a = new Time(1, 2, true);
		Time b = new Time(1, 2, false);
		System.out.println(a.equals(b));
    }

}