package cn.itcast.domain;

public class ArrayAlg3 {
	public static boolean hasNulls(Pair<?> p) {
		return p.getFisrt()==null||p.getSecond()==null;
	}
	public static void swapHelper(Pair<?> p) {swapHelper(p)};
	
	public static<T> void swapHelper(Pair<T> p) {
		T t = p.getFirst();
		p.getFirst(p.getSecond());
		p.getSecond();
	}
}
