public class NewDataContainer<T>{
    private  T[] c;

    private T a;


    public NewDataContainer(int size){
        T[] c = (T[]) new Object [size];
        this.c = c;
    }

    public  NewDataContainer(){
        this(1);
    }
    public void add(T object){
        boolean isEmpty = false;
        for(int i = 0; i < c.length;i++){
            if(c[i] == null){
                c[i] = object;
                isEmpty = true;
                break;
            }

        }
        if(!isEmpty){
            T[] newArr = (T[]) new Object [c.length + 1];
            for(int i = 0; i < c.length; i++){
                newArr[i] = c[i];
            }
            newArr[newArr.length - 1] = object;

            c = newArr;
        }


    }
    public void remove(int num){
        T[] newArr = (T[]) new Object [c.length - 1];
        int j = 0;
        for(int i = 0; i < c.length; i++){
            if(i != num){
                newArr[j++] = c[i];

            }
        }
        c = newArr;

    }


    public T getValue(Integer num) {
        return c[num];
    }

    public T[] get(){
        return c;
    }
}
