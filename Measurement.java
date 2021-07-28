/*
 * Q.3: Write a class that has a class Measurement which has two attributes (kgs and grms). Create two
objects that has own values of kgs and grms. Create a static method “add” in that class that add kgs
and grms of both objects and assign result in third object.
Like for object m1 [kgs:5 grms:500]
Like for object m2 [kgs:7 grms:800]
Then addition will be stored in m3 [kgs:13 grms:300]
 */

package Array;
import java.util.Scanner;

public class Measurement {
	int kgs,gms;
	
	
	static Measurement add(Measurement m1,Measurement m2) {
		Measurement m3=new Measurement();
		m3.kgs=m1.kgs+m2.kgs;
		int x=m1.gms+m2.gms;
		if(x>=1000) {
			m3.kgs++;
			x-=1000;
		}
		m3.gms=x;
		return m3;
	}
	void display() {
		System.out.println("After Addition:");
		System.out.println("Weight of Third Object is:"+kgs+"kgs and "+gms+"gms");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Measurement m1=new Measurement();
        Measurement m2=new Measurement();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter kgs for Object1:");
        m1.kgs=sc.nextInt();
        System.out.println("Enter gms for Object1:");
        m1.gms=sc.nextInt();
        System.out.println("Enter kgs for Object2:");
        m2.kgs=sc.nextInt();
        System.out.println("Enter gms for Object2:");
        m2.gms=sc.nextInt();
        
        m1=add(m1,m2);
        m1.display();
	}

}
