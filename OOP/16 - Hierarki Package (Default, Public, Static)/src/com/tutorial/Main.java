package com.tutorial;

// ini tidak akan bisa, penggunaan private tidak diperkenankan

// private class Test{
// }

import com.terminal.Terminal;

// import com.terminal.TerminalDefault; // tidak bisa

// mengimport class console
import com.terminal.Console;

// mengimport static method dari console
import static com.terminal.Console.log;

class Main{
    public static void main(String[] args) {
        Player player1 = new Player("Otong");
        player1.show();

        Console.log("Menampilkan data dengan console.log");
        Console.log(player1.getName());
        
        log("Menampilkan data dengan log saja");
        log(player1.getName());

        Terminal.log("Menampilkan data dengan terminal.log");
        Terminal.log(player1.getName());

        System.out.print("\n");
    }
}