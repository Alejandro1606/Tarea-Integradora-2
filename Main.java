package model;
import java.util.Scanner;

public class Main {

public static Scanner sc=new Scanner(System.in);

private int songsRegistered;
public static void main(String [] args) {

	
	
		
		Song song=new Song("Deseandote", "Frankie Ruiz",320,Gender.SALSA);{
				
		
				song.Showsong();
				}
	
				User user=new User("Pipe06",19,Rank.LITTLE_CONTRIBUTOR);{
					user.Showuser();
				}
				PrivatePlaylist playlist=new PrivatePlaylist("Rock","Jose25", Gender.ROCK); {
				
						playlist.Showprivateplaylist();
						}
				}


	public int addUser() {			
	String name = "";
	int age=0;
	String password= "";
	String category= "NEWBIE";
	int usersRegistered=0;
	
	System.out.println("Enter the nickname");
	name=sc.next();
	sc.nextLine();
	System.out.println("Enter the user password");
	password=sc.nextLine();
	System.out.println("Enter the user age");
	age=sc.nextInt();
	sc.nextLine();
	User.addUser(name,password,age,category,usersRegistered);
	System.out.println("The user has added successfully");
	usersRegistered+=1;
	
	return usersRegistered;
	


	


	
}
	public int addSong() {			
		String title = "";
		String artistname="";
		int releasingdate=0;
		int songDuration=0;
		Gender songGender = null;
		
		System.out.println("Enter the song title");
		title=sc.next();
		sc.nextLine();
		System.out.println("Enter the artist name");
		artistname=sc.nextLine();
		System.out.println("Enter the song´ releasing date");
		releasingdate=sc.nextInt();
		sc.nextLine();
		Song.addSong(title,artistname,releasingdate,songDuration,songGender);
		System.out.println("The song has added successfully");
		songsRegistered+=1;
		
		return songsRegistered;
		
	}
}





