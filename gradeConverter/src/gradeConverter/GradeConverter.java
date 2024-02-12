//Thora Cummins
//CIS406
//Grade Converter

package gradeConverter;
import java.util.Scanner;

public class GradeConverter {

	public String calcGrade(int score)
	{
		String grade = "";
		
		if (score >= 90)
		{
			grade = "A";
		}
		else if (score >= 80 && score < 90)
		{
			grade = "B";
		}
		else if (score >= 70 && score < 80)
		{
			grade = "C";
		}
		else if (score >= 60 && score < 70)
		{
			grade = "D";
		}
		else
		{
			grade = "F";
		}
			
		return grade;
	}
	
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
		
		// Execute while Continue = Yes
		while(cont.toUpperCase() == "Y")
		{
			GradeConverter gc = new GradeConverter();	
			score = gc.getScore();
			grade = gc.calcGrade(score);
					
			System.out.println("Score: "+ score);
			System.out.println("Letter grade: "+grade);
			
			cont = gc.continueYesNo();
			System.out.println("Continue = "+cont);
		}
	
		System.out.println("\nBYE!!!");

	}

}
