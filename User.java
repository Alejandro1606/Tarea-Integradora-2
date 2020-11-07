package model;

public class User {
public static final int MAX_USERS= 10;
protected static User [] users;
private String nickname;
private String password;
private int age;
private Rank category;
private final boolean USERS_REGISTERED;
public User(String nickname, int age, String password, Rank littleContributor) {
	super();
	this.nickname = nickname;
	this.password = password;
	this.age = age;
	this.category = littleContributor;
	this.USERS_REGISTERED = null != null;
	
	
	
	
	
}
public User(String nickname, int age, Rank littleContributor) {
	this.USERS_REGISTERED = null!=null;
	this.nickname=nickname;
	this.age=age;
	this.category=littleContributor;
	
	
}
public String getNickname() {
	return nickname;
}
public void setNickname(String nickname) {
	this.nickname = nickname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Rank getCategory() {
	return category;
}
public void setCategory(Rank category) {
	this.category = category;
}


public boolean getUSERS_REGISTERED() {
	return USERS_REGISTERED;
}
public static void addUser(String name, String password, int age, String category,int usersRegistered) {
	
}



public boolean addUser(User newUser) {
	int tsr=0;
	boolean USERS_REGISTERED=true;{
		
	while(tsr<MAX_USERS && users[tsr] !=null) {
		
		tsr++;
	
		
		users[tsr]=newUser;
		addNickname(newUser.getNickname());
		password+= newUser.getPassword();
		
		
	
		

	}
	
	return USERS_REGISTERED;

	}
 }
private void addNickname(String nickname) {
	
	
}

public void Showuser() {
	System.out.println("UserName:"+getNickname()+"Age:"+getAge()+"Category"+getCategory());
}
}






