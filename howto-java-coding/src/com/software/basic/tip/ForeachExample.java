package com.software.basic.tip;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ForeachExample {
	
	public static void main(String[] args) {
		
		// 임의의점수를 생성하기 위한 난수 객체
		Random randomScore = new Random();
		
		// 컬렉션 사용
		List<String> studentList = new ArrayList<String>();
		studentList.add("이철수");
		studentList.add("김영희");
		studentList.add("홍길동");
		String[] subjectList = {"국어", "수학", "영어", "국사"};
		
		/**
		 * 아래 코드는 일반적인 for를 사용한 중첩 반복문의 예로,
		 * 반복문을 사용할 때 i와 j라는 부가적인 변수를 생성해야 한다.
		 * 그로 인해 코드의 가독성이 떨어지고
		 * 논리적인 버그가 발생할 가능성이 있다.
		 */
		System.out.println("for를 이용한 성적 목록 출력");
		System.out.println("===================");
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println("학생명: " + studentList.get(i) + "\n");
			
			for (int j = 0; j < subjectList.length; j++) {
				System.out.println("\t과목: " + subjectList[j] + "\t\t점수: " + randomScore.nextInt(100) + 1);
			}
			System.out.println("===================");
		}
		
		/**
		 * foreach를 사용할 경우 불필요한 증감변수가 필요하지 않으며
		 * 코드의 가독성이 상대적으로 높아진다.
		 */
		System.out.println("\n\nforeach를 이용한 성적 목록 출력");
		System.out.println("===================");
		for (String student : studentList) {
			System.out.println("학생명: " + student + "\n");
			for(String subject : subjectList) {
				System.out.println("\t과목: " + subject + "\t\t점수: " + randomScore.nextInt(100));
			}
			System.out.println("===================");
		}
		
	}
	
}
