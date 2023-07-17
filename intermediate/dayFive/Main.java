package intermediate.dayFive;
/**
 * 
 * Assignment: Music Player Interface
 * Objective: The objective of this assignment is to create a music player 
 * application using Java interfaces. The application should support basic 
 * music player functionalities such as playing, pausing, and stopping songs. 
 * Additionally, it should allow the user to add and remove songs from the playlist.
 * Instructions:
 * 
 * 1. Create an interface called `MusicPlayer` with the following methods:
 * - `play()`: Abstract method that plays the current song.
 * - `pause()`: Abstract method that pauses the current song.
 * - `stop()`: Abstract method that stops the current song.
 * - `addSong(String song)`: Abstract method that adds a new song to the playlist.
 * - `removeSong(String song)`: Abstract method that removes a song from the playlist.
 * 
 * 2. Implement the `MusicPlayer` interface in a class called `MyMusicPlayer`. 
 * In this class, provide the necessary implementations for all the methods defined 
 * in the interface.
 * 
 * 3. In the `Main` class, create an instance of the `MyMusicPlayer` class and 
 * perform the following tasks:
 * - Add at least five songs to the playlist using the `addSong()` method.
 * - Play one of the songs using the `play()` method.
 * - Pause the currently playing song using the `pause()` method.
 * - Remove a song from the playlist using the `removeSong()` method.
 * - Stop the currently playing song using the `stop()` method.
 * 
 * 4. Test the program by adding, playing, pausing, and stopping songs. 
 * Make sure the methods are functioning correctly and producing the expected output.
 * 
 * 5. Optional: 
 * Enhance the program by adding additional functionalities such as displaying 
 * the current playlist or implementing a shuffle feature.
 * 
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MyMusicPlayer myMusicPlayer = new MyMusicPlayer();

        Scanner input = new Scanner(System.in);
        String songs = "";
        Integer numberOfSongs = 0;
        Map<Long, PlayList> playList = new HashMap<Long, PlayList>();
        boolean isValid = false;
        String nameOfSong="";
        String singer="";
        String band="";
        String album="";
        String shortLyrics="";
        Integer year;

        System.out.print("Input the number of songs you want to listen to... -> ");
        while (!isValid) {
            try {
                songs = input.nextLine();
                numberOfSongs = Integer.parseInt(songs);
                isValid=true;
            } catch (NumberFormatException e) {
                System.out.println("Number Invalid! Try another one...");
            }
        }
        for (Long i = 1L; i <= numberOfSongs; i++) {

            System.out.print("nameOfSong-> ");
            nameOfSong = input.nextLine();
            System.out.print("Singer -> ");
            singer = input.nextLine();
            System.out.print("Band -> ");
            band = input.nextLine();
            System.out.print("Album-> ");
            album = input.nextLine();
            System.out.print("ShortLyrics-> ");
            shortLyrics = input.nextLine();
            System.out.print("Year-> ");
            year = input.nextInt();
            input.nextLine();

            playList.put(i, new PlayList(
                i,
                nameOfSong,
                singer,
                band,
                album,
                shortLyrics,
                year
            ));
        }
        

        System.out.println("Playlist available .... Which song you want to play...");
        
        playList.forEach((k,v) -> System.out.println(k + " " + v));
        System.out.print("Pick the song you want to listen to -> ");
        Long songChosen = input.nextLong();

        System.out.println("Song chosen -> " + songChosen);

        //songChosen--;

        //System.out.println(playList.get(songChosen));


        myMusicPlayer.play(songChosen, playList);

        input.close();

    }

}
