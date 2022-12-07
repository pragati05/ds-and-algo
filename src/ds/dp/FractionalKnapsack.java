package ds.dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Input: N = 3, W = 50 values[] = {60,100,120} weight[] = {10,20,30}
 * 
 * Output: 240.00
 * 
 * Explanation:Total maximum value of item we can have is 240.00 from the given
 * capacity of sack.
 * 
 * @author pragati
 *
 */

class Item {
	int value, weight;

	Item(int x, int y) {
		this.value = x;
		this.weight = y;
	}

	@Override
	public String toString() {
		return "Item [value=" + value + ", weight=" + weight + "]";
	}
	
	

}

class SortedIteams  implements Comparable<SortedIteams>{
	int perUnitProfit;
	Item item;

	public int getPerUnitProfit() {
		return perUnitProfit;
	}

	public void setPerUnitProfit(int perUnitProfit) {
		this.perUnitProfit = perUnitProfit;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	@Override
	public int compareTo(SortedIteams o) {
		if(this.perUnitProfit > o.perUnitProfit)
			return -1;
		else if(this.perUnitProfit < o.perUnitProfit)
			return 1;
		else{
			if(item.value > o.item.value) {
				return -1;
			}else if(item.value < o.item.value) {
				return 1;
			}else {
				return 0;
			}
		}
	}

	@Override
	public String toString() {
		return "SortedIteams [perUnitProfit=" + perUnitProfit + ", item=" + item + "]";
	}
	

}

public class FractionalKnapsack {
	

	double fractionalKnapsack(int W, Item arr[], int n) {
		List<SortedIteams> sortedItems = calculatePerUnitPrice(arr);
		System.out.println("sortedItems size = " + sortedItems.size());
		System.out.println(sortedItems.toString());
		double totalProfit = 0.0;
		int i = 0;
		while(W > 0 && i < n) {
			if(sortedItems.get(i).getItem().weight >= W) {
				double fractionValue = W/sortedItems.get(i).getItem().weight;
				totalProfit += ((float)W/sortedItems.get(i).getItem().weight) * sortedItems.get(i).getItem().value;
				
				System.out.println("Total Profit 1: "+ totalProfit);
				W = 0;
				i++;
				break;
			}else if(W > sortedItems.get(0).getItem().weight ) {
				totalProfit += sortedItems.get(i).getItem().value;
				W = W - sortedItems.get(i).getItem().weight;
				i++;
				
			}
		}
		return totalProfit;
	}

	List<SortedIteams> calculatePerUnitPrice(Item[] arr) {
		List<SortedIteams> sortedItems = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			SortedIteams si = new SortedIteams();
			int profitPerUnit = arr[i].value / arr[i].weight;
			si.setPerUnitProfit(profitPerUnit);
			si.setItem(arr[i]);
			sortedItems.add(si);
			//sortedItems
			

		}
		Collections.sort(sortedItems);
		return sortedItems;
	}

	public static void main(String[] args) {
		FractionalKnapsack fnp = new FractionalKnapsack();

		int W = 87;
		//int[] values = {78,16,94,36,87,43,50,22,63,28,91,10,64,27,41,27,73,37,12,19,68,30,83,31,63,24,68,36,30,3,23,9,70,18,94,7,12,43,30,24,22,20,85,38,99,25,16,21,14,27,92,31,57,24,63,21,97,32,6,26,85,28,37,6,47,30,14,8,25,46,83,46,15,18,35,15,44,1,88,9,77,29,89,35};
		//int[] weight = {4,2,55,50,33,11,77,19,40,13,27,37,95,40,96,21,35,29,68,2,98,3,18,43,53,7,2,31,87,42,66,40,45,20,41,30,32,18,98,22,82,26,10,28,68,7,98,4,87,16,7,34,20,25,29,22,33,30,4,20,71,19,9,16,41,50,97,24,19,46,47,2,22,6,80,39,65,29,42,1,94,1,35,15};
		int N = 84;
		
		
		 W = 50;
		int[] values = {60,100};
		int[] weight = {10,20};
		 N = 2;
		
		
		Item[] arr = new Item[N];
		System.out.println("v length: "+ values.length);
		System.out.println("W length: " + weight.length);
		
		for(int i = 0 ; i<N;i++) {
			Item item = new Item(values[i], weight[i]);
			arr[i] = item;
		}
		
		System.out.println("arr size: "+ arr.length);
		double result = fnp.fractionalKnapsack(W, arr, N);
		System.out.println("Total Profit = "+result);
		
	
		
		
	}

}
