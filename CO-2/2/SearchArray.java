import java.util.Scanner;
public class SearchArray{
public static void main(String ar[]){
int n;
int flag=0;
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
System.out.print(array[i]+" ");
}
System.out.println("\nEnter element to search:");
int e=sc.nextInt();
for(int i=0;i<n;i++){
if(array[i]==e){
System.out.println("\nelement found at position "+(i+1));
break;
}
}
}
}

