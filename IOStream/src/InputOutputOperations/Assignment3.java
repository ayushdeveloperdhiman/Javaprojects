package InputOutputOperations;

import java.io.*;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Assignment3 {
    public static void main(String[] args) throws IOException {

        File in = new File(args[0]);
        File out = new File(args[1]);

        BufferedReader br = new BufferedReader(new FileReader(in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(out));

        Map<String, Integer> map = new TreeMap<>();

        String str;
        while ((str = br.readLine()) != null) {
            str = str.trim();
            String[] words = str.split(" ");

            for (String word : words) {
                if (!map.containsKey(word))
                    map.put(word, 1);
                else
                    map.put(word, map.get(word) + 1);
            }
        }

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> me = it.next();

            bw.write(me.getKey() + " : " + me.getValue() + "\n");
        }

        br.close();
        bw.close();
    }
}
