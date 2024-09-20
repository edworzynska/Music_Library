public class Main {
    public static void main(String[] args) {

        // Write a program in Java
        // that creates a class called "MusicLibrary" containing a collection of songs
        // as well as methods for adding, removing songs, and playing a random song.

        MusicLibrary library = new MusicLibrary();
        library.addSong(new Song("Karma Police", "Radiohead"));
        library.addSong(new Song("Parostatek", "Krzysztof Krawczyk"));
        library.addSong(new Song("Plug in baby", "Muse"));

        System.out.println("Contents of the library: ");
        for (Song song : library.getSongs()){
            System.out.println(song.getName() + " - " + song.getArtist());
        }
        System.out.println("Playing a random song: ");
        library.playRandomSong();
        System.out.println();
        library.playRandomSong();
    }
}