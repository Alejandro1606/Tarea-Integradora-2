package model;

public class PublicPlaylist extends Playlist {

private double averageGrade;

/**
 * @param name
 * @param Playlist length
 * @param Playlist gender
 * @param average grade
 */
public PublicPlaylist(String name, int playlistLength, Gender songsGender, double averageGrade) {
	super(name, playlistLength, songsGender);
	this.averageGrade = averageGrade;
}

/**
 * @return The average grade
 */
public double getAverageGrade() {
	return averageGrade;
}

/**
 * @param Average grade the average grade to set
 */
public void setAverageGrade(double averageGrade) {
	this.averageGrade = averageGrade;
}



/**
*Show the public playlist
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
	content +="**  Average: "+getAverageGrade()+" ***\n";
	content +="***********************************\n";
	return content;
}	
}
