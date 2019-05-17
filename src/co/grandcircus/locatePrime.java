package co.grandcircus;

public class locatePrime {

	public static boolean isPrime(int num) {
		int remainder;
		boolean isPrime = true;
		if(isPrime) {
				for(int i = 2; i <= (num/2); i++){
					remainder = num % i;
					System.out.println(num+" Divided by "+ i + " gives a remainder "+ remainder);
					if(remainder == 0) {
						isPrime = false;
						break;
					}
				}
		}else {
			isPrime = false;
		}
	return isPrime;
	}
		
}
