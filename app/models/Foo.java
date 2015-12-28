package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import play.db.jpa.GenericModel;

@Entity
public class Foo extends GenericModel {

    @Id @GeneratedValue
    public Long id;

    public String bar;

    @Override
    public String toString() {
        return String.format("Foo #%s: %s", id, bar);
    }
}
