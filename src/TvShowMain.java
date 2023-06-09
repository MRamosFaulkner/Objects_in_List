import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> tvShows = new ArrayList<>();

        System.out.print("TV Shows\n");
        System.out.println("Entering nothing will stop the loop \n");

        while (true) {

            System.out.println("Name of the show: ");

            String showName = scanner.nextLine();

            if (showName.isEmpty()) {
                break;
            }

            System.out.print("How many episodes: ");
            int numOfEpisodes = scanner.nextInt();
            scanner.nextLine();

            System.out.print("What is the genre?");
            String genre = scanner.nextLine();

            tvShows.add(new TvShow(showName, numOfEpisodes, genre));
        }

        for (TvShow shows : tvShows) {
            System.out.println(shows.toString());

        }

    }

}
