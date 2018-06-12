package jdbc.hr.employees.vo;
//데이터베이스 테이블의 필드와 매칭되는 필드들을 가진  객체
public class employeeVo {
	private Long emplyoeeId;
	private String firstName;
	private String lastName;
	private Float salary;
	public Long getEmployeeId() {
		return emplyoeeId;
	}
	public void setEmployeeId(long emplyoeeId) {
		this.emplyoeeId = emplyoeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}
