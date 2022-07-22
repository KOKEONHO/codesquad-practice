package solvedac_silver_5;

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

		// 서로 다른 3개의 숫자로 이루어진 임의의 세자릿 수 정하기 (100 ~ 999)
		String answer = createRandomNumber();
		while (true) {
			bw.write("숫자를 입력해주세요 ex)123 : ");
			bw.flush();

			// 유저 숫자 입력
			String user = br.readLine();
			int strikeCnt = strikeCheck(answer, user);
			int ballCnt = ballCheck(answer, user);

			if (strikeCnt != 0) {
				bw.write(strikeCnt + " 스트라이크 ");
			}
			if (ballCnt != 0) {
				bw.write(ballCnt + " 볼");
			}
			if (strikeCnt == 0 && ballCnt == 0) {
				bw.write("낫싱");
			}
			bw.newLine();
			if (strikeCnt == 3) {
				break;
			}
		}
		bw.write("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
		bw.flush();
		bw.close();

	}

	public static String createRandomNumber() {

		StringBuilder sb = new StringBuilder();
		Random rand = new Random();
		int number;

		for (int i = 0; i < 3; i++) {
			number = rand.nextInt(9) + 1;
			if (!sb.toString().contains(String.valueOf(number))) {
				sb.append(String.valueOf(number));
			} else
				i--;
		}
		return sb.toString();
	}

	public static int strikeCheck(String answer, String user) {

		int strikeCnt = 0;
		for (int i = 0; i < user.length(); i++) {
			if (containsSameIdxCheck(answer, user, i)) {
				strikeCnt++;
			}
		}
		return strikeCnt;
	}

	public static boolean containsSameIdxCheck(String answer, String user, int index) {
		if (answer.contains(Character.toString(user.charAt(index)))) {
			if (answer.indexOf(user.charAt(index)) == index) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static int ballCheck(String answer, String user) {
		int ballCnt = 0;
		for (int i = 0; i < user.length(); i++) {
			if (containsNotSameIdxCheck(answer, user, i)) {
				ballCnt++;
			}
		}
		return ballCnt;
	}

	public static boolean containsNotSameIdxCheck(String answer, String user, int index) {
		if (answer.contains(Character.toString(user.charAt(index)))) {
			if (answer.indexOf(user.charAt(index)) != index) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
