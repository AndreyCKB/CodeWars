package kyu6;

//For building the encrypted string:
//Take every 2nd char from the string, then the other chars, that are not every 2nd char, and concat them as new String.
//Do this n times!
//
//Examples:
//
//"This is a test!", 1 -> "hsi  etTi sats!"
//"This is a test!", 2 -> "hsi  etTi sats!" -> "s eT ashi tist!"
//Write two methods:
//
//String encrypt(final String text, final int n)
//String decrypt(final String encryptedText, final int n)
//For both methods:
//If the input-string is null or empty return exactly this value!
//If n is <= 0 then return the input text.

public class SimpleEncryptionAlternatingSplit {
    private int length;
    private int middle;
    private int tempMiddleOfArr;
    private char[][] arr;

    public SimpleEncryptionAlternatingSplit(String text) {
        this.length = text.length();
        init(text);
    }

    private void init(String text) {
        if (length % 2 != 0) {
            this.length -= 2;
            this.middle = length / 2 + 1;
            this.arr = new char[][]{text.toCharArray(), text.toCharArray()};

        } else {
            this.middle = this.length / 2;
            this.arr = new char[][]{new char[this.length], text.toCharArray()};
        }
        this.tempMiddleOfArr = this.middle;
    }

    private void swapArr() {
        char[] temp = this.arr[0];
        this.arr[0] = this.arr[1];
        this.arr[1] = temp;
    }

    private char originalSymbol(int index){
        return arr[1][index];
    }

    private void changeSymbol(int index, char symbol){
        arr[0][index] = symbol;
    }

    private void updateParameters(){
        this.middle = tempMiddleOfArr;
        swapArr();
    }

    private String result(){
        return String.valueOf(arr[1]);
    }
    public static String encrypt(final String text, final int n) {
        // Your code here
        if (n < 1 || text == null || text.length() < 2)
            return text;
        SimpleEncryptionAlternatingSplit param = new SimpleEncryptionAlternatingSplit(text);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < param.length; j += 2) {
                param.changeSymbol(param.middle++, param.originalSymbol(j));
                param.changeSymbol(j / 2, param.originalSymbol(j + 1));

            }
                param.updateParameters();
        }
        return param.result();
    }

    public static String decrypt(final String encryptedText, final int n) {
        // Your code here
        if (n < 1 || encryptedText == null || encryptedText.length() < 2)
            return encryptedText;
        SimpleEncryptionAlternatingSplit param = new SimpleEncryptionAlternatingSplit(encryptedText);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < param.length; j += 2) {
                param.changeSymbol(j, param.originalSymbol(param.middle++));
                param.changeSymbol(j + 1, param.originalSymbol(j / 2));
            }
            param.updateParameters();
        }
        return param.result();
    }


}