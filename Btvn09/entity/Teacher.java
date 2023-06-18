package BTVN.Btvn09.entity;

import statics.TeacherLevel;

public class Teacher extends entity.Person {
    private static int AUTO_ID = 100;

    private int id;
    private TeacherLevel level;
    public Teacher(){
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TeacherLevel getLevel() {
        return level;
    }

    public void setLevel(TeacherLevel level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                "} " + super.toString();
    }

    public void setName(String nextLine) {
    }
}

