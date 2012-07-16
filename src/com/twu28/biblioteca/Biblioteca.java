package com.twu28.biblioteca;

public class Biblioteca {
    private final Output output;
    private final Input input;

    public Biblioteca(Output output, Input input) {
        this.output = output;
        this.input = input;
    }

    public void start() {
        welcomeUser();
        while (true) {
            printMenu();
            int input = this.input.read();
            if(input == 0) {
                output.print("Bye!");
                break;
            } else {
                output.print("Select a valid option");
            }
        }
    }

    public static void main(String[] args) {
        new Biblioteca(new Output(), new Input()).start();
    }

    private void printMenu() {
        output.print("0. Exit");
    }

    private void welcomeUser() {
        output.print("Welcome User.");
    }
}
