import static java.lang.System.arraycopy;

public class SortingMerge {
    public static void sorts(Student[] a, int lo, int hi) {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        sorts(a, lo, mid);
        sorts(a, mid + 1, hi);
        Student[] buf = new Student[a.length];
        arraycopy(a, 0, buf, 0, a.length);
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j].getSum() < buf[i].getSum()) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
        for (int p =0;p< a.length;p++){
            System.out.println(a[p].getSum() + " " + a[p].getName());
        }
    }
}