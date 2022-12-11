package number13;

public class Test {
    public static void main(String[] args) {
        MyStringBuilder stringBuilder = new MyStringBuilder();
        stringBuilder.setObserver(new ConcretObserver());
        stringBuilder.append("ds");
        stringBuilder.reverse();
    }
}