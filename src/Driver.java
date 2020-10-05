import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver
{
	public static void main(String[] args) throws FileNotFoundException
	{
		BibleBook[] books = new BibleBook[27];
		
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/info.dat"));
		//Scanner user = new Scanner(System.in);
		//System.out.print("Enter a key word/s: ");
		//String s = user.nextLine();
		
		int pos = 0;
		while(input.hasNext())
		{
			books[pos] = new BibleBook(input.nextLine());
			books[pos].display();
			pos++;
		}
		input.close();
	}
}