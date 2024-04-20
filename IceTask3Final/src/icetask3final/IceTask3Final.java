/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetask3final;

/**
 *
 * @author aadim
 */
import java.util.HashMap;
public class IceTask3Final {
    
    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                sb.append(c);
            } else if (map.containsValue(c)) {
                if (sb.length() == 0 || map.get(sb.charAt(sb.length() - 1)) != c) {
                    return false;
                }
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.length() == 0;
    }

  
    
}
