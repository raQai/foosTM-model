package de.kongfoos.foostm.model.player;


public abstract class PlayerImpl implements IPlayer {

	private long id;

	public long getId(){
		return this.id;
	}
	
	public void setId(long id){
		this.id = id;
	}
	
    @Override
    public String getName() {
        return getSurname().toUpperCase() + " " + getForename();
    }

    @Override
    public String toString() {
        return getName();
    }
}
