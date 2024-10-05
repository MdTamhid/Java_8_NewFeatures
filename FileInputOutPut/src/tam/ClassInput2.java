package tam;

import java.io.*;

public class ClassInput2 {
	void fileOperation1() throws Exception // Read data from a file
	{
		System.out.println("Connection created data reading from a file");
		FileInputStream fi1 = new FileInputStream("D:\\Tamhid\\file1.txt");
		int a;
		while ((a = fi1.read()) != -1) {
			System.out.print((char) a);

		}
		fi1.close();

	}

	void fileOperation2() throws Exception // Data write data into a file
	{
		System.out.println("Connection created data wrtie into a file");
		FileOutputStream fi2 = new FileOutputStream("D:\\Tamhid\\file2.txt");
		String data = "Hey Tamhid this is for practice purpose";
		byte[] bs = data.getBytes();
		fi2.write(bs);

		fi2.close();
	}

	@SuppressWarnings("resource")
	void filedatareadandcopy() throws Exception // Read data from a file and copy into another file
	{
		System.out.println("Read data from a file and copy data into a another file");
		FileInputStream fi3 = new FileInputStream("D:\\Tamhid\\file1.txt");
		FileOutputStream fi4 = new FileOutputStream("D:\\Tamhid\\file3.txt");
		int x;
		while ((x = fi3.read()) != -1) {
			fi4.write(x);
		}
	}

	public static void main(String[] args) throws Exception {
		ClassInput2 ob = new ClassInput2();
		// ob.fileOperation1();
		// ob.fileOperation2();
		ob.filedatareadandcopy();
	}
}
