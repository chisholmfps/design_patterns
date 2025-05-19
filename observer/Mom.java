package observer;

import java.util.ArrayList;

/**
 * Mom reacts to a baby's cry based on the type of cry.
 */
public class Mom extends Observer {

    /**
     * Registers Mom as an observer for all babies in the list.
     *
     * @param babies the babies Mom will observe
     */
    public Mom(ArrayList<Baby> babies) {
        super(babies);
    }

    /**
     * Responds to the baby's cry.
     *
     * @param cry  the type of cry (ANGRY, HUNGRY, or WET)
     * @param baby the crying baby
     */
    @Override
    public void update(Cry cry, Baby baby) {
        switch (cry) {
            case ANGRY -> {
                System.out.println("Mom hugs " + baby.getName());
                baby.receiveLove();
            }
            case HUNGRY -> {
                System.out.println("Mom feeds " + baby.getName());
                baby.eat();
            }
            case WET -> {
                System.out.println("Mom changes " + baby.getName());
                baby.getChanged();
            }
        }
    }
}
