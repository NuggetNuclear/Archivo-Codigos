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

        void getData() {
            System.out.println("Nombre: " + getNombre() + " | artistaa: " + getArtista() + " | Album: " + getAlbum()
                    + " | Duración: " + (float) getDuracion() / 60 + " minutos");
        }
    }

    public static class Playlist {
        private

        String nombre;
        java.util.LinkedList<Cancion> Canciones = new java.util.LinkedList<>();
        Cancion[] PlaylistArray = new Cancion[10];
        int espacioDisponible, currentIndex;
        boolean isolatedSpace;

        public

        Playlist(String nombre) {
            this.nombre = nombre;

            espacioDisponible = 10;
            currentIndex = 0;

            for (int i = 0; i < PlaylistArray.length; i++) {
                PlaylistArray = null;
            }
        }

        String getNombre() {
            return nombre;
        }

        void addtoPlaylist(Cancion cancion) {
            Canciones.addLast(cancion);
            
            // Para despues: Añadir una forma de sincronizar las listas
        }

        void addtoPlaylistArray(Cancion cancion) {
            if (isolatedSpace) {

                PlaylistArray[currentIndex] = cancion;
                currentIndex++;
                isolatedSpace = false;

            } else if (espacioDisponible > 1) {

                PlaylistArray[currentIndex] = cancion;
                currentIndex++;
                espacioDisponible--;

            } else {

                Queue<Cancion> canciones = new LinkedList<>(); // Crea una nueva cola de canciones

                for (int i = 0; i < PlaylistArray.length - 1; i++) // Copia el arreglo a la cola
                {
                    canciones.add(PlaylistArray[i]);
                }

                int newSize = (PlaylistArray.length) + 10; // Calcula el nuevo tamaño del arreglo

                espacioDisponible = PlaylistArray.length - currentIndex; // Calcula el nuevo espacio disponible

                PlaylistArray = new Cancion[newSize]; // Crea el arreglo nuevo, sobreescribiendo el anterior

                for (int i = 0; i < PlaylistArray.length; i++) // Inicializa el nuevo arreglo en null
                {
                    PlaylistArray = null;
                }

                for (int i = 0; !canciones.isEmpty(); i++) // Copia los datos de la cola al arreglo nuevo
                {
                    PlaylistArray[i] = canciones.poll();
                }

                PlaylistArray[currentIndex] = cancion; // Añade la nueva canción al arreglo nuevo

                currentIndex++; // Actualiza el indice del próximo espacio vacío
            }

            // Para despues: Añadir una forma de sincronizar las listas
        }

        void removefromPlaylist(Cancion cancion) {

            Canciones.remove(cancion);

        }

        void removefromPlaylistArray(Cancion cancion) {

            for (int i = 0; i < currentIndex; i++) {

                if (cancion == PlaylistArray[i]) {

                    PlaylistArray[i] = null;
                    isolatedSpace = true;

                } else {

                    System.err.println("No se encotró la canción en el arreglo");
                }
            }
        }
    }

    public static void main(String[] args) {
    }
}
