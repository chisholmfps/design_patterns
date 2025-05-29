package singleton;

import java.util.ArrayList;

/**
 * Represents a clothing item with a name, color, and applicable seasons.
 */
public class ClothingItem {
    private String name;
    private String color;
    private ArrayList<Season> seasons;

    /**
     * Constructs a ClothingItem with the given name and color.
     *
     * @param name  the name of the clothing item
     * @param color the color of the clothing item
     */
    public ClothingItem(String name, String color) {
        this.name = name;
        this.color = color;
        this.seasons = new ArrayList<>();
    }

    /**
     * Checks if this clothing item is suitable for the specified season.
     *
     * @param season the season to check
     * @return true if the clothing item is suitable for the season, false otherwise
     */
    public boolean hasSeason(Season season) {
        return seasons.contains(season);
    }

    /**
     * Adds a season to this clothing item's list of suitable seasons.
     *
     * @param season the season to add
     */
    public void addSeason(Season season) {
        if (!seasons.contains(season)) {
            seasons.add(season);
        }
    }

    /**
     * Returns a string representation of the clothing item.
     *
     * @return the name and color of the item
     */
    @Override
    public String toString() {
        return color + " " + name;
    }
}
