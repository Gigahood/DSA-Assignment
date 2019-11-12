/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchEngine;

import DataClass.Admin;

/**
 *
 * @author User
 */
public class AdminModule {
    private Admin admin;
    private int index;
    private String input;

    public AdminModule() {
    }

    public AdminModule(Admin admin, int index) {
        this.admin = admin;
        this.index = index;
        
        Navigation();
    }
    
    public void Menu() {
        Main.clearScreen();
        System.out.println("------** Admin Page **-------");
        System.out.println("Welcome, "+Main.db.adminList.get(index).getGender()+" "+Main.db.adminList.get(index).getName()+" ~");
        System.out.println("1. Search Detail");
        System.out.println("2. Return");
        System.out.print("Your Selection ---> ");
    }
    
    public void Navigation() {

        while (true) {
            while (true) {
                Menu();
                input = Main.scan.nextLine();

                if (Main.checkInputMenu(2, input)) {
                    break;
                }
            }

            if (input.equals("2")) {
                Main.clearScreen();
                break;
            }

            switch (input) {
                case "1":
                    ShowSearchDetail();
                    break;
            }
        }
    }
    
    public void ShowSearchDetail(){
        System.out.print("Key in what you need to search: ");
        String s = Main.scan.nextLine();
        
    }
}
