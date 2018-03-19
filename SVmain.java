package oop;
import java.text.ParseException;
import java.util.Scanner;

import sv.QLSV;
public class SVmain {

    public static void main(String[] args) throws ParseException {
        int choose ;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        QLSV ql = new QLSV();
        while(true){
            ql.showMenu();
            choose = sc.nextInt();
            switch(choose){
                case 1: ql.xemDS(); break;
                case 2: ql.add(); break;
                case 3: ql.search(); break;
                case 4: ql.update(); break;
                case 0: break; 
                default:
                System.out.println("invalid! please choose action in below menu:");
                break;
            }
        }
    }
}


