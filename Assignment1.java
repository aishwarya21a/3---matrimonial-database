package Day1;
import java.util.Scanner;

public class Assignment1 {
public static void main(String args[]) {
	System.out.println("........Core Java Assignment : 1 ........");
	Scanner sc = new Scanner(System.in);
	float electricityBill;
	System.out.println("Enter number of units");
	float units = sc.nextFloat();
	if(units<100) {
		electricityBill = units*1.2f; 
	}
	else if (units>=100 || units<=300) {
		electricityBill = 100*1.2f + (units-100)*2f;
	}
	else {
		electricityBill = 100*1.2f + (units-200)*2f + (units-300)*3f;
	}
	
	System.out.println("The electricity bill for "+units+" units is "+electricityBill );
	
	}
}
