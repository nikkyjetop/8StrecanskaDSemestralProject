package semestralnapraca;
/**
 * 
 * @author Dominika.Strecanska
 */
public class Bod {
    double x;
    double y;
    double z;
    double vzdialenost;

    public Bod(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
        this.vzdialenost = vzdialenost();
    }

    //metoda vypocita vzdialenost od bodu [0 0 0]
    private double vzdialenost(){
        return Math.sqrt((this.x * this.x)+(this.y * this.y)+(this.z * this.z));
    }
    
    //metoda vzpisuje suradnice bodu
    public void vypis(){
        System.out.println(this.x + " " + this.y + " " + this.z);
    }
}
