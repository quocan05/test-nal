/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testnal;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author an
 */
public class TestNAL {

    /**
     * @param args the command line arguments
     */
    public static int countVNChars(String input) {
        HashMap<String, String> vnChars = new HashMap<>();
        vnChars.put("aw", "ă");
        vnChars.put("aa", "â");
        vnChars.put("dd", "đ");
        vnChars.put("ee", "ê");
        vnChars.put("oo", "ô");
        vnChars.put("ow", "ơ");
        vnChars.put("w", "ư");
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String sub = input.substring(i, j);
                // System.out.println(sub + " ");
                if (vnChars.containsValue(sub) || vnChars.containsKey(sub)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a string : \n");
        String i = scan.nextLine();
        System.out.println("Number of VN chars: " + countVNChars(i));
    }

}
