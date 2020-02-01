package beans;

import javax.ejb.Stateless;

@Stateless
public class TestBean {

	public void hello(String name){
		System.out.println(name);
	}
	
}
