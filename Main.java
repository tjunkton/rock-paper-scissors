package rps;

@SuppressWarnings("unused")

public class Main {
    
    public static void main(String[] args) {
        
        Item rock = new Item("Rock", new String[]{"scissors"});
        Item scissors = new Item("Scissors", new String[]{"paper"});
        Item paper = new Item("Paper", new String[]{"rock"});
    }
}