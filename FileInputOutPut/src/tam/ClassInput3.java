package tam;

import java.io.FileReader;
import java.io.FileWriter;

public class ClassInput3 
{
    @SuppressWarnings("resource")
	void fileOperation() throws Exception
    {
    	System.out.println("Data red from a file");
    	FileReader fr = new FileReader("D:\\Tamhid\\file1.txt");
    	int x;
    	while((x=fr.read())!=-1)
    	{ 
    		
    		System.out.print((char)x);
    		
    	}
    	
    	fr.close();
    }
    
    void fileOperation2() throws Exception
    {
    	System.out.println("Write data into a file");
    	
    	FileWriter fw = new FileWriter("D:\\Tamhid\\file3.txt");
    	String data="Hello Naresh IT";
    	fw.write(data);
    	fw.close();
    }
    
    void fileOperation3() throws Exception 
    {
    	System.out.println("Read data from a file and copy data into a file");
    	FileReader fr1 = new FileReader("D:\\Tamhid\\file1.txt");
    	FileWriter fr2 = new FileWriter("D:\\Tamhid\\file5.txt");
    	int x;
    	while((x=fr1.read())!=-1)
    	{
    		fr2.write(x);
    	}
    	
    	fr1.close();
    	fr2.close();
    }
    public static void main(String[] args) throws Exception 
    {
	    ClassInput3 ob = new ClassInput3();	
	    //ob.fileOperation();
	    //ob.fileOperation2();
	    ob.fileOperation3();
	}
}
