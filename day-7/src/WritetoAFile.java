import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WritetoAFile {
	
	public static void main(String[] args) throws IOException {
		
		
		File file = new File("c://javasessions/sample.txt");
		
		FileWriter writer = new FileWriter(file);
		
		BufferedWriter bfWriter = new BufferedWriter(writer);
		
		
		String str = "I love Java!!";
		
		bfWriter.write(str);
		
		bfWriter.close();
		
		System.out.println("Done....");
		
	
	}

}
