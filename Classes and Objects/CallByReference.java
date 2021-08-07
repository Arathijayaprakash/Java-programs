class Test{
int a,b;

Test(int i,int j){
a=i;
b=j;
}
void meth(Test ob){
ob.a*=2;
ob.b/=2;
}
}

class CallByReference{
public static void main(String ar[]){
Test ob=new Test(15,20);

ob.meth(ob);
System.out.println(ob.a);
}
}