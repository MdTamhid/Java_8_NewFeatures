package Lamda;
@FunctionalInterface
public interface FunctionInterfaceDemo {
	
	void singleAbstMehotd();
	
	// void singleAbstMehotd2();
	
	default  void printName() {
		System.out.println("Hello Tamhid!!"+"\n"+"How are you?");
	}
	

}
