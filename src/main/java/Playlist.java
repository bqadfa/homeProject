import java.util.ArrayList;

public class Playlist {

    private DanceType playlistGenre;

    private String nameOfPlaylist;

    public Playlist(DanceType playlistGenre, String nameOfPlaylist) {
        this.playlistGenre = playlistGenre;
        this.nameOfPlaylist = nameOfPlaylist;
    }

    public DanceType getPlaylistGenre() {
        return playlistGenre;
    }

    public void setPlaylistGenre(DanceType playlistGenre) {
        this.playlistGenre = playlistGenre;
    }

    public String getNameOfPlaylist() {
        return nameOfPlaylist;
    }

    public void setNameOfPlaylist(String nameOfPlaylist) {
        this.nameOfPlaylist = nameOfPlaylist;
    }
}
