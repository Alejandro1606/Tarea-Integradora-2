package ui;
import model.*;
import java.util.Scanner;

	public class Menu {
		private final static int ADD_USERS = 1;
		private final static int SHOW_USERS = 2;
		private final static int ADD_SONG = 3;
		private final static int SHOW_SONG = 4;
		private final static int ADD_PLAYLIST = 5;
		private final static int SHOW_PLAYLIST = 6;
		private final static int EXIT = 7;

		
		private static Scanner sc = new Scanner(System.in);
		
		private User users;
		private Song songs;
		private Playlist playlist;
		private PrivatePlaylist privateplaylist;
		private PublicPlaylist publicplaylist;
		private RestrictedPlaylist restrictedplaylist;

		

		/**
		 * 
		 */
		public Menu() {
			super();
		}
		
		/**
		*show menu options
		*@param 
		*@return
		*/
		public void showMenu() {
			System.out.println("(" +ADD_USERS+ ") Create a user");
			System.out.println("(" +SHOW_USERS+ ") List users");
			System.out.println("(" +ADD_SONG+ ") Create a song");
			System.out.println("(" +SHOW_SONG+ ") List the songs");
			System.out.println("(" +ADD_PLAYLIST+ ") Create playlist");
			System.out.println("(" +SHOW_PLAYLIST+ ") List Playlist");
			System.out.println("(" +EXIT+ ") EXIT");
		}
		
		
		/**
		*read the option that the user chooses from the menu
		*@param 
		*@return enter choice
		*/
		public int readOption() {
			int choice = sc.nextInt();
			return choice;
		}
		
		/**
		*the menu 
		*@param int choice, 
		*@return
		*/
		public void doOperation(int choice) {
			switch (choice) {
			case ADD_USERS:
				this.users = createUser();
				break;
			case SHOW_USERS:
				System.out.println(users.showUser());
				break;
			case ADD_SONG:
				this.songs =createSong();
				break;
			case SHOW_SONG:
				System.out.println(songs.showSong());
				break;
			case ADD_PLAYLIST:
				playlistvar();
				break;
			case SHOW_PLAYLIST:
				System.out.println(playlist.showPlaylist());
				break;
			case EXIT:
				break;
			default:
				System.out.println("Option invalid, repeat again");
				
			}
		}
		
		/**
		*invoke several methods, to make the menu work.
		*@param 
		*@return 
		*/
		public void startProgram() {
			int option;
			do {
				showMenu();
				option = readOption();
				doOperation(option);
			}while(option!=15);
		}
		
		/**
		*create a user object with the respective characteristics.
		*@param 
		*@return a object User
		*/
		public User createUser() {
			System.out.println("CREATE USER\n");
			System.out.println("Enter nickname, no space");
			String name = sc.next();
			System.out.println("Enter password:");
			String pasword = sc.next();
			System.out.println("Enter the user's age: ");
			int age = sc.nextInt();
			Rank category = Rank.NEWBIE;
			
			User users = new User (name,pasword,age,category);
			return users;
			
		}
		
		/**
		*create a song object with the respective characteristics.
		*@param 
		*@return a object Song
		*/
		public Song createSong() {
			System.out.println("Enter a title");
			String title = sc.next();
			System.out.println("Enter artist name or band name");
			String artistName = sc.next();
			System.out.println("Enter the release date");
			String releasingDate = sc.next();
			System.out.println("Enter the duration of the song in seconds");
			int songDuration = sc.nextInt();
			
			Song song = new Song( title, artistName, releasingDate, songDuration);
			return song;
		}
		
		/**
		*invoke various methods to create a play list according to its characteristics.
		*@param 
		*@return 
		*/
		public void playlistvar() {
			System.out.println("Enter what type of playlist you want to create ");
			System.out.println(" (1)Private, (2)Restricted, (3)Public ");
			int var = sc.nextInt();
			
			if(var==1) {
				this.privateplaylist = CreatePrivatePlaylist();
			}
			if(var==2) {
				this.restrictedplaylist = CreateRestrictedPlaylist();
			}
			if(var==3) {
				this.publicplaylist = CreatePublicPlaylist();
			}
		}
		
		private PublicPlaylist CreatePublicPlaylist() {
			
			return null;
		}

		private RestrictedPlaylist CreateRestrictedPlaylist() {
			
			return null;
		}

		private PrivatePlaylist CreatePrivatePlaylist() {
			
			return null;
		}

		/**
		*create a play list with the private feature.
		*@param 
		*@return a object PrivatePlaylist
		*/
		public PrivatePlaylist CreatePrvPlaylist() {
			
			System.out.println("Enter a name");
			String name = sc.next();
			System.out.println("Enter the song duration");
			int songDuration = sc.nextInt();
		
			System.out.println("Enter the user");
			String user = sc.next();
			
			PrivatePlaylist privateplaylist = new PrivatePlaylist(name,songDuration,null, user); 
			
			return privateplaylist;
		}
		
		/**
		*create a play list with the restricted feature.
		*@param 
		*@return a object RestrictedPlaylist
		*/
		public RestrictedPlaylist CreateResPlaylist() {	
			System.out.println("Enter a name");
			String name = sc.next();
			System.out.print("Enter the song duration");
			int songDuration = sc.nextInt();

			String[] user = new String[5];
			for (int i=0; i<5;i++) {
				System.out.println("Enter the user");
				user[i] = sc.next(); 
			}
			RestrictedPlaylist restrictedplaylist = new RestrictedPlaylist(name,songDuration,null,user); 
			
			return restrictedplaylist;
			
		}
		
		/**
		*create a play list with the public feature.
		*@param 
		*@return a object PublicPlaylist
		*/
		public PublicPlaylist CreatePubPlaylist() {	
			System.out.println("Enter a name");
			String name = sc.next();
			System.out.print("Enter the song duration");
			int songDuration = sc.nextInt();
			System.out.println("Enter the qualification From 1 to 5");
			int qualification = sc.nextInt();
			qualification = (qualification+qualification)/2;
			
			
			PublicPlaylist publicplaylist = new PublicPlaylist(name,songDuration,null,qualification); 
			
			return publicplaylist;
			
		}
		

		/**
		 * @return the private playlist
		 */
		public PrivatePlaylist getPrivatePlaylist() {
			return privateplaylist;
		}

		/**
		 * @param privateplaylist the private playlist to set
		 */
		public void setPrivatePlaylist(PrivatePlaylist privateplaylist) {
			this.privateplaylist = privateplaylist;
		}

		/**
		 * @return the public playlist
		 */
		public PublicPlaylist getPublicPlaylist() {
			return publicplaylist;
		}

		/**
		 * @param public playlist the public playlist to set
		 */
		public void setPublicPlaylist(PublicPlaylist publicplaylist) {
			this.publicplaylist = publicplaylist;
		}

		/**
		 * @return the playlist restricted
		 */
		public RestrictedPlaylist getRestrictedPlaylist() {
			return restrictedplaylist;
		}

		/**
		 * @param playlistrestricted the playlist restricted to set
		 */
		public void setRestrictedPlaylist(RestrictedPlaylist restrictedplaylist) {
			this.restrictedplaylist = restrictedplaylist;
		}
		
	}

