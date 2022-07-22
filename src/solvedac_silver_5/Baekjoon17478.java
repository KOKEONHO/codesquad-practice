package solvedac_silver_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon17478 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		bw.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		bw.newLine();

		function(bw, N, N);

		bw.flush();
		bw.close();
	}

	public static void function(BufferedWriter bw, int num, int temp) throws IOException {

		for (int i = 0; i < Math.abs(num - temp); i++) {
			bw.write("____");
		}
		bw.write("\"재귀함수가 뭔가요?\"");
		bw.newLine();
		if (temp == 0) {
			for (int i = 0; i < Math.abs(num - temp); i++) {
				bw.write("____");
			}
			bw.write("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
			bw.newLine();
		} else {
			for (int i = 0; i < Math.abs(num - temp); i++) {
				bw.write("____");
			}
			bw.write("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
			bw.newLine();
			for (int i = 0; i < Math.abs(num - temp); i++) {
				bw.write("____");
			}
			bw.write("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
			bw.newLine();
			for (int i = 0; i < Math.abs(num - temp); i++) {
				bw.write("____");
			}
			bw.write("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
			bw.newLine();
			function(bw, num, temp - 1);
		}
		for (int i = 0; i < Math.abs(num - temp); i++) {
			bw.write("____");
		}
		bw.write("라고 답변하였지.");
		bw.newLine();
	}
}
