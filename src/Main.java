import java.util.List;

void main() {

    List<Integer> vec = List.of(29, 37, 38, 41, 84, 67);

    aufgabe1 auf = new aufgabe1();


    System.out.println(auf.NichtAusreichendeNoten(vec));
    float medie = auf.Durchschnitt(vec);
    System.out.printf("Durchschnitt: %.2f\n", medie);
    System.out.println(auf.AufRunden(vec));
    System.out.println(auf.HochsteNote(auf.AufRunden(vec)));

}