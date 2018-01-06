package jcn.dyndns.org.myexchange.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jcn.dyndns.org.myexchange.R;

/**
 * Created by Thanomsak-NB on 06/01/2561.
 */

public class MainFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragement_main,container,false);
        return view;
    }
}// Main Class
