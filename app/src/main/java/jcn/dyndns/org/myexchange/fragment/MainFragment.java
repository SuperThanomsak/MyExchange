package jcn.dyndns.org.myexchange.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import jcn.dyndns.org.myexchange.R;

/**
 * Created by Thanomsak-NB on 06/01/2561.
 */

public class MainFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

            // Exchange Controller
        exchangeController();



    } //main Method

    private void exchangeController() {
        Button button = getView().findViewById(R.id.btnExchange);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                initial view
             EditText editText = getView().findViewById(R.id.edtMoney);
             String moneyString  = editText.getText().toString().trim();
                if (moneyString.isEmpty()) {
//                    Have SpaceHave

                }




            } // onClick
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragement_main,container,false);
        return view;
    }

}// Main Class
