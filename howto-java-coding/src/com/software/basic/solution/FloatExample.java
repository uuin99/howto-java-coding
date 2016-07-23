package com.software.basic.solution;

public class FloatExample {
	public static void main(String[] args) {
		final int START = 2_000_000_000;
		int count = 0;
		// int 또는 long을 사용하자.
		for (int f = START; f < START + 50; f++) {
			count++;
		}
		System.out.println(count);
	}

}
