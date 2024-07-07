package in.ineuron.controller;

import java.util.Scanner;

import in.ineuron.service.IStudentService;
import in.ineuron.servicefactory.StudentServiceFactory;

//controller logic
public class TestApp {

	public static void main(String[] args) {

		IStudentService studentService = StudentServiceFactory.getStudentService();

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the student name :: ");
		String sname = scanner.next();

		System.out.print("Enter the student age :: ");
		int sage = scanner.nextInt();

		System.out.print("Enter the student addres :: ");
		String saddress = scanner.next();

		String msg = studentService.addStudent(sname, sage, saddress);
		if (msg.equalsIgnoreCase("success")) {
			System.out.println("record inserted succesfully");
		} else {
			System.out.println("record insertion failed....");
		}

		scanner.close();

	}

}
