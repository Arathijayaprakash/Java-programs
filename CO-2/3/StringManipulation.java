import java.util.Scanner;
class StringManipulation{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.nextLine();
System.out.println("Length of the string: "+str.length());
System.out.println("string concatenation: "+str.concat("concat"));
System.out.println("Index of character 'i': "+str.indexOf('i'));
System.out.println("compare to 'string': "+str.compareTo("string"));
System.out.println("endswith character 'i':"+str.endsWith("i"));
System.out.println("replace 'text' with 'words':"+str.replace("text","words"));
System.out.println("covert to lowerCase:"+str.toLowerCase());
System.out.println("covert to upperCase:"+str.toUpperCase());
}
}