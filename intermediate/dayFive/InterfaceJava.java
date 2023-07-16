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

public class InterfaceJava implements MusicPlayer{


    public boolean play(){

        return true;

    }

    public boolean pause(){

        return true;
        
    }

    public boolean stop(){

        return true;
        
    }

    public boolean addSong(String song){

        return true;
        
    }
    public boolean removeSong(String song){

        return true;
        
    }
}
    
