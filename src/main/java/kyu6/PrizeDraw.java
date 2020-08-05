package kyu6;

import java.util.*;

/*
An array of random weights is linked to the firstnames and each som is multiplied by its corresponding weight to get what they call a winning number.

Example:

names: "COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH"
weights: [1, 4, 4, 5, 2, 1]

PauL -> som = length of firstname + 16 + 1 + 21 + 12 = 4 + 50 -> 54
The *weight* associated with PauL is 2 so PauL's *winning number* is 54 * 2 = 108.
Now one can sort the firstnames in decreasing order of the winning numbers. When two people have the same winning number sort them alphabetically by their firstnames.

Task:
parameters: st a string of firstnames, we an array of weights, n a rank

return: the firstname of the participant whose rank is n (ranks are numbered from 1)

Example:
names: "COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH"
weights: [1, 4, 4, 5, 2, 1]
n: 4

The function should return: "PauL"
Note:
If st is empty return "No participants".

If n is greater than the number of participants then return "Not enough participants".

See Examples Test Cases for more examples.
 */
public class PrizeDraw {


    public static String nthRank(String st, Integer[] we, int n) {
        // your code
        if (st == null || st.isEmpty()) return  "No participants";

        String[] names = st.split(",");
        int length = names.length;
        if (n > length) return  "Not enough participants";

        Player[] players = new Player[length];
        for (int i = 0; i < length; i++){
            players[i] = new Player(we[i], names[i]);
        }

        Arrays.sort(players);

        return players[n-1].name;
    }

    public static void main(String[] args) {
        String st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
        Integer[] we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
        System.out.println(PrizeDraw.nthRank(st, we, 6));
    }

}
class Player implements Comparable<Player>{
    private int som;
    final String name;

    public Player(int we, String name) {
        this.name = name;
        initSoms(we);
    }

    private void initSoms(Integer we){
        char[] chars = this.name.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++){
            this.som += chars[i] - 96;
        }
        this.som = (this.som + chars.length) * we;
    }

    public int getSom() {
        return som;
    }

    @Override
    public int compareTo(Player o) {
        if (this.som != o.getSom()) {
            return this.som > o.getSom() ? -1 : 1;
        } else return this.name.compareTo(o.name);
    }
}