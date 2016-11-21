package ni.edu.unan.te.socialmascotas;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MainFragment extends Fragment
{
    private ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_main,container,false);
        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        generarLinearLayoutVertical();
        inicializarMascotas();
        inicializarAdaptador();
        return v;
    }
    public void generarLinearLayoutVertical() {
        LinearLayoutManager linearLayoutManager =  new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(linearLayoutManager);

    }
    public void inicializarAdaptador()
    {
        MascotaAdaptador mascotaAdaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(mascotaAdaptador);
    }
    public void inicializarMascotas()
    {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.pluto,"Puppy 1", 5));
        mascotas.add(new Mascota(R.drawable.pluto2,"Puppy 2", 7));
        mascotas.add(new Mascota(R.drawable.pluto3,"Puppy 3", 4));
        mascotas.add(new Mascota(R.drawable.pluto4,"Puppy 4", 8));
        mascotas.add(new Mascota(R.drawable.pluto5,"Puppy 5", 6));
        mascotas.add(new Mascota(R.drawable.pluto6,"Puppy 6", 5));
        mascotas.add(new Mascota(R.drawable.pluto7,"Puppy 7", 6));
    }
}
