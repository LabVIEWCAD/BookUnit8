package cn.itcast.booktest;

import cn.itcast.domain.Employee;
import cn.itcast.domain.Manager;

public class PairTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager ceo = new Manager("Gus",800000,2003,12,15);
		Manager cfo = new Manager("Sid",600000,2003,12,15);
		Pair<Manager> buddies = new Pair<>(ceo,cfo);
		printBuddies(buddies);
		
		ceo.setBonus(1000000);
		cfo.setBonus(500000);
		
		Manager[] managers = {ceo,cfo};
		
		Pair<Employee> result = new pair<>();
		minmaxBonus(managers,result);
		System.out.println("first:"+result.getFirst().getName()+",second:"+result.getFirst().getName());
		maxminBonus(managers,result);
		System.out.println("first:"+result.getFirst().getName()+",second:"+result.getFirst().getName());
	}

		public static void printBoddies(Pair<? extends Employee> p) {
			Employee first = p.getFirst();
			Employee second = p.getSecond();
			System.out.println(first.getName()+" and "+second.getName()+" are buddies.");
		}
		
		public static void minmaxBuddies(Manager[] a,Paie<? super Manager> result) {
			if(a.length==0) return;
			Manager min = a[0];
			Manager max = a[0];
			for (int i = 0; i < a.length; i++) {
				if(min.getBonus() > a[i].getBonus()) min = a[i];
				if(max.getBonus() < a[i].getBonus()) max = a[i];
			}
			result.setFirst(min);
			result.setSecond(max);
		}
		
		public static void maxminBonus(Manager[] a,Pair<? super Manager> result) {
			minmaxBonus(a,result);
			PairAlg.swapHelper(result);
		}
}
