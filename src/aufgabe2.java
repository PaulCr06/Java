import java.util.List;

public class aufgabe2 {

    public int Maximal(List<Integer> vec){
        int max=0;
        for( int nr:vec){
            if(nr>max)
                max=nr;
        }
        return max;
    }
    public int Minimal(List<Integer> vec){
        int min=9999999;
        for( int nr:vec){
            if(nr<min)
                min=nr;
        }
        return min;
    }
    public int MaximaleSummeVon(List<Integer> vec){
        int sum=0;
        for( int nr:vec){
           sum+=nr;
        }
        return sum-Minimal(vec);
    }
    public int MinimaleSummeVon(List<Integer> vec){
        int sum=0;
        for( int nr:vec){
            sum+=nr;
        }
        return sum-Maximal(vec);
    }
}
