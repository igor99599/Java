package number2;
public enum Size {
    XXS(32), XS(34), S(36), M(38), L(40);
    private final int euroSize;

    private Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public static void getDescription(Size s) {
        switch (s) {
            case S:
                System.out.println("Взрослый размер");
                break;
            case M:
                System.out.println("Взрослый размер ");
                break;
            case L:
                System.out.println("Взрослый размер  ");
                break;
            case XS:
                System.out.println("Детский размер");
                break;
            case XXS:
                System.out.println("Детский размер ");
                break;
        }
    }
}
