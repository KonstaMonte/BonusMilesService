public class BonusMilesService {
    public int calculate(int ticketPrice) {

        int costMile = 20;
        int numberMiles = ticketPrice / costMile;


        return numberMiles;

    }

}
