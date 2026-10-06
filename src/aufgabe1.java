public class aufgabe1
{
    public int CateNoteDeTrecere(int[]vec){
        int ct=0;
        for(int i=0;i< vec.length;i++){
            if(vec[i]>40)
               ct++;
        }
        return ct;
    }
    public int[] NichtAusreichendeNoten(int []vec){
        int []newvec=new int[vec.length-CateNoteDeTrecere(vec)];
        int l=0;
        for(int i=0;i< vec.length;i++){
            if(vec[i]<40)
                newvec[l++]=vec[i];
        }

        return newvec;
    }
}
