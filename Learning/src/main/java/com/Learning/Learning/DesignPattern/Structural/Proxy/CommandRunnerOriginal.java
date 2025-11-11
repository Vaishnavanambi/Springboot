package com.Learning.Learning.DesignPattern.Structural.Proxy;

public class CommandRunnerOriginal implements CommandRunner{
    @Override
    public void runCommand(String cmd) {
        System.out.println("Running command : "+cmd+" ....");
    }
}
