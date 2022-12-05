package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("UwU TEST 1: department findbyId UwU");
		Department department = departmentDao.findById(3);

		System.out.println(department);
		
		System.out.println("\nUwU TEST 2: department findAll UwU");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\nUwU TEST 3: department insert UwU");
		Department newDepartment = new Department(null, "Anime Merch");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\nUwU TEST 4: department update UwU");
		department = departmentDao.findById(1);
		department.setName("Gaming Computers");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\nUwU TEST 5: department delete UwU");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}

}
