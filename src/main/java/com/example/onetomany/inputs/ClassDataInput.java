package com.example.onetomany.inputs;

public class ClassDataInput {
    private Long id;
    private String className;
    private String description;

    public ClassDataInput() {
    }

    public ClassDataInput(Long id, String className, String description) {
        this.id = id;
        this.className = className;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
