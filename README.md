# Практическое задание
# Диаграмма класов
![class diagram](http://www.plantuml.com/plantuml/png/XLFDRi8m3BxdANniDVe2rOIOq0v8Q3lm15dZeKXfEkLdXo7UVSbSjw4TubJysVxyVNRO-I1TYBqHdP7Umy7we4CC21SG3LZPOmkduBGzfz1e7reuOXUYG-V54vmnlAMQgkOgmauXAhGXmyVKaq2f58EUlYsCG4qz4ort0RKnNfdnnwoW1d45CKhV3z5vpBAPc6YMFZ8jrLObNF_d1Xueptc7_V2D3ymj5qApOl-1xlspI6exvYRNcI3PqsSxGWcPJNFP-bmvnbvgyw8wXzwNkF_2JakZVsJGWotDJcDBgWqJgP9eSuU67TyavvNUVpIlnP2g9emEHKjGQZzGCFddBSCbkTAAzhTwjjqVYQVLFnFbDZ7Utf-vQF11pUTOwIKrH0GLqRT0yIGyZwpgnT2h4FDVR6YQBKzTmjImHFayWdqtN4YV54ybExGgzkON)

# Пример рабочего кода
```Java

import java.util.*;

class Main {

  public static void main(String[] args) {
    Institution institution = new Institution("Институт", "г. Город");
    
    institution.addCourse(new Course("Химия"));
    institution.addCourse(new Course("Высшая математика"));
    institution.addCourse(new Course("программирование"));

    institution.addLecturer(new Lecturer("Химик Акуленко"));
    institution.addLecturer(new Lecturer("Математик Логинова"));
    institution.addLecturer(new Lecturer("Программист Юшин"));

    institution.addStudent(new Student("Корчагин Михаил Андреевич"));
    institution.addStudent(new Student("Родин Вячеслав Альбертович"));
    institution.addStudent(new Student("Смирнов Максим Денисович"));


    Student s = institution.getStudent(1);
    System.out.println();
    System.out.println(s.getName() + " изучает предметы:");
    s.getCourses().forEach(c -> System.out.println(c.getName()));

    System.out.println("\nпредмет " + institution.getCourse(1).getName() + " изучают:\n");
    institution.getCourse(1).getStudents().forEach(st -> System.out.println(st.getName()));
    
    System.out.println("\nпредмет " + institution.getCourse(3).getName() + " ведёт:");
    System.out.println(institution.getCourse(3).getLecturer().getName());
  }

}

```

## [Выполнить программу](https://ExtrasmallDefiniteSite.dimashumihin.repl.run)
