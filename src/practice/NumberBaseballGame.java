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
		int answer = rand.nextInt(899) + 100; // ���� ���ڸ��� �߻���Ŵ (100 ~ 999)
		int user;

		while (check) {
			bw.write("���ڸ� �Է����ּ��� ex)123 : ");
			bw.flush();
			user = Integer.parseInt(br.readLine()); // ���� ���� �Է�
			checkUser(bw, answer, user, check); // üũ �޼ҵ�� �ѱ��
			bw.flush();
		}
		// ��ġ�ϸ� �ݺ� ����
		bw.write("3���� ���ڸ� ��� �����̽��ϴ�! ���� ����\n");

		bw.flush();
		bw.close();

	}

	public static void checkUser(BufferedWriter bw, int answer, int user, boolean check) throws IOException {

		String strAns = String.valueOf(answer);
		String strUsr = String.valueOf(user);
		
		
	}
}
