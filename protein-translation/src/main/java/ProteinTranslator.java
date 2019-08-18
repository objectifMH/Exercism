import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

class ProteinTranslator {

    static List<String> translate(String rnaSequence) {

        List resList = new ArrayList();
        int index = 0 ;

        while ( index < rnaSequence.length())
        {
            String st = rnaSequence.substring(index, index+3);

            if ( isStop(st))
            {
                return resList ;
            }
            else if( isCysteine(st))
            {
                resList.add("Cysteine");
            }
            else if( isMethionine(st))
            {
                resList.add("Methionine");
            }
            else if( isPhenylalanine(st))
            {
                resList.add("Phenylalanine");
            }
            else if( isLeucine(st))
            {
                resList.add("Leucine");
            }
            else if( isSerine(st))
            {
                resList.add("Serine");
            }
            else if( isTyrosine(st))
            {
                resList.add("Tyrosine");
            }
            else if( isTryptophan(st))
            {
                resList.add("Tryptophan");
            }


            index = index + 3 ;

        }
        return resList;
    }

    static public boolean isStop(String st) { // UAA, UAG, UGA
        boolean res = false;
        if ( st.length() == 3 ){
            Set<String> set = new HashSet<>();
            set.add("UAA");
            set.add("UAG");
            set.add("UGA");

            if (set.contains(st)) {
                res = true ;
            }
         }
        else
        {
            res = false ;
        }
        return res;
    }

    static public boolean isMethionine(String st) { // AUG
        boolean res = false;
        if ( st.length() == 3 ){
            Set<String> set = new HashSet<>();
            set.add("AUG");

            if (set.contains(st)) {
                res = true ;
            }
        }
        else
        {
            res = false ;
        }
        return res;
    }


    static public boolean isPhenylalanine(String st) { // UUU, UUC
        boolean res = false;
        if ( st.length() == 3 ){
            Set<String> set = new HashSet<>();
            set.add("UUU");
            set.add("UUC");

            if (set.contains(st)) {
                res = true ;
            }
        }
        else
        {
            res = false ;
        }
        return res;
    }

    static public boolean isLeucine(String st) { // UUA, UUG
        boolean res = false;
        if ( st.length() == 3 ){
            Set<String> set = new HashSet<>();
            set.add("UUA");
            set.add("UUG");

            if (set.contains(st)) {
                res = true ;
            }
        }
        else
        {
            res = false ;
        }
        return res;
    }

    static public boolean isSerine(String st) { // UCU, UCC, UCA, UCG
        boolean res = false;
        if ( st.length() == 3 ){
            Set<String> set = new HashSet<>();
            set.add("UCU");
            set.add("UCC");
            set.add("UCA");
            set.add("UCG");

            if (set.contains(st)) {
                res = true ;
            }
        }
        else
        {
            res = false ;
        }
        return res;
    }


    static public boolean isTyrosine(String st) { // UAU, UAC
        boolean res = false;
        if ( st.length() == 3 ){
            Set<String> set = new HashSet<>();
            set.add("UAU");
            set.add("UAC");

            if (set.contains(st)) {
                res = true ;
            }
        }
        else
        {
            res = false ;
        }
        return res;
    }


    static public boolean isCysteine(String st) { // UGU, UGC
        boolean res = false;
        if ( st.length() == 3 ){
            Set<String> set = new HashSet<>();
            set.add("UGU");
            set.add("UGC");

            if (set.contains(st)) {
                res = true ;
            }
        }
        else
        {
            res = false ;
        }
        return res;
    }

    static public boolean isTryptophan(String st) { // UGG
        boolean res = false;
        if ( st.length() == 3 ){
            Set<String> set = new HashSet<>();
            set.add("UGG");

            if (set.contains(st)) {
                res = true ;
            }
        }
        else
        {
            res = false ;
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> trans = translate("AUGUUUUCUUAAAUG");
        for ( String st : trans)
        {
            System.out.println(st);
        }
    }

}