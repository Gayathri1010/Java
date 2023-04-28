import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Initials {
	public static void main(String[] args) {
		int[] arr = {1,7,4,3,7,3,4,3,1,1,1,2};
		System.out.println(arr.length);
		int n=arr.length;
		int k =2;
		HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            if(s.containsKey(arr[i])) {
                s.put(arr[i], s.get(arr[i]) + 1); 
            } else {
                s.put(arr[i], 1);
            } 
           
        }
        
        System.out.println(s);
        for(int i=0; i<5;i++) {
          if(s.get(arr[i])>1) {
        	System.out.println(arr[i]);  
          }
          }
        //System.out.println(-1);
		
	}
	}

