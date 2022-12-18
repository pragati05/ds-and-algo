package basic_interview_programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product{
	int price;
	String name;
	Product(int price, String name){
		this.price = price;
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [price=" + price + ", name=" + name + "]";
	}
	
	
	
	
}
public class HighestPriorty {

	public static void main(String[] args) {
		Product p1 = new  Product(100, "Apple");
		Product p2 = new  Product(200, "banana");
		Product p3 = new  Product(300, "kiwi");
		Product p4 = new  Product(400, "Orange");
		
		List<Product> fruits = new ArrayList<>();
		fruits.add(p1);
		fruits.add(p2);
		fruits.add(p3);
		fruits.add(p4);
		
		Comparator<Product> com = Comparator.comparing(Product :: getPrice);
		Product res = fruits.stream().max(com).get();
		
		System.out.println(res);
		

	}

}
