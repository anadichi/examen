package com.example.examen;

import java.util.ArrayList;

public class dataherper {
    public static ArrayList<listviewteam> provideItems(){
        ArrayList<listviewteam> list = new ArrayList<>();
        list.add(new listviewteam(R.drawable.bb, "HOLO BLUE BRIGHT", android.R.color.holo_blue_bright));
        list.add(new listviewteam(R.drawable.bl, "HOLO BLUE LIGHT", android.R.color.holo_blue_light));
        list.add(new listviewteam(R.drawable.gl, "HOLO GREEN LIGHT", android.R.color.holo_green_light));
        list.add(new listviewteam(R.drawable.ol, "HOLO ORANGE LIGHT", android.R.color.holo_orange_light));
        list.add(new listviewteam(R.drawable.rl, "HOLO RED LIGHT", android.R.color.holo_red_light));
        list.add(new listviewteam(R.drawable.p, "HOLO PURPLE", android.R.color.holo_purple));
        list.add(new listviewteam(R.drawable.bd, "HOLO BLUE DARK", android.R.color.holo_blue_dark));
        list.add(new listviewteam(R.drawable.gd, "HOLO GREEN DARK", android.R.color.holo_green_dark));
        list.add(new listviewteam(R.drawable.rd, "HOLO RED DARK", android.R.color.holo_red_dark));
        list.add(new listviewteam(R.drawable.od, "HOLO ORANGE DARK", android.R.color.holo_orange_dark));

        return list;
    }

}
