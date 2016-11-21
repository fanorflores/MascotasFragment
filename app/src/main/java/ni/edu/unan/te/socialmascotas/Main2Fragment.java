package ni.edu.unan.te.socialmascotas;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Main2Fragment extends Fragment
{
    private ArrayList<PerfilMascota> mascotas;
    private RecyclerView listaMascotas;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_main2,container,false);
        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        generarGrid();
        inicializarMascotas();
        inicializarAdaptador();
        return v;
    }
    public void generarGrid() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),3);
        listaMascotas.setLayoutManager(gridLayoutManager);

    }
    public void inicializarAdaptador()
    {
        MascotaPerfilAdaptador mascotaAdaptador = new MascotaPerfilAdaptador(mascotas);
        listaMascotas.setAdapter(mascotaAdaptador);
    }
    public void inicializarMascotas()
    {
        mascotas = new ArrayList<PerfilMascota>();

        mascotas.add(new PerfilMascota(R.drawable.pluto, 5));
        mascotas.add(new PerfilMascota(R.drawable.pluto2, 7));
        mascotas.add(new PerfilMascota(R.drawable.pluto3, 4));
        mascotas.add(new PerfilMascota(R.drawable.pluto4, 8));
        mascotas.add(new PerfilMascota(R.drawable.pluto5, 6));
        mascotas.add(new PerfilMascota(R.drawable.pluto6, 5));
    }
}
