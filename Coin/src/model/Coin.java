package model;

public class Coin {

    private  double coinValue;
    private String coinShows;
    // sets coin to either heads or tails
    // requires
    // modifies
    // effects: sets coinValue to heads or tails at random
    public void flip() {
        coinValue = 1 * Math.random();
        if (coinValue < 0.5) {
            coinShows = "heads";
        } else {
            coinShows = "tails";
        }
    }

    // checks whether coin is heads or tails
    // requires
    // modifies
    // effects: returns heads or tails
    public String checkStatus() {

        if (coinValue < 0.5) {
            coinShows = "heads";
        } else {
            coinShows = "tails";
        }
        return coinShows;
    }
}
