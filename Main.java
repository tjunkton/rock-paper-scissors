package rps;

import javax.swing.JFrame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
@SuppressWarnings("unused")

public class Main implements KeyListener {

    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {
        char key = e.getKeyChar();
        switch (key) {
            case 'a':
            case 's':
            case 'd':
                p1key = key;
                break;
            
            case 'j':
            case 'k':
            case 'l':
                p2key = key;
                break;
        }
    }


        static char p1key = ' ';
        static char p2key = ' ';

    public static void main(String[] args) {
        
        

        Item rock = new Item("Rock", new String[]{"scissors"});
        Item scissors = new Item("Scissors", new String[]{"paper"});
        Item paper = new Item("Paper", new String[]{"rock"});

        
        boolean done = false;
        while (done == false) {
            if (p1key != ' ' && p2key != ' ') {
                done = true;
            }
            System.out.println(p1key + ":" + p2key);


        }
        System.out.println(p1key + ":" + p2key);

    }
}