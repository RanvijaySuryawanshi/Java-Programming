public class ChangeIndex{
    public static void main(String[] args){
        String s = "wuryawanshi";
        int index = 0;
        char ch = 'S';
        s = s.substring(0, index) + ch + s.substring(index + 1);
        System.out.println(s);
    }
}