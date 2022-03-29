public class Video {
    private String videoName;
    private boolean checkout;
    private int rating;

    public Video(String name){
        videoName = name;
    }

    public String getVideoName() {
        return videoName;
    }

    void doCheckout (){
        checkout = true;
    }

    void doReturn(){
        checkout = false;
    }

    void receiveRating(int rating){
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }


}
