package observerDp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Channel channel1=new Channel();
//        Observer sankalp=new Subscriber("Sankalp");
//        channel1.subscribe(sankalp);
//
//        Observer vivek=new Subscriber("vivek");
//        channel1.subscribe(vivek);
//        channel1.sendNotification("video 1");

        Scanner br=new Scanner(System.in);
        while (true){
            System.out.println("press 1 for adding a subcriber");
            System.out.println("press 2 for removing a subcriber");
            System.out.println("press 3 for add a video");
            System.out.println("press 4 to show all subscribers");
            System.out.println("press 5 to exit");
            System.out.println("--------------------------------------------");
            int choice = br.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter subscriber name");
                    Observer obj=new Subscriber(br.nextLine());
                    channel1.subscribe(obj);
                    System.out.println("--------------------------------------------");
                    break;
                case 2:
                    System.out.println("enter subscriber name");
                    channel1.unsubscribe(br.nextLine());
                    System.out.println("--------------------------------------------");
                    break;
                case 3:
                    System.out.println("enter video title:");
                    channel1.sendNotification(br.nextLine());
                    System.out.println("--------------------------------------------");
                    break;
                case 4:
                    System.out.println(channel1.getSubscribers());
                    System.out.println("--------------------------------------------");
                    break;
                case 5:
                    System.out.println("Thanks!");
                    return;
                default:
                    System.out.println("enter valid input!");
            }

        }

    }

}
