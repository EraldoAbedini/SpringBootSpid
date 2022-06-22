package entities;

import java.sql.Timestamp;

public class Base {
    private long id;
    private Timestamp createdAt;
    private Timestamp modifiedAt;

    public Base() {
    }

    public void displayInfo() {
        System.out.println("BaseId: " + id);
        System.out.println("CreatedAt: " + createdAt);
        System.out.println("ModifiedAt: " + modifiedAt);
    }

    public Base(long id, Timestamp createdAt, Timestamp modifiedAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }
}