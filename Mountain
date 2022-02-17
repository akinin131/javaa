package Lesson4;

public class Mountain {
    private  String name;
    private int height;

    public Mountain(String name, int height) {
       setName(name);
       setHeight(height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <100){
            throw new IllegalArgumentException("это не гора");
        }
        this.height = height;
    }
}
