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

    MarkerOptions bl19;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gmap, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bl19 = new MarkerOptions().position(new LatLng(6.268242, -75.567333)).title("Bloque 19");

        MapFragment fragment = (MapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        fragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.addMarker(bl19);
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
