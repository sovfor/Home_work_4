public class Pair<T,U> implements GetValue<T>  {
    private T first;

    private U second;

    public Pair(T first, U second){
        this.first = first;
        this.second = second;
    }
    @Override
    public T getValue(){
     return first;// Добавил интерфейс для расширения класса. Используется метод открытости/закрытости
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T first){
        this.first = first;
    }

    public void setSecond(U second){
        this.second = second;
    }

}
