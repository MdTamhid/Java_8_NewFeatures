package tam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClassK {
	
	public static void main(String[] args) throws Exception
	{
		ClassA ob1 = new ClassA();
		System.out.println(ob1.a+" : "+ob1.b);
		System.out.println("Serilization write object into a file");
		
		ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream("D:\\Tam\\Data.ser"));
		System.out.println("Conneciom created");
		fout.writeObject(ob1);
		fout.close();
		
		System.out.println("-------Object data read from a file");
		
		ObjectInputStream fin = new ObjectInputStream(new FileInputStream("D:\\Tam\\Data.ser"));
		System.out.println("Connection created");
		System.out.println("Data Read Sucessfully");
		ClassA h= (ClassA)fin.readObject();
		System.out.println(h.a+" : "+h.b);
		
	}

}
