package intermediate.dayFive;

import java.util.Map;

public class PlayList {
    
    private long id;
    private String nameOfSong;
    private String singer;
    private String band;
    private String album;
    private String shortLyrics;
    private int year;
    
    public PlayList() {
    }

    public PlayList(Long id) {
        this.id=id;
    }

    public PlayList(Long id, String nameOfSong, String singer, String band, String album, String shortLyrics,
            int year) {
        this.id = id;
        this.nameOfSong = nameOfSong;
        this.singer = singer;
        this.band = band;
        this.album = album;
        this.shortLyrics = shortLyrics;
        this.year = year;
    }


    public PlayList(String nameOfSong, String singer, String band, String album, String shortLyrics, int year) {
        this.nameOfSong = nameOfSong;
        this.singer = singer;
        this.band = band;
        this.album = album;
        this.shortLyrics = shortLyrics;
        this.year = year;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameOfSong() {
        return nameOfSong;
    }

    public void setNameOfSong(String nameOfSong) {
        this.nameOfSong = nameOfSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getShortLyrics() {
        return shortLyrics;
    }

    public void setShortLyrics(String shortLyrics) {
        this.shortLyrics = shortLyrics;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "PlayList [id=" + id + ", nameOfSong=" + nameOfSong + ", singer=" + singer + ", band=" + band
                + ", album=" + album + ", shortLyrics=" + shortLyrics + ", year=" + year + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PlayList other = (PlayList) obj;
        if (id != other.id)
            return false;
        return true;
    }

    public void play(Long songChosen, Map<Long, PlayList> playList) {
    }

}
