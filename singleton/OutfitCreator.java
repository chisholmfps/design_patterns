package singleton;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Singleton class responsible for creating outfits based on season.
 */
public class OutfitCreator {
    private static OutfitCreator instance;
    private HashMap<ClothingPart, ArrayList<ClothingItem>> clothing;

    /**
     * Private constructor to prevent instantiation.
     */
    private OutfitCreator() {
        clothing = new HashMap<>();
        clothing.put(ClothingPart.TOP, FileReader.getTops());
        clothing.put(ClothingPart.BOTTOM, FileReader.getBottoms());
        clothing.put(ClothingPart.WHOLE, FileReader.getwholes());
    }

    /**
     * Returns the single instance of the OutfitCreator.
     *
     * @return the OutfitCreator instance
     */
    public static OutfitCreator getInstance() {
        if (instance == null) {
            instance = new OutfitCreator();
        }
        return instance;
    }

    /**
     * Returns an outfit based on the given season.
     *
     * @param season the season for which to generate the outfit
     * @return a String representation of the outfit
     */
    public String getOutfit(Season season) {
        ArrayList<ClothingItem> suitableTops = getSeasonalClothing(ClothingPart.TOP, season);
        ArrayList<ClothingItem> suitableBottoms = getSeasonalClothing(ClothingPart.BOTTOM, season);
        ArrayList<ClothingItem> suitableWholes = getSeasonalClothing(ClothingPart.WHOLE, season);

        StringBuilder outfit = new StringBuilder();

        if (!suitableWholes.isEmpty()) {
            outfit.append("Whole Outfit: ").append(randomItem(suitableWholes)).append("\n");
        } else {
            if (!suitableTops.isEmpty()) {
                outfit.append("Top: ").append(randomItem(suitableTops)).append("\n");
            }
            if (!suitableBottoms.isEmpty()) {
                outfit.append("Bottom: ").append(randomItem(suitableBottoms)).append("\n");
            }
        }

        if (outfit.length() == 0) {
            return "No suitable outfit found for " + season.toString().toLowerCase() + ".";
        }

        return outfit.toString();
    }

    /**
     * Filters clothing items by part and season.
     *
     * @param part   the clothing part (TOP, BOTTOM, WHOLE)
     * @param season the season to filter by
     * @return a list of suitable clothing items
     */
    private ArrayList<ClothingItem> getSeasonalClothing(ClothingPart part, Season season) {
        ArrayList<ClothingItem> filtered = new ArrayList<>();

        for (ClothingItem item : clothing.get(part)) {
            if (item.hasSeason(season)) {
                filtered.add(item);
            }
        }

        return filtered;
    }

    /**
     * Picks a random item from the list.
     *
     * @param items list of clothing items
     * @return a random ClothingItem
     */
    private ClothingItem randomItem(ArrayList<ClothingItem> items) {
        int index = (int) (Math.random() * items.size());
        return items.get(index);
    }
}
