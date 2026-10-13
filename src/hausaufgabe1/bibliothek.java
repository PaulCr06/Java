package hausaufgabe1;

import java.util.ArrayList;
import java.util.List;

    public class bibliothek {
        private List<buch> buecher;

        public bibliothek() {
            this.buecher = new ArrayList<>();
        }

        public void buchHinzufuegen(buch buch) {
            this.buecher.add(buch);
        }

        // Exercițiul 1: Bücher eines Autors
        public List<buch> findeBuecherVonAutor(String autor) {
            List<buch> gefundeneBuecher = new ArrayList<>();

            for (buch buch : buecher) {
                if (buch.getAutor().equalsIgnoreCase(autor)) {
                    gefundeneBuecher.add(buch);
                }
            }

            return gefundeneBuecher;
        }
    }

