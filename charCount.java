public class charCount {
    public static void main(String[] args) {
        String str="aaaabBBcccCCdee";
        char ch=str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++){
            if(ch==str.charAt(i)){
                 count++;   
            }
            else{
                System.out.print(ch+""+count);
                ch=str.charAt(i);
                count=1;
            }
        }
    }
}
