import java.util.*;

public class Spotify {
    public static class Song {
        private

        String name;
        String artist;
        String album;
        int duration;

        public

        Song(String name, String artist, String album, int duration)
        {
            this.name = name;
            this.artist = artist;
            this.album = album;
            this.duration = duration;
        }

        String getName()
        {
            return name;
        }

        String getArtist()
        {
            return artist;
        }

        String getAlbum()
        {
            return album;
        }

        int getDuration()
        {
            return duration;
        }

        void getData()
        {
            System.out.println("Nombre: " + name + " | Artista: " + artist + " | Album: " + album + " | Duración: " + (float)duration/60 + " minutos");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nombre: "); 
        String name = input.nextLine();
        System.out.println("Artista: "); 
        String artist = input.nextLine();
        System.out.println("Album: "); 
        String album = input.nextLine();
        System.out.println("Duración (en segundos): "); 
        int duration = input.nextInt();

        Song Cancion1 = new Song(name, artist, album, duration);

        Cancion1.getData();
        input.close();
    }
}
