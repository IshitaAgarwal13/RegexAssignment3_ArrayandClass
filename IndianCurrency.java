/* Q.2: Write a program to find how an amount can be using Indian
   currencies starts from 1000 notes and move downward.
e.g. 9788 [1000*9, 500*1, 100*2, 50*1, 20*1, 10*1, 5*1, 2*1, 1*1]
*/

package Array;
import java.util.Scanner;

public class IndianCurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount in Rupees:");
        int amt=sc.nextInt();
        int mult=1;
        int arr[]=new int[9];
        
		while(amt>0) {
			int rem= (amt%10)*mult;
			amt=amt/10;
			mult*=10;
			
			while(rem>0) {
				if(rem>=1000) {
					arr[0]++;
					rem-=1000;
				}
				else if(rem>=500) {
					arr[1]++;
					rem-=500;
				}
				else if(rem>=100) {
					arr[2]++;
					rem-=100;
					
				}
				else if(rem>=50) {
					arr[3]++;
					rem-=50;
				}
				else if(rem>=20) {
					arr[4]++;
					rem-=20;
				}
				else if(rem>=10) {
					arr[5]++;
					rem-=10;
				}
				else if(rem>=5) {
					arr[6]++;
					rem-=5;
				}
				else if(rem>=2) {
					arr[7]++;
					rem-=2;
				}
				else{
					arr[8]++;
					rem-=1;
				}
			}
		}
		int a[]= {1000,500,100,50,20,10,5,2,1}; 
		for(int i=0;i<9;i++) {
			System.out.println(a[i]+":"+arr[i]);
		}
	}

}
