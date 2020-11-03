package com.darts.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stats {
	@Id
    private long id;
    private int hi;
    private int hco;
    private int checkouttry;
    private int playedgames;
    private int useddartsnumber;
    private double avarage;
    private double checkoutpercent;
    private int below20;
    private int above20;
    private int above40;
    private int above60;
    private int above80;
    private int above100;
    private int above120;
    private int above140;
    private int above160;
    private int p180;

    public Stats() {
        this.id = 0;
        this.hi = 0;
        this.hco = 0;
        this.checkouttry = 0;
        this.playedgames = 0;
        this.useddartsnumber = 0;
        this.below20 = 0;
        this.above20 = 0;
        this.above40 = 0;
        this.above60 = 0;
        this.above80 = 0;
        this.above100 = 0;
        this.above120 = 0;
        this.above140 = 0;
        this.above160 = 0;
        this.p180 = 0;
    }
    
    public Stats(long id, int HCo, int checkoutTry, int playedGamesNumber, int usedDartsNumber, int below20, int above20, int above40,
                 int above60, int above80, int above100, int above120, int above140, int above160, int p180) {
        this.id = id;
        this.hco = HCo;
        this.checkouttry = checkoutTry;
        this.playedgames =  playedGamesNumber;
        this.useddartsnumber = usedDartsNumber;
        this.below20 = below20;
        this.above20 = above20;
        this.above40 = above40;
        this.above60 = above60;
        this.above80 = above80;
        this.above100 = above100;
        this.above120 = above120;
        this.above140 = above140;
        this.above160 = above160;
        this.p180 = p180;
    }
    
    public Stats(int Hi, int HCo, int chekoutTry, int playedGamesNumber, int usedDartsNumber, int below20, int above20, int above40,
                 int above60, int above80, int above100, int above120, int above140, int above160, int p180) {
        this.hi = Hi;
        this.hco = HCo;
        this.checkouttry = chekoutTry;
        this.playedgames =  playedGamesNumber;
        this.useddartsnumber = usedDartsNumber;
        this.below20 = below20;
        this.above20 = above20;
        this.above40 = above40;
        this.above60 = above60;
        this.above80 = above80;
        this.above100 = above100;
        this.above120 = above120;
        this.above140 = above140;
        this.above160 = above160;
        this.p180 = p180;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public int getHi() {
        return hi;
    }

    public void setHi(int Hi) {
        this.hi= Hi;
    }

    public int getHco() {
        return hco;
    }

    public void setHco(int HCo) {
        this.hco = HCo;
    }

    public int getCheckouttry() {
        return checkouttry;
    }

    public void setChekoutTry(int checkoutTry) {
        this.checkouttry = checkoutTry;
    }

    public int getPlayedgames() {
        return playedgames;
    }

    public void setPlayedGames(int playedGamesNumber) {
        this.playedgames = playedGamesNumber;
    }

    public int getUseddartsnumber() {
        return useddartsnumber;
    }

    public void setUseddartsnumber(int usedDartsNumber) {
        this.useddartsnumber = usedDartsNumber;
    }

    public int getBelow20() {
        return below20;
    }

    public void setBelow20() {
        this.below20 = getBelow20()+1;
    }

    public int getAbove20() {
        return above20;
    }

    public void setAbove20() {
        this.above20 = getAbove20()+1;
    }

    public int getAbove40() {
        return above40;
    }

    public void setAbove40() {
        this.above40 = getAbove40()+1;
    }

    public int getAbove60() {
        return above60;
    }

    public void setAbove60() {
        this.above60 = getAbove60()+1;
    }

    public int getAbove80() {
        return above80;
    }

    public void setAbove80() {
        this.above80 = getAbove80()+1;
    }

    public int getAbove100() {
        return above100;
    }

    public void setAbove100() {
        this.above100 = getAbove100()+1;
    }

    public int getAbove120() {
        return above120;
    }

    public void setAbove120() {
        this.above120 = getAbove120()+1;
    }

    public int getAbove140() {
        return above140;
    }

    public void setAbove140() {
        this.above140 = getAbove140()+1;
    }

    public int getAbove160() {
        return above160;
    }

    public void setAbove160() {
        this.above160 = getAbove160()+1;
    }

    public int getP180() {
        return p180;
    }

    public void setP180() {
        this.p180 = getP180()+1;
    }

	public double getAvarage() {
		return avarage;
	}

	public void setAvarage(double avarage) {
		this.avarage = avarage;
	}

	public double getCheckoutpercent() {
		return checkoutpercent;
	}

	public void setCheckoutpercent(double checkoutpercent) {
		this.checkoutpercent = checkoutpercent;
	}
    
}
