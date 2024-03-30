public class ContainerGetSize<T> {
    public ContainerGetSize(){

    }
    public Integer getSize(NewDataContainer<T> container){

        return container.get().length;//Вывел получение размера в отдкльный класс. Используется принцип единственной отвественности.
    }
}
