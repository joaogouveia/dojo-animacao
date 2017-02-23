package br.com.concretesolutions.animationdojo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Cena4Fragment extends Fragment implements AnimationFragment{

    public static Cena4Fragment newInstance() {
        Cena4Fragment fragment = new Cena4Fragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cena4, container, false);
    }

    @Override
    public void playAnimation() {

    }
}
