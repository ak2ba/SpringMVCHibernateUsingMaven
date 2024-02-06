package com.tap.acad;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.EmployeeDAOImpl;
import com.entity.Employee;

@Controller
public class Test {
	ClassPathXmlApplicationContext  ac;
	EmployeeDAOImpl ed;
	public Test(){
		ac = new ClassPathXmlApplicationContext("beans.xml");
		ed = (EmployeeDAOImpl) ac.getBean("edaoi");
	}
	
	@RequestMapping("/")
	public String home() {
		return "homePage";
	}
	
	@RequestMapping("dataInsert")
	public String insert(@RequestParam("empid") int empid, 
			@RequestParam("ename") String ename,@RequestParam("jobrole") String jobrole,
			@RequestParam("dept") String dept,@RequestParam("deptid") int deptid) {
		
		Employee e = new Employee(empid, ename, jobrole,dept, deptid);
		
		String s = ed.insert(e);
		return s+"Insert";
	}
	
	@RequestMapping("delete")
	public String delete(@RequestParam("empid") int empid) {
		String s = ed.delete(empid);
		return s+"Employee";
	}
	
}











