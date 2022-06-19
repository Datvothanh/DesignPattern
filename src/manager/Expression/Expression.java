package manager.Expression;

import model.Person;

public interface Expression {
    boolean interpreter(Person context);
}
