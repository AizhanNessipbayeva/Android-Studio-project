package com.example.aizha.bitsandpizzas;

import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class TopFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RelativeLayout layout = (RelativeLayout)inflater.inflate(R.layout.fragment_top, container, false);
        RecyclerView pizzaRecycler = (RecyclerView)layout.findViewById(R.id.pizza_recycler);


        String[] allNames = new String[4];

        for (int i = 0; i < 2; i++) {
            allNames[i] = Pizza.pizzas[i].getName();
        }
        for (int i = 2; i < 4; i++) {
            allNames[i] = Pasta.pastas[i-2].getName();
        }
        int[] allImages = new int[4];

        for (int i = 0; i < 2; i++) {
            allImages[i] = Pizza.pizzas[i].getImageResourceId();
        }
        for (int i = 2; i < 4; i++) {
            allImages[i] = Pasta.pastas[i-2].getImageResourceId();
        }

        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        pizzaRecycler.setLayoutManager(layoutManager);
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(allNames, allImages);
        pizzaRecycler.setAdapter(adapter);

        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), PizzaDetailActivity.class);
                intent.putExtra(PizzaDetailActivity.EXTRA_PIZZANO, position);
                intent.putExtra(PastaDetailActivity.EXTRA_PASTANO, position);
                getActivity().startActivity(intent);

            }
        });
        return layout;
    }
}
