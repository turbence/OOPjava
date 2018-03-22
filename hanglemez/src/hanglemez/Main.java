package hanglemez;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		hanglemez[] songs = new hanglemez[Integer.parseInt(scanner.nextLine())];
		for (int i = 0; i < songs.length; i++) {
			songs[i] = new hanglemez("Artist "+i, "Title"+i*i*i, (234*i/9));
		}
		hanglemez longestSong = songs[0];
		for (int i = 0; i < songs.length; i++) {
			if (longestSong.compareLength(songs[i])==-1) {
				longestSong = songs[i];
			}
		}
		System.out.println("Leghosszabb zene"+ longestSong);
		
		System.out.println("Adjon meg egy elõadót");
		
		String artist = scanner.nextLine();
		for (hanglemez hanglemez : songs) {
			if (hanglemez.artistEquals(artist)) {
				System.out.println(hanglemez);
			}
		}
	}

}
