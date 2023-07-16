package intermediate.dayFive;
/**
 * 
 * All methods shall return a boolean as:
 * true: success
 * false: fail
 * @return boolean
 * 
 */
public interface MusicPlayer {

        public boolean play();
        public boolean pause();
        public boolean stop();
        public boolean addSong(String song);
        public boolean removeSong(String song);
    
}
