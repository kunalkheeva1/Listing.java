import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Listing {
    public static void main(String[] args) {
        List<String> kk = new ArrayList<>();
        kk.add("Kunal");
        kk.add("Kheeva");
        Collections.addAll(kk,"Nav","Nitu","Kamal");
        System.out.println(kk);
        Collections.sort(kk);
    }
}
