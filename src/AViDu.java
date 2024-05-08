import java.util.Scanner;

public class AViDu {
	public static boolean binarySearch(int a[], int n, int x) {
		int l = 0, r = n - 1;
		while(l <= r) {
			int m = (l + r) / 2;
			if(a[m] == x) {
				return true;
			} else if(a[m] < x) {
				l = m + 1;
			}else {
				r = m - 1;
			}
			
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print(binarySearch(a,n,4));
		
			}

}
