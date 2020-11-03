import java.net.*;
import java.io.*;

public class URLConnectionTest {
	public static void main(String args[]) throws Exception {
		URL kbs = new URL("http://history.kbs.co.kr/");
		URLConnection kbsCon = kbs.openConnection();
		System.out.println("������ Ÿ��: " + kbsCon.getContentType());
		System.out.println("=== ������ ���� ===");
		InputStream input = kbsCon.getInputStream();
		int i = 500;
		int c;
		while (((c = input.read()) != -1) && (--i > 0)) {
			System.out.print((char) c);
		}
		input.close();
	}
}