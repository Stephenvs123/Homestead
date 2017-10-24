package com.bbd;

@SuppressWarnings("DefaultFileTemplate")
class Politician extends Person implements IVisitor{
    public Politician(String name, int age, Gender gender, PersonType politician) {
        super(name, age, gender, politician);
    }

    @Override
    public String toString() {
        return "Politician{} " + super.toString();
    }

    public void visit(Homestead home) {
        if (super.getType().equals(PersonType.Politician))
            throw new RuntimeException("Pay back the money!");

    }
}
