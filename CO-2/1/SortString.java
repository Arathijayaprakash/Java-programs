import java.util.Scanner;
class SortString{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of strings you want to enter:");
int n=sc.nextInt();
String str[]=new String[n];
Scanner sc2=new Scanner(System.in);
System.out.println("Enter the strings one by one:");
for(int i=0;i<n;i++){
str[i]=sc2.nextLine();
}
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(str[i].compareTo(str[j])>0){
String temp=str[i];
str[i]=str[j];
str[j]=temp;
}
}
}
System.out.println("\nstrings in sorted order\n");
for(int i=0;i<n;i++){
System.out.println(str[i]);
}
}
}