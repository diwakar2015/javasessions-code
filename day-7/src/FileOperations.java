import java.io.File;


public class FileOperations {
	
	
	public static void main(String[] args) throws Exception {
		
		// 1. Get the file object
		File file = new File("C://javasessions");
		
		File lisOfFilesAndFolders[] = file.listFiles();
		
		for(File s : lisOfFilesAndFolders )
		{
			
			if(s.isDirectory())
			{
				File f1[] = s.listFiles();
				
				for(File df : f1)
				{
					System.out.println(df.getAbsolutePath());
				}
				
			
			}
			else
			{
				System.out.println(s.getAbsolutePath());
			}
			
			
		}
		
		
		
		/*
		
		
		HashMap<String, Integer> itemCount = new HashMap<String, Integer>();
		
		if(file.exists())
		{
			// 2
			FileReader reader = new FileReader(file);
			
			//3
			BufferedReader br = new BufferedReader(reader);
			
			String str = "";
			while((str = br.readLine())!=null)
			{
				//System.out.println("Line read by reader = > "+ str);
				
				String data[] = str.split(",");
				
				String itemName = data[0];
				
				//System.out.println("Item name : "+ itemName);
				
				if(itemCount.get(itemName)==null)
				{
					itemCount.put(itemName, 1);
				}
				else
				{
					int getCount = itemCount.get(itemName);
					getCount ++;
					
					itemCount.put(itemName, getCount);
				}
				
			}
			
			
			
			
			System.out.println("Printing all the counts of items which has been sold today");
			
			for(Map.Entry<String, Integer> entry : itemCount.entrySet())
			{
				System.out.println("Item name "+ entry.getKey() + " Unit sold : "+ entry.getValue());
				
			}
			
			
	
		}
		
		else
		{
			System.out.println("There is no such file present in the provided path!");
		}
		
		*/
		
		
		
	}

}
