package com.holamundo.personasmaterial;

import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Datos {

    private static String db = "Personas";
    private static DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReference();


    public static ArrayList<Persona> personas = new ArrayList();

    public static void agregar(Persona p){
        databaseReference.child (db).child(p.getId()).setValue(p);
    }

    public static String getId(){

      return databaseReference.push().getKey();

    }

    public static void setPersona(ArrayList<Persona>personas){
        Datos.personas=personas;


    }

    public static ArrayList<Persona> obtener(){
        return personas;
    }

}

