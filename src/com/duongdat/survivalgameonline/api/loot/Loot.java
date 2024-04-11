package com.duongdat.survivalgameonline.api.loot;

public class LootProbability {

    public Item item;
    public double probability;

    /**
     * Loot and its probability pair.
     *
     * @param item loot
     * @param probability probability of getting loot
     */
    public LootProbability(Item item, double probability){
        this.item = item;
        this.probability = probability;
    }
}
