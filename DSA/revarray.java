package DSA;

public class revarray {
    public static void main(String[] args){
    String str="Ritesh";
    String rev=" ";
    for(int i=str.length()-1;i>=0;i--){
        rev+=str.charAt(i);
    }
    System.out.println("reversed string is: "+rev);
    }
}
