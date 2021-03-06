package generics.restrictions;

import java.util.AbstractList;

public class NumericOperator<T extends Number, R, E extends AbstractList<R>> {
    private T obj;
    private E list;

    public NumericOperator(T obj, E list){
        this.obj = obj;
        this.list = list;
    }

    public T getObj(){
        return this.obj;
    }

    public E getList(){
        return this.list;
    }

    public boolean isDividableByTen(){
        return obj.doubleValue() - obj.intValue() == 0 && obj.intValue() % 10 == 0;
    }

    public void addList(R a){
        list.add(a);
    }

    public void printList(){
        for(R listVal:this.list){
            System.out.println(listVal);
        }
    }
}
