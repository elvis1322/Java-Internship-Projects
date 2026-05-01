import java.util.Scanner;


public class FirstTask1{
    public FirstTask1( ){

    }
	
	private String formatNumber(double value) {
    if (value == (long) value) {
        return String.format("%d", (long) value);
    } else {
        return String.format("%s", value);
    }
  }
	
	
public char ChooseOperator() {
  Scanner input = new Scanner(System.in);
    char x = ';';
    
    while (true) {
        System.out.println("Choose operator (+, -, *, /): ");
        String s = input.next(); 
   
        if (s.length() == 1) {
            x = s.charAt(0);      
            if (x == '+' || x == '-' || x == '*' || x == '/') {
                break; 
            }
        }   
        System.out.println("Invalid input! Please enter exactly one valid operator.");
    }
    return x;
}

    public String calculateAddition(double a, double b){
        
		double sum=a+b;
		String result=formatNumber(a)+"+"+formatNumber(b)+"="+formatNumber(sum);
		return result;
		
    }
public String calculateSubtraction(double a, double b){
   double sum=a-b;
		String result=formatNumber(a)+"-"+formatNumber(b)+"="+formatNumber(sum);
		return result;
}
public String calculateMultiplication(double a, double b){

    double sum=a*b;
		String result=formatNumber(a)+"*"+formatNumber(b)+"="+formatNumber(sum);
		return result;

}
public String calculateDivision(double a,double b){

if (b==0) {
    throw new IllegalArgumentException("Division by zero is not allowed.");
}else{

     double sum=a/b;
		String result=formatNumber(a)+"/"+formatNumber(b)+"="+formatNumber(sum);
		return result;
}
}



public static void main(String[] args) {
    
	FirstTask1 f1=new FirstTask1();
 
 Scanner input = new Scanner(System.in);

System.out.println("Enter the first number:");
double num1= input.nextDouble();

 char y=f1.ChooseOperator();

System.out.println("Enter the second number:");
double num2 =input.nextDouble();
 
switch (y) {
        case '+':
            System.out.println(f1.calculateAddition(num1,num2));
            break;
			case '-':
            System.out.println(f1.calculateSubtraction(num1,num2));
            break;
			
			case '*':
         
            System.out.println(f1.calculateMultiplication(num1,num2));
            break;
			case '/':
           
            System.out.println(f1.calculateDivision(num1,num2));
            break;		
			
 
}
}
}

