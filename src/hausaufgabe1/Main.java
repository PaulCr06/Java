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
    IO.println("Welche Ubung wollen Sie losen(1-5): ");
    String choice= IO.readln();
    switch (choice){
        case "1":
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
            break;
        case "2":
            //aufgabe 2
            List<buch> books = List.of(carte3,carte4,carte5);
            for(buch b:books){
                IO.println(b.getTitel());
            }
            System.out.printf(Locale.US, "%.2f%n", biblioteca.DurchschnittSeitenAnzahl(books));
            break;
        case "3":
            //aufgabe 3
            IO.print("Maximaler Preis: ");
            String input = IO.readln();
            //ca sa scap de cuvantul euro si alte spatii libere
            int maxpreis = Integer.parseInt(input.replace("Euro", "").trim());

            for( buch carte:biblioteca.PreislimitBucher(biblioteca.getBuecher(),maxpreis)){
                IO.println(carte.getTitel());
            }
            break;
        case "4":
            //aufgabe4
            List<buch> carti = List.of(carte1,carte2,carte3);
            for (buch b: carti){
                IO.println(b.getTitel());
            }
            IO.println(biblioteca.MostExpensiveBuch(carti).getTitel()+"("+biblioteca.MostExpensiveBuch(carti).getPreis()+" Euro)");
            break;


    }











}
