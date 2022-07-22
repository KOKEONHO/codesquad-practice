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

		// ���� �ٸ� 3���� ���ڷ� �̷���� ������ ���ڸ� �� ���ϱ� (100 ~ 999)
		String answer = createRandomNumber();
		while (true) {
			bw.write("���ڸ� �Է����ּ��� ex)123 : ");
			bw.flush();

			// ���� ���� �Է�
			String user = br.readLine();
			int strikeCnt = strikeCheck(answer, user);
			int ballCnt = ballCheck(answer, user);

			if (strikeCnt != 0) {
				bw.write(strikeCnt + " ��Ʈ����ũ ");
			}
			if (ballCnt != 0) {
				bw.write(ballCnt + " ��");
			}
			if (strikeCnt == 0 && ballCnt == 0) {
				bw.write("����");
			}
			bw.newLine();
			if (strikeCnt == 3) {
				break;
			}
		}
		bw.write("3���� ���ڸ� ��� �����̽��ϴ�! ���� ����");
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
