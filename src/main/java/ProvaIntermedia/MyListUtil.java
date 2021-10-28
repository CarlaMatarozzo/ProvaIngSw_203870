package ProvaIntermedia;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyListUtil {
    private List<Integer> number;

    public MyListUtil(List<Integer> number){
        this.number=number;
    }

    public void getSize(){
        System.out.println(number.size());
    }

    public List<Integer> sort(List<Integer> number, int order){
        if(order==0){
            for(int i=0; i<number.size(); i++){
                for(int e=0; e<number.size(); e++){
                    if(number.get(i)< number.get(e)){
                        int x=number.get(i);
                        number.set(i,number.get(e));
                        number.set(e,x);
                    }
                }
            }
        } else if(order==1){
            for(int i=0; i<number.size(); i++){
                for(int e=0; e<number.size(); e++){
                    if(number.get(i)> number.get(e)){
                        int x=number.get(i);
                        number.set(i,number.get(e));
                        number.set(e,x);
                    }
                }
            }
        }
        return number;
    }
}
