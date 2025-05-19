package observer;

import java.util.ArrayList;

/**
 * Dad reacts randomly when a baby cries.
 */
public class Dad extends Observer {

    /**
     * Registers Dad as an observer for all babies in the list.
     *
     * @param babies the babies Dad will observe
     */
    public Dad(ArrayList<Baby> babies) {
        super(babies);
    }

    /**
     * Responds randomly to the baby's cry.
     *
     * @param cry  the type of cry (ANGRY, HUNGRY, or WET)
     * @param baby the crying baby
     */
    @Override
    public void update(Cry cry, Baby baby) {
        int reaction = rand.nextInt(3);
        switch (reaction) {
            case 0 -> System.out.println("Dad puts a pillow over his head");
            case 1 -> System.out.println("Dad nudges mom");
            case 2 -> System.out.println("Dad screams....aaaaaaaaa");
        }
    }
}
