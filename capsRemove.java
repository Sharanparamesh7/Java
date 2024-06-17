public class capsRemove {
    public static void main(String[] args) {
        String s="Hi,This is Thiru";
        char ch[]=s.toCharArray();
        //System.out.println(ch);
        String s1="";
        String s2="";
        for(int i=0;i<s.length();i++){
             if(ch[i]>='A' && ch[i]<='Z'){
                s1=s1+" "+ch[i];
               
             }
             else if(((int) ch[i]>='a' && (int) ch[i]<='z') ||  (int) ch[i]>=' '){
                s2+=ch[i];
               
             }
             
        }
        System.out.print(s2+" "+s1);
    }
}
