package entities;

import java.sql.Timestamp;

public class Spid extends Base {
    final private long id;
    private User user;
    private Status status;
    private String description;

    public Spid() {
        super();
        id = 0;
    }

    public Spid(long id, Timestamp createdAt, Timestamp modifiedAt, long spidId, User user, String description) {
        super(id, createdAt, modifiedAt);
        this.id = spidId;
        this.user = user;
        this.status = Status.PENDING;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Spid{" +
                "id=" + id +
                ", user=" + user +
                ", status=" + status +
                ", description=" + description +
                ", createdAt=" + getCreatedAt() +
                ", modifiedAt=" + getModifiedAt() + "}";
    }
}