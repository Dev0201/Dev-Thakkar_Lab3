package com.closing.brackets;

import java.util.*;

public class Brackets {
	
	static boolean checkingBrackets(String strBrackets) {
		Stack <Character> stack=new Stack<Character>();
		
		for (int i=0;i<strBrackets.length();i++) {
			char character = strBrackets.charAt(i);
			if (character == '{' || character == '[' || character == '(') {
				stack.push(character);
				continue;
			}
			
			if(stack.isEmpty())
				return false;
			
			char c;
			switch (character) {
			case '}':
				c = stack.pop();
				if(c == '[' || c == ')')
					return false;
				break;
			case ')':
				c = stack.pop();
				if(c == '{' || c == '[')
					return false;
				break;
			case ']':
				c = stack.pop();
				if(c == '{' || c == '(')
					return false;
				break;
			}
		}
		return stack.isEmpty();
	
	}
	public static void main (String [] args) {
		String strBracketsExp = "{[()]}";
		Boolean result;
		result = checkingBrackets(strBracketsExp);
		
		if(result)
			System.out.println("Brackets are Balanced");
		else
			System.out.println("Brackets are not Balanced");
		
	}

}
