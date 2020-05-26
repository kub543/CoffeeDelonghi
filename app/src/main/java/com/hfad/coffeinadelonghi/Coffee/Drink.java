package com.hfad.coffeinadelonghi.Coffee;

import com.hfad.coffeinadelonghi.R;

public abstract class Drink {
    private String name;
    private String description;
    private int imageResourceId;
    private boolean isDouble;
    private boolean isSugar;

    public Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public Drink() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public boolean isDouble() {
        return isDouble;
    }

    public void setDouble(boolean aDouble) {
        isDouble = aDouble;
    }

    public boolean isSugar() {
        return isSugar;
    }

    public void setSugar(boolean sugar) {
        isSugar = sugar;
    }

    public Drink(String name) {this.name = name;}

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
