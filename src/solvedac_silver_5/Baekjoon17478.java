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

		bw.write("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		bw.newLine();

		function(bw, N, N);

		bw.flush();
		bw.close();
	}

	public static void function(BufferedWriter bw, int num, int temp) throws IOException {

		for (int i = 0; i < Math.abs(num - temp); i++) {
			bw.write("____");
		}
		bw.write("\"����Լ��� ������?\"");
		bw.newLine();
		if (temp == 0) {
			for (int i = 0; i < Math.abs(num - temp); i++) {
				bw.write("____");
			}
			bw.write("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			bw.newLine();
		} else {
			for (int i = 0; i < Math.abs(num - temp); i++) {
				bw.write("____");
			}
			bw.write("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
			bw.newLine();
			for (int i = 0; i < Math.abs(num - temp); i++) {
				bw.write("____");
			}
			bw.write("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
			bw.newLine();
			for (int i = 0; i < Math.abs(num - temp); i++) {
				bw.write("____");
			}
			bw.write("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
			bw.newLine();
			function(bw, num, temp - 1);
		}
		for (int i = 0; i < Math.abs(num - temp); i++) {
			bw.write("____");
		}
		bw.write("��� �亯�Ͽ���.");
		bw.newLine();
	}
}
