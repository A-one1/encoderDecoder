public class Encoder {

    public int[] encode (String msg){
        int [] arr = new int[msg.length()];
        for(int i=0;i<msg.length();i++) {
            char c = msg.charAt(i);
            int a = (int) c;
            arr[i] = a;
        }
        return arr;

    }
    public int[] encode(String msg, int offset){
        int[] arr = new int[msg.length()];
        for (int i=0;i<msg.length();i++){
            char c = msg.charAt(i);
            int a = (int )c;
            arr[i] = a + offset;

        }
        return arr;
    }



}