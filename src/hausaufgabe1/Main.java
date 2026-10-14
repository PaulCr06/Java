import hausaufgabe1.bibliothek;
import hausaufgabe1.buch;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    buch carte1=new buch("Clean Code","Robert Martin",45,464);
    buch carte2=new buch("1984","George Orwell",18,328);
    buch carte3=new buch("Animal Farm","George Orwell",12,112);
    buch carte4=new buch("Java Basics","Max Muller",35,520);
    buch carte5=new buch("The Hobbit","J. R. R. Tolkien",28,310);

    bibliothek biblioteca=new bibliothek();
    biblioteca.buchHinzufuegen(carte1);
    biblioteca.buchHinzufuegen(carte2);
    biblioteca.buchHinzufuegen(carte3);
    biblioteca.buchHinzufuegen(carte4);
    biblioteca.buchHinzufuegen(carte5);
    //aufgabe 1
    IO.print("Autor: ");
    String autor = IO.readln();
    if(biblioteca.findeBuecherVonAutor(autor).isEmpty())
        IO.println("Es gibt keine Buecher von diesem Autor");
    else{
        for (buch b : biblioteca.findeBuecherVonAutor(autor)) {
            IO.println(b.getTitel());
        }
    }



}
