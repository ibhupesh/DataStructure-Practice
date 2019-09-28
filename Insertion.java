import java.util.Scanner;
public class Insertion {
	public void print(int b[]) {
		int n=b.length;
		for(int k=0;k<n;k++) {
			int d=b[k];
			System.out.print(d+" ");
		}
	}
	public static void main(String args[]) {
		Insertion ob= new Insertion();
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
		int i,k;
		int j=0;
		for(i=0;i<n-1;i++){
		  j=j+1;
		  if(a[i]>a[j] ){
		  int v=a[i];
		  a[i]=a[j];
		  a[j]=v;
		  for(k=0;k<j;k++){
		  if(a[k]>a[k+1]){
		  int y=a[k];
		  a[k]=a[k+1];
		  a[k+1]=y;
		  }
		  }
		  }
		  ob.print(a);
		  System.out.println();
                 }
                 
                 System.out.println("The sorted array is");
                 ob.print(a);
                 
}
}