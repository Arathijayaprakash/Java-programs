import java.util.Scanner;
public class ArrayScanner{
public static void main(String ar[]){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of elements in the Array: ");
n=sc.nextInt();
int[] array=new int[10];
System.out.println("Enter the elements of the Array: ");
for(int i=0;i<n;i++){
array[i]=sc.nextInt();
}
System.out.println("Array elements are: ");
for(int i=0;i<n;i++){
System.out.println(array[i]);
}
}
}

