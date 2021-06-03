class Product{
int pcode;
String pname;
double price;

String lowestprice(Product p1,Product p2,Product p3){
if(p1.price<p2.price){
	if(p1.price<p3.price){
		return p1.pname;
	}
	else{
		return p3.pname;
	}
}
else{
	if(p2.price>p3.price){
		return p3.pname;
	}
	else{
		return p2.pname;
	}
}

}

void setVal(int pc,String n,double r){
pcode=pc;
pname=n;
price=r;
}
}

class Products{
public static void main(String ar[]){
Product p1=new Product();
Product p2=new Product();
Product p3=new Product();

String lname;

p1.setVal(1011,"Lakme Eyeconic Kajal",275);
p2.setVal(1104,"Enchanteur Perfumed Body Lotion",599);
p3.setVal(1201,"Mayukhi Herbal Hair Oil",250);

lname=p1.lowestprice(p1,p2,p3);

System.out.println("The product with lowest price is "+lname);

}
}