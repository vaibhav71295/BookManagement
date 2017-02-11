package book.mgmt;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class BookDaoImplTest extends TestCase {

	BookDao i;

	
	@Test
	public void testFindByBook()
	{
		ApplicationContext appContext = 
	    		new ClassPathXmlApplicationContext("BeanLocations.xml");
	    	//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    	 i = (BookDao)appContext.getBean("BookDao");
		Book input = new Book();
		input.setBookId(1);
		input.setBookName("java");
		input.setAuthName("pojo");
		
		input.setBookQuantity(1);
		Book result=null;
		try {
			result = i.findByBook("java");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(input.getBookId(),result.getBookId());
	}
}
