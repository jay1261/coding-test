import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String now = sc.nextLine();
        String target = sc.nextLine();
        
        String[] splitedN = now.split(":");
        String[] splitedT = target.split(":");
        
        int nh = Integer.valueOf(splitedN[0]);
        int nm = Integer.valueOf(splitedN[1]);
        int ns = Integer.valueOf(splitedN[2]);
        
        int th = Integer.valueOf(splitedT[0]);
        int tm = Integer.valueOf(splitedT[1]);
        int ts = Integer.valueOf(splitedT[2]);
        
        StringBuilder sb = new StringBuilder();
        
        if(ts == ns && tm == nm && th == nh){
            System.out.println("24:00:00");
            return;
        }

        if(ts - ns < 0){
            tm--;
            insert(sb, ts - ns + 60);
        } else {
            insert(sb, ts - ns);
        }
        
        sb.insert(0, ":");
        
        if(tm - nm < 0){
            th--;
            insert(sb, tm - nm + 60);
        } else {
            insert(sb, tm - nm);
        }
        
        sb.insert(0, ":");
        
        if(th - nh < 0){
            insert(sb, th - nh + 24);
        } else {
            insert(sb, th - nh);
        }
        
        System.out.println(sb.toString());
    }
    
    public static void insert(StringBuilder sb, int num){
        if(num < 10) {
            sb.insert(0, "0"+num);
        } else {
            sb.insert(0, num);
        }
    }
}