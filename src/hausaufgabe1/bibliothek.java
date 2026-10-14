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
        public buch MostExpensiveBuch(List<buch> bucher){
            buch maxbuch = null;
            int max=0;
            for( buch b :bucher){
                if(b.getPreis()>max) {
                    max = b.getPreis();
                    maxbuch = b;
                }
            }
            return maxbuch;
        }
    public List<buch> Mindestssetenanzahl(List<buch> bucher,int  minanzahl){
        List<buch> GuteBucher = new ArrayList<>();
        for(buch b :bucher){
            if (b.getSeitenanzahl()>=minanzahl){
                GuteBucher.add(b);
            }
        }
        return GuteBucher;
    }
    public List<buch> ZweiBuecherInnerhalbBudgets(List<buch> alleBuecher, int budget) {
        List<buch> bestesPaar = new ArrayList<>();
        buch bestesBuch1 = null;
        buch bestesBuch2 = null;

        int maxPreis = -1;
        int maxSeiten = -1;

        for (int i = 0; i < alleBuecher.size(); i++) {

            for (int j = i + 1; j < alleBuecher.size(); j++) {
                buch b1 = alleBuecher.get(i);
                buch b2 = alleBuecher.get(j);

                int gemeinsamerPreis = b1.getPreis() + b2.getPreis();


                if (gemeinsamerPreis <= budget) {
                    int gemeinsameSeiten = b1.getSeitenanzahl() + b2.getSeitenanzahl();


                    if (gemeinsamerPreis > maxPreis) {
                        maxPreis = gemeinsamerPreis;
                        maxSeiten = gemeinsameSeiten;
                        bestesBuch1 = b1;
                        bestesBuch2 = b2;
                    }

                    else if (gemeinsamerPreis == maxPreis) {
                        if (gemeinsameSeiten > maxSeiten) {
                            maxSeiten = gemeinsameSeiten;
                            bestesBuch1 = b1;
                            bestesBuch2 = b2;
                        }
                    }
                }
            }
        }


        if (bestesBuch1 != null && bestesBuch2 != null) {
            bestesPaar.add(bestesBuch1);
            bestesPaar.add(bestesBuch2);
        }

        return bestesPaar;
    }

    }

