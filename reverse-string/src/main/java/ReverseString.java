class ReverseString {

    /*
    String reverse(String inputString) {
        String[] ch = inputString.split("");
        String result = "";

        for (int i= ch.length  - 1 ; i >= 0 ; i--)
        {
            result += ch[i] ;
        }
        return result;
    }
    */


    String reverse(String inputString) {
        StringBuilder output = new StringBuilder(inputString);
        return output.reverse().toString();
    }


  
}