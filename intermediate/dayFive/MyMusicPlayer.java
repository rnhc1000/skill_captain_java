package intermediate.dayFive;

import java.util.HashMap;
import java.util.Map;

public class MyMusicPlayer implements MusicPlayer{


    public boolean play(Long musicId, Map<Long, PlayList> listOfSongs){

        if (listOfSongs.containsKey(musicId)) {

            System.out.println(listOfSongs.get(musicId));


        } else {

            System.out.println("Music not found!!!");
        }

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
    
