package brillo;

import java.util.List;

public class SyncClass { 
	
	public void test() {
		List<String> stringList = new ArrayList();
		stringList.add("Star");
		stringList.add("Moon");
		
		stringList.stream().forEach(s -> System.out.println(s));
		
		for (String string : stringList) {
		System.out.println(string);
		}
	}
    public void methodA() {
        synchronized (String.class) {
            System.out.println("In sync String.class object");
            synchronized (Integer.class) {
                System.out.println("In sync Integer.class object");
            }
        }
    } 

    public void methodB() {
        synchronized (Integer.class) {
            System.out.println("In sync on Integer.class object");
            synchronized (String.class) {
                System.out.println("In sync on String.class object");
            }
        }
    }
}

// Read execel file from java
// exact column and value
// sort it asc




