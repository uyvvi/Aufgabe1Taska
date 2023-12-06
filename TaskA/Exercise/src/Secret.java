public class Secret {
    public static void main(final String[] args) {
        System.console().format("%s%n", System.getProperty(String.valueOf(new Object() {
            public String toString() {
                StringBuffer b = new StringBuffer();
                java.util.Arrays.stream(new int[] {848, 776, 944, 776, 368, 944, 808, 880, 800, 888, 912, 368, 936, 912, 864})
                        .mapToObj(it -> (char) (it >> 3)).forEach(b::append);
                return b.toString();
            }
        })));
    }
}


// Ausgabe ist https://adoptium.net/de/