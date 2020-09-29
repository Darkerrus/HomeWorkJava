package com.company;

import java.util.ArrayList;

public class FurnitureShop {
    ArrayList<Furniture> FS = new ArrayList<>();
    FurnitureShop()
    {
        FS.add(new Chair("Красный", 50, 30));
        FS.add(new Cupboard("Синий", 300, 100));
        FS.add(new Nightstand("Чёрный", 100, 100));
        FS.add(new Sofa("Розовый", 50, 300));
        FS.add(new Table("Бирюзовый", 50, 60));
    }

    @Override
    public String toString() {
        StringBuffer SB = new StringBuffer();
        for (Furniture furniture: FS) {
            SB.append(furniture).append("\n********************************************************\n");
        }
        return SB.toString();
    }
}
