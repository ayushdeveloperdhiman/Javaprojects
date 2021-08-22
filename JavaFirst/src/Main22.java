class Subsets
{
    static void printSubsets(int set[])
    {
        int n = set.length;
        System.out.print("[");
        for (int i = 0; i < (1<<n); i++)
        {

            System.out.print("[");
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + "");
            System.out.print("]");

            System.out.print(",");

        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args)
    {
        int set[] = {1,2,3};
        int set2[]={0};
        printSubsets(set);
        printSubsets(set2);
    }
}