package rest;

import java.util.ResourceBundle;

public class TBundle {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("USD");
        String str = bundle.getString("currEnam");
        String str2 = bundle.getString("r030");
        System.out.println(str2);
    }
}
