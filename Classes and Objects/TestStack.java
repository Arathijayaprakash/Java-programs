class Stack{
int stck[]=new int[10];
int top;

Stack(){
top=-1;
}

void push(int item){
if(top==9)
System.out.println("Stack is full");
else
stck[++top]=item;
}

int pop(){
if(top<0){
System.out.println("Stack underflow");
return 0;
}
else
return stck[top--];
}
}

class TestStack{
public static void main(String ar[]){
Stack mystack1=new Stack();
Stack mystack2=new Stack();

for(int i=0;i<10;i++) mystack1.push(i);
for(int i=10;i<20;i++) mystack2.push(i);

System.out.println("Stack in mystack1;");
for(int i=0;i<10;i++)
System.out.println(mystack1.pop());


System.out.println("Stack in mystack2;");
for(int i=0;i<10;i++)
System.out.println(mystack2.pop());

}
}