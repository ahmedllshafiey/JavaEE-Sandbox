
public class Count {

    private static int count = 0;

    public static synchronized int getCount() {
        return ++count;
    }
}
