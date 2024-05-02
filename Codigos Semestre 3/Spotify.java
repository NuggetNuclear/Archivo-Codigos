import java.util.LinkedList;
import java.util.Queue;

public class Spotify {
    public static class Cancion {
        private

        String nombre;
        String artista;
        String album;
        int duracion;

        public

        Cancion(String nombre, String artista, String album, int duracion) {
            this.nombre = nombre;
            this.artista = artista;
            this.album = album;
            this.duracion = duracion;
        }

        String getNombre() {
            return nombre;
        }

        String getArtista() {
            return artista;
        }

        String getAlbum() {
            return album;
        }

        int getDuracion() {
            return duracion;
        }

        void getInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Artista: " + artista);
            System.out.println("Album: " + album);
            System.out.println("Duracion: " + (int) duracion / 60 + ":" + duracion % 60);
        }

        boolean comparar(Cancion cancion) {
            if (cancion.getNombre() != nombre) {
                return false;
            } else if (cancion.getArtista() != artista) {
                return false;
            } else if (cancion.getAlbum() != album) {
                return false;
            } else if (cancion.getDuracion() != duracion) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static class Playlist {
        private

        java.util.LinkedList<Cancion> Canciones = new java.util.LinkedList<>();
        Cancion[] PlaylistArray = new Cancion[10];
        int espacioDisponible, currentIndex;
        String nombre;

        public

        Playlist(String nombre) {
            this.nombre = nombre;
            espacioDisponible = 10;
            currentIndex = 0;
        }

        String getNombre() {
            return nombre;
        }

        void getInformacion() { // Recorre la lista de canciones y muestra la información de cada una
            System.out.println("\nNombre: " + nombre + "\n");
            System.out.println("Canciones: ");
            for (Cancion cancion : Canciones) {
                cancion.getInformacion();
            }
        }

        void addtoPlaylist(Cancion cancion) {
            Canciones.addLast(cancion);
            ;

            // Para despues: Añadir una forma de sincronizar las listas
        }

        void addtoPlaylistArray(Cancion cancion) {
            if (espacioDisponible > 0) {

                PlaylistArray[currentIndex] = cancion;
                System.out.println("Añadido a la posición (" + currentIndex + ") del arreglo");
                currentIndex++;
                espacioDisponible--;
                System.out.println("Espacio disponible al salir: " + espacioDisponible);

            } else {
                System.out.println("\nArreglo lleno, creando uno nuevo\n");
                Queue<Cancion> canciones = new LinkedList<>();

                for (int i = 0; i < PlaylistArray.length; i++) { // 0 a 9
                    canciones.add(PlaylistArray[i]);
                    System.out
                            .println("Tamaño del arreglo: " + PlaylistArray.length + " Copiando canción N°: " + i + " a la cola | currentIndex: " + currentIndex);
                }

                int newSize = (PlaylistArray.length) + 10;

                espacioDisponible = newSize - currentIndex - 1;

                PlaylistArray = new Cancion[newSize];

                for (int i = 0; !canciones.isEmpty(); i++) {
                    PlaylistArray[i] = canciones.poll();
                }

                PlaylistArray[currentIndex] = cancion;
                System.out.println("Añadido a la posición (" + currentIndex + ") del arreglo, espacio disponible: " + espacioDisponible + "\n");

                currentIndex++; // Actualiza el indice del próximo espacio vacío
            }

            // Para despues: Añadir una forma de sincronizar las listas
        }

        void removefromPlaylist(Cancion cancion) {

            Canciones.remove(cancion);

        }

        void removefromPlaylistArray(Cancion cancion) {

            for (int i = 0; i < currentIndex; i++) {

                if (PlaylistArray[i].equals(cancion)) {

                    PlaylistArray[i] = null;
                    break;

                }
            }
        }
    }

    public static void main(String[] args) {

        Cancion cancion1 = new Cancion("Cancion1", "Artista1", "Album1", 180);
        Cancion cancion2 = new Cancion("Cancion2", "Artista2", "Album2", 200);
        Cancion cancion3 = new Cancion("Cancion3", "Artista3", "Album3", 220);
        Cancion cancion4 = new Cancion("Cancion4", "Artista4", "Album4", 240);

        Playlist playlist1 = new Playlist("Playlist1");

        playlist1.addtoPlaylist(cancion1);
        playlist1.addtoPlaylist(cancion2);
        playlist1.addtoPlaylist(cancion3);
        playlist1.addtoPlaylist(cancion4);

        Playlist playlist2 = new Playlist("Playlist2");

        playlist2.addtoPlaylistArray(cancion1);
        playlist2.addtoPlaylistArray(cancion2);
        playlist2.addtoPlaylistArray(cancion3);
        playlist2.addtoPlaylistArray(cancion4);
        playlist2.addtoPlaylistArray(cancion1);
        playlist2.addtoPlaylistArray(cancion2);
        playlist2.addtoPlaylistArray(cancion3);
        playlist2.addtoPlaylistArray(cancion4);
        playlist2.addtoPlaylistArray(cancion1);
        playlist2.addtoPlaylistArray(cancion2);
        playlist2.addtoPlaylistArray(cancion3);
        playlist2.addtoPlaylistArray(cancion4);
        playlist2.addtoPlaylistArray(cancion1);
        playlist2.addtoPlaylistArray(cancion2);
        playlist2.addtoPlaylistArray(cancion3);
        playlist2.addtoPlaylistArray(cancion4);
        playlist2.addtoPlaylistArray(cancion1);
        playlist2.addtoPlaylistArray(cancion2);
        playlist2.addtoPlaylistArray(cancion3);
        playlist2.addtoPlaylistArray(cancion4);
        playlist2.addtoPlaylistArray(cancion1);
        playlist2.addtoPlaylistArray(cancion2);
        playlist2.addtoPlaylistArray(cancion3);
        playlist2.addtoPlaylistArray(cancion4);
        playlist2.addtoPlaylistArray(cancion1);
        playlist2.addtoPlaylistArray(cancion2);
        playlist2.addtoPlaylistArray(cancion3);
        playlist2.addtoPlaylistArray(cancion4);
        playlist2.addtoPlaylistArray(cancion1);
        playlist2.addtoPlaylistArray(cancion2);
        playlist2.addtoPlaylistArray(cancion3);
        playlist2.addtoPlaylistArray(cancion4);
        playlist2.addtoPlaylistArray(cancion1);
        playlist2.addtoPlaylistArray(cancion2);
        playlist2.addtoPlaylistArray(cancion3);
        playlist2.addtoPlaylistArray(cancion4);
        playlist2.addtoPlaylistArray(cancion1);
        playlist2.addtoPlaylistArray(cancion2);
        playlist2.addtoPlaylistArray(cancion3);
        playlist2.addtoPlaylistArray(cancion4);
        playlist2.addtoPlaylistArray(cancion1);
        playlist2.addtoPlaylistArray(cancion2);
        playlist2.addtoPlaylistArray(cancion3);
        playlist2.addtoPlaylistArray(cancion4);
        playlist2.addtoPlaylistArray(cancion1);
        playlist2.addtoPlaylistArray(cancion2);
        playlist2.addtoPlaylistArray(cancion3);
        playlist2.addtoPlaylistArray(cancion4);
        playlist2.addtoPlaylistArray(cancion1);
        playlist2.addtoPlaylistArray(cancion2);
        playlist2.addtoPlaylistArray(cancion3);
        playlist2.addtoPlaylistArray(cancion4);
        playlist2.addtoPlaylistArray(cancion1);
        playlist2.addtoPlaylistArray(cancion2);
        playlist2.addtoPlaylistArray(cancion3);
        playlist2.addtoPlaylistArray(cancion4);
        playlist2.addtoPlaylistArray(cancion1);
        playlist2.addtoPlaylistArray(cancion2);
        playlist2.addtoPlaylistArray(cancion3);
        playlist2.addtoPlaylistArray(cancion4);
        playlist2.addtoPlaylistArray(cancion1);
        playlist2.addtoPlaylistArray(cancion2);
        playlist2.addtoPlaylistArray(cancion3);
        playlist2.addtoPlaylistArray(cancion4);

        playlist1.getInformacion();

        playlist1.removefromPlaylist(cancion2);

        playlist1.getInformacion();

    }
}
