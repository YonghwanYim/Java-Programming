/*
 * Project Title : Homework 11 - Hash Map Exam.
 * Author : Yonghwan Yim
 * Final Update : 2017.11.24
 */

package hashmapexam;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Iterator;

public class HashMapExam {

    public static void main(String[] args) {
        int nMenu = 0;
        boolean boolFlag = true;
        String strName = "";
        int nScore = 0;
        
        Scanner scan = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        while(boolFlag)
        {
            System.out.println("\n========================");
            System.out.println("1. 성적 입력");
            System.out.println("2. 성적 삭제");
            System.out.println("3. 성적 검색");
            System.out.println("4. 전체 성적 출력");
            System.out.println("5. 전체 성적 출력 - 이름");
            System.out.println("6. 전체 성적 출력 - 점수");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택 : ");
            
            try 
            { 
                nMenu = Integer.parseInt(scan.nextLine()); 
            }
            catch(Exception e)
            {
                System.out.println("0~6 까지의 숫자를 입력해주세요");
                continue;
            }
            
            switch(nMenu)
            {
                case 1:
                    try
                    {
                        System.out.print("이름 : ");
                        strName = scan.nextLine();
                        System.out.print("점수 : ");
                        nScore = Integer.parseInt(scan.nextLine());
                    } catch(Exception e) {}
                    map.put(strName, nScore);
                    break;
                    
                case 2:
                    try
                    {
                        System.out.print("이름 : ");
                        strName = scan.nextLine();           
                    } catch(Exception e) {}
                    map.remove(strName);
                    break;
                    
                case 3:
                    try
                    {
                        System.out.print("이름 : ");
                        strName = scan.nextLine();
                    } catch(Exception e) {}
                    nScore = map.get(strName);
                    System.out.println("이름 : " + strName + ", 점수 : " + nScore);
                    break;
                    
                case 4:
                    Object o[] = map.keySet().toArray();
                    for(int i = 0; i < o.length; i++)
                        System.out.println("이름 : " + o[i] + ", 성적 : " + map.get(o[i]));
                    break;
                    
                case 5:
                    Object o2[] = map.keySet().toArray();
                    Arrays.sort(o2);
                    for(int i = 0; i < o2.length; i++)
                        System.out.println("이름 : " + o2[i] + ", 성적 : " + map.get(o2[i]));
                    break;
                    
                case 6:
                    LinkedList<String> b = new LinkedList<String>();
                    Iterator i = map.keySet().iterator();
                    
                    while(i.hasNext())
                    {
                        strName = (String)i.next();
                        if(b.isEmpty()) b.add(strName);
                        else if(map.get(strName) >= map.get(b.getLast())) b.addLast(strName);
                        else b.addFirst(strName);
                    }
                    i = b.iterator();
                    while(i.hasNext())
                    {
                        strName = (String)i.next();
                        System.out.println("이름 : " + strName + ", 성적 : " + map.get(strName));
                    } 
                    break;
                    
                case 0:
                    boolFlag = false;
                    break;
                    
                default:
                    System.out.println("0~6 까지의 숫자를 입력해주세요.");
                    break;
            }
        }
    }
}