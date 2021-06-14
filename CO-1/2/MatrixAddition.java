import java.util.Scanner;
class MatrixAddition{
public static void main(String ar[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of rows:");
int r=sc.nextInt();
System.out.println("Enter no. of columns:");
int c=sc.nextInt();
int m1[][]=new int[r][c];
System.out.println("enter elements of matrix 1: ");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
m1[i][j]=sc.nextInt();
}
}
int m2[][]=new int[r][c];
System.out.println("enter elements of matrix 2: ");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
m2[i][j]=sc.nextInt();
}
}
System.out.println("matrix 1: ");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.print(m1[i][j]+" ");
System.out.print(" ");
}
System.out.println(" ");
}

System.out.println("matrix 2: ");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.print(m2[i][j]+" ");
System.out.print(" ");
}
System.out.println(" ");
}
int sum[][]=new int[r][c];
System.out.println("Sum of the 2 matrices is : ");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
sum[i][j]=m1[i][j]+m2[i][j];
System.out.print(sum[i][j]+" ");
System.out.print(" ");
}
System.out.println(" ");
}

}
}