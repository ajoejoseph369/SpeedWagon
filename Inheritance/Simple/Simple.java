class Student{
    String name = "Ajoe";
    int rollno = 14;
    public void display(){
        System.out.println("Name: "+name+"\nRollno: "+rollno);
    }
}

class Ajoe extends Student{
    String UID = "U2003000";
}

class Simple{
    public static void main(String[] args) {
        Ajoe a = new Ajoe();

        a.display();
        System.out.println("UID: "+a.UID);
    }
}