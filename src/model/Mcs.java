package model;

import ui.Menu;

public class Mcs {
		
		private final static int USERS = 10;
		private final static int PLAYLIST = 20;
		private final static int SONGS = 30;
		
		User [] user;
		Playlist [] playlist;
		Song [] songs;

		
		/**
		 * @param menu
		 * @param users
		 * @param playlist
		 * @param songs
		 */
		public Mcs(Menu menu, User[] users, Playlist[] playlist, Song[] songs) {
			super();
			users = new User[USERS];
			playlist = new Playlist[PLAYLIST];
			songs = new Song[SONGS];
		}
		
	}

