package com.software.basic.problem;

public class FloatExample {
	public static void main(String[] args) {
		final int START = 2000000000;
		int count = 0;
		for (float f = START; f < START + 50; f++) {
			count++;
		}
		// 아래의 결과는 몇 일까? 50?
		System.out.println(count);
	}
}
