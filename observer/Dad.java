package observer;

import java.util.ArrayList;

/**
 * Dad responds randomly when a baby cries.
 */
public class Dad extends Observer {
    public Dad(ArrayList<Baby> babies) {
        super(babies);
    }

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
