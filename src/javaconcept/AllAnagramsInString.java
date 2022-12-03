package javaconcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllAnagramsInString {
	public List<Integer> findAnagrams(String s, String p) {
		ArrayList<Integer> result = new ArrayList<>();

		// System.out.println("S: "+s + " , P: " + p);
		HashMap<Character, Integer> p_map = counter(p);
		HashMap<Character, Integer> prob_map = new HashMap<>();

		for (int i = 0; i <= s.length() - p.length(); i++) {
			String prob_match = s.substring(i, i + p.length());
			// System.out.println("prob_match: " + i + ": " + prob_match);
			if (i == 0)
				prob_map = counter(prob_match);
			else {
				// System.out.println("Before: " + i + ": " + prob_map);
				// System.out.println("add: " + s.charAt(i + p.length() - 1));
				// System.out.println("remove: " + s.charAt(i-1));
				updateMap(prob_map, s.charAt(i + p.length() - 1), s.charAt(i - 1));
				// System.out.println("After: " + i + ": " + prob_map);
			}
			if (p_map.equals(prob_map))
				result.add(i);
		}
		return result;

	}

	HashMap<Character, Integer> counter(String s) {

		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (hm.containsKey(c))
				hm.put(c, hm.get(c) + 1);
			else
				hm.put(c, 1);
		}
		return hm;
	}

	void updateMap(HashMap<Character, Integer> hm, Character a, Character r) {
		if (hm.get(r) == 1)
			hm.remove(r);
		else
			hm.put(r, hm.get(r) - 1);

		if (hm.containsKey(a))
			hm.put(a, hm.get(a) + 1);
		else
			hm.put(a, 1);
	}

	public static void main(String[] args) {
		AllAnagramsInString ana = new AllAnagramsInString();
		List<Integer> res = ana.findAnagrams("abccbabacbbbb", "abc");
		System.out.println("Res: "+ res.toString());

	}

}
