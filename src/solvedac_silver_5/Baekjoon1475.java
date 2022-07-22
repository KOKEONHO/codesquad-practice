package solvedac_silver_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon1475 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] array = new int[9];
		int maximum = Integer.MIN_VALUE;

		String roomNum = br.readLine();

		for (int i = 0; i < roomNum.length(); i++) {
			char ch = roomNum.charAt(i);
			int idx = Character.getNumericValue(ch);
			if (idx == 9) {
				idx = 6;
			}
			array[idx]++;
		}

		if (array[6] % 2 == 0) { // Â¦¼öÀÏ ½Ã
			array[6] /= 2;
		} else { // È¦¼öÀÏ ½Ã
			array[6] /= 2;
			array[6]++;
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] > maximum) {
				maximum = array[i];
			}
		}

		bw.write(Integer.toString(maximum));

		bw.flush();
		bw.close();
	}
}
