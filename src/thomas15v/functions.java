package thomas15v;

import java.util.Arrays;



public class functions {

	static boolean InArray(int[] array, int value){
		return Arrays.asList(array).contains(value);
	}
	
	static boolean InArray(String[] array, String value){
		String bettervalue = value;
		for (String i : array) {
			
			if (!i.contains(":"))bettervalue = value.split(":")[0];
			else bettervalue = value;
			if (i.trim().equalsIgnoreCase(bettervalue)) return true;
		}
		return false;
	}
	
	static int[] StringToIntArray(String value){
		String[] array = value.split(",");
		int[] returnvalue = new int[array.length];
		
		int count = 0;
		for (String i : array) {
			returnvalue[count] = Integer.parseInt(i.trim());
			count++;
		}
		return returnvalue;
	}
}
