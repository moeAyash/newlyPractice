package com.java.List;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap();
		tmap.put(22, "Paul");
		tmap.put(33, "John");
		tmap.put(66, "Mina");
		tmap.put(21, "Lee");
		//System.out.println(tmap);
		
		for(Map.Entry<Integer, String> entry : tmap.entrySet()) {
			  Integer key = entry.getKey();
			  String value = entry.getValue();
			 // System.out.println(key + " " + value);
		}
		
		int[] arr= {2,5,8,9,6,7,8,100};
		int max=0;
		for (int i = 1; i < arr.length; i++)
		{
		     if (arr[i] > max)
		     {
		      max = arr[i];
		     }
		}
		System.out.println("The  maximum  is: " + max);
		
		
		
		
		 int count=0;
	        for(int j=0;j<arr.length;j++) {
	            for(int k =j+1;k<arr.length;k++) {
	                if(arr[j]==arr[k]) {
	                    count++;
	                }
	            }
	            if(count==1)
	               System.out.println(arr[j]);
	            count = 0;
	        }
	}

}
