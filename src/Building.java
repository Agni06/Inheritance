public class Building {
    String name;
    double height;
    Building(String name, double height)
    {this.name = name;
    this.height = height;}
    void occupy()
    {
        System.out.println(name + " is now occupied.");
    }
    void evacuate()
    {
        System.out.println("Evacuating " + name + ".");
    }


}
class House extends Building{
    int numberOfRooms;
    House(String name, double height, int numberOfRooms)
    {
        super(name, height);
        this.numberOfRooms = numberOfRooms;
    }
    void conductMeetings()
    {
        System.out.println("Relaxing in " + name + ".");
    }
}
    class OfficeBuilding extends Building{
    int  numberOfFloors;
    OfficeBuilding(String name, double height, int numberOfFloors)
    {
        super(name, height);
        this.numberOfFloors= numberOfFloors;

    }
        public void conductMeetings() {
            System.out.println("Conducting meetings in " + name + ".");
        }
    }
        class Skyscraper extends Building{
            int numberOfElevators;
            Skyscraper(String name, double height, int numberOfElevators)
            {
                super(name, height);
                this.numberOfElevators = numberOfElevators;
            }
            public void conductMeetings() {
                System.out.println("Admiring the view from " + name + ".");
            }

        }
