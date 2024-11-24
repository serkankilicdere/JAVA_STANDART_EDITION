package AracKiralama.Entity;

import AracKiralama.Utility.State;

import java.util.UUID;

public class BaseEntity {
        private final UUID uuid;
        private State state;
        private Long createdAt;


    public BaseEntity(){
        this.uuid = UUID.randomUUID();
        this.state = State.ACTIVE;
        this.createdAt = System.currentTimeMillis();

    }

    public UUID getUuid() {
        return uuid;
    }

    public State getState() {
        return state;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setState(State state) {
        this.state = state;
    }
}
