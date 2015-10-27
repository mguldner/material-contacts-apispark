package net.apispark.webapi.db;

import net.apispark.webapi.representation.Contact;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mathieu on 27/10/15.
 */
public class ContactPersistenceTest {

    @Test
    public void added_contact_is_correct() throws Exception {
        Assert.assertTrue(ContactPersistence.INSTANCE.addContact(new Contact()).getId() != null);
    }

    @Test
    public void added_contact_is_well_retrieved_by_id() throws Exception {
        Contact contact = new Contact();
        String id = ContactPersistence.INSTANCE.addContact(contact).getId();
        Assert.assertSame(contact, ContactPersistence.INSTANCE.getContact(id));
    }
}
