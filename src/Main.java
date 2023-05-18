import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String dna = "ATTGC";
        String modify = makeComplement(dna);
        System.out.println(modify   );

    }

    public static String makeComplement(String dna) {
        StringBuilder complementaryDna = new StringBuilder();
        HashMap<Character, Character> dnaKey = new HashMap<>();
        dnaKey.put('A', 'T');
        dnaKey.put('T', 'A');
        dnaKey.put('C', 'G');
        dnaKey.put('G', 'C');

        for (char c:dna.toCharArray()) {
            if(dnaKey.containsKey(c)){
                complementaryDna.append(dnaKey.get(c));
        }

        }

        return complementaryDna.toString();
    }

}