package ProvaIntermediaTest;

import ProvaIntermedia.MyListUtil;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyListUtilTest {
    private MyListUtil myList;

    @Test
    public void sortTest(){
        List<Integer> lista=new ArrayList<Integer>();
        lista.addAll(Arrays.asList(5,9,8,6,50,30,10,7));
        assertEquals(Arrays.asList(5,6,7,8,9,10,30,50),myList.sort(lista,0));
        assertEquals(Arrays.asList(50,30,10,9,8,7,6,5),myList.sort(lista,1));
        assertNotEquals(Arrays.asList(7,8,6,9,5,10,30,50),myList.sort(lista,0));
        assertEquals(Arrays.asList(5,30,10,9,8,7,6,50),myList.sort(lista,1));
    }
}
