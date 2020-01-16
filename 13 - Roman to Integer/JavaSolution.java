class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;
        int len = s.length();

        for(int i =0; i<len; i++){
            switch(s.charAt(i)){
                case 'I':{
                    if ( i + 1 < len && s.charAt(i+1) == 'V' ){
                        num = num + V - I;
                        i = i+1;
                    }
                    else if (i + 1 < len && s.charAt(i+1) == 'X'){
                        num = num + X - I;
                        i = i + 1;
                    }
                    else
                        num = num + I;
                    break;
                }
                case 'V':{
                    num = num + V;
                    break;
                }
                case 'X':{
                    if (i + 1 < len && s.charAt(i+1) == 'L'){
                        num = num + L - X;
                        i = i+1;
                    }
                    else if (i + 1 < len && s.charAt(i+1) == 'C'){
                        num = num + C - X;
                        i = i + 1;
                    }
                    else
                        num = num + X;
                    break;
                }
                case 'L': {
                    num = num + L;
                    break;
                }
                case 'C':{
                    if (i + 1 < len && s.charAt(i+1) == 'D'){
                        num = num + D - C;
                        i = i+1;
                    }
                    else if (i + 1 < len && s.charAt(i+1) == 'M'){
                        num = num + M - C;
                        i = i + 1;
                    }
                    else
                        num = num + C;
                    break;
                }
                case 'D':{
                    num = num + D;
                    break;
                }
                case 'M':{
                    num = num + M;
                    break;
                }
                default:{
                    System.out.println("Not a valid character");
                    break;
                }
            }
        }
    return num;
    }
}