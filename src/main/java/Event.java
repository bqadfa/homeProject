import java.util.ArrayList;
import java.util.Scanner;

public class Event implements EventHandler {

    private EventHandler eventHandler;


    public void setNewPairs(ArrayList<Dancer> dancers, Playlist playlist) {

    }

    public void setPlaylist() {
        Scanner variant = new Scanner(System.in);
        System.out.println("Choose your dest... Playlist:\n1.Ballet Music\n2.Waltz Music\n3.INDUSTRIAL TECHNO");
        String decision = variant.nextLine();

        switch (decision) {
            case "3": {
                Playlist playlist1 = new Playlist(DanceType.RAVEDANCER, "Techno Dance");

                break;
            }
            case "2": {
                Playlist playlist1 = new Playlist(DanceType.WALTZ, "Waltz Dance");

                break;
            }
            case "1": {
                Playlist playlist1 = new Playlist(DanceType.BALLET, "Ballet Dance");

                break;
            }
            default:
                System.out.println("Error. Not acceptable variant.");
                break;
        }
        System.out.println("Success. ");
    }
}
