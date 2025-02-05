
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Класс `Monster_characteristics` управляет коллекцией объектов `Monsters`.
 * Предоставляет методы для добавления, удаления, получения, очистки и сортировки списка монстров.
 * @autor Фоминых Анна
 * @version 1.0
 */
public class Monster_characteristics {
    /**
     * Список для хранения объектов `Monsters`.
     */
    ArrayList<Monsters> monsters = new ArrayList();

    /**
     * Генерирует и возвращает новый ID для монстра.  Функция не работает корректно, всегда возвращает значение, превышающее размер списка.
     *
     * @return Новый ID для монстра (потенциально неверный).
     */

    public Integer id() {
        int id;
        for (id = 0; id <= monsters.size(); id++); // Проблема: пустой цикл for, id всегда будет monsters.size() + 1
        return id; // Возвращает значение, превышающее индекс последнего элемента в списке
    }

    /**
     * Добавляет нового монстра с указанным ID и характеристиками.
     *
     * @param Id      ID монстра.
     * @param name    Имя монстра.
     * @param powers  Способности монстра.
     * @param weakness Слабости монстра.
     */
    public void addId(int Id, String name, String powers, String weakness) {
        { // Этот блок {} не нужен и может быть удален
            Monsters monster = new Monsters();
            monster.setId(Id);
            monster.setName(name);
            monster.setPowers(powers);
            monster.setWeakness(weakness);
            this.monsters.add(monster);
        }
    }

    /**
     * Добавляет нового монстра с автоматическим присвоением ID.  Использует метод `id()` для генерации ID, который потенциально неверен.
     *
     * @param name    Имя монстра.
     * @param powers  Способности монстра.
     * @param weakness Слабости монстра.
     */
    public void add(String name, String powers, String weakness) {
        Monsters monster = new Monsters();
        monster.setId(id());  // Использует проблемный метод id()
        monster.setName(name);
        monster.setPowers(powers);
        monster.setWeakness(weakness);
        this.monsters.add(monster);
    }

    /**
     * Выводит информацию о монстре с указанным ID в консоль.
     *
     * @param Id ID монстра, информацию о котором нужно вывести.
     */
    public void get(int Id) {
        System.out.println(" | " + monsters.get(Id).getId() + " | " + monsters.get(Id).getName() + " | "
                + monsters.get(Id).getPowers() + " | " + monsters.get(Id).getWeakness() + " | ");
    }

    /**
     * Выводит информацию обо всех монстрах в списке в консоль.
     */
    public void getAll() {
        for (int i = 0; i < monsters.size(); i++) {
            System.out.println(" | " + monsters.get(i).getId() + " | " + monsters.get(i).getName() + " | "
                    + monsters.get(i).getPowers() + " | " + monsters.get(i).getWeakness() + " | ");
        }
    }

    /**
     * Удаляет монстров из списка, начиная с указанного ID.  Функция удаляет некорректно, удаляя все элементы после элемента с указанным индексом,
     *  вместо удаления элемента с указанным индексом
     * @param Id Индекс, с которого начинается удаление.
     */

    public void remove(int Id) {
        for (int i = Id; i < this.monsters.size(); i++) {
            monsters.remove(i); // Удаляет все элементы после Id, что является ошибкой
        }
    }

    /**
     * Очищает весь список монстров.
     */
    public void clear() {
        monsters.clear();
    }

    /**
     * Сортирует список монстров по ID с использованием `Collections.sort` и `Comparator`.
     * Рекомендуется заменить на `sortByMonsterId()` для более эффективной сортировки.
     *
     */

    public void sort() {
        Collections.sort(monsters, Comparator.comparingInt(Monsters::getId));
    }

    /**
     * Сортирует список с использованием алгоритма быстрой сортировки (Quicksort).
     *
     * @param list       Список для сортировки.
     * @param comparator Компаратор для сравнения элементов.
     * @param <T>        Тип элементов в списке.
     */
    public <T> void quickSort(List<T> list, Comparator<? super T> comparator) {
        quickSortHelper(list, 0, list.size() - 1, comparator);
    }

    /**
     * Вспомогательный рекурсивный метод для реализации алгоритма Quicksort.
     *
     * @param list       Список для сортировки.
     * @param low        Нижняя граница подсписка.
     * @param high       Верхняя граница подсписка.
     * @param comparator Компаратор для сравнения элементов.
     * @param <T>        Тип элементов в списке.
     */
    private <T> void quickSortHelper(List<T> list, int low, int high, Comparator<? super T> comparator) {
        if (low < high) {
            int partitionIndex = partition(list, low, high, comparator);

            quickSortHelper(list, low, partitionIndex - 1, comparator);
            quickSortHelper(list, partitionIndex + 1, high, comparator);
        }
    }

    /**
     * Метод разделения для алгоритма Quicksort.
     *
     * @param list       Список для разделения.
     * @param low        Нижняя граница подсписка.
     * @param high       Верхняя граница подсписка.
     * @param comparator Компаратор для сравнения элементов.
     * @param <T>        Тип элементов в списке.
     * @return Индекс разделения.
     */
    private <T> int partition(List<T> list, int low, int high, Comparator<? super T> comparator) {
        T pivot = list.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (comparator.compare(list.get(j), pivot) <= 0) {
                i++;

                T temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }


        T temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);

        return i + 1;
    }

    /**
     * Сортирует список монстров по ID с использованием алгоритма быстрой сортировки.
     */
    public void sortByMonsterId() {
        quickSort(monsters, Comparator.comparingInt(Monsters::getId));
    }

    /**
     * Сортирует список монстров по имени с использованием алгоритма быстрой сортировки.
     */
    public void sortByName() {
        quickSort(monsters, Comparator.comparing(Monsters::getName));
    }

    /**
     * Сортирует список монстров по способностям с использованием алгоритма быстрой сортировки.
     */
    public void sortByPowers() {
        quickSort(monsters, Comparator.comparing(Monsters::getPowers));
    }

    /**
     * Сортирует список монстров по слабостям с использованием алгоритма быстрой сортировки.
     */
    public void sortByWeakness() {
        quickSort(monsters, Comparator.comparing(Monsters::getWeakness));
    }


}
