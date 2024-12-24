// Определение класса IUStudent, который является наследником класса Student
class IUStudent extends Student {

    // Конструктор класса IUStudent
    // Принимает параметры: имя (name), фамилию (surname), курс (course) и оценку зп последний экзамен (last_mark)
    public IUStudent(String name, String surname, int course, int last_mark) {
        // Вызов конструктора родительского класса Student с передачей ему параметров
        super(name, surname, course, last_mark);
    }

    // Переопределение метода writeExam из родительского класса Student
    @Override
    public void writeExam() {
        // Вывод сообщения о том, что студент IU пишет экзамен по направлению 'Информационные технологии'
        System.out.println(name + " " + surname + " (IU Student) пишет экзамен по направлению 'Информационные технологии'.");
    }
}
