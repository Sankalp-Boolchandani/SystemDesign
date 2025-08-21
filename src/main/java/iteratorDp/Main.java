package iteratorDp;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        NameRepository nameRepository=new NameRepository(List.of("xd", "xd1", "xd2", "xd3"));
        Iterator<String> iterator = nameRepository.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
