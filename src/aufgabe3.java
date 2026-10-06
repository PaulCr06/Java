import java.util.ArrayList;
import java.util.List;

public class aufgabe3 {

    public List<Integer> Summe(List<Integer> vec1, List<Integer> vec2) {
        List<Integer> summe = new ArrayList<>();
        int c = 0;

        for (int i = vec1.size() - 1; i >= 0; i--) {

            int currentSum = vec1.get(i) + vec2.get(i) + c;

            summe.add(0, currentSum % 10);//insereaza la inceput

            c = currentSum / 10;
        }
        if (c > 0) {
            summe.add(0, c);
        }

        return summe;
    }
    public List<Integer> Differenz(List<Integer> vec1, List<Integer> vec2) {
        List<Integer> diferenta = new ArrayList<>();
        int borrow = 0;


        for (int i = vec1.size() - 1; i >= 0; i--) {

            int diff = vec1.get(i) - vec2.get(i) - borrow;

            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }


            diferenta.add(0, diff);
        }


        while (diferenta.size() > 1 && diferenta.get(0) == 0) {
            diferenta.remove(0);
        }

        return diferenta;
    }
    public List<Integer> Multiplikation(List<Integer> vec1,int nr) {
        List<Integer> produkt = new ArrayList<>();
        int c = 0;

        for (int i = vec1.size() - 1; i >= 0; i--) {

            int currentSum = (vec1.get(i) *nr)+c;

            produkt.add(0, currentSum % 10);//insereaza la inceput

            c = currentSum / 10;
        }
        if (c > 0) {
            produkt.add(0, c);
        }

        return produkt;
    }
    public List<Integer> Division(List<Integer> vec1, int nr) {
        if (nr == 0) {
            throw new IllegalArgumentException("Împărțirea la zero nu este permisă!");
        }

        List<Integer> cat = new ArrayList<>();
        int carry = 0;
        for (int i = 0; i < vec1.size(); i++) {

            int current = (carry * 10) + vec1.get(i);


            cat.add(current / nr);

            carry = current % nr;
        }


        while (cat.size() > 1 && cat.get(0) == 0) {
            cat.remove(0);
        }

        return cat;
    }
}
