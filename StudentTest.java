/* Q.4: Create a class student that has three attributes (name, 
   roll no & marks). Create an array of three students and 
   perform following operations
=> Sort them according to roll no
=> Sort them according to marks
=> Print details of topper
*/

package Array;
import java.util.Scanner;

class Student {
	String name;
	int roll;
	double marks;
	
	void sortRoll(Student s[]) {
		if(s[0].roll>s[2].roll) {
			//swap
			Student temp;
			temp=s[0];
			s[0]=s[2];
			s[2]=temp;
		}
		if(s[0].roll>s[1].roll) {
			//swap
			Student temp;
			temp=s[0];
			s[0]=s[1];
			s[1]=temp;
		}
		if(s[1].roll>s[2].roll) {
			//swap
			Student temp;
			temp=s[1];
			s[1]=s[2];
			s[2]=temp;
		}
		
	}
	void sortMarks(Student s[]) {
		if(s[0].marks>s[2].marks) {
			//swap
			Student temp;
			temp=s[0];
			s[0]=s[2];
			s[2]=temp;
		}
		if(s[0].marks>s[1].marks) {
			//swap
			Student temp;
			temp=s[0];
			s[0]=s[1];
			s[1]=temp;
		}
		if(s[1].marks>s[2].marks) {
			//swap
			Student temp;
			temp=s[1];
			s[1]=s[2];
			s[2]=temp;
		}
	}
	
	void display() {
		System.out.println("Name:"+name+" Roll no.:"+roll+" Marks:"+marks);
	}
}
class StudentTest{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student st[] = new Student[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++) {
        	st[i]=new Student();
        	System.out.println("Enter name,roll no. and marks of student "
                                    +(i+1)+":");
        	st[i].name=sc.next();
        	st[i].roll=sc.nextInt();
        	st[i].marks=sc.nextDouble();

        }
        //=> Sort them according to roll no
        System.out.println("Sorting through Roll no.:");
        st[0].sortRoll(st);
        st[0].display();
        st[1].display();
        st[2].display();
        
        //=> Sort them according to marks
        System.out.println("\n");
        System.out.println("Sorting through Marks:");
        st[0].sortMarks(st);
        st[0].display();
        st[1].display();
        st[2].display();
        
        System.out.println("\n");
        System.out.println("Details of topper are:");
        st[2].display();
        
	}

}
