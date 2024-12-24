class MathStudent extends Student {
    // Конструктор
    public MathStudent(String name, String surname, int course, int last_mark) {
        super(name, surname,  course, last_mark);
    }

    // Реализация абстрактного метода
    @Override
    public void writeExam() {
        System.out.println(name+ " "+ surname + " (Math Student) пишет экзамен по направлению 'Математика'.");
    }
}