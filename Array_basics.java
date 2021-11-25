package arrayLearning;

import java.util.Scanner;

public class Array_basics {

	public static void main(String[] args) {
		int total_marks = 0;
		int max_mark = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Subjects :");
		int len = s.nextInt();

		int[] marks = new int[len];

		System.out.println("Enter marks: ");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = s.nextInt();
		}
		
		System.out.println("Students marks :");
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);

		}

		for (int i = 0; i < marks.length; i++) {
			total_marks = total_marks + marks[i];
		}
		System.out.println("Total marks :" + total_marks);
		
		System.out.println("Average :" + total_marks / marks.length);

		for (int i = 0; i < marks.length; i++) {
			if (marks[i] > max_mark) {
				max_mark = marks[i];
			}
		}System.out.println("Highest Score :" + max_mark);

		
		int min_mark = marks[0];
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < min_mark) {
				min_mark = marks[i];
			}
		}System.out.println("Minimum Score :" + min_mark);

		
		System.out.println("Marks divied by 10 :");
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] % 10 == 0) {
				System.out.println(marks[i]);
			}
		}

		System.out.println("Searching particular mark :");
		int search = s.nextInt();
		boolean got = false;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] == search) {
				System.out.println("Mark present at " + i + " Position");
				got = true;
				break;
			}

		}if (got == false) {
			System.out.println("Mark not found.");
		}

	}

}
