package lambda.practice.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class app {

	public static void main(String[] args) throws IOException {
		

		//average of squares of an int array
		Arrays.stream(new int[] {4,7,2,8,5,1})
			.map((x) -> x * x)
			.average()
			.ifPresent(n -> System.out.println(n));
		
		
		//Stream form list, filter and print
		List<String> list = Arrays.asList("ankit", "sam", "david", "goliath", "charlotte", "sophie");
		
		list.stream()
				.map(x -> x.toLowerCase())
				.filter(x -> x.startsWith("s"))	
				.sorted()
				.forEach(x -> System.out.println(x));
		
		
		//stream of files
		Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"));
		
		lines.filter(l -> l.length() == 5)
				.sorted()
				.forEach(l -> System.out.println(l));
		
		lines.close();
		
		
		//stream from file and do operations
		Stream<String> data = Files.lines(Paths.get("files/stockDataCsv.txt"));
		
		data.map(x -> x.split(","))
				.filter(x -> x.length > 3)
				.filter(x -> Integer.parseInt(x[1].trim()) > 15)
				.forEach(x -> System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()));
		data.close();
	}

}
