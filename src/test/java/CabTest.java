import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CabTest {
    @Test
    @DisplayName("Should give fare as 40 for 1 km")
    void fareForDistance1km(){
        Cab cab= new Cab();
        int actualFare = cab.calculateFare(1,0);
        assertEquals(40,actualFare);
    }
    @Test
    @DisplayName("Should give fare as 50 for 5 km")
    void fareForDistance5km(){
        Cab cab= new Cab();
        int actualFare = cab.calculateFare(5,0);
        assertEquals(50,actualFare);
    }
    @Test
    @DisplayName("Should give fare as 54 for 5 km & 2 min Wait")
    void fareForDistance5km2minWait(){
        Cab cab= new Cab();
        int actualFare = cab.calculateFare(5,2);
        assertEquals(54,actualFare);
    }
    @Test
    @DisplayName("Should give fare as 54 for 1 Rides of 5 km & 2 min Wait")
    void aggregateFareFor1Ride(){
        Cab cab= new Cab();
        int [][] Rides = new int [][]{{5,2}};
        int actualFare = cab.aggregateFare(Rides);
        assertEquals(54,actualFare);
    }
    @Test
    @DisplayName("Should give fare as 104 for 2 Rides of 5 km & 2 min Wait and 4 km ride and 5 min wait") //edit
    void aggregateFareFor2Rides(){
        Cab cab= new Cab();
        int [][] Rides = new int [][]{{5,2},{4,5}};
        int actualFare = cab.aggregateFare(Rides);
        assertEquals(104,actualFare);
    }

    @Test
    @DisplayName("Should give fare as 144 for 3 Rides of 5 km & 2 min Wait and 3 km ride and 5 min wait and 2km and 0 min wait") //edit
    void aggregateFareFor3Rides(){
        Cab cab= new Cab();
        int [][] Rides = new int [][]{{5,2},{3,5},{2,0}};
        int actualFare = cab.aggregateFare(Rides);
        assertEquals(134,actualFare);
    }
}
