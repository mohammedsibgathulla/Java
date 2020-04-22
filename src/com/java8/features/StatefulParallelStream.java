package com.java8.features;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Java 8 Stream API Limitations
 * Java 8 Stream API brings a lot of new stuffs to work with list and arrays, but it has some limitations too.
 * 
 * Stateless lambda expressions: If you are using parallel stream and lambda expressions are stateful, it can result in random responses. 
 * See the below simple program.
 * 
 * If you run the program, you will get different results because it depends on the way stream is getting iterated and we don’t have any
 * order defined for parallel processing. If we use sequential stream, then this problem will not arise.
 * Once a Stream is consumed, it can’t be used later on. As you can see in above examples that every time I am creating a stream.
 * There are a lot of methods in Stream API and the most confusing part is the overloaded methods. It makes the learning curve time taking.
 * 
 */
public class StatefulParallelStream {

	public static void main(String[] args) {

		List<Integer> ss = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		List<Integer> result = new ArrayList<Integer>();
		 
		Stream<Integer> stream = ss.parallelStream();
		 
		stream.map(s -> {
		        synchronized (result) {
		          if (result.size() < 10) {
		            result.add(s);
		          }
		        }
				return s;
		    }).forEach( e -> {});
		 System.out.println(result);   
	}
}