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
        public float DurchschnittSeitenAnzahl(List<String> titluri){
            float sum=0;
            for(String titlu : titluri){
                for(buch b :buecher){
                    if(Objects.equals(b.getTitel(), titlu)){
                        sum+=b.getSeitenanzahl();
                    }
                }
            }
            return  sum/ titluri.size();
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

