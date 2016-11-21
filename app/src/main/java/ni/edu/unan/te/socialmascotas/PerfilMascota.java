package ni.edu.unan.te.socialmascotas;

/**
 * Created by Felipe on 13/11/2016.
 */

public class PerfilMascota
{
    private int foto;
    private  int likes;

    public PerfilMascota(){}
    public PerfilMascota(int foto, int likes)
    {
        this.foto=foto;

        this.likes=likes;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
