public class ChangeIndex{
    public static void main(String[] args){
        String str = "wuryawanshi";
        int index = 0;
        char ch = 'S';
        str = str.substring(0, index) + ch + str.substring(index + 1);
        System.out.println(str);
    }
}