class CPU{
int price;

class Processor{
int noOfCores=4;
String manufacturer="Intel";
void printpro(){
System.out.println("\nProcessor\n");
System.out.println("No. of cores : "+noOfCores);
System.out.println("Manufacturer : "+manufacturer);
}
}

static class RAM{
String memory="4GB";
String manufacturer="Micron";
void printram(){
System.out.println("\nRAM\n");
System.out.println("Memory : "+memory);
System.out.println("Manufacturer : "+manufacturer);
}
}

}

class NestedClass{
public static void main(String arg[]){
CPU.RAM ram=new CPU.RAM();
ram.printram();
CPU cpu=new CPU();
CPU.Processor pro=cpu.new Processor();
pro.printpro(); 
}
}