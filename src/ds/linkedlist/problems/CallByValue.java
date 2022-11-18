package ds.linkedlist.problems;

public class CallByValue {
static void change(int a) {
	a = a +1;
}
	public static void main(String[] args) {
		int x  = 5;
		change(x);
		System.out.println(x);

	}

}
