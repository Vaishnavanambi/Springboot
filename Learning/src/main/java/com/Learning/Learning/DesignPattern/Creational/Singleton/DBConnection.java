package com.Learning.Learning.DesignPattern.Creational.Singleton;

public class DBConnection {
    private static volatile DBConnection instance;// check instance from main memory


    private DBConnection() {

    }

    // first thread will check for instance if it is not null , thread does not have to wait for previous thread
    public static DBConnection getInstance(){
        DBConnection con = instance; //using local var to check instance from cached memory instead of main memory every time.
        if(con == null) {
            synchronized (DBConnection.class) {
                con = instance;
                if (con == null) {
                    instance = new DBConnection();
                    con = instance;
                }
            }
        }
        return con;
    }
}
