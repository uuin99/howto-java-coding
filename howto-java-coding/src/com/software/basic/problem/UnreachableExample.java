package com.software.basic.problem;

public class UnreachableExample {
	
	public static void main(String[] args) {
		while(true){}
		System.out.println("END");
		// 도달할 수 없는 코드가 메서드 또는 반복문 내에 존재한다는 의미
		// C언어의 경우 이런 오류는 단순 경고로 권고하나 Java에서는 이런 오류는 경고가 아닌 오류를 발생시킴.
	}

}
