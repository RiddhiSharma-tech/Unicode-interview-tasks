public class Section1 {

    String name, sap_id, uid;
    int sem;

    public void getData(String name, String sap_id, String uid, int sem) {

        this.name = name;
        this.sap_id = sap_id;
        this.uid = uid;
        this.sem = sem;

    }

    public void setData() {

        System.out.println("Student's name: " + name);
        System.out.println("Sap id: " + sap_id);
        System.out.println("user id: " + uid);
        System.out.println("Semester: " + sem);
    }

}

