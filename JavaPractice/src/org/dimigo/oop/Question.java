/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ Question
 * 1. 개요 :  
 * 2. 작성일 : 2017. 4. 3. 
 * </pre>
 * @author		: 변은서
 * @version		: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		String[] questions = {"가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?"};
		String[] answers = {"매드클라운", "이민호", "과학"};
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<3; i++){
			System.out.println((i+1)+"."+questions[i]);
			String answer = scanner.nextLine();
			if(answer.equals(answers[i]))
			{
				System.out.println("정답입니다!");
			}
			else
			{
				System.out.println("틀렸습니다!");
			}
		}
		
		System.out.println("<< 결과 출력 >>");
		StringBuilder str1= new StringBuilder();
		str1.append(questions[0]+" ").append(answers[0]).append("입니다.");

		StringBuilder str2= new StringBuilder();
		str2.append(questions[1]+" ").append(answers[1]).append("입니다.");

		StringBuilder str3= new StringBuilder();
		str3.append(questions[2]+" ").append(answers[2]).append("입니다.");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
