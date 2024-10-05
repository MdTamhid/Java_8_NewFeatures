package tam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassBufferStream {
	void fileOperation1() throws Exception {
		System.out.println("Read data from a file");
		BufferedInputStream bf1 = new BufferedInputStream(new FileInputStream("D:\\Tamhid\\file5.txt"));
		System.out.println("Connection created");
		int x;
		while ((x = bf1.read()) != -1) {
			System.out.print((char) x);
		}
		bf1.close();
	}

	void fileOperation2() throws Exception {
		System.out.println("Write a data into a file");
		BufferedOutputStream bf2 = new BufferedOutputStream(new FileOutputStream("D:\\Tamhid\\file6.txt"));
		System.out.println("Connection created");
		String data = "I am living in Patna Bihar";
		// bf2.write(data);
		byte[] bs = data.getBytes();
		bf2.write(bs);
		bf2.close();

	}

	void fileOperation3() throws Exception {
		System.out.println("Read the data from a file and copy data into a file");
		BufferedInputStream bf4 = new BufferedInputStream(new FileInputStream("D:\\Tamhid\\file5.txt"));
		BufferedOutputStream bf5 = new BufferedOutputStream(new FileOutputStream("D:\\Tamhid\\file7.txt"));

		System.out.println("Connection created");
		int y;
		while ((y = bf4.read()) != -1) {
			bf5.write(y);
		}
		bf4.close();
		bf5.close();
	}

	 public static void main(String[] args) throws Exception {
		ClassBufferStream ob = new ClassBufferStream();
		// ob.fileOperation1();
		// ob.fileOperation2();
		ob.fileOperation3();
	}
}
