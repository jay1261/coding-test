import java.util.*;

class Main{
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<>();

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            treeSet.add(sc.nextInt());
        }

        ArrayList<Integer> list = new ArrayList<>(treeSet);
        Set<Integer> sumSet = new HashSet<>();

        for(int i = 0; i < list.size(); i++){
            for (int j = 0; j < list.size(); j++){
                sumSet.add(list.get(i)+ list.get(j));
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = 0; j < list.size(); j++) {
                int target = list.get(i) - list.get(j);
                if(sumSet.contains(target)){
                    System.out.println(list.get(i));
                    return;
                }

            }
        }


    }

}