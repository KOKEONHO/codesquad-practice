package solvedac_silver_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon10815 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int[] user, check;

		int N = Integer.parseInt(br.readLine());
		user = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < user.length; i++) {
			user[i] = Integer.parseInt(st.nextToken());
		}

		int M = Integer.parseInt(br.readLine());
		check = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < check.length; i++) {
			check[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(user); // user 배열 정렬 (정렬을 해야 이진탐색이 가능)

		for (int i = 0; i < check.length; i++) {
			int result = binarySearch(user, check[i], 0, user.length - 1);
			bw.write(result + " ");
		}

		bw.flush();
		bw.close();
	}

	public static int binarySearch(int[] user, int key, int low, int high) {

		int mid; // 중간값

		while (low <= high) {
			mid = (low + high) / 2;
			if (key == user[mid]) {
				return 1;
			} else if (key < user[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return 0;
	}
}
