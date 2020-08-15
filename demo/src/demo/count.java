package demo;

public class count {

	public static int main(String[] args) {
		// TODO Auto-generated method stub

		
		
			int digits = 0;
			int n = 0;
			for (int i = 0; i < n; i++) {
			int[] a = null;
			int div = a[i];
			int k = 0;
			while (div >= 10) {
			int mod = div % 10;
			if (mod == k) {
			digits++;
			}
			div = div / 10;
			}
			if (div == k) {
			digits++;
			}
			}
			return digits;
			}
			
	}


