/*
 * Project Title : Homework 11
 * Author : Yonghwan Yim
 * Final Update : 2017.11.24
 */
package gamecharacter;

public abstract class FighterClass implements GameCharacters {
    private final String job;
    private final int nHP;
    private final int nMP;
    private final int StrPower;
    private final int DefPower;
    
    public FighterClass() { this.nHP = 200; this.nMP = 10; this.job = "Fighter"; this.StrPower = 120; this.DefPower = 90;}
    @Override
    public String getJob() { return this.job; }
    @Override
    public int getHP() { return this.nHP; }
    @Override
    public int getMP() { return this.nMP; }
    @Override
    public int getStrikingPower() { return this.StrPower; }
    @Override
    public int getDefensivePower() { return this.DefPower; }
    @Override
    public abstract String getSex();
    @Override
    public abstract String getName();
    @Override
    public abstract String getDescription();
}

