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

        boolean equals(Cancion cancion) {
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
        Cancion[] PlaylistArray0 = new Cancion[10];
        Cancion[] PlaylistArray1 = new Cancion[1];
        int espacioDisponible, currentIndex, arregloenUso;
        String nombre;

        public

        Playlist(String nombre) { // Constructor de la clase Playlist (asigna el nombre y inicializa las demás
                                  // variables)
            this.nombre = nombre;
            espacioDisponible = 10;
            currentIndex = 0;
            arregloenUso = 0;
        }

        String getNombre() {
            return nombre;
        }

        void getInformacion() { // Recorre la playlist (Linked List) y muestra la información de cada canción.
            System.out.println("Nombre de la playlist: " + nombre + "\nCanciones: ");
            for (Cancion cancion : Canciones) {
                cancion.getInformacion();
            }
        }

        void getInformacionArray() { // Recorre la playlist (Arreglo) y muestra la información de cada canción.
            System.out.println("Nombre de la playlist: " + nombre + "\nCanciones: ");
            if (arregloenUso == 0) {
                for (int i = 0; i < PlaylistArray0.length; i++) {
                    if (PlaylistArray0[i] != null) {
                        PlaylistArray0[i].getInformacion();
                    }
                }
            } else if (arregloenUso == 1) {
                for (int i = 0; i < PlaylistArray1.length; i++) {
                    if (PlaylistArray1[i] != null) {
                        PlaylistArray1[i].getInformacion();
                    }
                }
            }
        }

        void addtoPlaylist(Cancion cancion) {
            Canciones.addLast(cancion);
            // Para despues: Añadir una forma de sincronizar las listas
        }

        void addtoPlaylistArray(Cancion cancion) {
            if (espacioDisponible > 0) {

                // Si hay espacio disponible en el arreglo en uso, añado la cancion al arreglo y
                // actualizo las variables (indice y espacio disponible)

                if (arregloenUso == 0) {
                    PlaylistArray0[currentIndex] = cancion;
                    currentIndex++;
                    espacioDisponible--;
                } else if (arregloenUso == 1) {
                    PlaylistArray1[currentIndex] = cancion;
                    currentIndex++;
                    espacioDisponible--;
                }

            } else {

                // Si no hay espacio en el arreglo actual, aumento el tamaño del otro arreglo
                // (x1.5) y copio las canciones.

                if (arregloenUso == 0) {

                    PlaylistArray1 = new Cancion[(int) (PlaylistArray0.length * 1.5)];

                    System.arraycopy(PlaylistArray0, 0, PlaylistArray1, 0, PlaylistArray0.length);
                    // Arraycopy es un poco más eficiente que un for, por lo que uso eso para copiar
                    // las canciones, es parte de la librería estandar de java

                    espacioDisponible = PlaylistArray1.length - currentIndex - 1;
                    arregloenUso = 1;

                    PlaylistArray1[currentIndex] = cancion;

                } else if (arregloenUso == 1) {

                    PlaylistArray0 = new Cancion[(int) (PlaylistArray1.length * 1.5)];

                    System.arraycopy(PlaylistArray1, 0, PlaylistArray0, 0, PlaylistArray1.length);

                    espacioDisponible = PlaylistArray0.length - currentIndex - 1;
                    arregloenUso = 0;

                    PlaylistArray0[currentIndex] = cancion;
                }
            }

            // Para despues: Añadir una forma de sincronizar las listas

        }

        void removefromPlaylist(Cancion cancion) {

            Canciones.remove(cancion);

        }

        void removefromPlaylistArray(Cancion cancion) {

            if (arregloenUso == 0) {
                for (int i = 0; i < PlaylistArray0.length; i++) {
                    if (PlaylistArray0[i].equals(cancion) && i != PlaylistArray0.length - 1) {
                        PlaylistArray0[i] = PlaylistArray0[currentIndex - 1];
                        currentIndex--;
                        espacioDisponible++;
                    } else {
                        PlaylistArray0[i] = null;
                        currentIndex--;
                        espacioDisponible++;
                    }
                }
            } else if (arregloenUso == 1) {
                for (int i = 0; i < PlaylistArray1.length; i++) {
                    if (PlaylistArray1[i].equals(cancion) && i != PlaylistArray1.length - 1) {
                        PlaylistArray1[i] = PlaylistArray1[currentIndex - 1];
                        currentIndex--;
                        espacioDisponible++;
                    } else {
                        PlaylistArray1[i] = null;
                        currentIndex--;
                        espacioDisponible++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Cancion cancion1 = new Cancion("Cancion", "Artista", "Album", 184);

        Playlist playlist1 = new Playlist("Playlist1");
        Playlist playlist2 = new Playlist("Playlist2");

        for (int i = 0; i < 100000; i++) {

            playlist1.addtoPlaylistArray(cancion1);
            System.out.println(i);
        }

        System.out.println("Playlist 1 creada con 100,000 canciones");

        // 5,482 segundos en añadir 100,000 canciones (un cout por cada cancion)
        // 227 milisegundos en añadir 100,000 canciones (sin cout)

        for (int i = 0; i < 100000; i++) {

            playlist2.addtoPlaylist(cancion1);
            System.out.println(i);
        }

        System.out.println("Playlist 1 creada con 100,000 canciones");

        // 5,595 segundos en añadir 100,000 canciones (un cout por cada cancion)
        // 163 milisegundos en añadir 100,000 canciones (sin cout)

        // 10,086 segundos en añadir 100,000 canciones a cada Playlist (un cout por cada
        // cancion)

    }
}
