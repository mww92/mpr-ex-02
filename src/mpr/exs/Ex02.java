package mpr.exs;
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
		int[] primes = PrimesGen.genPrimes(numOfPrimes);
		for (int pn : primes) {
			System.out.printf("%d ", pn);
		}
		System.out.println();
	}

}
