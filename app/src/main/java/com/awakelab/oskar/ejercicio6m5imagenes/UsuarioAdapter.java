package com.awakelab.oskar.ejercicio6m5imagenes;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.awakelab.oskar.ejercicio6m5imagenes.databinding.ItemBinding;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioAdapter.viewHolder> {

    ArrayList<Usuario> usuarios =new ArrayList<>();

    @NonNull
    @Override
    public UsuarioAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new viewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioAdapter.viewHolder holder, int position) {
        Usuario usuario = usuarios.get(position);
        holder.bind(usuario);

    }

    @Override
    public int getItemCount() {
        return usuarios.size();
    }

    public void setUsuarios(ArrayList<Usuario> datos) {
        this.usuarios = datos;
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
        private ItemBinding binding;

        public viewHolder(@NonNull ItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind (Usuario usuario) {
            binding.txtDescripcion.setText(usuario.getNombre());
            Glide.with(binding.getRoot()).load(usuario.getImagen()).into(binding.imgFoto);
        }
    }
}
