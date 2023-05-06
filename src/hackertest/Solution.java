package com.hackertest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    	//arr.stream().filter(a -> (a > 0)).forEach(System.out::println);
    	long posNum = arr.stream().filter(a -> (a > 0)).count();
    	long negNum = arr.stream().filter(a -> (a < 0)).count();
    	long zeroCnt = arr.stream().filter(a -> (a == 0)).count();
    	int arrCnt = arr.size();
    	
    	System.out.println("Pos cnt>>>"+posNum+"Neg Cnt "+negNum+" zero cnt"+zeroCnt+" size "+arrCnt);
    	double r = (double)posNum/arrCnt;
    	double r1 = (double)negNum/arrCnt;
    	double r2 = (double)zeroCnt/arrCnt;
    	DecimalFormat df = new DecimalFormat();
    	df.setMaximumFractionDigits(6);
    	System.out.println("proportion of pos>>>"+r+" r1 "+df.format(r1));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

       // int n = Integer.parseInt(bufferedReader.readLine().trim());

        /*List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());*/
        
        List<Integer> arr1 = Arrays.asList(1,4,5,-1,0,-3);

        Result.plusMinus(arr1);

        bufferedReader.close();
    }
}


