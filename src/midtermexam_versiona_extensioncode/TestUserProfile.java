/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class TestUserProfile {
    public static void main (String []args){
        UserProfile up = new UserProfile();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a User Id");
        String uid = scan.nextLine();
        System.out.println("Please select your preferred movie from the list:");
        
        for (int i =0; i< up.getGenres().length;i++){
            System.out.println(up.getGenres()[i]);
        }

        String genre = scan.nextLine();
        up.setUserID(uid);
        up.setGenre(genre);
        
        
        System.out.println("your profile was created succesfully!");
        up.toString();
        
        
    }
}
