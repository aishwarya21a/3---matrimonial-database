package Day1;
import java.util.Random;
public class Assignment2 {
public static void main(String args[]) {
	Random rand = new Random();
	int upperbound = 7;
	int runs=0, no0=0, no1=0, no2=0, no3=0, no4=0, no6=0;
	float strikeRate=0;
	System.out.println("........Core Java Assignment : 2........");
	
	
	for(int i = 1;i<=30;i++) {
		int intRandom = rand.nextInt(upperbound);
		runs = runs+intRandom;
		if(intRandom==0) ++no0;
		if(intRandom==1) ++no1;
		if(intRandom==2) ++no2;
		if(intRandom==3) ++no3;
		if(intRandom==4) ++no4;
		if(intRandom==6) ++no6;
		
	}
	strikeRate = (float)runs/30;
	System.out.println("Total runs scored : "+runs);
	System.out.println("total 0's scored : "+no0);
	System.out.println("total 1's scored : "+no1);
	System.out.println("total 2's scored : "+no2);
	System.out.println("total 3's scored : "+no3);
	System.out.println("total 4's scored : "+no4);
	System.out.println("total 6's scored : "+no6);
	System.out.println("Strike Rate : "+strikeRate);
	
	
}
}
