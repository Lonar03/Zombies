package net.dip.objects;

import net.dip.enums.UserStatus;
import net.dip.objects.perks.Perk;

import org.bukkit.entity.Player;

import static net.dip.utils.Constants.MAX_PERK_COUNT;

/**
 * Represents the player that is in game
 */
public class User {
    private Player player;
    private int gold;
    private UserStatus status;
    private Perk[] perks;

    /**
     * Constructor to initialize player defaults
     *
     * @param player the Player to represent the User object
     */
    public User(Player player){
        setPlayer(player);
        this.gold = 0;
        perks = new Perk[MAX_PERK_COUNT];
    }

    /**
     * Get the Player representing the User object
     *
     * @return the Player associated with the User object
     */
    public Player getPlayer(){
        return player;
    }

    /**
     * Set the Player to the User object
     *
     * @param player the Player to represent the User object
     */
    private void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Get the gold of the User
     *
     * @return int representing User's gold
     */
    public int getGold() {
        return gold;
    }

    // in case i ever need this, but i want to stay away from changing gold directly
    // /**
    //  * Sets the gold of the User
    //  *
    //  * @param gold the int to set the User's gold to
    //  */
    // public void setGold(int gold) {
    //     this.gold = gold;
    // }

    /**
     * Gives the User a certain amount of gold
     *
     * @param amount the amount of gold to give the User
     */
    public void giveGold(int amount){
        this.gold += amount;
    }

    /**
     * Takes a certain amount of gold from the User. will not do anything if User does not have enough gold
     *
     * @param amount the amount of gold to take from the User
     */
    public void takeGold(int amount){
        int tempGold = this.gold - amount;
        if (tempGold >= 0){
            this.gold = tempGold;
        }
    }

    /**
     * Gets the status of the User, i.e, alive, knocked, or dead.
     *
     * @return UserStatus of the User
     */
    public UserStatus getStatus(){
        return status;
    }

    /**
     * Sets the status of the User.
     *
     * @param userStatus the UserStatus to set
     */
    public void setStatus(UserStatus userStatus){
        this.status = userStatus;
    }

    /**
     * Get the perks of the User. Each index corresponds to the perk slot.
     *
     * @return an array of perks that the player has
     */
    public Perk[] getPerks() {
        return perks;
    }

    /**
     * Checks if the User has a certain perk.
     *
     * @param perk the perk to check
     * @return true if the User has the perk, otherwise false
     */
    public boolean hasPerk(Perk perk){
        for(Perk p : getPerks()){
            if(perk.equals(p)){
                return true;
            }
        }
        return false;
    }

    /**
     * Sets the perk on a designated slot.
     *
     * @param perk the perk to set
     * @param slot the slot to set
     */
    public void setPerk(Perk perk, int slot){
        this.perks[slot] = perk;
    }

    /**
     * Clears all perks of the User.
     */
    public void clearPerks(){
        this.perks = new Perk[MAX_PERK_COUNT];
    }
}