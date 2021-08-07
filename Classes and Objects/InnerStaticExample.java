class Outer{
int outer_x=100;
static class Inner{
int inner_x=200;
void show(){
Outer o=new Outer();
System.out.println(o.outer_x);
System.out.println(inner_x);
}
}
}
class InnerStaticExample{
public static void main(String arg[]){
System.out.println("Within main");
Outer.Inner obj=new Outer.Inner();
obj.show();
}
}