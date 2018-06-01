package co.edu.udea.ubiu.fragments;

import android.Manifest;
import android.app.Fragment;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import co.edu.udea.ubiu.R;

/**
 * Created by AndresAlvarez on 9/05/18.
 */

public class GMapFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;
    LatLng medellin = new LatLng(6.2674, -75.5688);
    LatLng aero = new LatLng(6.270283, -75.569916);
    LatLng ing = new LatLng(6.269368, -75.566685);
    LatLng quilla = new LatLng(6.265207, -75.567844);
    LatLng humanas = new LatLng(6.265601, -75.570835);

    MarkerOptions bl1,bl2,bl3,bl4,bl5,bl6,bl7,bl8,bl9,bl20,bl10,
            bl11,bl12,bl13,bl14,bl15,bl16,bl17,bl18,bl19,bl21,bl22,bl23,bl24,bl25,bl26,
            bl27,bl28,bl29;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gmap, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bl1 = new MarkerOptions().position(new LatLng(6.2655,
                -75.5686)).title("Bloque 1").alpha(0.3f);
        bl2 = new MarkerOptions().position(new LatLng(6.2657,
                -75.5680)).title("Bloque 2").alpha(0.3f);
        bl3 = new MarkerOptions().position(new LatLng(6.2660,
                -75.5682)).title("Bloque 3").alpha(0.3f);
        bl4 = new MarkerOptions().position(new LatLng(6.2663,
                -75.5680)).title("Bloque 4").alpha(0.3f);
        bl5 = new MarkerOptions().position(new LatLng(6.2666,
                -75.5683)).title("Bloque 5").alpha(0.3f);
        bl6 = new MarkerOptions().position(new LatLng(6.2664,
                -75.5688)).title("Bloque 6").alpha(0.3f);
        bl7 = new MarkerOptions().position(new LatLng(6.2659,
                -75.5688)).title("Bloque 7").alpha(0.3f);
        bl8 = new MarkerOptions().position(new LatLng(6.2668,
                -75.5692)).title("Bloque 8").alpha(0.3f);
        bl9 = new MarkerOptions().position(new LatLng(6.2657,
                -75.5690)).title("Bloque 9").alpha(0.3f);
        bl10 = new MarkerOptions().position(new LatLng(6.2663,
                -75.5699)).title("Bloque 10").alpha(0.3f);
        bl11 = new MarkerOptions().position(new LatLng(6.2667,
                -75.5698)).title("Bloque 11").alpha(0.3f);
        bl12 = new MarkerOptions().position(new LatLng(6.2669,
                -75.5703)).title("Bloque 12").alpha(0.3f);
        bl13 = new MarkerOptions().position(new LatLng(6.2665,
                -75.5704)).title("Bloque 13").alpha(0.3f);
        bl14 = new MarkerOptions().position(new LatLng(6.2661,
                -75.5704)).title("Bloque 14").alpha(0.3f);
        bl15 = new MarkerOptions().position(new LatLng(6.2673,
                -75.5698)).title("Bloque 15").alpha(0.3f);
        bl16 = new MarkerOptions().position(new LatLng(6.2674,
                -75.5683)).title("Bloque 16").alpha(0.3f);
        bl17 = new MarkerOptions().position(new LatLng(6.2669,
                -75.5690)).title("Bloque 17").alpha(0.3f);
        bl18 = new MarkerOptions().position(new LatLng(6.2677,
                -75.5673)).title("Bloque 18").alpha(0.3f);
        bl19 = new MarkerOptions().position(new LatLng(6.2682,
                -75.5673)).title("Bloque 19").alpha(0.3f);
        bl20 = new MarkerOptions().position(new LatLng(6.2683,
                -75.5680)).title("Bloque 20").alpha(0.3f);
        bl21 = new MarkerOptions().position(new LatLng(6.2679,
                -75.5680)).title("Bloque 21").alpha(0.3f);
        bl22 = new MarkerOptions().position(new LatLng(6.2681,
                -75.5686)).title("Bloque 22").alpha(0.3f);
        bl23 = new MarkerOptions().position(new LatLng(6.2679,
                -75.5693)).title("Bloque 23").alpha(0.3f);
        bl24 = new MarkerOptions().position(new LatLng(6.2681,
                -75.5698)).title("Bloque 24").alpha(0.3f);
        bl25 = new MarkerOptions().position(new LatLng(6.2677,
                -75.5698)).title("Bloque 25").alpha(0.3f);
        bl26 = new MarkerOptions().position(new LatLng(6.2684,
                -75.5691)).title("Bloque 26").alpha(0.3f);
        bl27 = new MarkerOptions().position(new LatLng(6.2694,
                -75.5682)).title("Bloque 27").alpha(0.3f);
        bl28 = new MarkerOptions().position(new LatLng(6.2690,
                -75.5670)).title("Bloque 28").alpha(0.3f);
        bl29 = new MarkerOptions().position(new LatLng(6.2687,
                -75.5669)).title("Bloque 29").alpha(0.3f);

        MapFragment fragment = (MapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        fragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.addMarker(bl1);
        mMap.addMarker(bl2);
        mMap.addMarker(bl3);
        mMap.addMarker(bl4);
        mMap.addMarker(bl5);
        mMap.addMarker(bl6);
        mMap.addMarker(bl7);
        mMap.addMarker(bl8);
        mMap.addMarker(bl9);
        mMap.addMarker(bl10);
        mMap.addMarker(bl11);
        mMap.addMarker(bl12);
        mMap.addMarker(bl13);
        mMap.addMarker(bl14);
        mMap.addMarker(bl15);
        mMap.addMarker(bl16);
        mMap.addMarker(bl17);
        mMap.addMarker(bl18);
        mMap.addMarker(bl19);
        mMap.addMarker(bl20);
        mMap.addMarker(bl21);
        mMap.addMarker(bl22);
        mMap.addMarker(bl23);
        mMap.addMarker(bl24);
        mMap.addMarker(bl25);
        mMap.addMarker(bl26);
        mMap.addMarker(bl27);
        mMap.addMarker(bl28);
        mMap.addMarker(bl29);
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        CameraPosition inicialPos = CameraPosition.builder().target(medellin).zoom(17).tilt(0).build();
        mMap.moveCamera(CameraUpdateFactory.newCameraPosition(inicialPos));
        mMap.addPolyline(new PolylineOptions().geodesic(true).color(Color.LTGRAY).add(ing).add(quilla).add(humanas).add(aero).add(ing));
        if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        } else {
            // Show rationale and request permission.
        }
    }
}
