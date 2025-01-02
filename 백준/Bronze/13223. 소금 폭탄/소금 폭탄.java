import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String current = sc.nextLine();
        String target = sc.nextLine();
        
        if(current.equals(target)){
            System.out.println("24:00:00");
            return;
        }

        int ch = Integer.valueOf(current.charAt(0) + "" +  current.charAt(1));
        int cm = Integer.parseInt(current.charAt(3) + "" + current.charAt(4));
        int cs = Integer.parseInt(current.charAt(6) + "" + current.charAt(7));

        int th = Integer.parseInt(target.charAt(0) + "" + target.charAt(1));
        int tm = Integer.parseInt(target.charAt(3) + "" + target.charAt(4));
        int ts = Integer.parseInt(target.charAt(6) + "" + target.charAt(7));

        
        int as = ts - cs;
        if(as < 0){
            as += 60;
            tm--;
        }
        
        int am = tm - cm;
        if(am < 0){
            am += 60;
            th--;
        }
                
        int ah = th - ch;
        if(ah < 0){
            ah += 24;
        }
        
        String hh = ah < 10 ? "0"+ah : ah+"";
        String mm = am < 10 ? "0"+am : am+"";
        String ss = as < 10 ? "0"+as : as+""; 
        System.out.println(hh+":"+mm+":"+ss);
    }

}