package Practice_4;
import java.util.Scanner;
public class Seasons {
    enum Season {
        SPRING(15),
        SUMMER(25),
        AUTUMN(10),
        WINTER(-5);

        private int averageTemperature;

        Season(int averageTemperature) {
            this.averageTemperature = averageTemperature;
        }
        public int getAverageTemperature() {
            return averageTemperature;
        }
        public String getDescription() {
            return "Beautiful season of year.";
        }
    }

    public static void main(String[] args) {
        Season favoriteSeason = Season.AUTUMN;
        System.out.println(favoriteSeason + " is my favorite season.");
        System.out.println("Average temperature: " + favoriteSeason.getAverageTemperature());
        System.out.println("Description of the season: " + favoriteSeason.getDescription());

        printSeasonInfo(Season.SPRING);
        printSeasonInfo(Season.SUMMER);
        printSeasonInfo(Season.AUTUMN);
        printSeasonInfo(Season.WINTER);
    }
    public static void printSeasonInfo(Season season) {
        switch (season) {
            case SUMMER:
                System.out.println("Summer is the hottest season of year.");
            case SPRING:
                System.out.println("Spring is a flowering time.");
            case AUTUMN:
                System.out.println("My favorite season is autumn.");
            case WINTER:
                System.out.println("Winter is the coldest season.");
        }
        System.out.println("Average temperature: " + season.getAverageTemperature());
        System.out.println("Description of season of year: " + season.getDescription());
    }
}
