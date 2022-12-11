package number1;

public enum Seasons {
    Winter(1, -10),
    Spring(2, 15),
    Summer(3, 22),
    Autumn(4, 12);
    private final int levels;
    private int tempers;

    private Seasons(int levels, int tempers) {
        this.levels = levels;
        this.tempers = tempers;
    }

    public int getLevels() {
        return levels;
    }

    public int getTempers() {
        return tempers;
    }

    public void setTempers(int tempers) {
        this.tempers = tempers;
    }

    public static void getDescription(Seasons S) {
        switch (S) {
            case Summer:
                System.out.println("Теплое время года");
                break;
            case Winter:
                System.out.println("Холодное время года");
                break;
        }
    }
}
