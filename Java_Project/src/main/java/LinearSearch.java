import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = {10,12,3,18,14,7,77,50,3};
		int target =3;
		String str = "Gayaahri";
		
		//char strTarget = 'u';
		int result = searchOperation(arr,target);
		//Boolean strResult = searchString(str, strTarget);
		//System.out.println(strResult);
		System.out.println("The index of 14: "+result);
	}
	public static int searchOperation(int arr[], int target) {
		if(arr.length==0) {
			return -1;
		}
		for (int i =1;i<4; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
			
		return -1;
	}
	public static Boolean searchString(String str, char strTarget) {
		int strLength = str.length();
		HashMap<Character,Integer> s=new HashMap<Character,Integer>();
		System.out.println(s);
		char[] strArr = str.toCharArray();
		for(int i=0;i<strLength;i++) {
			if(s.containsKey(strArr[i])) {
				s.put(strArr[i], s.get(strArr[i])+1);
			}
			else {
				s.put(strArr[i],1);
			}			
		}
		System.out.println(s.entrySet());
		//if(s.entrySet())
		for(HashMap.Entry<Character, Integer> ss : s.entrySet()) {
			if(ss.getValue() >1) {
				System.out.println(ss.getKey()+ " "+ ss.getValue());
			}
			
		}
		return false;
	}
}
