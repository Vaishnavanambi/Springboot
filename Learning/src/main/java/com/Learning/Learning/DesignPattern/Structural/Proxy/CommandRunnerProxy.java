package com.Learning.Learning.DesignPattern.Structural.Proxy;

public class CommandRunnerProxy implements CommandRunner{
    private boolean isAdminUser;
    private CommandRunnerOriginal commandRunnerOriginal;
    public CommandRunnerProxy(String userName, String password) {
        if(userName.equals("Admin") && password.equals("1234")) {
            commandRunnerOriginal = new CommandRunnerOriginal();
            isAdminUser = true;
        }
    }
    @Override
    public void runCommand(String cmd) {
        if(isAdminUser){
            commandRunnerOriginal.runCommand(cmd);
        }else{
            if(cmd.startsWith("rm")) //remove command is not safe to use by non-admins
                System.out.println("Your are not authorised user");
            else
                commandRunnerOriginal.runCommand(cmd);
        }
    }
}
