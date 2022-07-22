package solvedac_silver_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Baekjoon1676 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		BigInteger bigNum = new BigInteger("1");
		BigInteger multiNum;

		for (int i = N; i > 0; i--) {
			multiNum = new BigInteger("" + i);
			bigNum = bigNum.multiply(multiNum);
		} // N! 값 구하기

		int length = bigNum.toString().length();
		int cnt = 0;

		for (int i = length - 1; i >= 0; i--) {
			if (bigNum.toString().charAt(i) == '0') {
				cnt++;
			} else {
				break;
			}
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.flush();
		bw.close();
	}
}
