package ships;

public class Ships 
{
    public static void main(String[] args) 
    {
        final int SIZE = 10;
                        
        Frigate fregata01 = new Frigate();
        MissileBoat kuter01 = new MissileBoat();
        MissileBoat kuter02 = new MissileBoat();
        MissileBoat kuter03 = new MissileBoat();
        MissileBoat kuter04 = new MissileBoat();
        
        fregata01.placeFrigate();
        
        kuter01.placeMissileBoat();
        kuter01.markPosition();
        kuter01.supervisor();
        
        kuter02.placeMissileBoat();
        kuter02.markPosition();
        
        kuter03.placeMissileBoat();
        kuter03.markPosition();
        
        kuter04.placeMissileBoat();
        kuter04.markPosition();
        
        System.out.println("Współrzędne klocka 1 dla fregaty01: " + fregata01.x1 + " " + fregata01.y1);
        System.out.println("Współrzędne klocka 2 dla fregaty01: " + fregata01.x2 + " " + fregata01.y2);
        System.out.println("Współrzędne kutra01: " + kuter01.x + " " + kuter01.y);
        System.out.println("Współrzędne kutra02: " + kuter02.x + " " + kuter02.y);
        System.out.println("Współrzędne kutra03: " + kuter03.x + " " + kuter03.y);
        System.out.println("Współrzędne kutra04: " + kuter04.x + " " + kuter04.y);
    }
}
