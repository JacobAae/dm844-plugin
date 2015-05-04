package dk.dm844.bsg

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(ChuckNorrisQuoteService)
class ChuckNorrisQuoteServiceSpec extends Specification {


    void "test chuckNorrisQuote when it works"() {
        when:
        String quote = service.chuckNorrisQuote
        println quote

        then:
        noExceptionThrown()
        quote != service.DEFAULT_QUOTE
    }

    void "test chuckNorrisQuote when it fails"() {
        setup:
        service.metaClass.getQuote = { throw new Exception('The service does something unexpected :(') }

        when:
        String quote = service.chuckNorrisQuote
        println quote

        then:
        noExceptionThrown()
        quote == service.DEFAULT_QUOTE
    }

}
