/*
 * Project Title : Homework 11
 * Author : Yonghwan Yim
 * Final Update : 2017.11.24
 */
package gamecharacter;

public class Wizard extends WizardClass {
    private String name;
    private String sex;
    
    public Wizard() {  }
    public Wizard(String name, String sex) { this.name = name; this.sex = sex; }
    @Override
    public String getName() { return name; }
    @Override
    public String getSex() { return sex; }
    @Override
    public String getDescription() 
    { 
        String desc;
        desc = "\n** 결과 **\n";
        desc = desc + "직업 : " + this.getJob() + " (현명하고...)\n";
        desc = desc + "피 : " + this.getHP() + "\n";
        desc = desc + "마나 : " + this.getMP() + "\n";
        desc = desc + "공격력 : " + this.getStrikingPower() + "\n";
        desc = desc + "방어력 : " + this.getDefensivePower() + "\n";
        desc = desc + "캐릭터 : " + this.name + "\n";
        desc = desc + "성별 : " + this.sex;
        
        return desc;
    }
}