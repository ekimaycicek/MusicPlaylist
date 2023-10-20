import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {

    /*
         Bir müzik çalma listesi geliştiriyoruz ve kullanıcıların favori
          şarkılarını ekleyebilmeleri için bir mekanizma oluşturmanız gerekiyor.
          Ayrıca, kullanıcıların şarkıları silebilmeleri ve çalma listesini görebilmeleri için bir
          arabirim sağlamanız gerekiyor.
          */

    public static void main(String[] args) {

        ArrayList<String> playlist = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add song");
            System.out.println("2. Delete song");
            System.out.println("3. Show playlist");
            System.out.println("4. Exit");
            System.out.print("Make your choice: ");
            int vote = input.nextInt();
            input.nextLine(); 











            if (vote == 1) {
                System.out.print("Enter the song you want to add: ");
                String song = input.nextLine();
                playlist.add(song);
                System.out.println("Song successfully added.");
            } else if (vote == 2) {
                System.out.print("Enter the name of the song you want to delete: ");
                String SongToBeDeleted = input.nextLine();
                if (playlist.contains(SongToBeDeleted)) {
                    playlist.remove(SongToBeDeleted);
                    System.out.println("Song deleted successfully.");
                } else {
                    System.out.println("The specified song was not found in the playlist.");
                }
            } else if (vote == 3) {
                System.out.println("Playlist:");
                if (playlist.isEmpty()) {
                    System.out.println("Playlist is empty.");
                } else {
                    for (String song : playlist) {
                        System.out.println(song);
                    }
                }
            } else if (vote == 4) {
                System.out.println("Exiting the program...");
                break;
            } else {
                System.out.println("You have made an invalid choice. Try again.");
            }

            System.out.println();
        }

        input.close();
    }
}
