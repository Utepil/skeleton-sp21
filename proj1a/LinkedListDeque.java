import java.lang.management.ThreadInfo;

public class LinkedListDeque<her> {
    public class IntNode {
        public IntNode pre;
        public IntNode next;
        public her item;
    }

    public int size = 0;
    public IntNode sentinel;

    public boolean isEmpty() {
        return size == 0;
    }

    public LinkedListDeque(){
        sentinel = new IntNode();
        sentinel.pre = sentinel;
        sentinel.next = sentinel;
    }

    public void printDeque(){
        IntNode p = sentinel.next;
        while(p != sentinel){
            System.out.println(p.item+" ");
            p = p.next;
        }
        System.out.println();
    }
    public LinkedListDeque(LinkedListDeque<her> other){
        sentinel = new IntNode();
        sentinel.pre = sentinel;
        sentinel.next = sentinel;
        size = 0;
        for(int i = 0; i < other.size(); i++){
            addLast(other.get(i));
        }
    }
    
    public her get(int index){
        int count = 0;
        IntNode p = sentinel;
        if(index > size) return null;
        while(count < index){
            p = p.next;
            count++;
        }
        return p.item;
    }
    
    public her getRecursive(int index,int cnt,IntNode p,int size){
        if(index > size) return null;
        if(cnt == index) return p.item;
        return getRecursive(index + 1, cnt+1, p.next,size);
    }

    public void addFirst(her item){
        IntNode newNode = new IntNode();
        newNode.item = item;
        newNode.next = sentinel;
        newNode.pre = sentinel.pre;

        sentinel.pre.next = newNode;
        sentinel.pre = newNode;
        sentinel = newNode;

        size++;
    }

    public void addLast(her item){
        IntNode newNode = new IntNode();
        newNode.item = item;
        newNode.pre = sentinel.pre;
        newNode.next = sentinel;

        sentinel.pre.next = newNode;
        sentinel.pre = newNode;

        size++;
    }

    public void removeFirst(){
        if(size == 0) return;
        sentinel.next.pre = sentinel.pre;
        sentinel.pre.next = sentinel.next;
        IntNode temp = sentinel.next;
        sentinel.next = null;
        sentinel = temp;
        size--;
    }
    public void removeLast(){
        if(size == 0) return;
        sentinel.pre.pre.next = sentinel;
        IntNode temp= sentinel.pre;
        sentinel.pre = temp.pre;

        temp.pre = null;
        size--;
    }

    public int size(){
        return size;
    }
}