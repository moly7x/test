package integralPoints;

public class mainProgram {

	static boolean isPowerOfFour(long n) {
	    double temp = Math.log(n)/Math.log(4);
	    if ((int) temp == temp) {
	        return true;
	    }
	    return false;
	}

	public static void main(String[] args) {
		System.out.println(isPowerOfFour(16));
	}
}
