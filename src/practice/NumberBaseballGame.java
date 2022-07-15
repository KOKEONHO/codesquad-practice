package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public class NumberBaseballGame {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean check = true;
		Random rand = new Random();
		int answer = rand.nextInt(899) + 100; // 난수 세자릿수 발생시킴 (100 ~ 999)
		int user;

		while (check) {
			bw.write("숫자를 입력해주세요 ex)123 : ");
			bw.flush();
			user = Integer.parseInt(br.readLine()); // 유저 숫자 입력
			checkUser(bw, answer, user, check); // 체크 메소드로 넘기기
			bw.flush();
		}
		// 일치하면 반복 종료
		bw.write("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n");

		bw.flush();
		bw.close();

	}

	public static void checkUser(BufferedWriter bw, int answer, int user, boolean check) throws IOException {

		String strAns = String.valueOf(answer);
		String strUsr = String.valueOf(user);
		
		
	}
}
