package hausaufgabe1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class bibliothek {
        private List<buch> buecher;

        public bibliothek() {
            this.buecher = new ArrayList<>();
        }

        public void buchHinzufuegen(buch buch) {
            this.buecher.add(buch);
        }
        public List<buch> getBuecher(){
            return buecher;
        }

        // aufgabe 1
        public List<buch> findeBuecherVonAutor(String autor) {
            List<buch> gefundeneBuecher = new ArrayList<>();

            for (buch buch : buecher) {
                if (Objects.equals(buch.getAutor(), autor)) {
                    //IO.println("das");
                    gefundeneBuecher.add(buch);
                }
            }

            return gefundeneBuecher;
        }
    }

