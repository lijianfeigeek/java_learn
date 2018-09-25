package com.lijianfei.java_learn;

import java.util.Scanner;

public class InputTest {

	private static Scanner console;

	public static void main(String[] args) {
		console = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入课程ID");
			String couresId = console.next();
			System.out.println(couresId);
		}
	}

}
