package ru.otus.java.basic.homeworks;

public class HelloApplication {
    public static void main(String[] args) {
        System.out.println("Проект домашних заданий Java Basic 2025-01");

        User [] users = {
                new User("Петров", "Сергей", "Петрович", 1990, "petrov1990@gmail.com"),
                new User("Иванов", "Иван", "Иванович", 1996, "ivanov1996@gmail.com"),
                new User("Степанов", "Степан", "Иванович", 1980, "stepanov@gmail.com"),
                new User("Смирнов", "Илья", "Иванович", 1984, "smirnov@gmail.com"),
                new User("Алексеев", "Федор", "Сергеевич", 1975, "alekseev@gmail.com"),
                new User("Сидоров", "Андрей", "Алексеевич", 1970, "sidorov@gmail.com"),
                new User("Соколов", "Петр", "Сергеевич", 1998, "sokolov1998@gmail.com"),
                new User("Титов", "Андрей", "Евгеньевич", 1965, "titov@gmail.com"),
                new User("Антонов", "Сергей", "Петрович", 2008, "titov@gmail.com"),
                new User("Федоров", "Антон", "Иванович", 2000, "fedorov2000@gmail.com")
        };

        for (int i = 0; i < users.length; i++) {
            if (2025 - users[i].getBirthYear() > 40) {
                users[i].info();
            }
        }

    }
}
