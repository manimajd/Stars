/*
							Stars(*) with loop
Created by:		Mani Majd
Date:			July 14th 2017
Purpose:		Training

*/
public class Stars {

	public static void main(String[] args) {
		
		
//		oneDemintialLoop();
//		System.out.println("___________");
//		System.out.println();
//		twoDemintialLoop();
//		System.out.println("___________");
//		System.out.println();
//		threeDemintialLoop();
//		System.out.println("___________");
//		System.out.println();
//		fourDemintialLoop();
//		
//		
		decreasingStars();
//		System.out.println("___________");
//		System.out.println();
		increasingStars();
	}

	public static void oneDemintialLoop(){
		
				for(int i = 0; i<=4; i++){
					System.out.print("*");
				}//end of first loop
			System.out.println();
		
		
	}// end of simpleStars method
	public static void twoDemintialLoop(){
		for (int i = 0; i<= 4; i++){
				for(int j = 0; j<=4; j++){
					System.out.print("*");
				}//end of first loop
			System.out.println();
		}//end of second loop
		
	}// end of simpleStars method
	
	
	public static void threeDemintialLoop(){
		for (int i = 0; i<= 4; i++){
				for(int j = 0; j<=4; j++){
					System.out.print(" ");
						for(int k=0; k<=2; k++){
							System.out.print("*");
						}//end of third loop
				}//end of second loop
			System.out.println();
		}//end of first loop
		
	}// end of simpleStars method
	
	
	public static void fourDemintialLoop(){
		for (int i = 0; i<= 4; i++){
				for(int j = 0; j<3; j++){
					System.out.print("$");
						for(int k=0; k<=1; k++){
							System.out.print("+");
							for(int l=0; l<=2;l++){
								System.out.print(" * ");
							}
						}//end of third loop
				}//end of second loop
			System.out.println("/");
		}//end of first loop
		
	}// end of simpleStars method
	
	public static void decreasingStars(){
		for (int i = 0; i<= 4; i++){
				for(int j = i; j<=4; j++){
					System.out.print("*");
				}//end of first loop
			System.out.println();
		}//end of second loop
		
	}// end of simpleStars method
	
	
	public static void increasingStars(){
		for (int i = 0; i<= 4; i++){
				for(int j = 0; j<=i; j++){
					System.out.print("*");
				}//end of first loop
			System.out.println();
		}//end of second loop
		
	}// end of simpleStars method
}
