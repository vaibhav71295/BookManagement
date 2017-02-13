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
		//input.setBookId(1);
		input.setBookName("python");
		input.setAuthName("ijklm");
		
		input.setBookQuantity(1);
	 	assertEquals(i.saveBook(input),true);
	}
}
