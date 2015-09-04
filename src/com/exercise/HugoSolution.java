package com.exercise;

public class HugoSolution {
	
	public static void main(String[] strings){
		
		int n = 6;
		int value = 0;
		int controller1 = 1;
		int controller2 = n;
		int scope = n;
		
		StringBuilder result = new StringBuilder();
		for(int iterate = 1 ; iterate<= scope; iterate++){
			
			for(int index = 1; index <= n; index++ ){
				value+=controller1;
				result.append(value + ",");
			}

			n--;
			
			for(int index = 1; index <= n; index++ ){
				value+=controller2;
				result.append(value + ",");
			}
			
			controller1*=-1;
			controller2*=-1;
		}
		
		result.deleteCharAt(result.lastIndexOf(","));
		System.out.println(result);
		
	}

}
