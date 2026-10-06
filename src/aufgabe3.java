import java.util.ArrayList;
import java.util.List;

public class aufgabe3 {

    public List<Integer> Summe(List<Integer> vec1,List<Integer> vec2){
        List<Integer> summe=new ArrayList<>();
        for(int i=0;i<vec1.size();i++){
            summe.add(vec1.get(i)+vec2.get(i));
        }
        return summe;

    }
    public List<Integer> Differenz(List<Integer> vec1,List<Integer> vec2){
        List<Integer> diff=new ArrayList<>();
        for(int i=0;i<vec1.size();i++){
            diff.add(vec1.get(i)+vec2.get(i));
        }
        return diff;

    }
}
