package book.mgmt;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "user", catalog = "book", uniqueConstraints = {
		@UniqueConstraint(columnNames = "user_id")})
public class User implements Serializable {

	@Id @GeneratedValue
	@Column(name="user_id")
	private int userId;
	@Column(name="user_name")
	private String userName;
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="fine")
	private int fine;
	
	@Column(name="books_issued")
	private int booksIssued;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Integer getBookIssued() {
		return booksIssued;
	}
	public void setBookIssued(Integer booksIssued) {
		this.booksIssued = booksIssued;
	}
	
}
