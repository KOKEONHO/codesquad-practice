package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Practice {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int answer = 652;
		int user = Integer.parseInt(br.readLine());

		String strAnswer = String.valueOf(answer);
		String strUser = String.valueOf(user);

		for (int i = 0; i < strUser.length(); i++) {
			if (strAnswer.contains(Character.toString(strUser.charAt(i)))) {
				bw.write(strUser.charAt(i) + " 포함 !!!!");
				bw.newLine();
			} else {
				bw.write(strUser.charAt(i) + " 미포함 !!!!");
				bw.newLine();
			}
		}

		bw.flush();
		bw.close();
	}
}
