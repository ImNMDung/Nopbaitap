import java.io.*;
import java.util.*;
import java.io.Serializable;
public class Carr {
    static class Car implements Serializable {
        String name;
        String engine;
        int seats;
        String production_date;

        Car(String _name, String _engine,int _seats, String _production_date)
        {
            this.name = _name;
            this.engine = _engine;
            this.seats = _seats;
            this.production_date = _production_date;
        }
        public void setvalue() {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Name :");
                this.name = sc.next();
                System.out.print("engine :");
                this.engine = sc.next();
                System.out.print("seats :");
                this.seats = sc.nextInt();
                System.out.print("production_date :");
                this.production_date = sc.next();
            }
        }
        @Override
        public String toString() {
            return "Name:" + name + " Engine: " +engine + " Seats: " + seats + " production_date: " + production_date ;
        }
        public static void main(String[] args) throws ClassNotFoundException {

            try {

                Car car1 = new Car("\nToyotaz" , "Hexas" ,4 , "2021");
                car1.setvalue();
                FileOutputStream fos = new FileOutputStream("f:/filename.txt");

                ObjectOutputStream dos = new ObjectOutputStream(fos);

                dos.writeObject(car1);

                fos.close();
                dos.close();



            } catch (IOException ex) {
                ex.printStackTrace();

            }
            try {
                FileInputStream fis = new FileInputStream("f:/filename.txt");
                ObjectInputStream dis = new ObjectInputStream(fis);
                Car Car2 = (Car) dis.readObject();
                System.out.println("Xuat File Vua Nhap!");
                System.out.println(Car2.toString());

                fis.close();
                dis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }}}

