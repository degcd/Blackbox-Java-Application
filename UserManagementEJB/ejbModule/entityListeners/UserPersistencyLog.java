package entityListeners;

import javax.persistence.PostPersist;

public class UserPersistencyLog {
    @PostPersist
    public void newEntry(Object entity)
    {
        System.out.println("Entity gespeichert: " +
                entity.getClass().getName());
    }
}
