package com.awakelab.oskar.ejercicio6m5imagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.awakelab.oskar.ejercicio6m5imagenes.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        initRecycler();
        setContentView(binding.getRoot());
    }

    private void initRecycler() {
        ArrayList<Usuario> datos = getUsuarios();
        UsuarioAdapter adapter = new UsuarioAdapter();
        adapter.setUsuarios(datos);

        binding.rvMain.setAdapter(adapter);
    }

    private ArrayList<Usuario> getUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Zhuo Cheng", "https://unsplash.com/photos/UBvtBr_FmrY/download?force=true&w=640"));
        usuarios.add(new Usuario("billow926", "https://unsplash.com/photos/pNoP-qVwBFQ/download?force=true&w=640"));
        usuarios.add(new Usuario("PhilippDeiß", "https://unsplash.com/photos/LfJx0gqqiEc/download?force=true&w=640"));
        usuarios.add(new Usuario("Huper by JoshuaEarle", "https://unsplash.com/photos/_p8gVNNsWw4/download?force=true&w=640"));
        usuarios.add(new Usuario("Melnychuk Nataliya", "https://unsplash.com/photos/rnPGCe7LsQo/download?force=true&w=640"));
        usuarios.add(new Usuario("Teagan Maddux", "https://unsplash.com/photos/k2DbTXQ0yrQ/download?force=true&w=640"));
        usuarios.add(new Usuario("Chen Liu", "https://unsplash.com/photos/kZH8X0q4Nvo/download?force=true&w=640"));
        usuarios.add(new Usuario("John Fornander", "https://unsplash.com/photos/iNqJx-VOceI/download?force=true&w=640"));
        usuarios.add(new Usuario("Parker Coffman", "https://unsplash.com/photos/mNWrQ9O6KZw/download?force=true&w=640"));
        usuarios.add(new Usuario("XPS", "https://unsplash.com/photos/8pb7Hq539Zw/download?force=true&w=640"));
        usuarios.add(new Usuario("Daniel J. Schwarz", "https://unsplash.com/photos/l8BvDmt8Ac4/download?force=true&w=640"));
        usuarios.add(new Usuario("Wesley Armstrong", "https://unsplash.com/photos/q0wqYpyWDpc/download?force=true&w=640"));

        return usuarios;
    }
}