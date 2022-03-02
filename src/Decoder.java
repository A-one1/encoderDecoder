public class Decoder {
    public String decode(int[] secret){
        String s= "";
        for (int i=0;i<secret.length;i++) {
            int a = secret[i];
            char c = (char) a;
            s = s + c;
        }
        return s;

    }

    public String decode(int[] secret, int offset){
        String s = "";
        for (int i=0;i<secret.length;i++){
            int a = secret[i];
            a = a - offset;
            char c= (char) a;
            s = s + c;
        }
        return s;
    }


}