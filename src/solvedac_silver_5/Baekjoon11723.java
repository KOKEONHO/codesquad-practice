package solvedac_silver_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon11723 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String command, number;

		int M = Integer.parseInt(br.readLine());
		ArrayList<String> arrayList = new ArrayList<>();

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			command = st.nextToken();
			switch (command) {
			case "add":
				number = st.nextToken();
				if (!arrayList.contains(number)) {
					arrayList.add(number);
				}
				break;
			case "remove":
				number = st.nextToken();
				if (arrayList.contains(number)) {
					arrayList.remove(number);
				}
				break;
			case "check":
				number = st.nextToken();
				if (arrayList.contains(number)) {
					bw.write("1");
				} else {
					bw.write("0");
				}
				bw.newLine();
				break;
			case "toggle":
				number = st.nextToken();
				if (arrayList.contains(number)) {
					arrayList.remove(number);
				} else {
					arrayList.add(number);
				}
				break;
			case "all":
				arrayList.clear();
				for (int j = 0; j < 20; j++) {
					arrayList.add(Integer.toString(j + 1));
				}
				break;
			case "empty":
				arrayList.clear();
				break;
			}
		}

		bw.flush();
		bw.close();
	}
}
