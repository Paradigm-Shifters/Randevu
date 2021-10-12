package com.paradigm_shifters.Randevu.model;
import org.junit.*;

public class ContactManagerTest {

    private ContactManager contactManager;

    @Before
    public void setup() {
        System.out.println("before testing...");
        contactManager = new ContactManager();
    }

    @After      // Cleanup logic
    public void cleanup() {
        System.out.println("Finishing and cleaning up the test...");
    }

    @Test
    public void shouldCreateContact() {
        contactManager.addContact("Dany", "Flores", "1234567890");
        Assert.assertFalse(contactManager.getAllContacts().isEmpty());
        Assert.assertEquals(1, contactManager.getAllContacts().size());
    }

    @Test
    public void shouldNotCreateContactWhenFirstNameIsNull() {
        Assert.assertThrows(RuntimeException.class, () ->
                contactManager.addContact(null, "Flores", "1234567890"));
    }

    @Test
    public void shouldNotCreateContactWhenLastNameIsNull() {
        Assert.assertThrows(RuntimeException.class, () ->
                contactManager.addContact("Dany", null, "1234567890"));
    }
}