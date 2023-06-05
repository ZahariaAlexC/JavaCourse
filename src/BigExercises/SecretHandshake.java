package BigExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecretHandshake {

        List<String> calculateHandshake(int number) {
            List<String> signals = new ArrayList<String>();
            if ((number & 1) == 1) {
                signals.add("Wink");
            }
            if ((number & 2) == 2) {
                signals.add("Double_Blink");
            }
            if ((number & 4) == 4) {
                signals.add("CLOSE_YOUR_EYES");
            }
            if ((number & 8) == 8) {
                signals.add("JUMP");
            }
            if ((number & 16) == 16) {
                Collections.reverse(signals);
            }
            return signals;
        }

}
