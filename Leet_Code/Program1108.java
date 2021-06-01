package Leet_Code;

public class Program1108 {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        Solution1108 s = new Solution1108();
        System.out.println(s.defangIPaddr(address));
    }
}

class Solution1108 {
    public String defangIPaddr(String address) {
        String[] arr = address.split("\\.");
        address = "";
        for (int i = 0; i < arr.length - 1; i++) {
            address += (arr[i] + "[.]");
        }
        address += arr[arr.length - 1];
        return address;
    }
}
