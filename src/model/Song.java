package model;

public class Song {
public static final int MAX_SONGS= 10;
protected static Song [] songs;
public  String title;
public String artistName;
private  int releasingDate;
public  int songDuration;
private  Gender songGender;


/**
 * @param title
 * @param artistname
 * @param releasingDate
 * @param songDuration
 * @param songGender
 */
public Song(String title, String artistName, int releasingDate, int songDuration, Gender songGender) {
	super();
	this.title = title;
	this.artistName = artistName;
	this.releasingDate = releasingDate;
	this.songDuration = songDuration;
	this.songGender = songGender;
}







public Song(String title2, String artistName2, String releasingDate2, int songDuration2) {
	
}







public Song(String title2, String artistname2, int releasingDate2, int songDuration2, Gender songGender2,
		String songs2) {
	
}







/**
 * @return the title
 */
public String getTitle() {
	return title;
}



/**
 * @param title the title to set
 */
public void setTitle(String title) {
	this.title = title;
}



/**
 * @return the artist
 */
public String getArtistName() {
	return artistName;
}



/**
 * @param artistname the artist to set
 */
public void setArtistName(String artistName) {
	this.artistName = artistName;
}



/**
 * @return the date
 */
public int getReleasingDate() {
	return releasingDate;
}



/**
 * @param releasingDate the releasing date to set
 */
public void setReleasingDate(int releasingDate) {
	this.releasingDate = releasingDate;
}



/**
 * @return the song duration
 */
public int getSongDuration() {
	return songDuration;
}



/**
 * @param duration the duration to set
 */
public void setSongDuration(int songDuration) {
	this.songDuration = songDuration;
}



/**
 * @return the song gender
 */
public Gender getSongGender() {
	return songGender;
}



/**
 * @param songGender the song gender to set
 */
public void setSongGender(Gender songGender) {
	this.songGender = songGender;
}


/**
*Show the songs 
*@param
*@return a String, .
*/
public String showSong() {
	String content = "SONG \n";
	content +="*************  SONG **************\n";
	content +="**  Title: "+getTitle()+ " ***\n";
	content +="**  Artist: "+getArtistName()+" ***\n";
	content +="**  Genre: "+getSongGender()+" ***\n";
	content +="***********************************\n";
	
	return content;
	
}

}
