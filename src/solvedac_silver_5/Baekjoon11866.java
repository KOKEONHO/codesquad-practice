package solvedac_silver_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon11866 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] array = getArray(N); // 배열 생성해서 리턴해주는 메서드

		ArrayList<Integer> resultList = getArrayList(array, K);

		bw.write("<");
		for (int i = 0; i < resultList.size(); i++) {
			bw.write(Integer.toString(resultList.get(i)));
			if (i != resultList.size() - 1) {
				bw.write(", ");
			}
		}
		bw.write(">");

		bw.flush();
		bw.close();
	}

	public static int[] getArray(int N) {
		int[] array = new int[N];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}

		return array;
	}

	public static ArrayList<Integer> getArrayList(int[] array, int K) {

		ArrayList<Integer> result = new ArrayList<>();

		int initial = -1, cnt = 0;
		while (cnt < array.length) {
			for (int i = 0; i < K; i++) {
				initial++;
				if (initial > array.length - 1) {
					initial -= array.length;
				}
				if (array[initial] == 0) {
					i--;
				} else if (i == K - 1) {
					result.add(array[initial]);
					array[initial] = 0;
					cnt++;
				}
			}
		}

		return result;
	}
}
