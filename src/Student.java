// Абстрактный класс Student, представляющий студента
abstract class Student {
    // Защищенные переменные для хранения имени, фамилии, курса и последней оценки студента
    protected String name;       // Имя студента
    protected String surname;    // Фамилия студента
    protected int course;        // Номер курса, на котором учится студент
    protected int last_mark;     // Оценка за последний экзамен

    // Конструктор класса Student, инициализирующий поля студента
    public Student(String name, String surname, int course, int last_mark) {
        // Присваивание значений переменных с помощью геттеров
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.last_mark = last_mark;
    }

    // Абстрактный метод writeExam(), который должен быть реализован в наследниках
    public abstract void writeExam();

    // Метод для вывода информации о студенте
    public void printInfo() {
        // Форматированный вывод информации о студенте
        System.out.println("ФИО: " + name + " " + surname +  ", Курс: " + course + ", Оценка за последний экзамен: " + last_mark);
    }
}
