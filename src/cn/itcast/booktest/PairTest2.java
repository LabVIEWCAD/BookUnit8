package cn.itcast.booktest;

import java.time.LocalDate;

import cn.itcast.domain.ArrayAlg;

public class PairTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate[] birthdays = {LocalDate.of(1906, 12, 9),LocalDate.of(1815, 12, 10),
				LocalDate.of(1903, 12, 3),LocalDate.of(1910, 6, 12)};
		Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
		System.out.println("min="+mm.getFirst());
		System.out.println("max="+mm.getSecond());
	}

}
