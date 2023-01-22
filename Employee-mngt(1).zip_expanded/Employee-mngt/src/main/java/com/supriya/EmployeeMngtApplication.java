package com.supriya;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.CommandLineRunner;
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;

	import com.supriya.entity.Company;
	import com.supriya.entity.Employee;
	import com.supriya.repository.EmployeeRepository;

	@SpringBootApplication
	public class EmployeeMngtApplication implements CommandLineRunner{
		
		@Autowired
		private EmployeeRepository employeeRepository;

		public static void main(String[] args) {
			SpringApplication.run(EmployeeMngtApplication.class, args);
		}

		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			
			Employee emp1=new Employee();
			emp1.setEmpId(11);
			emp1.setEmpName("Mohan_Yadav");
			emp1.setEmpAge(23);
			emp1.setEmpEmail("yadavmohan580@gmail.com");
			emp1.setEmpMobile("9716078550");
			
			Employee emp2=new Employee();
			emp2.setEmpId(12);
			emp2.setEmpName("supriya_sharma");
			emp2.setEmpAge(24);
			emp2.setEmpEmail("supriyasharma@gmail.com");
			emp2.setEmpMobile("9123564578");
			
			Employee emp3=new Employee();
			emp3.setEmpId(13);
			emp3.setEmpName("Pravallika_manda");
			emp3.setEmpAge(25);
			emp3.setEmpEmail("pravallika.manda06@gmail.com");
			emp3.setEmpMobile("8824356098");
			
			Company comp1=new Company();
			comp1.setcId(77);
			comp1.setcName("Hitachi");
			comp1.setcLocation("Delhi");
			comp1.setcPincode(133001);
			
			Company comp2=new Company();
			comp2.setcId(78);
			comp2.setcName("Accenture");
			comp2.setcLocation("Gurugram");
			comp2.setcPincode(122001);
			
			Company comp3=new Company();
			comp3.setcId(79);
			comp3.setcName("Whirpool");
			comp3.setcLocation("Pune");
			comp3.setcPincode(411003);
			
			emp1.setCompany(comp2);
			emp2.setCompany(comp3);
			emp3.setCompany(comp1);
			
			employeeRepository.save(emp1);
			employeeRepository.save(emp2);
			employeeRepository.save(emp3);
			
			System.out.println("Data Saved");
		}

	}

