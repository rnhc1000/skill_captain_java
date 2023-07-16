package intermediate.dayFive;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MyMusicPlayer myMusicPlayer = new MyMusicPlayer();

        Scanner input = new Scanner(System.in);
        String songs = "";
        Integer numberOfSongs = 0;

        System.out.print("Input the number of songs you want to listen to... -> ");
        try {
            songs = input.nextLine();
            numberOfSongs = Integer.parseInt(songs);
            } catch(NumberFormatException e) {
                System.out.println("Number Invalid! Try another one...");
            }
        for (int i=0; i<numberOfSongs; i++) {

        }
        
        
        }


    }
    
