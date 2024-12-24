public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры классов
        IUStudent iuStudent = new IUStudent("Иван", "Иванов", 3, 5);
        MathStudent mathStudent = new MathStudent("Петр", "Петров",2, 5);

        // Выводим информацию о студентах и вызываем метод writeExam
        iuStudent.printInfo();
        iuStudent.writeExam();

        System.out.println(); // Для разделения вывода

        mathStudent.printInfo();
        mathStudent.writeExam();
    }
}
