package model;

public class Song {
public static final int MAX_SONGS= 10;
protected static Song [] songs;
protected static String title;
protected static String artistname;
private static int releasingDate;
protected static int songDuration;
private static Gender songGender;
private final boolean SONGS_REGISTERED;

public Song(String title, String artistname, int releasingDate, int songDuration, Gender songGender, String songs) {
	super();
	Song.title = title;
	this.SONGS_REGISTERED= null != null;
	this.setArtistname(artistname);
	this.setReleasingDate(releasingDate);
	this.setSongDuration(songDuration);
	this.setSongGender(songGender);
}

public Song(String title, String artistname,int songDuration, Gender Salsa) {
	this.SONGS_REGISTERED = null!=null;
	Song.title=title;
	Song.artistname=artistname;
	Song.songDuration=songDuration;
	Song.songGender=Salsa;
}



public static String getTitle() {
	return title;
}

public void setTitle(String title) {
	Song.title = title;
}

public static String getArtistname() {
	return artistname;
}

public void setArtistname(String artistname) {
	Song.artistname = artistname;
}

public static int getReleasingDate() {
	return releasingDate;
}

public void setReleasingDate(int releasingDate) {
	Song.releasingDate = releasingDate;
}

public double getSongDuration() {
	return songDuration;
}

public void setSongDuration(int songDuration) {
	Song.songDuration = songDuration;
}

public static Gender getSongGender() {
	return songGender;
}

public void setSongGender(Gender songGender) {
	Song.songGender = songGender;
}
public Song[] getSongs() {
	return songs;
}

public Song getGenre() {
	return null;
}

public static void addSong(String title2, String artistname2, int releasingdate2, int songDuration2,
		Gender songGender2) {
	
	
}

public boolean SONGS_REGISTERED() {
	return SONGS_REGISTERED;
}

public void Showsong() {
	System.out.println("Title:"+getTitle()+"UserName:"+getArtistname()+"Song duration:"+getSongDuration()+"Genre"+getGenre());
}
}
