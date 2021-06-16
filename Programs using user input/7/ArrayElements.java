import java.util.Scanner;
public class ArrayElements{
public static void main(String ar[]){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter limit of Array: ");
n=sc.nextInt();
int[] array=new int[n];
System.out.println("Enter the elements of the Array: ");
for(int i=0;i<n;i++){
array[i]=sc.nextInt();
}
System.out.println("Array elements are: ");
for(int i=0;i<n;i++){
System.out.println(array[i]);
}
System.out.println("no. of elements in the array is: "+array.length);
}
}

