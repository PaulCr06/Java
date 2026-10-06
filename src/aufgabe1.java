import java.util.ArrayList;
import java.util.List;

public class aufgabe1
{
    public List<Integer> NichtAusreichendeNoten(List<Integer> vec) {
        List<Integer> newvec = new ArrayList<>();

        for (int nota : vec) {
            if (nota < 40) {
                newvec.add(nota);
            }
        }

        return newvec;
    }
}
