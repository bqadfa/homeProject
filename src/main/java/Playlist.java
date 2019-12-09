import java.util.ArrayList;

public class Playlist {

    private ArrayList<DanceType> playlistGenre;

    private String nameOfPlaylist;

    public Playlist(ArrayList<DanceType> playlistGenre, String nameOfPlaylist) {
        this.playlistGenre = playlistGenre;
        this.nameOfPlaylist = nameOfPlaylist;
    }

    public ArrayList<DanceType> getPlaylistGenre() {
        return playlistGenre;
    }

    public void setPlaylistGenre(ArrayList<DanceType> playlistGenre) {
        this.playlistGenre = playlistGenre;
    }

    public String getNameOfPlaylist() {
        return nameOfPlaylist;
    }

    public void setNameOfPlaylist(String nameOfPlaylist) {
        this.nameOfPlaylist = nameOfPlaylist;
    }
}
