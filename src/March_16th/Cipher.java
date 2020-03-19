package March_16th;

public class Cipher {
    private String input;
    private int shift;

    private Cipher() {
        this.input = "Sample";
        this.shift = 3;
    }

    Cipher(String input, int shift) {
        this.input = input;
        this.shift = shift;
    }

    String cipher() {
        String newinput = "";
        for (int i = 0; i < input.length(); i++) {
            newinput += (char) (input.charAt(i) + shift);
        }
        input = newinput;
        return input;
    }

    String decipher() {
        String newinput = "";
        for (int i = 0; i < input.length(); i++) {
            newinput += (char) (input.charAt(i) - shift);
        }
        input = newinput;
        return input;
    }

    String getInput() {
        return input;
    }

    private void setInput(int shift) {
        this.shift = shift;
    }


    public static void main(String[] args) {
        Cipher x = new Cipher("hello", 3);
        System.out.println(x.getInput());
        x.cipher();
        System.out.println(x.getInput());
        x.decipher();
        System.out.println(x.getInput());
    }
}
