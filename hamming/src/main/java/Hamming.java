import java.util.stream.IntStream;

class Hamming {

    public String left ;
    public String right ;

    Hamming(String leftStrand, String rightStrand) {
        if ( leftStrand.length() == rightStrand.length())
        {
            left = leftStrand ;
            right = rightStrand ;
            getHammingDistance();
        }
        else {
            String st = leftStrand.isEmpty() ? "left strand must not be empty." : (rightStrand.isEmpty() ? "right strand must not be empty." : "leftStrand and rightStrand must be of equal length." ) ;
            throw new IllegalArgumentException(st) ;
        }
    }


    int getHammingDistance() {
        return (int) IntStream.range(0, left.length())
                .filter(i -> left.charAt(i) != right.charAt(i))
                .count();

    }


}
