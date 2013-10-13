package mpr.exs;

import java.util.ArrayList;
import java.util.List;

public class PrimesGen {

	/*
	 * Generator liczb pierwszych
	 * @param N liczba liczb pierwszych do wygenerowania
	 * @return tablica wygenerowanych liczb pierwszych
	 */
	
	public static List<Integer> genPrimes(int N){
	
			List<Integer> primes = new ArrayList<>();

		/* wiemy, że najmniejszą liczbą pierwszą jest 2 */
		primes.add(2);
		int numOfPrimes = 1;
		
		/* najbliższym dwójce kandydatem na liczbe pierwszą jest 3 */
		int primeCandidate = 3;

		while (numOfPrimes < N) {
			boolean isPrime = true;
			for (int k = 0; k < numOfPrimes; k++) {
				if (primeCandidate % primes.get(k) == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primes.add(primeCandidate);
				numOfPrimes++;
			}
			primeCandidate += 2; // liczby parzyste możemy spokojnie pominąć
		}

		return primes;
	}
}