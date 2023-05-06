package com.hackertest;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MinMaxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	      /*  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        List<Integer> arr = null;
			try {
				arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				    .map(Integer::parseInt)
				    .collect(toList());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
*/
			List<Integer> arr1 = Arrays.asList(256741038,623958417,467905213,714532089,938071625);
	        Result1.miniMaxSum(arr1);

	      /*  try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
	    }
	

}
class Result1 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    	
    	List<Long> sumArr = new ArrayList<>();
    	for(int i = 0;i<5;i++) {
    		List<Integer> newList = arr.stream().collect(toList());
    	
    		newList.remove(i);
    	
    	long sum1 = newList.stream().mapToLong(Integer::intValue).sum();
    	
    	System.out.println("sum value>>>"+sum1);
    	sumArr.add((long) sum1);
    	
    	}
    	
    	long minVal = sumArr.stream().min(Long::compare).get();
    	long maxVal = sumArr.stream().max(Long::compare).get();
    	System.out.println(minVal+" "+maxVal);
    	
    }

}
