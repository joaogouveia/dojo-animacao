package br.com.concretesolutions.animationdojo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Cena1Fragment extends Fragment implements AnimationFragment{

    ViewGroup root;
    View view;

    public static Cena1Fragment newInstance() {
        Cena1Fragment fragment = new Cena1Fragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_cena1, container, false);
        root = (ViewGroup) layout.findViewById(R.id.cena1_view_root);
        view = layout.findViewById(R.id.cena1_view1);
        return layout;
    }

    @Override
    public void playAnimation() {
        view.setVisibility(view.getVisibility() == View.VISIBLE? View.GONE : View.VISIBLE);
    }
}
