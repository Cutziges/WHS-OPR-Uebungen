
package carsharing;


public class FMTest {
    public static void main(String[] args) {
        Fahrzeugmanager fahrzeuge = new Fahrzeugmanager();
        fahrzeuge.fuegeFahrzeugHinzu("Bahnhof 1", "Bahnhof");
        fahrzeuge.bucheFahrzeug("Bahnhof 1", "2005/04/14, 20:00", "2005/04/15, 08:00");
        fahrzeuge.bucheFahrzeug("Bahnhof 1", "2005/04/15, 18:00", "2005/04/16, 00:00");
        fahrzeuge.gibVerfuegbareFahrzeuge("Bahnhof", 
                "2005/04/15, 11:30", "2005/04/15, 19:00");
        //"2005/04/15, 10:00", "2005/04/15, 19:00"
        //"2005/04/15, 09:00", "2005/04/15, 11:00"
        //"2005/04/15, 18:00", "2005/04/15, 20:00"
        //"2005/04/15, 09:00", "2005/04/15, 11:00"
        //"2005/04/15, 11:00", "2005/04/15, 18:00"
        //"2005/04/15, 09:00", "2005/04/15, 10:00"
        //"2005/04/15, 11:30", "2005/04/15, 19:00"
        //f1.bucheFahrzeug("Bahnhof 1", "2005/04/14, 20:00", "2005/04/15, 08:00");
        //f1.bucheFahrzeug("Bahnhof 1", "2005/04/15, 18:00", "2005/04/16, 00:00");
        //System.out.println("2005/04/15, 18:00".compareTo("2005/04/15, 11:30"));
        //System.out.println("2005/04/15, 18:00".compareTo("2005/04/15, 19:00"));
        //System.out.println("2005/04/16, 00:00".compareTo("2005/04/15, 11:30"));
        //System.out.println("2005/04/16, 00:00".compareTo("2005/04/15, 19:00"));
        //f1.bucheFahrzeug("Bahnhof 3", "2005/04/15, 10:00", "2005/04/15, 19:00");
        //System.out.println("2005/04/15, 10:00".compareTo("2005/04/15, 11:30"));
        //System.out.println("2005/04/15, 10:00".compareTo("2005/04/15, 19:00"));
        //System.out.println("2005/04/15, 19:00".compareTo("2005/04/15, 11:30"));
        //System.out.println("2005/04/15, 19:00".compareTo("2005/04/15, 19:00"));
        //System.out.println("2005/04/15, 10:00".compareTo("2005/04/15, 09:00"));
        //System.out.println("2005/04/15, 10:00".compareTo("2005/04/15, 11:00"));
        //System.out.println("2005/04/15, 19:00".compareTo("2005/04/15, 09:00"));
        //System.out.println("2005/04/15, 19:00".compareTo("2005/04/15, 11:00"));
        
        //f1.bucheFahrzeug("Bahnhof 1", "2005/04/14, 20:00", "2005/04/15, 08:00");
        //f1.bucheFahrzeug("Bahnhof 1", "2005/04/15, 18:00", "2005/04/16, 00:00");
        //"2005/04/15, 11:30", "2005/04/15, 19:00"
        //"2005/04/15, 19:15", "2005/04/15, 23:00"
        System.out.println("2005/04/15, 18:00".compareTo("2005/04/15, 11:30"));
        System.out.println("2005/04/15, 18:00".compareTo("2005/04/15, 19:00"));
        System.out.println("2005/04/16, 00:00".compareTo("2005/04/15, 11:30"));
        System.out.println("2005/04/16, 00:00".compareTo("2005/04/15, 19:00"));
        
        //System.out.println("2005/04/15, 18:00".compareTo("2005/04/15, 19:15"));
        //System.out.println("2005/04/15, 18:00".compareTo("2005/04/15, 23:00"));
        //System.out.println("2005/04/16, 00:00".compareTo("2005/04/15, 19:15"));
        //System.out.println("2005/04/16, 00:00".compareTo("2005/04/15, 23:00"));
        
        //System.out.println("2005/04/14, 20:00".compareTo("2005/04/15, 19:15"));
        //System.out.println("2005/04/14, 20:00".compareTo("2005/04/15, 23:00"));
        //System.out.println("2005/04/15, 08:00".compareTo("2005/04/15, 19:15"));
        //System.out.println("2005/04/15, 08:00".compareTo("2005/04/15, 23:00"));
        
        //System.out.println("2019/03/21".compareTo("2019/03/22"));
        //System.out.println("2019/03/21".compareTo("2019/03/20"));
        //System.out.println("2019/03/21 10:00".compareTo("2019/03/20 16:00"));
        //System.out.println("2019/03/21 10:00".compareTo("2019/03/21 19:00"));
        //b3 = new Buchung("2019/03/25 12:00", "2019/03/28 12:00");
        //System.out.println(b1.istVerfuegbar("2019/03/22 17:00", "2019/03/22 19:00"));
        
        //System.out.println(fahrzeuge.bucheFahrzeug("Ford Ka", "2019/03/21 10:00", "2019/03/23 15:00"));
        //System.out.println(fahrzeuge.bucheFahrzeug("Ford Ka", "2019/03/22 17:00", "2019/03/22 19:00"));
    }
    
}
