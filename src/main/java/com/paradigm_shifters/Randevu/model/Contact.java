package com.paradigm_shifters.Randevu.model;

public class Contact {
    private String fn;
    private String ln;
    private String pn;

    public Contact(String fn, String ln, String pn) {
        this.fn = fn;
        this.ln = ln;
        this.pn = pn;
    }

    public String getFirstName() { return fn; }
    public String getLastName() { return ln; }
    public String getPhoneNumber() { return pn; }

    public void validatePhoneNumber() {
        if (this.pn.isBlank())
            throw new RuntimeException("Cannot be null or empty");
        if (this.pn.length() != 10)
            throw new RuntimeException("Has to have 10 Digits");
        if (!this.pn.matches("\\d+"))
            throw new RuntimeException("Must only have digits");
        if (!this.pn.startsWith("1"))
            throw new RuntimeException("Must Start with 1");
    }

    public void validateFirstName() {
        if (this.fn.isBlank())
            throw new RuntimeException("First Name cannot be null or empty");
    }

    public void validateLastName() {
        if (this.ln.isBlank())
            throw new RuntimeException("Last Name cannot be null or empty");
    }
}