package tam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ClassFileInput 
{
    void fileOperation1() throws Exception
    {
    	System.out.println("Reading the data from a file");
    	FileInputStream fi1 = new FileInputStream("D:\\Tam\\file1.txt.txt");
        System.out.println("Connection created");   
        int a;
        while((a=fi1.read())!=-1)
        {
        	System.out.print((char)a);
        }
        System.out.println();
        System.out.println("Data Rrtirived sucessfully");
        fi1.close();
    }
    
    @SuppressWarnings("resource")
	void fileOperation2() throws Exception
    {
    	System.out.println("Data written into a file");
    	FileOutputStream fi2 = new FileOutputStream("D:\\Tam\\file2.txt.txt",true);
        String data=", java is awesome";
        byte[] bs = data.getBytes();
        fi2.write(bs);
        System.out.println("Data Written");
        fi2.close();
    }
    
    void fileOperation3() throws Exception
    {
    	System.out.println("Connection created");
    	FileInputStream fi1 = new FileInputStream("D:\\Tam\\pic1.jpg");  
    	FileOutputStream fi2 = new FileOutputStream("D:\\Tam\\pic2.jpg");
    	int x;
    	while((x=fi1.read())!=-1)
    	{
    		fi2.write(x);
    	}
    	
    	System.out.println("data write");
    	
    }
    
    public static void main(String[] args) throws Exception 
    {
	    ClassFileInput input = new ClassFileInput();
	    //input.fileOperation1();
	   // input.fileOperation2();
	    input.fileOperation3();
	}
}
