/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        String [] data = {"rosa","rosa","juan","juan","juan","juan","luisa"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        
        
        for (String key : histogr.keySet()) {
            System.out.println(key+" --> "+histogr.get(key));
            
        }
    }
}
