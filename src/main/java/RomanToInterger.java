public class RomanToInterger {

    public static int romanToInt(String s) {
        int number = 0;

        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            switch (letter) {
                case 'M':
                    number = 1000;

                case 'D':
                    number = number + 500;
                    break;
                case 'C':

                    number = number + 100;
                    break;
                case 'L':
                    number = number + 50;
                    break;
                case 'X':
                    number = number + 10;
                    break;
                case 'V':
                    number = number + 5;
                    break;
                case 'I':
                    number = number + 1;
                    break;

            }

        }

        return number;
    }
    public static void main(String []args){

        System.out.println(romanToInt("MXIII"));
        System.out.println(romanToInt("II"));
        System.out.println(romanToInt("LVII"));
        System.out.println(romanToInt("MCMXCIV"));

    }
}
