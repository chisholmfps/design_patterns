package observer;

import java.util.ArrayList;

/**
 * Mom responds specifically based on the baby's cry type.
 */
public class Mom extends Observer {
    public Mom(ArrayList<Baby> babies) {
        super(babies);
    }

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
