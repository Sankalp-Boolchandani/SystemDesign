package iteratorDp;

import java.util.ArrayList;
import java.util.List;

public class NameIterator implements Iterator<String>{

    List<String> names;
    int index;

    public NameIterator(List<String> names) {
        this.names = names;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index<names.size();
    }

    @Override
    public String next() {
        if (hasNext()){
            return names.get(index++);
        }
        return null;
    }
}
