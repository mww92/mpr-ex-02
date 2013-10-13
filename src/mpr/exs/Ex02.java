package mpr.exs;

import java.util.List;
import java.util.ListIterator;



/*
 * a) Zmodyfikuj kod „generatora liczb pierwszych” PrimesGen tak, żeby
 *    zamiast tablic wykorzystywał listy. W szczególności wynikiem metody
 *    genPrimes powinna być lista liczb całkowitych.
 *    
 * b) Korzystając ze struktury „iteratora listowego” (ListIterator) zmodyfikuj
 * 	  metodę main tak, żeby wypisywała jedynie ostatnie 10 wygenerowanych 
 *    liczb pierwszych i to w odwrotnej kolejności.
 */

public class Ex02 {

	public static void main(String[] args) {
		int numOfPrimes = 20;
		List<Integer> primes = PrimesGen.genPrimes(numOfPrimes);
		ListIterator<Integer> iterator = primes.listIterator(numOfPrimes);
		for (int i=0;i<10;i++) {
			if(iterator.hasPrevious()){
			System.out.printf("%d ", iterator.previous());

			}}
		System.out.println();
	}

}
