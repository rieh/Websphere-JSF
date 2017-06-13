//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package ru.vkaretko.listmanager.web.service.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.vkaretko.listmanager.web.service.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetUserId_QNAME = new QName("http://soap.service.web.listmanager.vkaretko.ru/", "getUserId");
    private final static QName _GetUserIdResponse_QNAME = new QName("http://soap.service.web.listmanager.vkaretko.ru/", "getUserIdResponse");
    private final static QName _GetUserListItemsResponse_QNAME = new QName("http://soap.service.web.listmanager.vkaretko.ru/", "getUserListItemsResponse");
    private final static QName _GetUserListItems_QNAME = new QName("http://soap.service.web.listmanager.vkaretko.ru/", "getUserListItems");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.vkaretko.listmanager.web.service.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserListItems }
     * 
     */
    public GetUserListItems createGetUserListItems() {
        return new GetUserListItems();
    }

    /**
     * Create an instance of {@link GetUserListItemsResponse }
     * 
     */
    public GetUserListItemsResponse createGetUserListItemsResponse() {
        return new GetUserListItemsResponse();
    }

    /**
     * Create an instance of {@link GetUserId }
     * 
     */
    public GetUserId createGetUserId() {
        return new GetUserId();
    }

    /**
     * Create an instance of {@link GetUserIdResponse }
     * 
     */
    public GetUserIdResponse createGetUserIdResponse() {
        return new GetUserIdResponse();
    }

    /**
     * Create an instance of {@link ListItem }
     * 
     */
    public ListItem createListItem() {
        return new ListItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.web.listmanager.vkaretko.ru/", name = "getUserId")
    public JAXBElement<GetUserId> createGetUserId(GetUserId value) {
        return new JAXBElement<GetUserId>(_GetUserId_QNAME, GetUserId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.web.listmanager.vkaretko.ru/", name = "getUserIdResponse")
    public JAXBElement<GetUserIdResponse> createGetUserIdResponse(GetUserIdResponse value) {
        return new JAXBElement<GetUserIdResponse>(_GetUserIdResponse_QNAME, GetUserIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserListItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.web.listmanager.vkaretko.ru/", name = "getUserListItemsResponse")
    public JAXBElement<GetUserListItemsResponse> createGetUserListItemsResponse(GetUserListItemsResponse value) {
        return new JAXBElement<GetUserListItemsResponse>(_GetUserListItemsResponse_QNAME, GetUserListItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserListItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.web.listmanager.vkaretko.ru/", name = "getUserListItems")
    public JAXBElement<GetUserListItems> createGetUserListItems(GetUserListItems value) {
        return new JAXBElement<GetUserListItems>(_GetUserListItems_QNAME, GetUserListItems.class, null, value);
    }

}
