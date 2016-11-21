package ni.edu.unan.te.socialmascotas;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Felipe on 13/11/2016.
 */

class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>
{
    ArrayList<Mascota> Mascotas;
     public MascotaAdaptador( ArrayList<Mascota> Mascotas )
     {
        this.Mascotas= Mascotas;
     }


    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.detallemascota, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder holder, int position)
    {
        final Mascota mascota = Mascotas.get(position);
        holder.ivFotoDetalle.setImageResource(mascota.getFoto());
        holder.tvNamePuppy.setText(mascota.getNombre());
        holder.tvLikesDetalle.setText(""+mascota.getLikes());
    }

    @Override
    public int getItemCount() {
        return Mascotas.size();
    }


    public static class MascotaViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView ivFotoDetalle;
        private TextView tvNamePuppy;
        private TextView tvLikesDetalle;

        public MascotaViewHolder(View itemView)
        {
            super(itemView);
            ivFotoDetalle = (ImageView) itemView.findViewById(R.id.ivFotoDetalle);
            tvNamePuppy = (TextView) itemView.findViewById(R.id.TvNamePuppy);
            tvLikesDetalle = (TextView) itemView.findViewById(R.id.tvLikesDetalle);
        }
    }

}
