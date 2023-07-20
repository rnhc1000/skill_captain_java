package intermediate.dayFive;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyMusicPlayer implements MusicPlayer{


    public boolean play(Long musicId, Map<Long, PlayList> listOfSongs){

        if (listOfSongs.containsKey(musicId)) {

            System.out.println(listOfSongs.get(musicId));


        } else {

            System.out.println("Music not found!!!");
        }

        return true;

    }

    public boolean pause(Map<Long, PlayList> listOfSongs){


        System.out.println("Playlist available .... Which song you want to pause...");
        listOfSongs.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println("Input the number of the song to be paused... -> ");
        Scanner data = new Scanner(System.in);
        Long pause = data.nextLong();
        System.out.print("Song " + listOfSongs.get(pause) + " Paused! Press any key to keep listening it...");

        System.out.print("Enjoy the song...." + listOfSongs.get(pause));

        return true;
        
    }

    public boolean stop(Long musicId,  Map<Long, PlayList> listOfSongs){

        return true;
        
    }

    public boolean addSong(Long musicId, Map<Long, PlayList> listOfSongs){

        //Map<Long, PlayList> playList = new HashMap<Long, PlayList>();
        String nameOfSong="";
        String singer="";
        String band="";
        String album="";
        String shortLyrics="";
        Integer year;
        Scanner data = new Scanner(System.in);

        if (listOfSongs.containsKey(musicId)) {

            System.out.println("Music already in the current PlayList!!!");
            data.close();
            return false;

        } else {

            System.out.print("nameOfSong-> ");
            nameOfSong = data.nextLine();
            System.out.print("Singer -> ");
            singer = data.nextLine();
            System.out.print("Band -> ");
            band = data.nextLine();
            System.out.print("Album-> ");
            album = data.nextLine();
            System.out.print("ShortLyrics-> ");
            shortLyrics = data.nextLine();
            System.out.print("Year-> ");
            year = data.nextInt();
            data.nextLine();

            listOfSongs.put(musicId, new PlayList(
                musicId,
                nameOfSong,
                singer,
                band,
                album,
                shortLyrics,
                year
            ));

            System.out.println(listOfSongs);
        }

        //data.close();


        return true;
        
    }
    public boolean removeSong(Map<Long, PlayList> listOfSongs){
        Scanner data = new Scanner(System.in);
        System.out.println("Playlist available .... Which song you want to play...");
        listOfSongs.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.print("Pick the numer of song you want to remove to -> ");
        Long choice = data.nextLong();
        listOfSongs.remove(choice);

        System.out.println("Here is the new PlayList \n" + listOfSongs);
        return true;
        
    }
}
    
