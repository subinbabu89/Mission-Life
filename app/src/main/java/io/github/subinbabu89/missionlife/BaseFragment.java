package io.github.subinbabu89.missionlife;


import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseFragment extends Fragment {

    private View parent;

    public BaseFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(initLayoutID(), container, false);
        ButterKnife.bind(this, view);
        this.parent = view;
        customizeFragment();
        return view;
    }

    public BaseFragment initWithBundle(Bundle bundle){
        this.setArguments(bundle);
        return this;
    }

    public View getParent() {
        return parent;
    }

    public abstract @LayoutRes int initLayoutID();

    public abstract void customizeFragment();

}
