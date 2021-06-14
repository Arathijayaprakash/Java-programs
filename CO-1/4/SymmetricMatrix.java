import java.util.Scanner;
class SymmetricMatrix{
public static void main(String ar[]){
int flag=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of rows:");
int r=sc.nextInt();
System.out.println("Enter no. of columns:");
int c=sc.nextInt();
int m[][]=new int[r][c];
System.out.println("enter elements of matrix: ");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
m[i][j]=sc.nextInt();
}
}

System.out.println("matrix: ");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.print(m[i][j]+" ");
System.out.print(" ");
}
System.out.println(" ");
}
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
if(m[i][j]!=m[j][i]){
flag=0;
break;
}
if(flag==0){
System.out.println("Not Symmetric");
break;
}
}
if(flag==1){
System.out.println("Symmetric");

}
}
}
}