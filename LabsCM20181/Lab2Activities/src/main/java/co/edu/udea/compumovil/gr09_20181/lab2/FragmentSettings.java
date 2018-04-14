package co.edu.udea.compumovil.gr09_20181.lab2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSettings extends Fragment {

    private Button boton;
    private CheckBox cb1;
    private CheckBox cb2;


    public FragmentSettings() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        boton = (Button) view.findViewById(R.id.configPerfil);
        cb1 = (CheckBox)view.findViewById(R.id.autorizarnotificaciones);
        cb2 = (CheckBox) view.findViewById(R.id.activarnotificaciones);

        boton.setOnClickListener( new View.OnClickListener() {

            public void onClick(View view){

                String men = "";
                if(cb1.isChecked())men = men + "cb1,";
                if(cb2.isChecked())men = men + "cb2,";

            }

        });


        return view;
    }

}
