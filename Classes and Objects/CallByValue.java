class Test{
void meth(int i,int j){
i*=2;
j/=2;
}
}

class CallByValue{
public static void main(String ar[]){
Test ob=new Test();
int a=15;
int b=20;

ob.meth(a,b);
System.out.println(a);
}
}