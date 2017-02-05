package den.dragon;

import java.util.ArrayList;
import java.util.Scanner;

public class channel {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Type channel name: ");

        String channel = console.nextLine();

        console.close();

        System.out.println();

        System.out.println(numbersToWords(channel));

    }

    public static String numbersToWords(String channel) {

        String channelName = "";

        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : channel.toCharArray()) {

            if (48 <= c && c <= 57) {
                int number = c - 48;

                switch (number) {

                case '0':
                    channelName = channelName + "zero";
                    break;

                case '1':
                    channelName = channelName + "one";
                    break;

                case '2':
                    channelName = channelName + "two";
                    break;

                case '3':
                    channelName = channelName + "three";
                    break;

                case '4':
                    channelName = channelName + "four";
                    break;

                case '5':
                    channelName = channelName + "five";
                    break;

                case '6':
                    channelName = channelName + "six";
                    break;

                case '7':
                    channelName = channelName + "seven";
                    break;

                case '8':
                    channelName = channelName + "eight";
                    break;

                case '9':
                    channelName = channelName + "nine";
                    break;
                }

            } else {

                chars.add(c);

            }

            channelName = channelName + c;

        }

        chars.clear();
        return channelName;

    }

}
