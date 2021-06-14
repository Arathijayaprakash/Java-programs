import java.util.Scanner;
public class ArraySmallestElement{
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

System.out.println("Largest element in the array is : ");
int min=array[0];
for(int i=1;i<n;i++){
if(array[i]<min)
min=array[i];
}
System.out.println(min);

}
}

