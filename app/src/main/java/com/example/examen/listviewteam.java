package com.example.examen;

public class listviewteam {
    private int imageResource;
    private String title;
    private  int colorId;

    public listviewteam(int imageResource, String title, int colorId) {
        this.imageResource = imageResource;
        this.title = title;
        this.colorId = colorId;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public int getColorId() {
        return colorId;
    }
}
