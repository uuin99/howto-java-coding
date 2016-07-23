package com.software.basic.problem;

public class BranchingExample {
	public static void main(String[] args) {
		
		// 제어문과 break 문을 이용해 반복문을 종료시키는 예
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			break;
		}
		
		// 제어문과 return 문을 이용해 반복문과 메서드를 종료시키는 예
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			return;
		}
	}

}
