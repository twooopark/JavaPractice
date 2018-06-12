package jdbc.hr.employees.dao;

import java.util.List;
import jdbc.hr.employees.vo.employeeVo;

//DAO (Data Access Object): DB를 사용하여 데이터를 조회하거나 조작하는 기능을 전담하도록 만든 오브젝트(트랜잭션 객체)
public interface IemployeeDao {
	public List<employeeVo> getList();
	public List<employeeVo> getListbyName(String keyword);
}
