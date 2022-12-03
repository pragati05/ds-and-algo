package ds.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Text: AABAACAADAABAABA
Pattern: AABA

Output: Pattern Found at 0, 9 and 12 index

 * @author pragati
 *
 */
public class PatternMatchIndex {

	  public static void main(String[] args) {
	        final String regex = "AABA";
	        final String string = "AABAACAADAABAABA";
	        
	        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
	        final Matcher matcher = pattern.matcher(string);
	        
	        while (matcher.find()) {
	            System.out.println("Full match: " + matcher.group(0));
	            System.out.println("start "+matcher.start() + ", end: "+ matcher.end());
	            
	            for (int i = 1; i <= matcher.groupCount(); i++) {
	                System.out.println("Group " + i + ": " + matcher.group(i));
	            }
	        }
	    }

}
