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
        public float DurchschnittSeitenAnzahl(List<buch> uebergebeneBuecher) {
            if (uebergebeneBuecher == null || uebergebeneBuecher.isEmpty()) {
                return 0;
            }

            float sum = 0;
            for (buch b : uebergebeneBuecher) {
                sum += b.getSeitenanzahl();
            }

            return sum / uebergebeneBuecher.size();
        }

        public List<buch> PreislimitBucher(List<buch> bucher,int  maxpreis){
            List<buch> GuteBucher = new ArrayList<>();
            for(buch b :bucher){
                if (b.getPreis()<=maxpreis){
                    GuteBucher.add(b);
                }
            }
            return GuteBucher;
        }
    }

