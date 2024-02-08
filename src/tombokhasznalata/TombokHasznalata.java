/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombokhasznalata;

/**
 *
 * @author SimonGergő(SZF_2023_
 */
public class TombokHasznalata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] tomb = {"egy", "kettő", "három"};
        
        /* memória címet írja ki nem a tartalmat*/
        /* mérete nem változtatható */
        System.out.println("tomb = " + tomb);
        
        System.out.println("A tömb elemei");
        //for i in range (len(tomb))
        for (int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n",i, tomb[i]);
        }
        
        tomb = new String[4];
        for (int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n",i, tomb[i]);
        }
        
        tomb[2] = "zwei";
        for (int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n",i, tomb[i]);
        }
        
        System.out.println("vegyesen");
        tomb[0] = "null";
        tomb[1] = "one";
        tomb[2] = "two";
        tomb[3] = "three";
        for (int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n",i, tomb[i]);
        }
        
        if("null" == null){
            System.out.println("egyezik");
        }else{
            System.out.println("nem egyezik");
        }
        /* le sem fordítható, ÉRTÉK -- REFERENCIA*/
        
        
    }
    
}
