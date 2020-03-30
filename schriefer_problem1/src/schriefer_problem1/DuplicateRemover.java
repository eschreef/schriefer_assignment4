package schriefer_problem1;

import java.util.Scanner;
import java.util.Set;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.io.File;
import java.io.FileWriter;

public class DuplicateRemover 
{
	private Set<String> unique;
	
	//removes the duplicate words from the txt file
	public void remove(String dataFile) throws FileNotFoundException
	{
		String duplicates;
		unique = new HashSet<String>();
		Scanner scan = new Scanner(new File(dataFile));
		while(scan.hasNext())
		{
			duplicates = scan.next();
			unique.add(duplicates);
		}
		scan.close();
	}
  
	//writes unique words onto the output file
	public void write(String outputFile)
	{
		try
		{
			FileWriter print = new FileWriter(outputFile);
			for (String f1: unique)
			{
				print.write(f1 + "\n");
			}
			print.close();
			System.out.println("Data Written to File");
		}
		catch(Exception e)
		{
			System.out.println("An error has occured while printing the file");
		}
	}
}