package codes.Implementation;

import java.util.Scanner;
/*For Division 1: 1900≤rating
For Division 2: 1600≤rating≤1899
For Division 3: 1400≤rating≤1599
For Division 4: rating≤1399
*/


public class Division {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			
			int rating=sc.nextInt();
			if(rating>=1900) {
				System.out.println("Division 1");
			}
			else if(rating >=1600 && rating <=1899) {
				System.out.println("Division 2");
				
			}
			
			else if(rating>=1400 && rating <=1599)
				System.out.println("Division 3");
			
			else if(rating <=1399)
				System.out.println("Division 4");
		}

	}

}
