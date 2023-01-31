package Geek_For_Geeks;

public class PowerSets {
    public static void main(String[] args) {
        String s  = "abc";
        PowerSets pSets = new PowerSets();
        pSets.powerSets(s, 0, "");
        
    }
    void powerSets(String str, int index, String tempString){
        if(index == str.length()){
            System.out.println(tempString);
            return;
        }
        powerSets(str, index+1, tempString+str.charAt(index));
        powerSets(str, index+1, tempString);        
    }

}

