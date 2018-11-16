package com.holamundo.personasmaterial;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class DetallePersona extends AppCompatActivity {
    private TextView lblCedula;
    private TextView lblNombre;
    private TextView lblApellido;
    private Bundle bundle;
    private Intent i;
    private ImageView foto;
    private String ced,nomb,apell,id,fot;
    private StorageReference storageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_persona);

        lblCedula=findViewById(R.id.txtCedula);
        lblNombre=findViewById(R.id.txtNombre);
        lblApellido=findViewById(R.id.txtApellido);
        foto= findViewById(R.id.fotoE);
        storageReference = FirebaseStorage.getInstance().getReference();
        i=getIntent();
        bundle = i.getBundleExtra("datos");

        ced = bundle.getString("cedula");
        nomb = bundle.getString("nombre");
        apell = bundle.getString("apellido");
        fot = bundle.getString("foto");
        id = bundle.getString("id");

        lblCedula.setText(ced);
        lblNombre.setText(nomb);
        lblApellido.setText(apell);



    }
}
