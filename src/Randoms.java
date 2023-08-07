import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private List<Integer> list = new ArrayList<>();
    protected Random random;

    public Randoms(int min, int max) {
        random = new Random();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return list.get(random.nextInt(list.size()));
            }
        };
    }
}
