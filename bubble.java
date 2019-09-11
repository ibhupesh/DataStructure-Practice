import java.util.Scanner;
public class bubble {
public static void main(String args[]) {
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
	int a[]= new int[10];
	for(int i=0;i<10;i++) {
		System.out.println("Enter the "+i+"th term of array");
		a[i]=sc.nextInt();
	}
	for (int i=0;i<10;i++) {
		int d=a[i];
		System.out.print(d+" ");
	}
	System.out.println();
for(int j=0;j<10;j++) {
	for(int i=0;i<9;i++) {
	if(a[i]>a[i+1]) {
		int b;
	b=a[i];
	a[i]=a[i+1];
	a[i+1]=b;
	for(int k=0;k<10;k++) {
		int h=a[k];
		System.out.print(h+" ");
	}
	System.out.println();
	
	}
	else { }
	
}
}
System.out.println("The sorted array is: ");
for(int i=0;i<10;i++) {
	int b=a[i];
	System.out.print(b+" ");

}
}
}
