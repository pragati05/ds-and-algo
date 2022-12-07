package ds.dp;

public class Fractionalknapsack3 {


    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int capacity, Item arr[], int n) 
    {
        // Sorting items by value/weight ratio;
		Arrays.sort(arr, new Comparator<Item>() {
			@Override
			public int compare(Item item1,
							Item item2)
			{
				double cpr1
					= new Double((double)item1.value
								/ (double)item1.weight);
				double cpr2
					= new Double((double)item2.value
								/ (double)item2.weight);

				if (cpr1 < cpr2)
					return 1;
				else
					return -1;
			}
		});

		double totalValue = 0d;

		for (Item i : arr) {

			int curWt = (int)i.weight;
			int curVal = (int)i.value;

			if (capacity - curWt >= 0) {

				// this weight can be picked while
				capacity = capacity - curWt;
				totalValue += curVal;
			}
			else {

				// Item cant be picked whole
				double fraction
					= ((double)capacity / (double)curWt);
				totalValue += (curVal * fraction);
				capacity
					= (int)(capacity - (curWt * fraction));
				break;
			}
		}

		return totalValue;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math.min(0, 0)

	}

}
