package minitest.impl;

import minitest.model.Classroom;
import minitest.model.IOFileOfClassroom;
import minitest.servise.Manage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassroomManage implements Manage<Classroom> {
    private final Scanner scanner;
    static ArrayList<Classroom> classrooms;
    static IOFileOfClassroom ioFileOfClassroom = new IOFileOfClassroom();

    static {
        try {
            classrooms = (ArrayList<Classroom>) ioFileOfClassroom.readFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ClassroomManage(Scanner scanner) {
        this.scanner = scanner;
        classrooms = new ArrayList<>();
        classrooms.add(new Classroom("C0223I1"));
        classrooms.add(new Classroom("C1022I1"));
    }


    public ArrayList<Classroom> getClassrooms() {
        return classrooms;
    }

    @Override
    public Classroom create() {
        try {
            System.out.println("Input name classroom: ");
            String name = scanner.nextLine();
            Classroom classroom = new Classroom(name);
            classrooms.add(classroom);
            ioFileOfClassroom.writeFile(classrooms);
            return classroom;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Classroom update() throws IOException {
        Classroom classroom = getById();
        if (classroom != null) {
            System.out.println("Input new name classroom: ");
            String name = scanner.nextLine();
            if (!name.equals("")) {
                classroom.setName(name);
            }
        }
        ioFileOfClassroom.writeFile(classrooms);
        return classroom;
    }

    @Override
    public Classroom delete() throws IOException {
        Classroom classroom = getById();
        if (classroom != null) {
            classrooms.remove(classroom);
        }
        ioFileOfClassroom.writeFile(classrooms);
        return classroom;
    }

    @Override
    public Classroom getById() {
        displayAll();
        System.out.println("Input id you want to find: ");
        String i = scanner.nextLine();
        if (!i.equals("")) {
            int id = Integer.parseInt(i);
            for (Classroom classroom : classrooms) {
                if (classroom.getId() == id) {
                    return classroom;
                }
            }
        }
        return null;
    }

    @Override
    public void displayAll() {
        System.out.printf("%-10s%s", "ID", "NAME\n");
        for (Classroom classroom : classrooms) {
            classroom.display();
        }
    }

    public void displayOne(Classroom classroom) {
        if (classroom != null) {
            classroom.display();
        } else {
            System.out.println("Not exist this object!");
        }
    }
}
