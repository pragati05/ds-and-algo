package ds.arrays;
 /**
  * 121 - 121 = true
  * 12223 = 3221 - false
  * @author pragati
  *
  */
public class PalindromCheck {

	boolean checkPalindrome(int n) {
		
		StringBuffer sb = new StringBuffer();
		int n2 = n;
		while(n>0) {
			int rem = n % 10;
			sb.append(rem);
			n = n/10;
		}
		
		System.out.println(sb);
		
		//int n3 = Integer.parseInt(sb);
		if(Integer.parseInt(sb.toString()) ==  n2) {
			return true;
		}else {
			return false;
		}
	
	}
	public static void main(String[] args) {
		PalindromCheck p = new PalindromCheck();
		System.out.println(p.checkPalindrome(0));

	}

}


func1(){
	Obj o =- new Object()
			o.setI(10);
	func2(o);
	print o; // 10, 20
}

func2(Objec o1){
	o1.setI(20);
}


o1.i = 




stack head
o  --> 20;
o1 -- 10



class A
{
	A(int a){}
}


class B extends class A;
{
	B(){
		super();
	}
}


B b = new B();

student.stream().filter(s -> s.getId >100).toCollect(Collector.toMap(Student:: getId , Student::getName,Linkedhash::new);



employee - id , nam e, salaray; 
2nd highest ;


select salary from employee  order by salary desc top 2 offeset 1;

ecommer 
step 1 - create ordeer 
step 2 - update product invesoty 
step 3 - bill 

step 4 - genertae product list / deliver / dispatch 









