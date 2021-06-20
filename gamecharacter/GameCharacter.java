/*
 * Project Title : Homework 11
 * Author : Yonghwan Yim
 * Final Update : 2017.11.24
 */
package gamecharacter;
import java.util.*;

public class GameCharacter {
    public void desc(GameCharacters chracter)
    {
        System.out.println(chracter.getDescription());
    }
    
    public static void main(String[] args) {
        int nMenu = 0, nHP, nMP = 0;
        String strName = "";
        String strSex = "";
        boolean bFlag = true;
        
        Scanner scan = new Scanner(System.in);
         try
        {
            System.out.println("**캐릭터 생성**");
            System.out.print("직업 선택 [0, 헌터] [1. 파이터] [2. 마법사] : ");
            nMenu = Integer.parseInt(scan.nextLine());
            System.out.print("캐릭터 이름 : ");
            strName = scan.nextLine();
            System.out.print("성별 (M, F) : ");
            strSex = scan.nextLine();
         
            GameCharacter character = new GameCharacter();
            
            if(nMenu == 0)
                character.desc(new Hunter(strName, strSex));
            else if(nMenu == 1)
                character.desc(new Fighter(strName, strSex));
            else if(nMenu == 2)
                character.desc(new Wizard(strName, strSex));
            else
                System.out.println("잘못 입력하셨습니다.");
        } catch(Exception e) {}
    }
}
