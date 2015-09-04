package com.exercise;

public class Snake {
	
	public static void main(String... args){
	  snake(6);
	  System.out.print("\n\n");
	  snake(4);
	}
	
	public static void snake(int n){
		int[][] m = new int[n][n];
		fillMatriz(m,n);
		printNormal(m,n);
		printLikeSnake(m,n);
	}
	
	public static void fillMatriz(int[][] m,int  n){
	  int index= 1;
	  for(int i=0; i<n; i++){
		  for(int j=0;j<n; j++){
			  m[i][j] = index;
			  index ++;
		  }
	  }
	}
	
	public static void printNormal(int[][] m, int n){
		for(int i=0; i<n; i++){
			  for(int j=0;j<n; j++){
				  System.out.print(m[i][j] +", ");
				  if(j == n-1)
					  System.out.print("\n");
			  }
		  }
	}
	
	public static void printLikeSnake(int[][] m, int n){
		int count=0, dir=0, top=0,left=0, right=n-1, botton=n-1;
		while(count < (n*n)){
			switch(dir){
				case 0:for(int i=left; i<=right;i++){
						System.out.print(m[top][i]+",");
						count++;
					   } 
					  dir=1;
					  top++;
				 	  break;
				
				case 1:for(int i=top; i<=botton;i++){
						System.out.print(m[i][right]+",");
						count++;
				      }
					  dir=2;
					  right--;
					  break;
				
				case 2:for(int i=right; i >= left; i--){
						System.out.print(m[botton][i]+",");
						count++;
				 		}
						dir=3;
						botton--;
						break;
				case 3:for(int i=botton ; i>= top; i--){
						System.out.print(m[i][left]+",");
						count++;
					   }
					  dir=0;
					  left++;
					  break;
			}
		}
	}
	
	
}
