/**
 * <p>
 * Класс {@code Monsters}, неизменяем, описывает характеристики монстра, такие как:
 * уникальный идентификатор, имя, силы и слабости.
 * Он служит хранилищем данных и предоставляет методы получения значений для каждого из свойств.
 * </p>
 *
 * @author Фоминых Анна Андреевна
 * @version 1.0
 */

public class Monsters {

    /**
     * Уникальный идентификатор монстра.
     */
    private int id;

    /**
     * Название монстра.
     */
    private String name;

    /**
     * Описание способностей монстра.
     */
    private String powers;

    /**
     * Описание слабостей монстра.
     */
    private String weakness;

    /**
     * Конструктор по умолчанию класса `Monsters`.
     * Создает экземпляр класса `Monsters` с полями, не инициализированными значениями.
     */
    public Monsters() {
    }

    /**
     * Возвращает идентификатор монстра.
     *
     * @return Идентификатор монстра.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Устанавливает идентификатор монстра.
     *
     * @param id Новый идентификатор монстра.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Возвращает имя монстра.
     *
     * @return Имя монстра.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Устанавливает имя монстра.
     *
     * @param name Новое имя монстра.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает описание способностей монстра.
     *
     * @return Описание способностей монстра.
     */
    public String getPowers() {
        return this.powers;
    }

    /**
     * Устанавливает описание способностей монстра.
     *
     * @param powers Новое описание способностей монстра.
     */
    public void setPowers(String powers) {
        this.powers = powers;
    }

    /**
     * Возвращает описание слабостей монстра.
     *
     * @return Описание слабостей монстра.
     */
    public String getWeakness() {
        return this.weakness;
    }

    /**
     * Устанавливает описание слабостей монстра.
     *
     * @param weakness Новое описание слабостей монстра.
     */
    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }
}
