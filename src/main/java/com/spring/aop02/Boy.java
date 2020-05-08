package com.spring.aop02;

/*
 * 남자(청소년)
 * - 문을 열고 집에 들어갑니다. - 공통 관심사항(before)
 * - 컴퓨터로 게임을 합니다. -핵심 관심사항
 * - 잠을 잡니다. - 공통 관심사항.(after-returningg)
 * - 문을 열고 지브을 퓨ㅠㅠㅠㅠ 나오비다 ㅠㅠㅠㅠ -공통 관심사항.(after)
 * - 화재 발생: 119에 신고 - 공통관심사ㅏㅇ(예외)(after-throwing)
 */
public class Boy implements Person {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터로 게임을 합니다....");
	}

}
