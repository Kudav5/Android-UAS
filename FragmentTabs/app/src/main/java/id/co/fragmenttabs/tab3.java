package id.co.fragmenttabs;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class tab3 extends Fragment {
    View view;
    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tab3, container, false);
        button = view.findViewById(R.id.playinter);
        button.setOnClickListener(view -> playn());
        return view;
    }
    public void playn(){
        Intent intent = new Intent(requireContext(), ilmiah.class);
        startActivity(intent);
    }
}