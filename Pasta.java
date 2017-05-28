package com.example.aizha.bitsandpizzas;

public class Pasta {
    private String name;
    private int imageResourceId;
    private boolean isFavorite;

    public static final Pasta[] pastas = {
            new Pasta("Spaghetti Bolognese", R.drawable.bolognese,false),
            new Pasta("Lasagne", R.drawable.lasagne,false)
    };

    private Pasta(String name, int imageResourceId,boolean isFavorite) {
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

