public class MegaBytesConverter {
    public static void printMegabytesAndKiloBytes(int KiloBytes) {
        int megaBytes = KiloBytes / 1024;
        int remainder = KiloBytes % 1024;
        if (KiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(KiloBytes + " KB " + megaBytes + " MB " + remainder + " KB");
        }
    }
}
