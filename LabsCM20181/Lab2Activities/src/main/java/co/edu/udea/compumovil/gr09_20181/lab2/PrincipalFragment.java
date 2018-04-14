package co.edu.udea.compumovil.gr09_20181.lab2;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrincipalFragment extends Fragment {

    ImageButton ib2,ib3;
    private Context context;



    public PrincipalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_principal, container, false);
        ib2 = (ImageButton) view.findViewById(R.id.imageButton2);
        ib3 = (ImageButton) view.findViewById(R.id.imageButton3);

        return view;

    }
    public void onClick1(View view) {
        //Intent click1 = new Intent(, MenuRegister.class);
        //startActivity(click1);
        Intent detail = new Intent(context.getApplicationContext(), MenuRegister.class);
        detail.putExtra("id", ib2.getId());
        context.startActivity(detail);
    }
    public void onClick2(View view) {
        //Intent click2 = new Intent(getApplicationContext(), DrinkRegister.class);
        //startActivity(click2);
        Intent detail = new Intent(context.getApplicationContext(), DrinkRegister.class);
        detail.putExtra("id", ib3.getId());
        context.startActivity(detail);
    }


}
