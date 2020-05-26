package com.hfad.coffeinadelonghi.Coffee;

import com.hfad.coffeinadelonghi.R;

public class MilkDrink extends Drink {

    public MilkDrink(String name, String description, int imageResourceId) {
        super(name, description, imageResourceId);
    }

    public static final Drink[] drinks = {
            new MilkDrink("Cappucino", "włoski napój kawowy z dodatkiem spienionego mleka (rzadziej z bitą śmietaną) i szczyptą sypkiej czekolady lub kakao dla ozdoby", R.drawable.cappucino),
            new MilkDrink("CaffeLatte", "włoski napój kawowy powstający w wyniku wlania podgrzanego mleka do kawy espresso.",R.drawable.caffelatte),
            new MilkDrink("Latte Macchiato", "napój mleczny powstały przez powolne (delikatnie, po ściance) dolanie kawy espresso do gorącego mleka, pokrytego warstwą mlecznej piany",R.drawable.latte_macchiato),
            new MilkDrink("Flat White", "przygotowywany poprzez zalanie jednej lub dwóch porcji espresso spienionym mlekiem o jednorodnej, aksamitnej konsystencji", R.drawable.flat_white),
            new MilkDrink("Mleko", "ciepłe, spienione mleko jest mieszaniną wieloskładnikową, składająca się z trzech podstawowych faz, będących w ścisłej zależności od siebie: emulsyjnej, koloidalnej i molekularnej.", R.drawable.mleko)
    };


}
