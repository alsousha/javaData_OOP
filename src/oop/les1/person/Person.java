
package oop.les1.person;
public class Person {
    private String name;
    private float height;
    private float weight;

    public Person(String name, float height, float weight){
        setName(name);
        setHeight(height);
        setWeight(weight);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("")) this.name = name;
    }

    public float getHeight() {
        return height;
    }

    //suppose that height is between 30 and 220 sm
    public void setHeight(float height) {
        if (height > 30 && height < 220) this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    //suppose that weight less than 300 kg
    public void setWeight(float weight) {
        if (weight > 0 && weight < 300) this.weight = weight;

    }

    //show Person's data
    public String show(){
        return "Person " + this.name + " with height " + this.height + " and weight "+this.weight;
    }
}
