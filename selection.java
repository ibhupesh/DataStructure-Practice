import java.util.Scanner;
public class selection {
	public void print(int b[]) {
		int n=b.length;
		for(int k=0;k<n;k++) {
			int d=b[k];
			System.out.print(d+" ");
		}
	}
	public static void main(String args[]) {
		selection ob= new selection();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the lenth of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int u=0;u<n;u++) {
			System.out.println("Enter the "+u+"th term of array");
			a[u]=sc.nextInt();
		}
		ob.print(a);
		System.out.println();
		int min,i,j;
		for (i=0;i<n;i++) {
			min=i;
			for (j=i+1;j<n;j++) {
				if(a[min]>a[j])
					min=j;
				else
					continue;
			}
			if(min!=i) {
				int c=a[min];
				a[min]=a[i];
				a[i]=c;
			}
			ob.print(a);
			System.out.println();
			}
			
		System.out.println("Sorted Array is:");
		System.out.println();
		ob.print(a);
		}
}
		
		