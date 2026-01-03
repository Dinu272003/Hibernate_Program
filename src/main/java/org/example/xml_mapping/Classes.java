package org.example.xml_mapping;

public class Classes {
    int classesId;
    String classesName;
    String duration;
    public Classes(){

    }
    public Classes(int classesId, String classesName, String duration) {
        this.classesId = classesId;
        this.classesName = classesName;
        this.duration = duration;
    }

    public int getClassesId() {
        return classesId;
    }

    public void setClassesId(int classesId) {
        this.classesId = classesId;
    }

    public String getClassesName() {
        return classesName;
    }

    public void setClassesName(String classesName) {
        this.classesName = classesName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}

