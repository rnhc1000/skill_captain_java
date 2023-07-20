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

        public boolean play(Long musicId, Map<Long, PlayList> PlayList);
        public boolean pause(Map<Long, PlayList> PlayList);
        public boolean stop(Long musicId, Map<Long, PlayList> PlayList);
        public boolean addSong(Long musicId, Map<Long, PlayList> PlayList);
        public boolean removeSong(Map<Long, PlayList> PlayList);
    
}
