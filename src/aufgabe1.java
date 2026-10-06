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

    public float Durchschnitt(List<Integer>vec){
        if (vec.isEmpty()) {
            return 0.0f;
        }

        float sum=0;
        for (int nota : vec) {
            sum+=nota;
        }
        return sum/vec.size();
    }
    public List<Integer> AufRunden(List<Integer> vec) {

        List<Integer> result = new ArrayList<>();
        for (int i=0;i<vec.size();i++) {

            int aux= vec.get(i);
            while(aux%5!=0){
                aux++;
            }
            if (aux-vec.get(i)<3 && vec.get(i)>=38) {
                result.add(aux);
            }
            else{

                result.add(vec.get(i));
            }

        }

        return result;
    }
    public int HochsteNote(List<Integer> vec){
        int max=0;
        for( int nota:vec){
            if(nota>max)
                max=nota;
        }
        return  max;
    }
}
