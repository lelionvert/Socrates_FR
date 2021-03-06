package scenarios;

import lacombe.PriceCalculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CompletePriceTest {

    @Test
    public void Participant_ArrivesThursdayAt17_LeavesSundayAt14_ChooseSingle_AndPaid610() {
        String input = "Pierre;jeudi;17h;dimanche;14h;Single";

        long price = PriceCalculator.calculatePrice(input);

        assertThat(price).isEqualTo(610);
    }

    @Test
    public void Participant_ArrivesThursdayAt21_LeavesSundayAt16_ChooseSingle_AndPaid240(){
        String input = "Arnaud;jeudi;21h;dimanche;16h;No Accommodation";

        long price = PriceCalculator.calculatePrice(input);

        assertThat(price).isEqualTo(240);
    }

    @Test
    public void Participant_ArrivesThursdayAt21_LeavesSundayAt16_ChooseSingle_AndPaid510(){
        String input = "Mila;jeudi;21h;dimanche;16h;Twin";

        long price = PriceCalculator.calculatePrice(input);

        assertThat(price).isEqualTo(510);
    }

    @Test
    public void Participant_ArrivesThursdayAt21_LeavesSundayAt16_ChooseSingle_AndPaid410(){
        String input = "Jhon;jeudi;21h;dimanche;16h;Triple";

        long price = PriceCalculator.calculatePrice(input);

        assertThat(price).isEqualTo(410);
    }

    @Test
    public void Participant_ArrivesThursdayAt21_LeavesSundayAt16_ChooseError(){
        String input = "crafter;jeudi;21h;dimanche;16h;XXXX";

        long price = PriceCalculator.calculatePrice(input);

        assertThat(price).isEqualTo(-1);
    }
}
