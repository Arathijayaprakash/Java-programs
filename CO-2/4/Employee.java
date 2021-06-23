import java.util.Scanner;
class Employee{
	int eNo;
	String eName;
	long eSalary;
	void Getdata(){
		Scanner sc=new Scanner(System.in);
		System.out.print("\n"+"Enter employee no.:");
		eNo=Integer.parseInt(sc.nextLine());
		System.out.print("\n"+"Enter employee name:");
		eName=sc.nextLine();
		System.out.print("\n"+"Enter employee salary:");
		eSalary=Integer.parseInt(sc.nextLine());
	}
	void Putdata(){
		System.out.print("\n\t"+eNo+"\t"+eName+"\t"+eSalary);
	}
	public static void main(String arg[]){
		Scanner sc2=new Scanner(System.in);
		System.out.print("\n"+"Enter no. of employees:");
		int n=sc2.nextInt();
		Employee[] emp=new Employee[n];
		for(int i=0;i<n;i++)
		emp[i]=new Employee();
		for(int i=0;i<n;i++){
			System.out.println("\n"+"Enter details of the employ:");
			emp[i].Getdata();
		}
		System.out.println("details of employees:");
		for(int i=0;i<n;i++)
		emp[i].Putdata();
		System.out.println("\nEnter Employee no. you want to search:");
		int no=sc2.nextInt();
		for(int i=0;i<emp.length;i++){
			if(emp[i].eNo==no){
				emp[i].Putdata();
			}
		}
}
}	
