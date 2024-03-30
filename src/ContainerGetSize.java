public class ContainerGetSize<T> {
    public Integer getSize(NewDataContainer<T> container){

        return container.get().length;//Вывел получение размера в отдкльный класс. Используется принцип единственной отвественности.
    }
}
