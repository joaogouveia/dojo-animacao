package br.com.concretesolutions.animationdojo;

import android.animation.Animator;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Cena3Fragment extends Fragment implements AnimationFragment {

    private View view1;
    private View view2;

    public static Cena3Fragment newInstance() {
        Cena3Fragment fragment = new Cena3Fragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_cena3, container, false);
        view1 = layout.findViewById(R.id.cena3_view1);
        return layout;
    }

    @Override
    public void playAnimation() {
        if (view1.getVisibility() == View.GONE) {
            view1.setVisibility(View.VISIBLE);
        } else {
            view1.setVisibility(View.GONE);
        }
    }
}
