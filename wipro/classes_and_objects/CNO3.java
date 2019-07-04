public class CNO3
{

    public static void main(String[] args) {
        Patient p = new Patient("Arpita", 10, 22);
        System.out.println(p.computeBMI());
    }
}

class Patient
{
    String patientName;
    double height;
    double width;

    Patient(String name, double w, double h)
    {
        this.patientName = name;
        this.height = h;
        this.width = w;
    }

    public double computeBMI()
    {
        return this.width / this.height;
    }
}