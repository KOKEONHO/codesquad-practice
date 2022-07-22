package solvedac_silver_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon1010_X {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수 입력
		int N, M;

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			double result = getBridges(N, M);
			bw.write(Double.toString(result));
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}

	public static double getBridges(int N, int M) {
		double a = 1, b = 1, result = 1;
		int temp = N;
		for (int i = 0; i < N; i++) {
			a = M--;
			b = temp--;
			result *= a / b;
		}

		return result;
	}
}
