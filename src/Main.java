/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        int random = (int) (Math.random() * 90 + 10);
        String result = String.format("Random number is %s. Please, try again", random);

        System.out.println(result);
    }
}
