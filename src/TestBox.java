import java.util.Arrays;
import java.util.Calendar;
import static java.lang.System.out;
import java.util.Date;

public class TestBox {
    static int DAY_IM = 1000* 60 * 60 * 24;

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2004, 0, 7, 15, 40);
        long day1 = c.getTimeInMillis();
        int i=0;
        while (i<3) {
            day1 += (DAY_IM * 29.52);
            c.setTimeInMillis(day1);
            out.println(String.format("Полнолуние было в %tc", c));
            i++;
        }
    }
}
