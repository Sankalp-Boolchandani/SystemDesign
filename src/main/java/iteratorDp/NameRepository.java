package iteratorDp;

import java.util.List;

public class NameRepository implements NameCollection{

    List<String> names;

    public NameRepository(List<String> names) {
        this.names = names;
    }

    @Override
    public Iterator<String> getIterator() {
        return new NameIterator(names);
    }
}
