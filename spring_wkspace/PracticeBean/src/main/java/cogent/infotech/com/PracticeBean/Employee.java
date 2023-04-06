package cogent.infotech.com.PracticeBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.annotation.*;

public class Employee  {

	private String name;
	private int empNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	@Override
	public String toString() {
		
		return "Employee[No" + empNo +"]";
		
	}
	
	/*
	 * This approach is for annotations. 
	 */
	@PostConstruct
	public void init() {
		System.out.println("We are in init");
	}
	
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("We are in destroy");
	}
	
	/*
	 * This is for utilizing spring interface disposable bean and initializing bean. 
	 * Class must implement disposablebean and initializing bean
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Inside after property set method");
		
	}
	*/
}
