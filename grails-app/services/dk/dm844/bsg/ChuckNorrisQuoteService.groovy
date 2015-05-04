package dk.dm844.bsg

import grails.transaction.Transactional
import groovy.json.JsonSlurper

@Transactional
class ChuckNorrisQuoteService {

    static final String DEFAULT_QUOTE = "Chuck Norris have killed the quote service!"

    String getChuckNorrisQuote() {
        String cnQuote
        try {
            cnQuote = quote
        } catch (Exception e) {
            log.error("Problems contacting the quote service", e)
            cnQuote = DEFAULT_QUOTE
        }
        return cnQuote
    }

    private String getQuote() {
        String json = "http://api.icndb.com/jokes/random".toURL().text

        JsonSlurper slurper = new JsonSlurper()
        Map jokeMap = slurper.parseText(json)

        return jokeMap.value.joke
    }

}
