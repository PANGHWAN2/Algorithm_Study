//stack

import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Stack<Integer> stk = new Stack<>();
        
        if(stk.empty()){
            stk.push(1);
            stk.push(2);
            stk.push(3);
        }
        
        if(!stk.empty()){
            if(stk.peek() == 3)
                stk.pop();
                
        }
        
        if(stk.search(3) == -1){
            System.out.println("3 is poped");
        }
    }
}

//map

import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        HashMap<String, Integer> hm = new HashMap<>();
        
        hm.put("key1", 1);
        hm.put("key2", 2);
        hm.put("key3", 3);
        
        if(hm.containsKey("key1") && hm.containsValue(1))
            System.out.println("YES");
            
        hm.put("key1", hm.getOrDefault(("key1"), 0) * 10);
        
        List<String> keyList = new ArrayList<>(hm.keySet());
        
        // 오름차순으로 키 정렬
        Collections.sort(keyList, new Comparator<String>(){
            public int compare(String s1, String s2){
                int v1 = hm.get(s1);
                int v2 = hm.get(s2);
                
                return Integer.compare(v1, v2);
            }    
        });
        
        // 출력
        for(String s : keyList){
            System.out.println(s + " = " + hm.get(s));
        }
        
        System.out.println(hm.size());
    }
}


//set
import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("apple");
        ts.add("core");
        ts.add("banana");
        
        // 정렬된 순서로 출력
        for(String s : ts)
            System.out.println(s);
            
        HashSet<String> hs = new HashSet<>(ts);
        
        // 정렬되지 않은 채 출력
        for(String s : hs)
            System.out.println(s);    
            
            
        // For문내에서 요소 삭제
        Iterator<String> iterator = hs.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.length() % 2 == 0) {
                iterator.remove();
            }
        }
        
        // 삭제 결과 출력
        for(String s : hs)
            System.out.println(s);    
    }
}


//Heap(Priority Queue)
import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
    public static class Item{
        int val1, val2;
        Item(int val1, int val2){
            this.val1 = val1;
            this.val2 = val2;
        }
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
        // 생성 및 정렬
        PriorityQueue<Item> queue = new PriorityQueue<>(new Comparator<Item>(){
            public int compare(Item i1, Item i2){
                if(i1.val1 == i2.val1){
                    return Integer.compare(i1.val2, i2.val2);
                }else
                    return Integer.compare(i1.val1, i2.val1);
            }
        });
        
        queue.add(new Item(4, 3));
        queue.add(new Item(3, 6));
        queue.add(new Item(4, 8));
        queue.add(new Item(1, 1));
        
        // Poll & Peek
        if(queue.size() != 0)
            queue.poll();
            
        queue.add(new Item(7, 3));
        queue.add(new Item(2, 6));
        
        // 단순 출력(정렬되어 있어도, 단순 출력은 정렬형태가 아님)
        for(Item item : queue){
            System.out.println(item.val1 + " : " + item.val2);
        }
        
        
        // Sort 확인
        while(queue.size() != 0){
            Item item = queue.poll();
            System.out.println(item.val1 + " : " + item.val2);
        }
    }
}

