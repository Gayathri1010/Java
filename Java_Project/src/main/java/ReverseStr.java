
public class ReverseStr {
	public static void main(String[] args) {
		String str  ="Geeks";
		String[] str1;
		str1 = str.split("");
		String str2="";
		for(int i=str1.length-1;i>=0;i--) {
			str2+=str1[i];
		}
		System.out.println(str2);
	}
}
