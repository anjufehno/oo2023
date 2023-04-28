package oo2023.Temperature.src;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args){
            String[] seasons = new String[4]; // Создали массив(список) с размером 4-ех ячеек

            seasons[0] = "Зима"; // В 0-ую ячейку записали Зиму
            seasons[1] = "Весна"; // В 1-ую Весну
            seasons[2] = "Лето"; // В 2-ую Лето
            seasons[3] = "Осень"; // И в 3-тью Осень

            Scanner k = new Scanner(System.in);
            System.out.println("Какой сейчас сезон года?");
            String season = k.nextLine();
            if (season.equalsIgnoreCase("Зима")) {
                Winter();
            } else if (season.equalsIgnoreCase("Весна")) {
                Spring();
            } else if (season.equalsIgnoreCase("Лето")) {
                Summer();
            } else if (season.equalsIgnoreCase("Осень")) {
                Autumn();
            } else {
                System.out.println("Такого времени года нет");
            }
    }
    public static void Winter() {
        System.out.println("Наденьте шапку и варежки, и пошлите кататься на санях!");
    }
    public static void Spring() {
        System.out.println("Купите резиновые сапоги, на улице очень мокро!");
    }
    public static void Summer(){
        System.out.println("Берите крем для загара и полотенце, сегодня мы идем на пляж!");
    }
    public static void Autumn(){
        System.out.println("Возьмите зонт, и пойдётеме гулять по парку!");
    }
}

