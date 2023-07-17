package intermediate.dayFive;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * All methods shall return a boolean as:
 * true: success
 * false: fail
 * @return boolean
 * 
 */
public interface MusicPlayer {

        public boolean play(Long musicId, Map<Long, PlayList> playList);
        public boolean pause();
        public boolean stop();
        public boolean addSong(String song);
        public boolean removeSong(String song);
    
}
