package com.techreturners.exercise003;

import java.util.Arrays;
import java.util.List;

public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {

        List<String> list = Arrays.asList(iceCreamFlavours());

        return list.indexOf(iceCreamFlavour);

    }

    String[] iceCreamFlavours() {

        return new String[]{"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
    }

}
