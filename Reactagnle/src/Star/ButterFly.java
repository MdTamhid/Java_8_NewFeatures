package Star;

public class ButterFly {
	
	public static void main(String[]args)
	{
		
		 int space = 2*4-1;  
	        int star = 3;  
	                for(int j = 0; j <= 2*space-1; j++){  
	                        if(j <= space){  
	                            space = space - 2;  
	                            star++;
	                            //break;
	                        }  
	                        else {  
	                            space = space + 2;  
	                            star--;  
	                        }   
	                        for(int m = 1; m <= star; m++){  
	                         System.out.print("*");  
	                        }    
	                        for(int n = 1; n <= space; n++){  
	                            System.out.print(" ");  
	                        }   
	                        for(int p = 1; p <= star; p++){  
	                            if(p != space){
	                            	
	                            	
	                    System.out.print("*"); 
	                   
	                }  
	                        }  
	                        System.out.println();  
	                        
	                        break;
	                }  
	                
	             
		            
	}
}
		
	
	
		
	

