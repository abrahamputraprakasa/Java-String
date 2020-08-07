package site.abrahamprakasa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        StringBuilder kata = new StringBuilder("Halo Dunia");
        System.out.println(kata);
//        System.out.println(kata.substring(5));
//        System.out.println(kata + " Semua");
//        System.out.println(kata.concat(" Gembira"));
//        System.out.println(kata);

//        kata = kata + " Gembira";
//        kata = kata.concat(" Gembira");
        kata.append(" Gembira");
        System.out.println(kata);

//        for (int i = 0; i < 100000; i++){
//            kata.append(" Gembira ").append(i).append("\n");
//        }
//        System.out.println(kata);

        String petunjuk = "  Mohon Isikan Jawaban Di Bawah Dengan Benar!  ";
        System.out.println(petunjuk);
//        System.out.println(petunjuk.toLowerCase());
//        System.out.println(petunjuk.substring(0, petunjuk.indexOf("Dengan")));
//        System.out.println(petunjuk.substring(0, petunjuk.length() - 1));

        petunjuk = petunjuk.trim();
        System.out.println(petunjuk.substring(0, petunjuk.lastIndexOf(" ")));

        System.out.println("berisi kata 'Bawah' " + petunjuk.contains("Bawah"));





    }
}
