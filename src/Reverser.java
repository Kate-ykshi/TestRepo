public class Reverser {
    static void reverse(char[] text) {
        reverse(text, 0);
    }

    /**
     * Recursively reverses the values in the input array.
     * The result will be put back into the original array.
     *
     * @param text the character array to reverse
     * @param i    the current index being processed
     */
    static void reverse(char[] text, int i) {
        // Add your code here.
        if (i>=text.length/2)
           return;

        char temp = text[i];
        text[i] = text[text.length-1-i];
        text[text.length-1-i] = temp;

        reverse(text,++i);
    }



    public static void main(String[] args) {
        char[] text = "HELLO WORLD!".toCharArray();
        reverse(text);
        System.out.println("<" + new String(text) + ">");

        reverse(text);
        System.out.println("<" + new String(text) + ">");
    }
}