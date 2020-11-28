package model;

public class PrivatePlaylist extends Playlist {
	private String user;
	public static final int MAX_USERS= 1;
	public  Gender songsGenders;


	public PrivatePlaylist(String name, int playlistLength, Gender songsGenders,String user) {
		super(name, playlistLength, songsGenders);
		this.user = user;
		this.songsGenders=songsGenders;
		this.getPlaylistLength();
		this.getName();
	}

	




public String getUser() {
	return user;
}


public void setUser(String user) {
	this.user = user;
}

/**
*show the private playlist
*@param
*@Override 
*@return a String, .
*/

@Override
public String showPlaylist() {
	String content = "";
	content +="************* Playlist  **************\n";
	content +="**  Title: "+getName()+" ***\n";
	content +="**  Duration: "+getPlaylistLength()+" ***\n";
	content +="**  Genre: "+songsGenders()+" ***\n";
	content +="**  User name: "+getUser()+" ***\n";
	content +="***********************************\n";
	return content;
}
}