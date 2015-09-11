
public class StringExamples {
	
	public static void main(String[] args) {
		
		String str=  "RACEsdfsfdsdfgjoasjglkasjgklasdjglkasjglkahglkhagflkhaslkfghaslkghalskjfghlkasjdghlkjasdgkljasdgkjsgkjsgkjashggCAR";
		boolean flag = true;
		for(int i = 0, j = str.length()-1; i!=j || i<j; i++,j--)
		{
			
			
			char leftChar = str.charAt(i);
			char rightChar = str.charAt(j);
			
			System.out.println("leftChar = "+ leftChar + " and rightChar = "+ rightChar);
			
			if(leftChar == rightChar)
			{
				continue;
			}
			else
			{
				System.out.println("String is not palindrome");
				flag = false;
				break;
			}
	   
			
		}
		
		if(flag)
		{
			System.out.println("palindomre");
		}
		
	}

}
