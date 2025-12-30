package org.example.entity;

import javax.persistence.Embeddable;

@Embeddable
public class UseEmbedable {
    String course;
    String duration;


    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
