package model;
public class Playlist  {
public static final int MAX_PLAYLISTS= 20;

private String name;
private int playlistLength;
protected Gender songsGenders;

/**
 * @param name
 * @param playlistLength
 * @param songsGenders
 */
public Playlist(String name, int playlistLength, Gender songsGenders) {
	super();
	this.name = name;
	this.playlistLength = playlistLength;
	this.songsGenders = songsGenders;
}

/**
 * 
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the playlist length
 */
public int getPlaylistLength() {
	return playlistLength;
}


/**
 * @param playlistLegth the playlist length to set
 */
public void setPlaylistLength(int playlistLength) {
	this.playlistLength = playlistLength;
}

/**
 * @return the songs genders
 */
public Gender songsGenders() {
	return songsGenders;
}

/**
 * @param songsGenders the songs genders to set
 */
public void setSongsGenders(Gender songsGenders){
	this.songsGenders = songsGenders;
}

/**
*show the Playlist
*@param
*@return a String
*/
public String showPlaylist() {
	
	
	String content = "";
	content +="************* Playlist  **************\n";
	content +="**  Title: "+getName()+" ***\n";
	content +="**  Duration: "+getPlaylistLength()+" ***\n";
	content +="**  Genre: "+songsGenders()+" ***\n";
	content +="***********************************\n";
	
	return content;
}

	}







