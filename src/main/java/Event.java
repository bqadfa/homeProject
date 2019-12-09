import java.util.ArrayList;
import java.util.Scanner;

public class Event implements EventHandler {

    private EventHandler eventHandler;


    public void setNewPairs(ArrayList<Dancer> dancers, Playlist playlist) {

    }

    public void setPlaylist(Playlist playlist) {
        Scanner variant = new Scanner(System.in);
        System.out.println("Choose your dest... Playlist:\n1.Ballet Music\n2.Waltz Music\n3.INDUSTRIAL TECHNO");
        String decision = variant.nextLine();

        if (decision.equals("3")) {

        }
    }
}
