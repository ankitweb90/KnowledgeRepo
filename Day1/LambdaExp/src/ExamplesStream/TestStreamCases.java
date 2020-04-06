package ExamplesStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Stream;

public class TestStreamCases {

	public static void main(String args[]){
		
		Stream<String> str;
		
		List<String> list = new LinkedList<>(Arrays.asList("ankit","natasha","sam","jacob","mehra","stat"));
		
		str = list.stream().filter(p->p.length()>4);
		
		str.forEach(e->System.out.println(e));
		
	}
}
