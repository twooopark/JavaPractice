package jdbc.hr.employees.main;

import java.util.Iterator;
import java.util.List;

import jdbc.hr.employees.dao.employeeDao;
import jdbc.hr.employees.vo.employeeVo;

public class HRmain {
	public static void main(String[] args) {
		employeeDao dao = new employeeDao();
		List<employeeVo> list = dao.getList();
		
		Iterator<employeeVo> it = list.iterator();
		
		while(it.hasNext()) {
			employeeVo emp = it.next();
			System.out.println("Id: "+emp.getEmployeeId()+" Name: "+emp.getFirstName()+emp.getLastName()+" sal: "+emp.getSalary());
		}
		
		
	}
}
