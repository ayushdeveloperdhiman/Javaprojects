import java.util.Scanner;

public class VideoLauncher {

    public static void main(String[] args) {
        int input;
        boolean exit=false;
        Scanner s = new Scanner(System.in);
        VideoStore videoStore = new VideoStore();

        while(!exit) {
            System.out.println("\n1. Add Videos : "+"\n"+"2. Check Out Video : "+"\n"+"3. Return Video : "+
                    "\n"+"4. Receive Rating : "+"\n"+"5. List Inventory : "+"\n"+"6. Exit : ");
            System.out.print("Enter Your Choice (1..6) : ");

            String name;
            input = s.nextInt();
            s.nextLine();

            switch(input) {
                case 1:
                    System.out.print("Enter the name of video you want to add: ");
                    name = s.nextLine();
                    videoStore.addVideo(name);
                    System.out.print("video \""+ name + "\" added successfully.");
                    break;

                case 2:
                    System.out.print("Enter the name of video you want to check out: ");
                    name = s.nextLine();
                    videoStore.doCheckout(name);
                    break;

                case 3:
                    System.out.print("Enter the name of video you want to return: ");
                    name = s.nextLine();
                    videoStore.doReturn(name);
                    break;

                case 4:
                    System.out.print("Enter the name of video you want to rate: ");
                    name = s.nextLine();
                    System.out.print("Enter the rating for this video: ");
                    int rating = s.nextInt();
                    videoStore.receiveRating(name, rating);
                    break;

                case 5:
                    videoStore.listInventory();
                    break;

                case 6:
                    System.out.println("Exiting...!! Thanks for using the application.");
                    exit = true;
                    break;

                default:
                    System.out.println("Wrong input !!!");
            }
        }
    }

}