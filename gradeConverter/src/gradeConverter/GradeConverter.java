//Thora Cummins
//CIS406
//Grade Converter

package gradeConverter;
import java.util.Scanner;

public class GradeConverter {

	public String continueYesNo()
	{
		Scanner contOBJ = new Scanner(System.in);
		System.out.println("Continue? (y/n): ");
		return contOBJ.nextLine();		
	}
	
	public int getScore()
	{
		Scanner gradeOBJ = new Scanner(System.in);
		System.out.println("Enter numerical grade: ");
		return gradeOBJ.nextInt();		
	}
	
	public static void main(String[] args) 
	{
		String cont = "Y";
		String grade = "";
		int score = 0;
		
		while(cont == "Y" || cont == "y")
		{
			GradeConverter gc = new GradeConverter();	
			score = gc.getScore();
						
			//if (score >= 90 && score <= 100)
			//{
			//	grade = "A";
			//	break;
			//}
		//	else
		//	{
			//	grade = "next";
			//	break;
			//}
			
			System.out.println("Score: "+ score);
			cont = gc.continueYesNo();
		}
	
		System.out.println("\nBYE!!!");

	}

}
