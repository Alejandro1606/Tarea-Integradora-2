package model;

public class PrivatePlaylist extends Playlist {
	public static final int MAX_USERS= 1;
	private static Gender songGenders;
	protected static String user;
	
	public PrivatePlaylist(String title, String artistname, Gender songGender) {
		super(title, artistname, getReleasingDate(), songDuration, songGender, name, playlistLength, songGenders);
		
	}
	public PrivatePlaylist(String title, String nickname,int playlistLength, Gender rock) {
		super(getTitle(), artistname, getReleasingDate(), songDuration, getSongGender(), name, playlistLength,songGenders);
		PrivatePlaylist.title=title;
		Playlist.playlistLength=playlistLength;
		
	}
		
	public void PrivatePlaylist1(String name, String artistname, int playlistLength, int songDuration, Gender Rock, String name2, int playlistLength2, Gender songsGenders2) {
		
	PrivatePlaylist.name=name;
	PrivatePlaylist.playlistLength=playlistLength;
	this.songsGenders=Rock;



}
	public void Showprivateplaylist() {
	
		System.out.println("Playlist Title:"+getTitle()+"Authorized user"+getUser()+ "Playlist duration"+ playlistLength + "Playlist gender" + getSongGender() );
		}
	private String getUser() {
		return user;
	}
	
}