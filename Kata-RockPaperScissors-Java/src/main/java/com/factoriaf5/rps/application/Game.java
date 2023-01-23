package com.factoriaf5.rps.application;

import java.util.Random;
import java.util.Scanner;

import com.factoriaf5.rps.models.Paper;

public class Game {
    public void play(){
        Scanner input = new Scanner(System.in);
        String playerChoice;
        String computerChoice;
        Random rand = new Random();

    while (true){
        System.out.println("Enter your choice: Scissors, paper, rock:");
        playerChoice input.nextLine();

        if(!playerChoice.equals("paper") && !playerChoice.equals("scissors") && !playerChoice.equals("rock")){
            System.out.println("Invalid choice. Please, choice between: Scissors, paper or rock");
            continue;
        }
        int choice = rand.nextInt(3);
            if (choice == 0){
                computerChoice = "paper";
            }else if (choice == 1){
                computerChoice = "scissors";
            }else{ 
                computerChoice = "rock";
            }
            if (playerChoice.equals(computerChoice)){
                System.out.print("Tie!");
            } else if(playerChoice.equals("paper") && computerChoice.equals("rock") || playerChoice.equals("scissors") && computerChoice.equals("paper")|| playerChoice.equals("rock") && computerChoice.equals("scissors")){
                System.out.println("It's a victory!");
            }else{
                System.out.println("Sorry, you loose!");
            }
            System.out.println("Do you want to play again? (yes/no) ");
            String again = input.nextLine();
            if (!again.equals("yes")) {
                break;
            }
            }
            }

    private void nextLine() {
    }

    }

