package javaconcept;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class JavaStreamExample {

	public static void main(String[] args) {
		Collection<Long> hm1 = Arrays.stream("abaebahscc".split(""))
	            .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting())).values();
	   
	     System.out.println(hm1.stream().sorted().collect(Collectors.toList()));
	}

}
