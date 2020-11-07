package model;

public class PublicPlaylist extends Playlist {
private double averageGrade;
	public PublicPlaylist(String title, String artistname, int releasingDate, int songDuration, Gender songGender,
			String name, int playlistLength, Gender songsGenders, double averageGrade) {
		super(title, artistname, releasingDate, songDuration, songGender, name, playlistLength, songsGenders);
		this.averageGrade=averageGrade;
		
	}
	public double getAverageGrade() {
		return averageGrade;
	}
	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}

	
}
