class Main8
{
    private static void printOrder(char[][] ch)
    {
        System.out.println("Spiral order :");
        int t = 0, b = ch.length - 1;
        int l = 0, r = ch[0].length - 1;

        while (true)
        {
            if (l > r) {
                break;
            }

            // print top row
            for (int i = l; i <= r; i++) {
                System.out.print(ch[t][i] + " ");
            }
            t++;

            if (t > b) {
                break;
            }

            // print right column
            for (int i = t; i <= b; i++) {
                System.out.print(ch[i][r] + " ");
            }
            r--;

            if (l > r) {
                break;
            }

            // print bottom row
            for (int i = r; i >= l; i--) {
                System.out.print(ch[b][i] + " ");
            }
            b--;

            if (t > b) {
                break;
            }

            // print left column
            for (int i = b; i >= t; i--) {
                System.out.print(ch[i][l] + " ");
            }
            l++;
        }
    }

    public static void main(String[] args)
    {
        char[][] ch =
                {
                        { 'a', 'b', 'c', 'd', 'e'},
                        {'f', 'g', 'h', 'i', 'j'},
                        {'k', 'l', 'm', 'n', 'o'},
                        {'p', 'q', 'r', 's', 't'},
                        {'u', 'v', 'w', 'x', 'y'}

                };
        for(int i=0;i< ch.length;i++) {
            for (int j=0;j<ch[i].length;j++){
                System.out.print(ch[i][j]+"\t");
            }
            System.out.println();
        }

        printOrder(ch);
    }
}