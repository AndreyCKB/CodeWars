package kyu6;

public class DetectPangram {
    public boolean check(String sentence){
        //code
        int [] countChar = new int [123];

        sentence = sentence.toLowerCase();
        for (char c: sentence.toCharArray()){
            countChar[c]++;
        }

        for (int i = 97; i < 123; i++){
            if (countChar[i] == 0) return false;
        }

        return true;
    }
}
