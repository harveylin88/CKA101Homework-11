package hw7;

import java.io.*;

public class Hw7_1 {
	public static void main(String[] args) {
		File file = new File ("C:\\CKA101_Workspace\\CKA101Homework_11\\src\\hw7\\Sample.txt");
		long byteCount = file.length();
		int charCount = 0;
		int lineCount = 0;
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				lineCount++;
				charCount += line.length();
				charCount += 1;
			}
			System.out.println("Sample.txt檔案共有 " + byteCount + " 個位元組, " + charCount + " 個字元, " + lineCount + " 列資料");

		} catch (IOException e) {
			System.out.println("讀取檔案時出錯了：" + e.getMessage());
		}
	}
}
