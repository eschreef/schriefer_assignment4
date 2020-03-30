package schriefer_problem2;

import java.io.FileNotFoundException;

public class Application 
{
	  private static final String INPUT_FILE = "problem2.txt";
	  private static final String OUTPUT_FILE = "unique_word_counts.txt";
  
	  public static void main(String[] args) throws FileNotFoundException
	  {
		  DuplicateCounter counting = new DuplicateCounter();
		  counting.count(INPUT_FILE);
		  counting.write(OUTPUT_FILE);
	  }
}
