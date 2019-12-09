import java.util.ArrayList;

public interface EventHandler {

    int count = 0;

    void setNewPairs(ArrayList<Dancer> dancers, Playlist playlist);

    void setPlaylist(Playlist playlist);



}
