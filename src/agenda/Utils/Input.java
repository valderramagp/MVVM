package agenda.Utils;

/**
 * Created by gusta on 03/11/2016.
 */
public class Input {
    private static Input ourInstance = new Input();

    public static Input getInstance() {
        return ourInstance;
    }

    private Input() {
    }
}
