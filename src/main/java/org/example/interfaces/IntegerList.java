package org.example.interfaces;

public interface IntegerList {

    // Добавление элемента.
    // Вернуть добавленный элемент
    // в качестве результата выполнения.
    Integer add(Integer item);

    // Добавление элемента
    // на определенную позицию списка.
    // Если выходит за пределы фактического
    // количества элементов или массива,
    // выбросить исключение.
    // Вернуть добавленный элемент
    // в качестве результата выполнения.
    Integer add(int index, Integer item);

    // Установить элемент
    // на определенную позицию,
    // затерев существующий.
    // Выбросить исключение,
    // если индекс больше
    // фактического количества элементов
    // или выходит за пределы массива.
    Integer set(int index, Integer item);

    // Удаление элемента.
    // Вернуть удаленный элемент
    // или исключение, если подобный
    // элемент отсутствует в списке.
    Integer remove(Integer item);

    // Удаление элемента по индексу.
    // Вернуть удаленный элемент
    // или исключение, если подобный
    // элемент отсутствует в списке.
    Integer remove(int index);

    // Проверка на существование элемента.
    // Вернуть true/false;
    boolean contains(Integer item);

    // Поиск элемента.
    // Вернуть индекс элемента
    // или -1 в случае отсутствия.
    int indexOf(Integer item);

    // Поиск элемента с конца.
    // Вернуть индекс элемента
    // или -1 в случае отсутствия.
    int lastIndexOf(Integer item);

    // Получить элемент по индексу.
    // Вернуть элемент или исключение,
    // если выходит за рамки фактического
    // количества элементов.
    Integer get(int index);

    // Сравнить текущий список с другим.
    // Вернуть true/false или исключение,
    // если передан null.
    boolean equals(IntegerList otherList);

    // Вернуть фактическое количество элементов.
    int size();

    // Вернуть true,
    // если элементов в списке нет,
    // иначе false.
    boolean isEmpty();

    // Удалить все элементы из списка.
    void clear();

    // Создать новый массив
    // из строк в списке
    // и вернуть его.
    Integer[] toArray();


//    Основы алгоритмов ч.2.
//    В сегодняшней работе требуется написать еще одну реализацию интерфейса из прошлого домашнего задания,
//    но с дополнительными методами.
//
//    Выполненное задание присылайте на платформу в виде ссылки на pull-request.
//
//            Необходимо:
//
//    Написать вторую реализацию интерфейса списка (скопировать и скорректировать первую) из прошлого домашнего задания,
//    но «подогнать» под работу с целыми числами, используя ссылочный тип Integer.
//    Добавить в реализацию приватный метод с самой быстрой из рассмотренных сортировок.
//    Для выявления самой быстрой сортировки следует сравнить сортировки по времени выполнения на случайно
//    сгенерированном массиве со 100 000 элементов.
//
//    Замерить можно следующим кодом:
//
//    long start = System.currentTimeMillis();
//    ваш_метод_сортировки(arr);
//    System.out.println(System.currentTimeMillis() - start);
//
//    Учесть, что для сравнения сортировок нужно использовать 3 разные копии массива, т. к. сортировать уже
//    отсортированный ранее массив некорректно.
//
//    Код самого сравнения прикладывать по желанию.
//
//    Добавить в реализацию приватный метод бинарного поиска.
//            Учесть, что метод contains уже был реализован в прошлом ДЗ.
//
//    Его следует переработать, осуществив сортировку (реализованную в шаге 2) и вызвав метод бинарного поиска.
//
//    Подсказки:
//
//    Сгенерировать массив можно с помощью кода из домашнего задания по массивам.

//    После генерации требуется сделать копию массива через Arrays.copyOf для использования в других сортировках.

}
