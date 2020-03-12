import com.sun.xml.internal.ws.wsdl.writer.document.Part;

import java.util.Arrays;
import java.util.List;

public class ParticipantAdapter {

    public String csvContent;

    public ParticipantAdapter(String csvContent) {
        this.csvContent = csvContent;
    }


    public Meal parser() {
        String[] arrayOfInfo = csvContent.split(";");
        String[] arrivalTime = arrayOfInfo[2].split("h");
        Participant participant = Participant.createParticipantHourMinuteDay(Integer.valueOf(arrivalTime[0].trim())
                ,Integer.valueOf(arrivalTime[1].trim()),4);
        return new Meal(Arrays.asList(participant));
    }
}
