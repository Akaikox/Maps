import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        while (true) {
            HashMap<String, String>
                    lexicon = new HashMap<String, String>();

            lexicon.put("banan", "banana");
            lexicon.put("apelsin", "orange");
            lexicon.put("annanas", "pineapple");
            lexicon.put("Gustaf", "nub Scrub");

            Scanner sc = new Scanner(System.in);

            System.out.print("Skriv vad du vill översätta från svenska till engelska, skriv quit för att avsluta: ");
            String input = sc.next();


            if (input.equals("quit")) {
                System.exit(0);
            }

            if (lexicon.get(input) == null) {
                System.out.println("Word does not exist.\n");

            } else {

                System.out.println(input + " på svenska blir " + lexicon.get(input) + " på engelska.\n");
            }

        }


    }
}
