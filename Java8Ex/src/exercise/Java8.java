package exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("/Users/ankit/Desktop/file.txt");
		long lines = (Files.lines(path).count())/4;
		int remainder = (int) (lines%4);
		
		int filecount = 0;
		String Line;
		
		BufferedReader reader = new BufferedReader(new FileReader("/Users/ankit/Desktop/file.txt"));
		
		  for (int j=1;j<=4;j++)  
		  {  
		   FileWriter myWriter = new FileWriter("file" + j + ".txt"); 
		   BufferedWriter output = new BufferedWriter(myWriter); 
		   
		   if(j == 4) {
			   lines += remainder;				//added lines for remainder
		   }
		
		  for (int i=1;i<=lines;i++)  
		   {  
		    Line = reader.readLine();   
		    if (Line!= null)  
		    {  
		     output.write(Line);   
		     if(i!=lines)  
		     {  
		      output.newLine();  
		     }  
		    }  
		   }  
		   output.close();  
		  } 
	     
		// now we have 4 files 
		  
		  
		  Stream<String> stream1 = Files.lines(Paths.get("file1.txt"), Charset.defaultCharset());
		  Stream<String> stream2 = Files.lines(Paths.get("file2.txt"), Charset.defaultCharset());
		  Stream<String> stream3 = Files.lines(Paths.get("file3.txt"), Charset.defaultCharset());
		  Stream<String> stream4 = Files.lines(Paths.get("file4.txt"), Charset.defaultCharset());
		  
		  Stream<Stream<String>> str = Stream.of(stream1, stream2, stream3, stream4);
		 
		  Stream<String> str1 = str.flatMap(s -> s);
		  
		 //---------------------------------------xx-----------------------------------------------------
		  
		  Set<String> set = str1.map(s -> s.split("\\s+"))
		  	  .flatMap(Arrays::stream)
		  	  .map(String::toLowerCase)
		  	  .distinct()
		  	  .collect(Collectors.toSet());
		  
		  System.out.println(set.size());
		  
//		  int[] findScore = new int[]{1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
	
		  Map<String, Integer> map = set.stream()
				.collect(Collectors.toMap(e->e, e->getScoreFromStr(e)));
		  
//		  map.entrySet()
//		  .stream()
//		  .sorted(Map.Entry.<String, Integer>comparingByValue())
//		  .forEach(System.out::println);
		  
		 String maxValue =  map.entrySet()
				 			.stream()
				 			.max(Map.Entry.<String, Integer>comparingByValue()).get().getKey();
		  
		 
		 System.out.println("Max score string  - " + maxValue);
		 System.out.println("Max score string value  - " + map.get(maxValue));
		

	}

	private static int getScoreFromStr(String word) {
		
		  int[] findScore = new int[]{1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
		  int wordScore = 0;
		  for(int i=0; i<word.length(); i++) {
			  char alphabet = word.charAt(i);
			  
			  if(Character.isLetter(alphabet)) {
			   int score = findScore[alphabet - 'a'];  
			   wordScore += score;
			  }
		  }
		return wordScore;
	}

}
