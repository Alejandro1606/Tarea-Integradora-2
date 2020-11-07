package model;

public class RestrictedPlaylist extends Playlist{
	public static final int MAX_USERS= 5;
	public RestrictedPlaylist(String title, String artistname, int releasingDate, int songDuration, Gender songGender,
			String name, int playlistLength, Gender songsGenders) {
		super(title, artistname, releasingDate, songDuration, songGender, name, playlistLength, songsGenders);
	}


}
