import javax.swing.text.StyledEditorKit.BoldAction;


public class StringExample {
	
	public static void main(String[] args) {
		
		String sentence = "The actor posted the update posted on his micro the blogging actor page";
		
		String wordArray[] = sentence.split(" ");
		
		int idx = 0;
		for(String s : wordArray)
		{
			int wordCount = 0;
			
			boolean flag = false;
			
			if(isAlreadyDone(wordArray, s, idx))
			{
			
			for(String s1 : wordArray)
			{
				if(s.equalsIgnoreCase(s1))
						{
					        wordCount++;
						}
			}
			flag = true;
			}
			if(flag)
			System.out.println("The word "+ s + " appeared "+ wordCount + " times.");
			
			idx ++;
			
		}
		
		
		
	}
	
	public static boolean isAlreadyDone(String arr[], String str, int index)
	{
		for(int i = index-1; i >=0; i--)
		{
			if(arr[i].equalsIgnoreCase(str))
			{
				return false;
			}
		}
		
		return true;
		
	}
	
	
}
