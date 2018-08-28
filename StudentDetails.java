package com.capgemini.day5.exception;
import java.util.InputMismatchException;
import com.capgemini.day5.exception.AgeNotWithinRangeException;
import com.capgemini.day5.exception.NameNotValidException;
import com.capgemini.day5.domain.Student;
import java.util.Scanner;
public class StudentDetails{
	
	try(Scanner scanner = new Scanner(System.in)){
		
		System.out.print("Please enter your age = ");
		int studentage = scanner.nextInt();
		System.out.print("Please enter your name = ");
		String studentName = scanner.nextLine();
			
		}
	catch(InputMismatchException e1) {
		System.out.println("Please provide valid input");
	}
	catch(AgeNotWithinRangeException | NameNotValidException e) {
		System.out.println(e1.getMessage());
	}
	}
}
