package book.mgmt;

import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args ) throws IOException
	    {
	    	ApplicationContext appContext = 
	    		new ClassPathXmlApplicationContext("BeanLocations.xml");
	    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    	BookDao bookBo = (BookDao)appContext.getBean("BookDao");
	    	while(true)
	    	{
	    		System.out.println("Choose");
	    		System.out.println("1.Add User");
	    		System.out.println("2.Remove User");
	    		System.out.println("3.Update Details of User");
	    		System.out.println("4.List All User");
	    		System.out.println("5.Add Book");
	    		System.out.println("6.Remove Book");
	    		System.out.println("7.Update Quantity of Book");
	    		System.out.println("8.Issue Book");
	    		System.out.println("9.ReIssue a Book");
	    		System.out.println("10.Availaibilty of Book");
	    		System.out.println("11.Books issued by a user");
	    		
	    		int choice=Integer.parseInt(reader.readLine());
	    		
	    		switch(choice)
	    		{
	    		case 1:
	    		//Book book=bookBo.findByBook("java");
	    		//System.out.println(book.getBookName());
	    		User user=new User();
	    		String name=reader.readLine();
	    		String mobile=reader.readLine();
	    		user.setUserName(name);
	    		user.setMobile(mobile);
	    		user.setFine(0);
	    		user.setBookIssued(0);
	    		bookBo.insertUser(user);
	    		break;
	    		
	    		case 2:
		    		User user2=new User();
		    		int id=Integer.parseInt(reader.readLine());
		    		user2=bookBo.findUser(id);
		    		bookBo.deleteUser(user2);
		    		break;
		    		
	    		case 4:
		    		//User user3=new User();
		    		//String name=reader.readLine();
		    		//String mobile=reader.readLine();
		    		//user.setUserName(name);
		    		//user.setMobile(mobile);
		    		//user.setFine(0);
		    		//user.setBookIssued(0);
		    		List<User> l=bookBo.listUser();
		    		System.out.println(" list: "+l.get(0));
		    		break;
	    		case 0:
	    		break;
	    		}
	    		if(choice==0)
	    			break;
	    	}
	    	/** insert **/
	    	/*Book book= new Book();
	    	book.setBookName("ABCD");
	    	book.setAuthName("vaibhav");
	    	book.setBookQuantity(1);
	    	bookBo.saveBook(book);
	    	*/
	    	//List list=bookBo.listBooks();
	    	//System.out.println(list);
	    	/** select **/
	    	//Book book2 = bookBo.findByBook("ABCD");
	    	//System.out.println(book2);
	    /*	User user =new User();
	    	user.setUserName("bhands");
	    	user.setMobile("8800456123");
	    	user.setBookIssued(0);
	    	bookBo.insertUser(user);*/
	    	/** update **/
	    	//book2.setBookName("HAIO-1");
	    	//bookBo.update(book2);
	    	
	    	/** delete **/
	    	//bookBo.delete(book2);
	    	/*User u=bookBo.findUser(2);
	    	Book b=bookBo.findByBook("ABCD");
	    	System.out.println(u.getMobile());
	    	System.out.println(b.getBookQuantity());
	    	
	    	Issue i=new Issue();
	    	i.setBookId(b.getBookId());
	    	i.setUserId(u.getUserId());
	    	long millis=System.currentTimeMillis();
	    	java.sql.Date date=new java.sql.Date(millis);
	    	Date rDate= new Date(millis+7l*24l*60l*60l*1000l);		
	    	i.setIssueDate(date);
	    	i.setReturnDate(rDate);
	    	bookBo.issueBook(i);
	    	b.setBookQuantity(b.getBookQuantity()-1);
	    	u.setBookIssued(u.getBookIssued()+1);
	    	bookBo.updateBook(b);
	    	bookBo.updateUser(u);*/
	    	
	    	System.out.println("Done");
	    }
    }
