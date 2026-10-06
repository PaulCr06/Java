import java.util.List;

void main() {

    List<Integer> vec = List.of(29, 37, 38, 41, 84, 67);
    List<Integer> vec2 = List.of(4, 8, 3, 10, 17);
    List<Integer> zahl1 = List.of(1 ,3, 0,0 ,0 ,0, 0, 0, 0);
    List<Integer> zahl2 = List.of(8, 7, 0,0, 0, 0, 0, 0, 0);

    aufgabe1 auf = new aufgabe1();
    aufgabe2 auf2=new aufgabe2();

    System.out.println(auf.NichtAusreichendeNoten(vec));
    float medie = auf.Durchschnitt(vec);
    System.out.printf("Durchschnitt: %.2f\n", medie);
    System.out.println(auf.AufRunden(vec));
    System.out.println(auf.HochsteNote(auf.AufRunden(vec)));

    System.out.print("maximale zahl ");
    System.out.println(auf2.Maximal(vec2));
    System.out.print("minimale  zahl ");
    System.out.println(auf2.Minimal(vec2));
    System.out.print("maximale summe von n-1 zahlen ");
    System.out.println(auf2.MaximaleSummeVon(vec2));
    System.out.print("minimale summe von n-1 zahlen ");
    System.out.println(auf2.MinimaleSummeVon(vec2));

}