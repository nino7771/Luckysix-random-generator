package com.loto;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class LuckySix {

	public static void main(String[] args) {
		Random random = new Random();
		
		int [] array = new int[36];
		
		for(int i=0;i<array.length;i++) {
			boolean isDuplicate = false;
			int a = random.nextInt(49);
			
			for(int j=0;j<array.length;j++) {
				if(array[j]==a || a==0) {
					System.out.println("inside if statement");
					i--;
					j=0;
					isDuplicate = true;
					break;
				}
			}
			
			if(isDuplicate)
				continue;
			array[i]=a;
			}
		
		Arrays.sort(array);
		
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" , ");
		/*
		 Random randNum = new Random();
	      Set<Integer>set = new LinkedHashSet<Integer>();
	      while (set.size() < 36) {
	         set.add(randNum.nextInt(48)+1);
	      }
	      System.out.println(set);
		
		*/
		
		
	}//main method

}
