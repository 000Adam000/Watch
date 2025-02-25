
package Watchtv;

//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Scanner;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class MainWatch {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* Date dt = new Date();
        SimpleDateFormat hh = new SimpleDateFormat("hh");
        SimpleDateFormat mm = new SimpleDateFormat("mm");
        SimpleDateFormat ss = new SimpleDateFormat("ss");*/
        System.out.println("witch type of modifying do you want? 1-manual / 2-Automatic");
        int ch = scanner.nextInt();
        if(ch == 1){
        
        
        System.out.println("Choose the company:\n1- Asus, 2- Apple, 3- Samsung");
        int choice = scanner.nextInt();
        System.out.println("enter the type of representing thre clock:\n1- default\n2- hour:min:sec\n3- hour:min\n4- hour");
        int CHOICE = scanner.nextInt();
        
        switch (choice){
            case 1:
                System.out.println("Asus corporation");
                break;
            case 2:
                System.out.println("Apple corporation");
                break;
            case 3:
                System.out.println("Samsung corporation");
                break;
            default:
        }
        
        Watch w = new Watch();
        Watch w1 = new Watch(10,10,10);
        Watch w2 = new Watch(10,10);
        Watch w3 = new Watch(10);
        
        switch (CHOICE){
            case 1:
                System.out.println(""+w.gethour()+w.gethour()+":"+w.gethour()+w.gethour()+":"+w.gethour()+w.gethour());
                break;
                
            case 2:
                System.out.println(w1.gethour()+":"+w1.getminute()+":"+w1.getsecond());
                System.out.println("do you want to modify: 1-yes/2-No");
                int yn = scanner.nextInt();
                if(yn == 1){
                System.out.print("enter the hour: ");
                int h = scanner.nextInt();
                w1.sethour(h);
                System.out.print("enter the minute: ");
                int m = scanner.nextInt();
                w1.setminute(m);
                System.out.print("enter the second: ");
                int s = scanner.nextInt();
                w1.setsecond(s);
                System.out.println(w1.gethour()+":"+w1.getminute()+":"+w1.getsecond());
                }
                else if(yn==2)
                    System.out.println(w1.gethour()+":"+w1.getminute()+":"+w1.getsecond());
                    
                break;
                
            case 3:
                System.out.println(w1.gethour()+":"+w1.getminute()+":"+w1.getsecond());
                System.out.println("do you want to modify: 1-yes/2-No");
                int yn1 = scanner.nextInt();
                if(yn1 == 1){
                System.out.print("enter the hour: ");
                int h1 = scanner.nextInt();
                w2.sethour(h1);
                System.out.print("enter the minute: ");
                int m1 = scanner.nextInt();
                w2.setminute(m1);
                System.out.println(w2.gethour()+":"+w2.getminute()+":00");
                }
                else if(yn1==2)
                System.out.println(w2.gethour()+":"+w2.getminute()+":00");
                break;
                
            case 4:
                System.out.println(w1.gethour()+":"+w1.getminute()+":"+w1.getsecond());
                System.out.println("do you want to modify: 1-yes/2-No");
                int yn2 = scanner.nextInt();
                if(yn2 == 1){
                System.out.print("enter the hour: ");
                int h2 = scanner.nextInt();
                w3.sethour(h2);
                System.out.println(w3.gethour()+":00"+":00");
                }
                else if(yn2==2)
                System.out.println(w3.gethour()+":00"+":00");
                break;
        }
        }
        else if(ch == 2)
        {
            
            System.out.println("Choose the company:\n1- Asus, 2- Apple, 3- Samsung");
        int choice = scanner.nextInt();
        System.out.println("enter the type of representing thre clock:\n1- default\n2- hour:min:sec\n3- hour:min\n4- hour");
        int CHOICE = scanner.nextInt();
        
        switch (choice){
            case 1:
                System.out.println("Asus corporation");
                break;
            case 2:
                System.out.println("Apple corporation");
                break;
            case 3:
                System.out.println("Samsung corporation");
                break;
            default:
        }
        
        Watch w = new Watch();
        Watch w1 = new Watch(10,10,10);
        Watch w2 = new Watch(10,10);
        Watch w3 = new Watch(10);
        
        switch (CHOICE){
            case 1:
                System.out.println(""+w.gethour()+w.gethour()+":"+w.gethour()+w.gethour()+":"+w.gethour()+w.gethour());
                break;
                
            case 2:
                System.out.println(w1.gethour()+":"+w1.getminute()+":"+w1.getsecond());
                System.out.println("do you want to modify: 1-yes/2-No");
                int yn = scanner.nextInt();
                if(yn == 1){
                System.out.print("enter the hour: ");
                int h = scanner.nextInt();
                w1.sethour(h);
                System.out.print("enter the minute: ");
                int m = scanner.nextInt();
                w1.setminute(m);
                System.out.print("enter the second: ");
                int s = scanner.nextInt();
                w1.setsecond(s);
                System.out.println(w1.gethour()+":"+w1.getminute()+":"+w1.getsecond());
                }
                else if(yn==2)
                    System.out.println(w1.gethour()+":"+w1.getminute()+":"+w1.getsecond());
                   // w1.sethour(Integer.parseInt(hh.format(dt)));
                break;
                
            case 3:
                System.out.println(w1.gethour()+":"+w1.getminute()+":"+w1.getsecond());
                System.out.println("do you want to modify: 1-yes/2-No");
                int yn1 = scanner.nextInt();
                if(yn1 == 1){
                System.out.print("enter the hour: ");
                int h1 = scanner.nextInt();
                w2.sethour(h1);
                System.out.print("enter the minute: ");
                int m1 = scanner.nextInt();
                w2.setminute(m1);
                System.out.println(w2.gethour()+":"+w2.getminute()+":00");
                }
                else if(yn1==2)
                System.out.println(w2.gethour()+":"+w2.getminute()+":00");
                break;
                
            case 4:
                System.out.println(w1.gethour()+":"+w1.getminute()+":"+w1.getsecond());
                System.out.println("do you want to modify: 1-yes/2-No");
                int yn2 = scanner.nextInt();
                if(yn2 == 1){
                System.out.print("enter the hour: ");
                int h2 = scanner.nextInt();
                w3.sethour(h2);
                System.out.println(w3.gethour()+":00"+":00");
                }
                else if(yn2==2)
                System.out.println(w3.gethour()+":00"+":00");
                break;
        }
        }
            
        }
        
        
        
        
    
    
}
