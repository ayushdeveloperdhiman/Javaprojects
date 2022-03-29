
public class VideoStore {
    Video[] store = new Video[0];

    void addVideo(String name){
        Video video = new Video(name);
        if(store.length == 0){
            store = new Video[1];
            store[0] = video;
        }else {
            Video[] copyArray = new Video[store.length];
            for(int i=0;i<store.length;i++){
                copyArray[i] = store[i];
            }
            store = new Video[copyArray.length +1];

            for(int i=0;i<copyArray.length;i++){
                store[i] = copyArray[i];
            }
            store[copyArray.length] = video;
        }

    }
    void doCheckout(String name){
        if(queryVideo(name)){
            if(store.length != 0){
                for(Video video: store){
                    if(video.getVideoName().equals(name)){
                        video.doCheckout();
                        System.out.print("video \""+ name + "\" checked out successfully.");
                    }
                }
            }
        } else{
            System.out.print("Video does not exist");
        }

    }

    void doReturn(String name){
        if(queryVideo(name)){
            if(store.length != 0){
                for(Video video: store){
                    if(video.getVideoName().equals(name)){
                        video.doReturn();
                        System.out.print("video \""+ name + "\" returned successfully.");
                    }
                }
            }
        }else {

        }

    }

    void receiveRating(String name,int rating){
        if(queryVideo(name)){
            if(store.length != 0){
                for(Video video: store){
                    if(video.getVideoName().equals(name)){
                        video.receiveRating(rating);
                        System.out.print("Rating \""+rating+"\" has been mapped to video \""+ name +"\".");
                    }
                }
            }
        }else{
            System.out.print("Video does not exist");
        }

    }

    void listInventory() {
        if (store == null || store.length == 0) {
            System.out.println("Store is empty");
            return;
        }
        System.out.print("---------------------------------------------------------------------------");
        System.out.printf("\n\t%-16s\t%-20s\t%-15s\n", "Video Name","Checkout Status","Rating");
        for (Video video : store) {
            System.out.printf("\n\t%-16s\t|\t%-16s\t|\t%-15s\n", video.getVideoName(), video.getCheckout(),video.getRating());
        }
        System.out.println("---------------------------------------------------------------------------");
    }

    private boolean queryVideo(String name){
        for(Video video : store){
            if (video.getVideoName().equals(name)){
                return true;
            }
        }
        return false;
    }

}
