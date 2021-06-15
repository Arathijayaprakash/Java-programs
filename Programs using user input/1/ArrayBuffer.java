import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ArrayBuffer
{
public static void main(String ar[])
throws IOException
{
int n;
BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no. of elements in the Array: ");
n=Integer.parseInt(reader.readLine());;
int[] array=new int[10];
System.out.println("Enter the elements of the Array: ");
for(int i=0;i<n;i++){
array[i]=Integer.parseInt(reader.readLine());;
}
System.out.println("Array elements are: ");
for(int i=0;i<n;i++){
System.out.println(array[i]);
}
}
}

