package com.hackertest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		//int n;
		
		//n = Integer.parseInt(in.nextLine());
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = null;
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		int n = 0;
		try {
			n = Integer.parseInt(bufferedReader.readLine().trim());
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, n).forEach(i -> {
			try {
				arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int result = Result5.diagonalDifference(arr);
		// int result = Result.diagonalDifference(arr);

		try {
			bufferedWriter.write(String.valueOf(result));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bufferedWriter.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Result5 {

	public static int diagonalDifference(List<List<Integer>> arr) {
		int diag1 = 0;
		int diag2 = 0;
		List<Integer> i12 = new ArrayList();
		
		arr.forEach(System.out::println);
		for (int i = 0; i < arr.size(); i++) {
			//String str[] = in.nextLine().split(" ");
			i12 = arr.get(i);
			i12.forEach(System.out::println);
			//diag1 = diag1 + arr.get(i);
			//diag2 = diag2 + Integer.parseInt(str[n - 1 - i]);
		}

		int diagDiff = Math.abs(diag1 - diag2);
		System.out.println(diagDiff);

		return 1;
	}
}