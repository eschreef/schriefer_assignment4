package schriefer_problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter 
{
	private Integer wordCounter;
	private Map<String, Integer> map;
  
	public DuplicateCounter()
	{
		this.wordCounter = 0;
		this.map = new HashMap<>();
	}
  
	public void count(String dataFile) throws FileNotFoundException
	{
		Scanner sc;
		sc = new Scanner(new File(dataFile));
		while(sc.hasNextLine())
		{
			String run = sc.nextLine().trim();				
			String[] words = run.split("[\\W]+");
			for(String word : words)
			{
				this.wordCounter = map.get(word);
				this.wordCounter = (this.wordCounter == null) ? 1 : ++ this.wordCounter;
				map.put(word, this.wordCounter);
			}
		}
		sc.close();
}
  
public void write(String outputFile)	
{
	
	
}
}
