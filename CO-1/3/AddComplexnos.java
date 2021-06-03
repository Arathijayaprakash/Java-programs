class Complex{
double real;
double img;

String addition(Complex x1,Complex x2){
return (x1.real+x2.real)+"+"+(x1.img+x2.img)+"i";
}

void setVal(double r,double i){
real=r;
img=i;
}
}

class AddComplexnos{
public static void main(String ar[]){
Complex x1=new Complex();
Complex x2=new Complex();
String sum;

x1.setVal(2,3);
x2.setVal(3,5);

sum=x1.addition(x1,x2);
System.out.println("Sum of the Complex no.s "+x1.real+"+"+x1.img+"i"+" and "+x2.real+"+"+x2.img+"i"+" is "+sum);

}
}