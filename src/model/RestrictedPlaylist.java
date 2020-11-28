package model;

public class RestrictedPlaylist extends Playlist{
	public static final int MAX_USERS= 5;	
String [] users;

/**
 * @param name
 * @param playlistlength
 * @param playlistgender
 * @param users
 */
public RestrictedPlaylist(String name, int playlistLength, Gender songsGenders, String [] users) {
	super(name, playlistLength, songsGenders);
	this.users = users;
}

/**
 * @return The users
 */
public String[] getUsers() {
	return users;
}

/**
 * @param users the users to set
 */
public void setUsers(String[] users) {
	this.users = users;
}


/**
*show the Restricted playlist
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
	content +="**  Average: "+getUsers()+" ***\n";
	content +="***********************************\n";
	return content;
}	

}