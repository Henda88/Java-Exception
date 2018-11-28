import java.io.*;

class Example {
	public static void main(String args[]) {
		
		FileInputStream fis = null;
		
		try {
		fis = new FileInputStream("C:/fichier.txt");
		
		int k;

		while ((k = fis.read()) != -1)
		{
			System.out.print((char) k);
		}
		
		fis.close();
		}
		
		catch(IOException e) {
			
			e.getMessage();
		}
		
	}
}
