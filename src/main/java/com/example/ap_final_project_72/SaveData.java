package com.example.ap_final_project_72;

import java.io.Serializable;

public class SaveData implements Serializable {

    private static int coins;
    private static int points;
    private static double Orc1X;
    private static double Orc2X;
    private static double Orc3X;
    private static double Orc4X;
    private static double Orc5X;
    private static double HeroX;
    private static double heroY;
    private static double LayoutX;

    public int getKsteps() {
        return ksteps;
    }

    public void setKsteps(int ksteps) {
        this.ksteps = ksteps;
    }

    private static int ksteps;
    private static int kmode;

    public int getKmode() {
        return kmode;
    }

    public void setKmode(int kmode) {
        this.kmode = kmode;
    }
;



    public double getkLayoutX() {
        return LayoutX;
    }

    public void setkLayoutX(double layoutX) {
        LayoutX = layoutX;
    }
    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public double getOrc1X() {
        return Orc1X;
    }

    public void setOrc1X(double orc1X) {
        Orc1X = orc1X;
    }

    public double getOrc2X() {
        return Orc2X;
    }

    public void setOrc2X(double orc2X) {
        Orc2X = orc2X;
    }

    public double getOrc3X() {
        return Orc3X;
    }

    public void setOrc3X(double orc3X) {
        Orc3X = orc3X;
    }

    public double getOrc4X() {
        return Orc4X;
    }

    public void setOrc4X(double orc4X) {
        Orc4X = orc4X;
    }

    public double getOrc5X() {
        return Orc5X;
    }

    public void setOrc5X(double orc5X) {
        Orc5X = orc5X;
    }

    public double getHeroX() {
        return HeroX;
    }

    public void setHeroX(double heroX) {
        HeroX = heroX;
    }

    public double getHeroY() {
        return heroY;
    }

    public void setHeroY(double heroY) {
        this.heroY = heroY;
    }

}