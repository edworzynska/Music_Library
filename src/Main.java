public class Main {
    public static void main(String[] args) {

        //Napisz program w języku Java
        //tworzący klasę o nazwie „MusicLibrary” zawierającą zbiór utworów
        //oraz metody dodawania i usuwania utworów oraz odtwarzania losowego utworu.

        MusicLibrary biblioteka = new MusicLibrary();
        biblioteka.addSong(new Song("Waka waka", "Shakira"));
        biblioteka.addSong(new Song("Parostatek", "Krzysztof Krawczyk"));
        biblioteka.addSong(new Song("Pliki", "Malik Montana"));

        System.out.println("zawartosc biblioteki utworów: ");
        for (Song song : biblioteka.getSongs()){
            System.out.println(song.getName() + " - " + song.getArtist());
        }
        System.out.println("odtwarzam losową utwór: ");
        biblioteka.playRandomSong();
        System.out.println();
        biblioteka.playRandomSong();
    }
}