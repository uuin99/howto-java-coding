package com.software.basic.solution;

import org.junit.Before;
import org.junit.Test;

public class IfExampleTest {
	
	private static String param;
	
	/**
	 * @Before 애노테이션을 이용하면
	 * if(true)로 무조건 조건을 통과하도록 수정하는 것이 아닌
	 * 아래의 메서드와 같이 원본 코드를 수정할 필요 없이
	 * 필요한 모의 상황을 만들어서 테스트할 수 있다.
	 */
	@Before
	public void setParam() {
		param = "admin";
	}

	@Test
	public void test() {
		boolean isAdmin = "admin".equals(param);
		
		// 원래는 관리자임을 확인하고 진행해야 하는 코드지만
		// 개발자가 임의로 프로세스 진행을 확인하기 위해 임의로 수정한 조건문
		if(isAdmin) {
			System.out.println("관리자입니다.");
			
			/**
			 * 길고 긴 코드
			 */
		}
	}

}
