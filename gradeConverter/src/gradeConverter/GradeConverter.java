//Thora Cummins
//CIS406
//Grade Converter

package gradeConverter;
import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) 
	{
		String cont = "Y";
		String grade = "";
		int score = 0;
		
		while(cont == "Y" || cont == "y")
		{
			Scanner gradeOBJ = new Scanner(System.in);
			System.out.println("Enter numerical grade: ");
			score = gradeOBJ.nextInt();
			
			if (score > 89 && score < 100)
			{
				grade = "A";
				break;
			}
			else
			{
			}
			}
		}

	}

}
