package com.week1;

public class Week1 {

    public static void main(String[] args) {
        String command;
        
        while (true){

            Lib.printCommands();
            command = Lib.scanner.nextLine();
            Lib.runCommand(command);

            if (!isQuit(command)){
                System.out.print("Do you want to continue? y/n: ");
            }

            if (isExit(command)){
                break;
            }
        }
    }

    public static boolean isQuit(String command){
        return command.equals(Lib.commands[Lib.commands.length-1].name);
    }

    public static boolean isExit(String command){
        return Lib.scanner.nextLine().equals("n") || isQuit(command);
    }
}
