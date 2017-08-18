import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	private static Stack<Character> st = new Stack<>();

    public static void main(String[] args) throws Exception{
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s = bi.readLine();
        
		System.out.println(balanceDelim(s));
	}

	private static String balanceDelim(String s){
		for(char ch: s.toCharArray()){
			switch(ch){
				case '(':
				case '[':
				case '{':
					st.push(ch);
					break;
				case ')':
					if(st.empty() || '(' != st.pop())
						return "False";
					break;
				case ']':
					if(st.empty() || '[' != st.pop())
						return "False";
					break;
				case '}':	
					if(st.empty() || '{' != st.pop())
						return "False";
					break;
				default:
					break;
			}
		}		
		return st.empty() ? "True" : "False";
	}
}
