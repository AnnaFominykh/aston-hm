/**
 * Главный класс с реализацией функций
 * @autor Фоминых Анна
 * @version 1.0
**/

public class Main {
    public static void main(String[] args)
    {
        // Создаем экземпляр класса Monster_characteristics для управления списком монстров
        Monster_characteristics m = new Monster_characteristics();

        // Добавляем несколько монстров с использованием метода add (автоматическое присвоение ID)
        m.add("vampire", "speed, transformation, hypnosis", "sunlight, holy_symbols");
        m.add("ghost", "flight", "holy_symbols");
        m.add("zombie", "immortality", "fire");

        // Выводим информацию обо всех монстрах в списке
        System.out.println("----- Изначальный список -----");
        m.getAll();

        // Добавляем монстра с указанием ID с использованием метода addId
        m.addId(2, "werewolf", "transformation", "silver");

        // Выводим обновленный список монстров
        System.out.println("----- Список после добавления werewolf (addId) -----");
        m.getAll();

        // Сортируем список по ID (используется устаревший метод sort())
        // Примечание: Этот метод помечен как @deprecated и рекомендуется использовать sortByMonsterId()
        System.out.println("----- Список после сортировки по ID (sort()) -----");
        m.sort();
        m.getAll();

        // Получаем и выводим информацию о монстре с ID 2
        System.out.println("----- Информация о монстре с ID 2 (get(2)) -----");
        m.get(2);

        // Удаляем монстров, начиная с ID 2 (используется устаревший метод remove())
        // Примечание: Этот метод помечен как @deprecated и удаляет все элементы после указанного индекса, а не элемент с этим индексом.
        System.out.println("----- Список после удаления, начиная с ID 2 (remove(2)) -----");
        m.remove(2);
        m.getAll();

        // Сортируем список по имени
        System.out.println("----- Список после сортировки по имени (sortByName()) -----");
        m.sortByName();
        m.getAll();

        // Сортируем список по ID с использованием Quicksort
        System.out.println("----- Список после сортировки по ID (sortByMonsterId()) -----");
        m.sortByMonsterId();
        m.getAll();

        // Сортируем список по способностям
        System.out.println("----- Список после сортировки по способностям (sortByPowers()) -----");
        m.sortByPowers();
        m.getAll();

        // Сортируем список по слабостям
        System.out.println("----- Список после сортировки по слабостям (sortByWeakness()) -----");
        m.sortByWeakness();
        m.getAll();

        // Очищаем список монстров
        System.out.println("----- Список после очистки (clear()) -----");
        m.clear();

        // Выводим пустой список (должен быть пустым)
        m.getAll();
    }

}
