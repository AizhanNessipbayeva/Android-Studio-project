package com.example.aizha.bitsandpizzas;

public class Pizza {
    private String name;
    private int imageResourceId;
    private boolean isFavorite;

    public static final Pizza[] pizzas = {
            new Pizza("Diavolo", R.drawable.diavolo,false),
            new Pizza("Funghi", R.drawable.funghi,false)
    };

    private Pizza(String name, int imageResourceId,boolean isFavorite) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.isFavorite=isFavorite;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
    public boolean isFavorite(){
        return isFavorite;
    }


    public void setFavorite(boolean favorite) {
        this.isFavorite = favorite;
    }
}

