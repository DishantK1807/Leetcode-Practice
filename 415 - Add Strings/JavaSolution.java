class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder lst = new StringBuilder();
        char[] str1 = num1.toCharArray();
        char[] str2 = num2.toCharArray();
        int n1= str1.length - 1;
        int n2 = str2.length - 1;
        int carry=0;
        while(n1 >=0 || n2 >=0){
            int a = n1 >=0 ? str1[n1--]-'0':0;
            int b = n2 >=0 ? str2[n2--]-'0':0;
            lst.append(( a+b+carry)%10);
            carry = (a+b+carry)/10;

        }
        if(carry>0)lst.append(carry);
        return lst.reverse().toString();
    }
}