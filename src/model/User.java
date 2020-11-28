package model;

public class User {
public static final int MAX_USERS= 10;
protected static User [] users;


private String nickName;
private String password;
private int age;
private Rank category;


/**
 * @param nickname
 * @param pasword
 * @param age
 * @param category
 */
public User(String nickName, String password, int age, Rank category) {
	super();
	this.nickName = nickName;
	this.password = password;
	this.age = age;
	this.category = category;
}

/**
 * @return the nickname
 */
public String getNickName() {
	return nickName;
}

/**
 * @param nickname the nickname to set
 */
public void setNickName(String nickName) {
	this.nickName = nickName;
}

/**
 * @return the password
 */
public String getPasword() {
	return password;
}

/**
 * @param pasword the password to set
 */
public void setPasword(String pasword) {
	this.password = pasword;
}

/**
 * @return the age
 */
public int getAge() {
	return age;
}

/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}

/**
 * @return the category
 */
public Rank getCategory() {
	return category;
}

/**
 * @param category the category to set
 */
public void setCategory(Rank category) {
	this.category = category;
}

/**
*show the List Users
*@param 
*@return a String, .
*/
public String showUser() {
	
	
	String content = "";
	content +="*************  User **************\n";
	content +="**  UserName: "+getNickName()+" ***\n";
	content +="**  Age: "+getAge()+" ***\n";
	content +="**  Category: "+getCategory()+" ***\n";
	content +="***********************************\n";
	
	return content;
}
}



