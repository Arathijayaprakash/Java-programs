import java.util.Scanner;
class SymmetricMatrix
	{
		public static void main(String ar[])
		{
		int r,c;
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		r=sc.nextInt();
		System.out.println("Enter no. of columns:");
		c=sc.nextInt();
		int[][] m=new int[r][c];
		System.out.println("enter elements of matrix: ");
		for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)		
					{
						m[i][j]=sc.nextInt();
					}
			}
		if(r==c){
		System.out.println("matrix: ");
		for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
					{
						System.out.print(m[i][j]+" ");
						System.out.print(" ");
						if(m[i][j] != m[j][i])
						flag=1;
					}
				System.out.println(" ");
			}
		if(flag==0)
			System.out.println("Symmetric");
		else
			System.out.println("NotSymmetric");
			}
		else
			System.out.println("NotSymmetric (not a square matrix)");	
		}
	}
