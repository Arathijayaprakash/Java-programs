import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
public class ArrayElementsUsingBufferedReader{
public static void main(String ar[])
throws IOException
{
BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no. of elements in the Array: ");
int n=reader.read();
int[] array=new int[10];
System.out.println("Enter the elements of the Array: ");
for(int i=0;i<n;i++){
array[i]=reader.read();
}
System.out.println("Array elements are: ");
for(int i=0;i<n;i++){
System.out.println(array[i]);
}
}
}

