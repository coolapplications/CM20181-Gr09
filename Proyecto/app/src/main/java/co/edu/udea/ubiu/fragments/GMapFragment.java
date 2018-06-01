package co.edu.udea.ubiu.fragments;

import android.Manifest;
import android.app.Fragment;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
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

    MarkerOptions[] blocks = new MarkerOptions[29];
    String selectedBlock = "Bloque 1";
    float generalAlpha = 0.3f;
    float[][] latLngs = {
            {6.2655f,-75.5686f},
            {6.2657f,-75.5680f},
            {6.2660f,-75.5682f},
            {6.2663f,-75.5680f},
            {6.2666f,-75.5683f},
            {6.2664f,-75.5688f},
            {6.2659f,-75.5688f},
            {6.2668f,-75.5692f},
            {6.2657f,-75.5690f},
            {6.2663f,-75.5699f},
            {6.2667f,-75.5698f},
            {6.2669f,-75.5703f},
            {6.2665f,-75.5704f},
            {6.2661f,-75.5704f},
            {6.2673f,-75.5698f},
            {6.2674f,-75.5683f},
            {6.2669f,-75.5690f},
            {6.2677f,-75.5673f},
            {6.2682f,-75.5673f},
            {6.2683f,-75.5680f},
            {6.2679f,-75.5680f},
            {6.2681f,-75.5686f},
            {6.2679f,-75.5693f},
            {6.2681f,-75.5698f},
            {6.2677f,-75.5698f},
            {6.2684f,-75.5691f},
            {6.2694f,-75.5682f},
            {6.2690f,-75.5670f},
            {6.2687f,-75.5669f}
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_gmap, container, false);
        if(this.getArguments() != null) {
            Bundle bundle = this.getArguments();
            selectedBlock = bundle.getString("block");
        }
        return v;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        for(int i = 0; i < blocks.length; i++){
            blocks[i] = new MarkerOptions().position(new LatLng(latLngs[i][0],latLngs[i][1])).title("Bloque " + String.valueOf(i+1)).alpha(generalAlpha);
            if(selectedBlock == "Bloque "+String.valueOf(i+1)){
                blocks[i] = new MarkerOptions().position(new LatLng(latLngs[i][0],latLngs[i][1])).title("Bloque " + String.valueOf(i+1));
            }
        }



        MapFragment fragment = (MapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        fragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        for(int i = 0; i < blocks.length; i++){

            mMap.addMarker(blocks[i]);

        }

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
