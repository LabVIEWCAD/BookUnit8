package cn.itcast.booktest;

import cn.itcast.domain.ArrayAlg;

public class PairTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"Mary","had","a","litte","lamb"};
		Pari<String> mm = ArrayAlg.minmax(words);
		System.out.println("min="+mm.getFirst());
		System.out.println("max="+mm.getSecond());
	}

}
