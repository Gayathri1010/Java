
public class LetterSearch {
	public static void main(String[] args) {
		char[] letters = {'a','c','f','j'};
		char target = 'b';
		System.out.println(findLetter(letters,target));
		
	}
	public static char findLetter(char[] letters, char target) {
		int start = 0; //0 
		int end = letters.length -1; //2 //0
		while(start<=end) {
			int mid = start + (end-start)/2; //1 //0
			if(letters[mid]>target) {
				end = mid-1; 
			}
			else if(letters[mid] <target) {
				start=mid+1;
			}
			else if(letters[mid]==target) {
				return letters[mid];
			}
		}
		return letters[end];
	}
}
