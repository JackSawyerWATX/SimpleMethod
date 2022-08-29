class Main {
    public static void main(String[] args) {
        // public static int greatest
        System.out.println(greatest(1, 4));
    }

    public static int greatest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
