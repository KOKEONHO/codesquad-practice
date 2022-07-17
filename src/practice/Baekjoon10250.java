package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon10250 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수 입력
		int H, W, N; // 순서대로 호텔의 층 수, 각 층의 방 수, 손님의 순서

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			String roomNum = decideHotelRoom(H, W, N);

			bw.write(roomNum);
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}

	public static String decideHotelRoom(int H, int W, int N) {
		StringBuilder sb = new StringBuilder();
		String floor, room;
		if (N % H == 0) {
			floor = String.valueOf(H);
		} else {
			floor = String.valueOf(N % H);
		}

		if (N % H == 0) {
			room = String.valueOf(N / H);
		} else {
			room = String.valueOf(N / H + 1);
		}
		sb.append(floor);
		if (room.length() < 2) {
			sb.append("0");
		}
		sb.append(room);

		return sb.toString();
	}
}
