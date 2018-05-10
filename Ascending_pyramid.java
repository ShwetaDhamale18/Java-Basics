package day_4;

public class Ascending_pyramid {

	public static void main(String args[]) {
		
	
		int count=4,column=4,count_2=7;
		for(int i=1; i<=4; i++) {
			for(int j=1;j<=column;j++) {
				if(j<count) {
				System.out.print(" ");
			}
				else {
					System.out.print("*");
				}
				
			}
			if (count==0) {
				break;
			}
			System.out.println();
			count--;
			column++;
			
		}
		for (int i=1;i<4;i++) {
			
			for(int j=1;j<count_2;j++) {
				if(j<=i) {
					System.out.print(" ");
			}
				else 
				{
					System.out.print("*");
				}
					
				}
			System.out.println();
			count_2--;
		}
		}
		
			
		}
		

		
			