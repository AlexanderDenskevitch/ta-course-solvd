package homework.task2and3;

import homework.task2and3.shop.Address;

import java.util.Objects;

public abstract class PublicBuilding extends Building {

    protected String publicPurpose;

    public PublicBuilding(Address address, String publicPurpose) {
        super(address);
        this.publicPurpose = publicPurpose;
    }

    public abstract void getStarted();

    @Override
    public String toString() {
        return "It is class PublicBuilding";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PublicBuilding that = (PublicBuilding) o;
        return publicPurpose.equals(that.publicPurpose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), publicPurpose);
    }
}
