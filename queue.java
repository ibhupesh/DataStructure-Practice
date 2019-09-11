import java.util.Scanner;
public class queue {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the total number of elements in the queue");
		int n= sc.nextInt();
		int a[]= new int[n];
		for(int i=(n-1);i>=0;i--) {
			int t=0;
			t=n-i;
			System.out.println("Enter the "+t+" element of the queue");
			a[i]=sc.nextInt();
		}
		System.out.println("The entered Queue is");
		for(int i=0;i<n;i++) {
			int p=a[i];
			System.out.print(p+" ");
		}
		System.out.println();
		System.out.println("Enter the index of elment to be deleted, index starts from right");
		int o=sc.nextInt();
		int d=n-o;
		for(int i=d;i<(n-1);i++) {
			a[i]=a[i+1];
			
		}
		n=n-1;
		System.out.println("Element Deleted");
		System.out.println("The entered Queue after deletion is ");
		for(int i=0;i<n;i++) {
			int p=a[i];
			System.out.print(p+" ");
		
	}

}
}
