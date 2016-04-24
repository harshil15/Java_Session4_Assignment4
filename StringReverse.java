package acadgild;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is Palindrome";
		String[] str = s.split(" ");
		System.out.println(str.length);
		char[] chrarray;
		for(int i = str.length-1; i >= 0; i--){
			chrarray = str[i].toCharArray();
			for(int j=chrarray.length-1; j>=0; j--){
				System.out.print(chrarray[j]);
			}
			System.out.print(" ");
		}
	}

}
