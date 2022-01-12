package testPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseString {
	  public static String reverseWords(String message) {
		
		Stack s = new Stack();
		char[] ch = message.toCharArray();
		for(int i=0;i<=message.length()-1;i++)
		{
			s.push(ch[i]);
		}
		
		StringBuilder strB = new StringBuilder();
		for(int i=0;i<=message.length()-1;i++)
		{
			strB.append(s.pop());
		}
		String reverseStr = strB.toString();
		
		return reverseStr;
		}
	

public static void main(String[] args)
{
	String word = "Being Remote is awesome";
	reverseWords(word);
}

}
