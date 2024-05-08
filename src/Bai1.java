import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bai1 {
	public static int chan(int n) {
		int ans = 0;
		while(n != 0) {
			if(n % 2 == 0) {
				++ans;
				
			}
			n /= 10;
		}
		return ans;
	}
	public static int le(int n) {
		int ans = 0;
		while(n != 0) {
			if(n % 2 != 0) {
				++ans;
			}
			n /= 10;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		Integer[] b = new Integer[n];
		
		for(int i = 0 ; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		Arrays.sort(a, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(chan(o1) != chan(o2)) {
					return chan(o1) - chan(o2);
				}else {
					return o1 - o2;
				}
				
			}
			
		});
		for(int x : a) {
			System.out.print(x + " ");
		}
		System.out.println(" ");
		Arrays.sort(b, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return le(o1) - le(o2);
			}
			
		});
		for(int x : b) System.out.print(x + " ");
		
	}

}
