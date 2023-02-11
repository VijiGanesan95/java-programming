package com.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
    int techId;
    String techname;

    public Technologies() {
    }

    public Technologies(int techId, String techname) {
        this.techId = techId;
        this.techname = techname;
    }

    public int getTechId() {
        return techId;
    }

    public void setTechId(int techId) {
        this.techId = techId;
    }

    public String getTechname() {
        return techname;
    }

    public void setTechname(String techname) {
        this.techname = techname;
    }
    public void tech(){
        System.out.println("tech details");
    }
}
