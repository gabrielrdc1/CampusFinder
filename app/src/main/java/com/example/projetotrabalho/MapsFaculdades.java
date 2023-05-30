package com.example.projetotrabalho;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFaculdades extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap gmap;
    FrameLayout map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_faculdades);

        map = findViewById(R.id.map);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        this.gmap = googleMap;

        LatLng mapBauru = new LatLng(-22.30476, -49.07177);
        this.gmap.addMarker(new MarkerOptions().position(mapBauru).title("Faculdade Anhanguera de Bauru"));
        this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapBauru));

        mapBauru = new LatLng(-22.32763, -49.05319);
        this.gmap.addMarker(new MarkerOptions().position(mapBauru).title("UNISAGRADO"));
        this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapBauru));

        mapBauru = new LatLng(-22.33473, -49.05835);
        this.gmap.addMarker(new MarkerOptions().position(mapBauru).title("USP - Universidade de São Paulo - Campus Bauru"));
        this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapBauru));

        mapBauru = new LatLng(-22.32449, -49.09427);
        this.gmap.addMarker(new MarkerOptions().position(mapBauru).title("Instituição Toledo de Ensino - ITE"));
        this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapBauru));

        mapBauru = new LatLng(-22.34478, -49.10725);
        this.gmap.addMarker(new MarkerOptions().position(mapBauru).title("Faculdades Integradas de Bauru"));
        this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapBauru));

        mapBauru = new LatLng(-22.34728, -49.03184);
        this.gmap.addMarker(new MarkerOptions().position(mapBauru).title("FAAC - Faculdades de Arquitetura, Artes e Comunicação - Câmpus de Bauru - Unesp"));
        this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapBauru));

        mapBauru = new LatLng(-22.36967, -49.03196);
        this.gmap.addMarker(new MarkerOptions().position(mapBauru).title("UNIP - Bauru"));
        this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapBauru));

        mapBauru = new LatLng(-22.33719, -49.05142);
        this.gmap.addMarker(new MarkerOptions().position(mapBauru).title("UNINOVE- Campus Bauru"));
        this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapBauru));
    }
}
