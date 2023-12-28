import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
			System.out.println("welcome to student managment app");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				System.out.println("Press 1 to add Student");
				System.out.println("Press 2 to delete Student");
				System.out.println("Press 3 to display Student");
				System.out.println("Press 4 to exit app");
				int c = Integer.parseInt(br.readLine());
				if(c==1) {
					// add student..
					
					System.out.println("Enter user name : ");
					String name=br.readLine();
					
					System.out.println("Enter user phone : ");
					String phone=br.readLine();
					
					System.out.println("Enter user city : ");
					String city=br.readLine();
					
					//create student object to store student
					
					Student st=new Student(name,phone, city);
					boolean answer = StudentDao.insertStudentToDB(st);
					if(answer) {
						System.out.println("Student is added successfully ...");
					}else {
						System.out.println("something went wrong try again...");
					}
					System.out.println(st);
					
					
				}else if(c==2) {
					//delete student..
				}else if(c==3) {
					//display student..
					
					//exit
					break;
				}else {
					
				}
			}
			System.out.println("thank for using my application");
			System.out.println("see you soon");
	}

}
