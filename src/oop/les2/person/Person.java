package oop.les2.person;

public class Person {
    private String name;
    private Person partner = null;

    public Person(String name) {
        setName(name);
        this.partner = null;
    }

    public Person(String name, Person partner) {
        setName(name);
        //this.partner = partner;
        setPartner(partner);
        //partner.setPartner(this);
    }

    public Person getPartner() {
        return partner;
    }

    public void changePartner(Person partner) {
        //this.partner.setPartner(null);
        System.out.println("EEE");
        this.partner.getPartner().setPartner(null);
        (this.partner.getPartner()).show();
//        this.partner.getPartner().setPartner(null);
//        this.partner = partner;
////        if (partner.getPartner() != null) partner.getPartner().setPartner(null);
//        partner.setPartner(this);
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.print("Person " + this.name);
        if (this.partner == null) {
            System.out.print(" hasn't partner");
        } else System.out.print(" has partner " + this.partner.getName());
        System.out.println();
    }

    public void setPartner(Person partner) {
        if (partner == null) this.partner = null; //Partner is null object ()
        else {
            //check is this not same object (Olga is not with Olga)
            if (this.partner!=partner && this != partner) {
                if(this.partner!=null) this.partner.setPartner(null);

                this.partner=partner;
                if(partner.getPartner()==null){
                    partner.setPartner(this);
                }else if(partner.getPartner()!=this){
                    partner.getPartner().setPartner(null);
                    partner.setPartner(this);
                }
            }
        }
    }

    public boolean setName(String name) {
        if (!name.equals("")) {
            this.name = name;
            return true;
        } else return false;
    }
}
