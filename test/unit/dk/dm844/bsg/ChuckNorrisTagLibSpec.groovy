package dk.dm844.bsg

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.GroovyPageUnitTestMixin} for usage instructions
 */
@TestFor(ChuckNorrisTagLib)
class ChuckNorrisTagLibSpec extends Specification {

    void "test chuck norris quote service"() {
        setup:
        tagLib.chuckNorrisQuoteService = Mock(ChuckNorrisQuoteService)
        tagLib.chuckNorrisQuoteService.chuckNorrisQuote >> 'Chuck Norris > encoding testing!'

        expect:
        tagLib.randomChuckNorrisJoke() == '<span class="chuck-norris-joke">Chuck Norris &gt; encoding testing!</span>'

    }
}
