import java.util.HashMap;
import java.util.Map.Entry;

public class CountDuplicates {
	public static void main(String[] args) {
		int[] a= {1,2,3,2,9,5,3,5,5,2,2};
		int count=1;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i:a) {
			if(hm.containsKey(i)) {
				hm.put(i,hm.get(i)+1);
			}
			else {
				hm.put(i, 1);
			}
		}
		System.out.println(hm.entrySet());
		for(Entry<Integer, Integer> ss:hm.entrySet()) {
			if(ss.getValue()>1) {
				System.out.println(ss.getKey()+ " "+ss.getValue());
			}
		}
	}
}
