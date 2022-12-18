package oop.les2.adult;

public class Adult {
    private String name;
    private int id;
    private String speciality;

    public Adult(String name, int id, String speciality) {
        setName(name);
        setSpeciality(speciality);
        if (checkId(id)) {
            this.id = id;
        }
    }

    public Adult(String name, int id) {
        setName(name);
        if (checkId(id)) {
            this.id = id;
        }
    }

    public Adult(Adult adult) {
        this.name = adult.getName();
        this.id = adult.getId();
        this.speciality = adult.getSpeciality();
    }

    public String getSpeciality() {
        return speciality;
    }

    public boolean setSpeciality(String speciality) {
        if (!speciality.equals("")) {
            this.speciality = speciality;
            return true;
        } else return false;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (!name.equals("")) {
            this.name = name;
            return true;
        } else {
            this.name = "Default_name";
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public boolean checkId(int id){
        return id > 100000000 && id <= 999999999;
    }
    public void show() {
        System.out.print("\nname: " + this.name + "\nid: " + this.id);
        if (this.speciality != null && !this.speciality.equals(""))
            System.out.print("\nspeciality: " + this.speciality);
        System.out.println();
    }

}
