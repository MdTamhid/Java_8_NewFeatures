package tam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassDataOutPutStream 
{
	@SuppressWarnings("resource")
	void fileoperation() throws Exception 
	{
		System.out.println("Implementing DataStream");
		DataOutputStream da = new DataOutputStream(new FileOutputStream("D:\\Tamhid\\file8.txt"));
		System.out.println("Connection Created");
		da.writeInt(20);
		da.writeChar('A');
		da.writeBoolean(true);
		da.writeInt(200);

		da.close();
		
		DataInputStream dac = new DataInputStream(new FileInputStream("D:\\Tamhid\\file8.txt"));
       System.out.println("-----------Connection Created--------------");
       
       System.out.println(dac.readInt());
       System.out.println(dac.readChar());
       System.out.println(dac.readBoolean());
       System.out.println(dac.readInt());
       
       System.out.println("Data Retrived sucessfully!!");
       
       dac.close();
	}
	
	public static void main(String[] args) throws Exception 
	{
	   ClassDataOutPutStream ob = new ClassDataOutPutStream();	
	   ob.fileoperation();
	}
}
