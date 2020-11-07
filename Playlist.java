package model;
public class Playlist extends Pool {
public static final int MAX_PLAYLISTS= 20;
protected static String name;
protected static int playlistLength;
protected Gender songsGenders;

public Playlist(String title, String artistname, int releasingDate, int songDuration, Gender songGender, String name, int playlistLength, Gender songsGenders) {
	super(title, getArtistname(), releasingDate, songDuration, songGender, name);
	Playlist.name = name;
	Playlist.playlistLength = playlistLength;
	this.songsGenders = songsGenders;
}

	

	

	





	










	























	public boolean addSong(Song newSong) {
		int ths=0;
		boolean added=true;{
		
		while(ths<MAX_SONGS && songs[ths] !=null) {
			
		ths++;
		}
		
		songs[ths]=newSong;
		addGenre(newSong.getGenre());
		songDuration+= newSong.getSongDuration();
		
		return added;
		
			
		}
	
	}




	






	














private void addGenre(Song genre) {
		
		
	}





}


