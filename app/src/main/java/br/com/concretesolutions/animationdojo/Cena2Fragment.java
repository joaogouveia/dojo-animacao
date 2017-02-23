package br.com.concretesolutions.animationdojo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.TextViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Cena2Fragment extends Fragment implements AnimationFragment{

    private TextView text;

    public static Cena2Fragment newInstance() {
        Cena2Fragment fragment = new Cena2Fragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_cena2, container, false);
        text = (TextView) layout.findViewById(R.id.cena2_text);

        text.setTranslationX(900);
        return layout;
    }

    @Override
    public void playAnimation() {
        text.setTranslationX(text.getTranslationX() == 0? 900 : 0);
    }
}
