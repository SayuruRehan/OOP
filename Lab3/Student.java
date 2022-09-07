package Lab3;

public class Student {
    private String name, ditno, address;

    String getDetails(){
        String s = "Im a student.\nMy name is " + getName() + ".\nMy dit number is " + getDitno() + ".\nMy address is " + getAddress() + ".";
        return s;
    }
/*
    public Student(String Nname, String NditNo, String Naddress){
        name = Nname;
        ditno = NditNo;
        address = Naddress;
    }
*/
    //mutator methods
    public void setName(String Nname){
        name = Nname;
    }

    public void setDitNo(String NditNo){
        ditno = NditNo;
    }

    public void setAddress(String Naddress){
        address = Naddress;
    }

    //accessor methods
    public String getName(){
        return name;
    }

    public String getDitNo(){
        return ditno;
    }

    public String getAddress(){
        return address;
    }


}
